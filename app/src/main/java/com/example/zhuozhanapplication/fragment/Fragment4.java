package com.example.zhuozhanapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.activity.CaoZuoActivity;
import com.example.zhuozhanapplication.activity.ShiPinZiYuanActivity;
import com.example.zhuozhanapplication.activity.TongZhiActivity;
import com.example.zhuozhanapplication.activity.XiuGaiActivity;
import com.example.zhuozhanapplication.activity.XiuGaiMiMaActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {
    ImageView imageView;
    CardView xiugai,mima,shipin,tongao,zhinna,tui;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment4, container, false);
        imageView=view.findViewById(R.id.tou);
        xiugai=view.findViewById(R.id.geren);
        mima=view.findViewById(R.id.xiugmi);
        shipin=view.findViewById(R.id.shipin);
        tongao=view.findViewById(R.id.tongga);
        zhinna=view.findViewById(R.id.caozuo);
        tui=view.findViewById(R.id.exit);

        Glide.with(this).load(R.drawable.gerenzhongxin_icon_05)
                .apply(RequestOptions.circleCropTransform()).into(imageView);
        xiugai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), XiuGaiActivity.class);
                startActivity(intent);
            }
        });
        mima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), XiuGaiMiMaActivity.class);
                startActivity(intent);
            }
        });
        shipin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ShiPinZiYuanActivity.class);
                startActivity(intent);
            }
        });
        tongao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TongZhiActivity.class);
                startActivity(intent);
            }
        });
        zhinna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), CaoZuoActivity.class);
                startActivity(intent);
            }
        });
        tui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
        return view;
    }

}
