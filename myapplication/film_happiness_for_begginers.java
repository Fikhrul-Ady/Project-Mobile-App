package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class film_happiness_for_begginers extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_happiness_for_begginers);

        // Inisialisasi VideoView
        videoView = findViewById(R.id.VideoView);

        // Set path video
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.happiness; // Ganti dengan sumber video Anda

        // Set URI video
        Uri uri = Uri.parse(videoPath);

        // Set video ke VideoView
        videoView.setVideoURI(uri);

        // Inisialisasi MediaController
        MediaController mediaController = new MediaController(this);

        // Hubungkan MediaController dengan VideoView
        mediaController.setAnchorView(videoView);

        // Set MediaController ke VideoView
        videoView.setMediaController(mediaController);

        // Jalankan video
        videoView.start();
    }
}