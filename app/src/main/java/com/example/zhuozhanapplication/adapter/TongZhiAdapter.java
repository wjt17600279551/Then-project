package com.example.zhuozhanapplication.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.bean.JiaoLiuBean;
import com.example.zhuozhanapplication.bean.TongGaoBean;

import java.util.ArrayList;

public class TongZhiAdapter extends RecyclerView.Adapter<TongZhiAdapter.ViewHolder> {
    ArrayList<JiaoLiuBean.DataBean> arrayList=new ArrayList<>();
    public void reshes(ArrayList<JiaoLiuBean.DataBean> arrayList){
        this.arrayList.addAll(arrayList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_tongzhi,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tong.setText("通知"+arrayList.get(i).getId());
//        viewHolder.mess.setText();
        viewHolder.timme.setText("通告时间："+arrayList.get(i).getCreateTime());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tong;
        TextView mess;
        TextView timme;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tong=itemView.findViewById(R.id.jitg);
            mess=itemView.findViewById(R.id.tgnr);
            timme=itemView.findViewById(R.id.tgsj);
        }
    }
}
