package com.example.zhuozhanapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.zhuozhanapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {
    ImageView imageView;

    public Fragment4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment4, container, false);
        imageView=view.findViewById(R.id.tou);
        Glide.with(this).load(R.drawable.gerenzhongxin_icon_05)
                .apply(RequestOptions.circleCropTransform()).into(imageView);
        return view;
    }

}
