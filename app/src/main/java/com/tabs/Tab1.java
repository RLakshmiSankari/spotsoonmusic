package com.tabs;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.model.Model;
import com.spotsoonpractical.GetVideosDetails;
import com.spotsoonpractical.R;

import java.util.ArrayList;

public class Tab1 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab_1,container,false);
        RecyclerView rv = (RecyclerView) v.findViewById(R.id.rvVideo);
        rv.setLayoutManager(new LinearLayoutManager(v.getContext()));
        rv.setAdapter(new VideosListAdapter(new GetVideosDetails(v.getContext()).getDetails()));
        return v;
    }

    class VideosListAdapter extends RecyclerView.Adapter<VideosViewHolder> {
        private final ArrayList<Model> videosDetails;

        VideosListAdapter(ArrayList<Model> details) {
            this.videosDetails = details;
        }

        @Override
        public VideosViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
            final View v = layoutInflater.inflate(R.layout.cardview, viewGroup, false);
            return new VideosViewHolder(v);
        }

        @Override
        public void onBindViewHolder(VideosViewHolder videosViewHolder, int i) {
            videosViewHolder.tvTitles.setText(videosDetails.get(i).getVideoTitle());
            videosViewHolder.tvLastPlay.setText(videosDetails.get(i).getVideoLastPlay());
            videosViewHolder.tvVideosUrl.setText(videosDetails.get(i).getVideoUrl());
            Bitmap thumb = ThumbnailUtils.createVideoThumbnail(GetVideosDetails.filepath,
                    MediaStore.Images.Thumbnails.MINI_KIND);
            videosViewHolder.iv.setImageDrawable(getResources().getDrawable(videosDetails.get(i).getIv()));
        }

        @Override
        public int getItemCount() {
            return videosDetails.size();
        }
    }

    class VideosViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitles, tvVideosUrl, tvLastPlay;
        ImageView iv;

        VideosViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.iv);
            tvTitles = (TextView) itemView.findViewById(R.id.tvTitles);
            tvLastPlay = (TextView) itemView.findViewById(R.id.tvLastPlay);
            tvVideosUrl = (TextView) itemView.findViewById(R.id.tvVideosUrl);
        }
    }
}
