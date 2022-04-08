package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.HeaderViewListAdapter;

public class splash_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(splash_screen.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}