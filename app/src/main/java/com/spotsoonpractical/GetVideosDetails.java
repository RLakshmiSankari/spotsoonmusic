package com.spotsoonpractical;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;

import com.model.Model;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by root on 21/7/17.
 */

public class GetVideosDetails {
    Context context;
    public static String filepath = Environment.getExternalStorageDirectory() + File.separator + "Movies" + File.separator + "ccc.mp4";

    public GetVideosDetails(Context context){
        this.context = context;
    }

    public ArrayList<Model> getDetails(){
        ArrayList<Model> arrayList = new ArrayList<>();
        try {
            Model model = new Model();
            model.setIv(R.drawable.images);
            model.setVideoLastPlay("18 HOURS AGO");
            model.setVideoTitle("EMPTINESS FT.JUSTIN TIBLEKAR");
            model.setVideoUrl("Lorem Ipsum is simply dummy text of the printing and typecasting industry");
            arrayList.add(model);
            model  = new Model();
            model.setIv(R.drawable.images5);
            model.setVideoLastPlay("20 HOURS AGO");
            model.setVideoTitle("I'M FALLING LOVE WITH YOU");
            model.setVideoUrl("Lorem Ipsum is simply dummy text of the printing and typecasting industry");
            arrayList.add(model);
            model  = new Model();
            model.setIv(R.drawable.images8);
            model.setVideoLastPlay("15 HOURS AGO");
            model.setVideoTitle("BABY FT.JUSTIN BABER");
            model.setVideoUrl("Lorem Ipsum is simply dummy text of the printing and typecasting industry");
            arrayList.add(model);
            model  = new Model();
            model.setIv(R.drawable.images1);
            model.setVideoLastPlay("30 HOURS AGO");
            model.setVideoTitle("WHITE HOREST FT.TAYLOR SWIFT");
            model.setVideoUrl("Lorem Ipsum is simply dummy text of the printing and typecasting industry");
            arrayList.add(model);
        }catch (Exception e){

        }
        return arrayList;
    }

}
