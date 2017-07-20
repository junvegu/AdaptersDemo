package com.deadapp.adaptersdemo;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by luizkawai on 20/07/17.
 */

public class GrpupKoreanGirlAdapter extends RecyclerView.Adapter<GrpupKoreanGirlAdapter.ViewHolder> {

    private ArrayList<GroupKoreanGirlModel> mList;
    private Context mContext;


    public GrpupKoreanGirlAdapter(ArrayList<GroupKoreanGirlModel> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public GrpupKoreanGirlAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group_girls, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(GrpupKoreanGirlAdapter.ViewHolder holder, int position) {
        GroupKoreanGirlModel groupKoreanGirlModel =  mList.get(position);

        KoreanGirlAdapter koreanGirlAdapter = new KoreanGirlAdapter(groupKoreanGirlModel.getKoreanGirlModels(),mContext);
        LinearLayoutManager linearLayoutManager =  new LinearLayoutManager(mContext,LinearLayoutManager.HORIZONTAL,false);
        holder.recyclerView.setAdapter(koreanGirlAdapter);
        holder.recyclerView.setLayoutManager(linearLayoutManager);



    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



    static class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;


        ViewHolder(View itemView) {
            super(itemView);
            recyclerView =  (RecyclerView)itemView.findViewById(R.id.rvListGroup);

        }

    }
}
