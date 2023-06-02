package com.example.sideproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

   ImageButton btnPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play);

        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);

        String sendThisString = "";
        String sendThisToo = "";

        secondActivity.putExtra("data1",sendThisString);
        secondActivity.putExtra("data1",sendThisToo);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(secondActivity);
            }
        });

        @SuppressLint("MissingInflateId")
        ImageView imageView = findViewById(R.id.gif_image);


        Glide.with(this)
                .load(R.drawable.logo)
                .into(imageView);
    }
}