package com.example.app_alll;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recom_adp extends RecyclerView.Adapter<recom_adp.recomViewHolder> {

    private Context mContext;
    private List<recom> recomList;

    public recom_adp(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<recom> recomList) {
        this.recomList = recomList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public recomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recom, parent, false);
        return new recomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recomViewHolder holder, int position) {
        recom recom = recomList.get(position);
        if (recom == null) {
            return;
        }
        holder.img.setImageResource(recom.getSrc_img());
        holder.text.setText(recom.getText1());
    }

    @Override
    public int getItemCount() {
        if(recomList != null){
            return recomList.size();
        }
        return 0;
    }

    class recomViewHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        private TextView text;
        public recomViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgView);
            text = itemView.findViewById(R.id.textView_item);
        }
    }
}
