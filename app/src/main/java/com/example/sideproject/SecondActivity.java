package com.example.sideproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String recieve1 = intent.getStringExtra("data1");
        String recieve2 = intent.getStringExtra("data2");

        @SuppressLint("MissingInflateId")
        ImageView imageView = findViewById(R.id.gif_image2);
        
        Glide.with(this)
                .load(R.drawable.tutorial)
                .into(new GifDrawableImageViewTarget(imageView, 1));



    }
}