package com.example.zhuozhanapplication.activity;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.adapter.TongZhiAdapter;
import com.example.zhuozhanapplication.bean.JiaoLiuBean;
import com.example.zhuozhanapplication.httpUtils.BaseUrlUtils;
import com.example.zhuozhanapplication.httpUtils.MyService;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TongZhiActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tong_zhi);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        recyclerView=findViewById(R.id.rec_tz);
        imageView=findViewById(R.id.back_img);
        //点击返回箭头关闭此页面
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        LinearLayoutManager manager=new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        TongZhiAdapter adapter=new TongZhiAdapter();
        recyclerView.setAdapter(adapter);
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(BaseUrlUtils.NET_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MyService myService = retrofit.create(MyService.class);
        Call<JiaoLiuBean> jiao = myService.getJiao();
        jiao.enqueue(new Callback<JiaoLiuBean>() {
            @Override
            public void onResponse(Call<JiaoLiuBean> call, Response<JiaoLiuBean> response) {
                List<JiaoLiuBean.DataBean> data = response.body().getData();
            }

            @Override
            public void onFailure(Call<JiaoLiuBean> call, Throwable t) {

            }
        });

    }
}
