package com.example.zhuozhanapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zhuozhanapplication.R;
import com.example.zhuozhanapplication.bean.RenWuLeiBean;

import java.util.ArrayList;

public class RenWuAdapter extends RecyclerView.Adapter<RenWuAdapter.ViewHolder> {
    ArrayList<RenWuLeiBean.DataBean> arrayList=new ArrayList<>();

    public void reshes(ArrayList<RenWuLeiBean.DataBean> arrayList){
        this.arrayList.addAll(arrayList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_rw_two,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.anjianmengcheng.setText("案件名称："+arrayList.get(i).getName());
        viewHolder.renwumingcheng.setText("任务名称："+arrayList.get(i));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView anjianmengcheng;
        TextView renwumingcheng;
        TextView duixiang;
        TextView fzeren;
        TextView renwumiaoshu;
        TextView shijian;
        TextView jieshou;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            anjianmengcheng=itemView.findViewById(R.id.ajmengcheng);
            renwumingcheng=itemView.findViewById(R.id.rwmingcheng);
            duixiang=itemView.findViewById(R.id.duixiang);
            fzeren=itemView.findViewById(R.id.fuzeren);
            renwumiaoshu=itemView.findViewById(R.id.rwmiaohu);
            shijian=itemView.findViewById(R.id.date_time);
            jieshou=itemView.findViewById(R.id.js);
        }
    }

}
