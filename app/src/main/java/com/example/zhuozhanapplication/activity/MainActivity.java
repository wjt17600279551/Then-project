package com.example.zhuozhanapplication.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.adapter.MyAdapter;
import com.example.zhuozhanapplication.fragment.Fragment1;
import com.example.zhuozhanapplication.fragment.Fragment2;
import com.example.zhuozhanapplication.fragment.Fragment3;
import com.example.zhuozhanapplication.fragment.Fragment4;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    ArrayList<Fragment> fragments=new ArrayList<>();
    Fragment fragment=null;
    MyAdapter adapter;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        Intent intent=getIntent();
        token = intent.getStringExtra("token");

        initData();
        initView();
        initAdapter();
        initListener();
        bottomNavigationView.setSelectedItemId(R.id.homeItem);


    }
    private void initListener() {
        fragment=new Fragment1();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.homeItem:
                        fragment=fragments.get(0);
                        Bundle bundle = new Bundle();
                        bundle.putString("token",token);
                        fragment.setArguments(bundle);
                        break;
                    case R.id.vipItem:
                        fragment=fragments.get(1);
                        break;
                    case R.id.cheItem:
                        fragment=fragments.get(2);
                        break;
                    case R.id.meItem:
                        fragment=fragments.get(3);
                        break;
                }

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                for (int i = 0; i <fragments.size() ; i++) {
                    if (!fragments.get(i).isHidden()){
                        fragmentTransaction.hide(fragments.get(i));
                    }
                }
                if (fragment.isAdded()){
                    fragmentTransaction.show(fragment).commit();
                }else {
                    fragmentTransaction.add(R.id.frame,fragment).show(fragment).commit();
                }

                return true;
            }
        });
    }

    private void initAdapter() {
        adapter = new MyAdapter(getSupportFragmentManager(),fragments);
    }

    private void initView() {
        frameLayout=findViewById(R.id.frame);
        bottomNavigationView=findViewById(R.id.bottomNavigat);
    }

    private void initData() {
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
    }
}
