package com.example.zhuozhanapplication.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.TongZhiActivity;
import com.example.zhuozhanapplication.adapter.RenWuAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    ImageView imageView;
    RecyclerView recyclerView;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment1, container, false);

        Bundle bundle = getArguments();
        String token = bundle.getString("token");

        imageView=view.findViewById(R.id.message_btn);
        recyclerView=view.findViewById(R.id.rev_rw);
        LinearLayoutManager manager=new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        RenWuAdapter adapter=new RenWuAdapter(getActivity(),token);
        recyclerView.setAdapter(adapter);
        //点击消息跳转通知页面
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), TongZhiActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
