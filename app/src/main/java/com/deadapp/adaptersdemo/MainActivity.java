package com.deadapp.adaptersdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Number colums for Recycle View Grid
    private static final int NUM_COLUMS = 2;


    private RecyclerView mRecyclerView;
    private Button mButtonLinear, mButtonGrid, mButtonMix;

    //Linear
    private LinearLayoutManager mLinearLayoutManager;
    //Grid
    private GridLayoutManager mGridLayoutManager;




    //DATA
    private KoreanGirlAdapter mKoreanGirlAdapter;
    private GrpupKoreanGirlAdapter mGrpupKoreanGirlAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)findViewById(R.id.rvList);
        mButtonLinear = (Button) findViewById(R.id.btn_1);
        mButtonGrid = (Button) findViewById(R.id.btn_2);
        mButtonMix = (Button) findViewById(R.id.btn_3);


        mButtonLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRecyclerView.setLayoutManager(mLinearLayoutManager);
                mRecyclerView.setAdapter(mKoreanGirlAdapter);
            }
        });


        mButtonGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRecyclerView.setLayoutManager(mGridLayoutManager);
                mRecyclerView.setAdapter(mKoreanGirlAdapter);
            }
        });

        mButtonMix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRecyclerView.setLayoutManager(mLinearLayoutManager);
                mRecyclerView.setAdapter(mGrpupKoreanGirlAdapter);
            }
        });



        mLinearLayoutManager =   new LinearLayoutManager(this);
        mGridLayoutManager =  new GridLayoutManager(this,NUM_COLUMS);


        mKoreanGirlAdapter =  new KoreanGirlAdapter(KoreanGirlModel.getMockGirls(),this);
        mGrpupKoreanGirlAdapter =  new GrpupKoreanGirlAdapter(GroupKoreanGirlModel.getMockGroupGirls(),this);

        mRecyclerView.setAdapter(mKoreanGirlAdapter);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);


    }
}
