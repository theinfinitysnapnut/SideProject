package com.example.sideproject;

import androidx.annotation.RawRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaParser;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

   private ImageButton btnPlay;

   MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MediaPlayer mp = MediaPlayer.create(this, R.raw.press_button);
        //mp.start();

        btnPlay = findViewById(R.id.btn_play);
        ImageButton btnPlay = (ImageButton) findViewById(R.id.btn_play);




        Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);

        String sendThisString = "";
        String sendThisToo = "";

        secondActivity.putExtra("data1",sendThisString);
        secondActivity.putExtra("data1",sendThisToo);


        MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.press_button);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.release();
            }

        });



        btnPlay.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                startActivity(secondActivity);
                finish();
                mp.start();



            }
        });



        @SuppressLint("MissingInflateId")
        ImageView imageView = findViewById(R.id.gif_image);


        Glide.with(this)
                .load(R.drawable.logo)
                .into(imageView);
    }
}