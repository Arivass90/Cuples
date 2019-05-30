package com.example.alexr.couples.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.alexr.couples.GlideApp;
import com.example.alexr.couples.R;

public class MediaActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

    Intent intent = getIntent();
    mImageView = findViewById(R.id.imageView);
    String mediaUrl = intent.getStringExtra("imagen");

        if(mImageView!= null) {
        GlideApp.with(this).load(mediaUrl).into(mImageView);
    }
}
}
