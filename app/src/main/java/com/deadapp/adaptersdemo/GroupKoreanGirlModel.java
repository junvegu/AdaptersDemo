package com.deadapp.adaptersdemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by luizkawai on 20/07/17.
 */

public class GroupKoreanGirlModel implements Serializable {

    private ArrayList<KoreanGirlModel> koreanGirlModels;


    public static ArrayList<GroupKoreanGirlModel> getMockGroupGirls(){
        ArrayList<GroupKoreanGirlModel> koreanGirlModels =  new ArrayList<>();

        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        koreanGirlModels.add(new GroupKoreanGirlModel(KoreanGirlModel.getMockGirls()));
        return koreanGirlModels;
    }

    public GroupKoreanGirlModel(ArrayList<KoreanGirlModel> koreanGirlModels) {
        this.koreanGirlModels = koreanGirlModels;
    }

    public ArrayList<KoreanGirlModel> getKoreanGirlModels() {
        return koreanGirlModels;
    }

    public void setKoreanGirlModels(ArrayList<KoreanGirlModel> koreanGirlModels) {
        this.koreanGirlModels = koreanGirlModels;
    }
}

