package com.model;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by root on 21/7/17.
 */

public class Model {
    int iv;
    Bitmap imageView;
    String videoTitle;
    String videoLastPlay;
    String videoUrl;

    public Model() {
    }

    public Model(int iv, String videoTitle, String videoLastPlay, String videoUrl) {
        this.iv = iv;
        this.videoTitle = videoTitle;
        this.videoLastPlay = videoLastPlay;
        this.videoUrl = videoUrl;
    }



    public int getIv() {
        return iv;
    }

    public void setIv(int iv) {
        this.iv = iv;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getVideoLastPlay() {
        return videoLastPlay;
    }

    public void setVideoLastPlay(String videoLastPlay) {
        this.videoLastPlay = videoLastPlay;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
