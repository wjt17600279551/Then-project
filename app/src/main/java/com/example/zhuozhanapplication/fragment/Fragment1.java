package com.example.zhuozhanapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.activity.TongZhiActivity;
import com.example.zhuozhanapplication.adapter.RenWuAdapter;
import com.example.zhuozhanapplication.httpUtils.BaseUrlUtils;
import com.example.zhuozhanapplication.httpUtils.MyService;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    ImageView imageView;
    RecyclerView recyclerView;
    private RenWuAdapter adapter;
    TextView name;
    TextView phone;
    TextView zhiwei;
    TextView bumen;
    private String token;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

        Bundle bundle = getArguments();
        token = bundle.getString("token");
        recyclerView=view.findViewById(R.id.rev_rw);
        imageView=view.findViewById(R.id.message_btn);
        name=view.findViewById(R.id.name);
        phone=view.findViewById(R.id.phone);
        zhiwei=view.findViewById(R.id.zhiwei);
        bumen=view.findViewById(R.id.bumen);
        imageView=view.findViewById(R.id.message_btn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TongZhiActivity.class);
                startActivity(intent);
            }
        });
        initNetData();
//        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
//        manager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(manager);
//        adapter=new RenWuAdapter();
//        recyclerView.setAdapter(adapter);
//        initNetData1();

        return view;
    }

    private void initNetData1() {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Authorization", token)
                                .build();
                        return chain.proceed(request);
                    }
                }).build();
//        Retrofit retrofit=new Retrofit.Builder()
//                .baseUrl(BaseUrlUtils.NET_BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        MyService myService = retrofit.create(MyService.class);
//        myService.getRenWu(token);
    }


    private void initNetData(){
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request()
                                .newBuilder()
                                .addHeader("Authorization", token)
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
        Call<ResponseBody> cheng = service.getCheng(token);
        cheng.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
                try {
                    String string = response.body().string();
                    Log.e("aaa",""+string);
                    JSONObject jsonObject=new JSONObject(string);
                    JSONObject data = jsonObject.getJSONObject("data");
                    String username = data.getString("username");
                    String phone1 = data.getString("phone");
                    String duty = data.getString("duty");
                    String employer = data.getString("employer");
                    name.setText("姓名："+username);
                    if (phone1.equals("null")){
                        phone.setText("手机号：无");
                    }else {
                        phone.setText("手机号："+phone1);
                    }

                    zhiwei.setText("职位："+duty);
                    bumen.setText("部门："+employer);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

}
