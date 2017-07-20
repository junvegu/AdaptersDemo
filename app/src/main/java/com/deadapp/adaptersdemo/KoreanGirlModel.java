package com.deadapp.adaptersdemo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by luizkawai on 20/07/17.
 */

public class KoreanGirlModel implements Serializable {

    private int id = 0;
    private String photo;
    private String name;

    public int getId() {
        return id;
    }


    public KoreanGirlModel(String photo) {
        this.photo = photo;
    }

    public static ArrayList<KoreanGirlModel> getMockGirls(){
        ArrayList<KoreanGirlModel> koreanGirlModels =  new ArrayList<>();

        koreanGirlModels.add(new KoreanGirlModel("https://s-media-cache-ak0.pinimg.com/564x/ef/82/b5/ef82b5e2b43d415fe62c916126176ec6.jpg"));
        koreanGirlModels.add(new KoreanGirlModel("https://s-media-cache-ak0.pinimg.com/originals/21/90/f0/2190f078a59ec569629b3659c822f4e8.jpg"));
        koreanGirlModels.add(new KoreanGirlModel("https://s-media-cache-ak0.pinimg.com/originals/bc/21/c2/bc21c2586db78b664952381a76557676.jpg"));
        koreanGirlModels.add(new KoreanGirlModel("https://s-media-cache-ak0.pinimg.com/originals/6a/d2/ad/6ad2add9247262c5ea6ba5b734ce40bd.png"));
        koreanGirlModels.add(new KoreanGirlModel("http://www.allkpop.com/upload/2017/04/af_org/black-pink_1491245567_af_org.jpg"));
        koreanGirlModels.add(new KoreanGirlModel("https://s-media-cache-ak0.pinimg.com/564x/ef/82/b5/ef82b5e2b43d415fe62c916126176ec6.jpg"));
        koreanGirlModels.add(new KoreanGirlModel("http://www.moonrok.com/wp-content/uploads/rose_1.png"));

        return koreanGirlModels;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
