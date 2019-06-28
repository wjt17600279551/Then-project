package com.example.zhuozhanapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhuozhanapplication.ChengGongBean;
import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.httpUtils.BaseUrlUtils;
import com.example.zhuozhanapplication.httpUtils.MyService;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RenWuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    public static final int ITEMONE=0;
    public static final int ITEMTWO=1;
    private String token;

    Context context;

    public RenWuAdapter(Context context, String token) {
        this.context = context;
        this.token = token;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=null;
        LayoutInflater from=LayoutInflater.from(viewGroup.getContext());
        RecyclerView.ViewHolder viewHolder=null;
        switch (i){
            case 0:
                view=from.inflate(R.layout.item_rw_one,viewGroup,false);
                viewHolder=new OneViewHolder(view);
                break;
            case 1:
                view=from.inflate(R.layout.item_rw_two,viewGroup,false);
                viewHolder=new TwoViewHolder(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof OneViewHolder){

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            Request request = chain.request()
                                    .newBuilder()
                                    .addHeader("token", token)
                                    .build();
                            return chain.proceed(request);
                        }
                    }).build();
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(BaseUrlUtils.NET_BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            MyService service = retrofit.create(MyService.class);
            Call<ChengGongBean> cheng = service.getCheng("Authorization");
            cheng.enqueue(new Callback<ChengGongBean>() {
                @Override
                public void onResponse(Call<ChengGongBean> call, retrofit2.Response<ChengGongBean> response) {
                    Object realName = response.body().getData().getRealName();
                }

                @Override
                public void onFailure(Call<ChengGongBean> call, Throwable t) {

                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return ITEMONE;
        } else {
            return ITEMTWO;
        }
    }

    class OneViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView phone;
        TextView zhiwei;
        TextView bumen;
        public OneViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            phone=itemView.findViewById(R.id.phone);
            zhiwei=itemView.findViewById(R.id.zhiwei);
            bumen=itemView.findViewById(R.id.bumen);
        }
    }

    class TwoViewHolder extends RecyclerView.ViewHolder{

        public TwoViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
