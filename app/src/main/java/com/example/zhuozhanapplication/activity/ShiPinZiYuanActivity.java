package com.example.zhuozhanapplication.activity;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Spinner;

import com.example.zhuozhanapplication.R;

public class ShiPinZiYuanActivity extends AppCompatActivity {
    ImageView imageView;
    Spinner renwuo,renwut,renwur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_pin_zi_yuan);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        imageView=findViewById(R.id.diandian);
//        View view= LayoutInflater.from(ShiPinZiYuanActivity.this).inflate(R.layout.menu_pop,null);
//        renwuo=view.findViewById(R.id.renwuo);
//        renwut=view.findViewById(R.id.renwut);
//        renwur=view.findViewById(R.id.renwur);
//
//        PopupWindow popupWindow=new PopupWindow(ShiPinZiYuanActivity.this);
//        popupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
//        popupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
//        popupWindow.setContentView(view);
//        popupWindow.setOutsideTouchable(true);
//        popupWindow.showAsDropDown(view);
    }
}
