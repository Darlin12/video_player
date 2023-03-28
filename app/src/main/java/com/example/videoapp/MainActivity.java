package com.example.videoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    VideoView videoView, videoView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        videoView2 = findViewById(R.id.videoView2);

        //From local storage
        videoView.setVideoPath("android.resource://"+ getPackageName() + "/" + R.raw.hulu);

        //Setting the media controllers
        MediaController mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);
        videoView.start();


        //From a URL
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=lzomiJ3mZXY");
        videoView2.setVideoURI(uri);

        //setting the media controllers
        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        mc.setMediaPlayer(videoView2);
        videoView2.setMediaController(mc2);
        videoView2.start();
    }
}