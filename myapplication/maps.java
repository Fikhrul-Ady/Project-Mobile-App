package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class maps extends AppCompatActivity {
    private MaterialButton Btnpinlocate;
    private String latitudeOne = "-6.238270";
    private String longtitudeOne = "106.975571";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        setLayout();
        setClick();
    }

    void setLayout(){
        Btnpinlocate = findViewById(R.id.Btnpinlocate);
    }

    void setClick(){
        Btnpinlocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Btnpinlocate(latitudeOne, longtitudeOne);
            }
        });
    }
    private void Btnpinlocate(String latitude, String longtitude) {
        Uri mapUri = Uri.parse("https://maps.google.com/maps/search/" + latitude + ","+ longtitude);
        Intent intent = new Intent(Intent.ACTION_VIEW,mapUri);
        startActivity(intent);
    }
}