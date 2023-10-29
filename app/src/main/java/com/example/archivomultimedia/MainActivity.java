package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //VIDEO LOCAL

        //VideoView miVideo = findViewById(R.id.videoView);
        //String video = "android.resource://"+getPackageName()+"/"+R.raw.ando;
        //Uri uri = Uri.parse(video);
        //miVideo.setVideoURI(uri);
        //MediaController mController = new MediaController(this);
        //miVideo.setMediaController(mController);
        //mController.setAnchorView(miVideo);

//        VIDEO POR DRIVE
//        video = findViewById(R.id.videoView);
//        String url = "https://drive.google.com/uc?export=download&id=15h-OQsLdoh9-Lv11TdWLtOSjWwYnjFfl";
//        MediaController mController = new MediaController(this);
//        video.setMediaController(mController);
//        mController.setAnchorView(video);
//        video.setVideoURI(Uri.parse(url));
//        video.start();
    }
}