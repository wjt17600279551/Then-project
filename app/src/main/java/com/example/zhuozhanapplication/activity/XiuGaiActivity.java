package com.example.zhuozhanapplication.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.zhuozhanapplication.R;

import java.util.ArrayList;

public class XiuGaiActivity extends Activity {
    ArrayList<String> teamList;
    Spinner spinner;
    ArrayAdapter<String> arrayAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiu_gai);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        initView();
        Glide.with(this).load(R.drawable.gerenzhongxin_icon_05)
                .apply(RequestOptions.circleCropTransform()).into(imageView);
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,teamList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //加载适配器
        spinner.setAdapter(arrayAdapter);

    }

    private void initView() {
        teamList=new ArrayList<>();
        imageView=findViewById(R.id.toux);
        initList();
        spinner=findViewById(R.id.spinners);
    }

    private void initList() {
        teamList.add("缉毒大队");
        teamList.add("迅捷小队");
        teamList.add("侦察大队");
    }
}
