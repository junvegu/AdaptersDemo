package com.deadapp.adaptersdemo;

import android.content.Context;
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

public class KoreanGirlAdapter extends RecyclerView.Adapter<KoreanGirlAdapter.ViewHolder> {

    private ArrayList<KoreanGirlModel> mList;
    private Context mContext;


    public KoreanGirlAdapter(ArrayList<KoreanGirlModel> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public KoreanGirlAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_girl, parent, false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(KoreanGirlAdapter.ViewHolder holder, int position) {
        KoreanGirlModel koreanGirlModel =  mList.get(position);

        Glide.with(mContext).load(koreanGirlModel.getPhoto()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



    static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;


        ViewHolder(View itemView) {
            super(itemView);
            imageView =  (ImageView)itemView.findViewById(R.id.girl_image);

        }

    }
}
