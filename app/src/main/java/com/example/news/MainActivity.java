package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView sandesh_btn,tv9_btn,gujrati_btn,etv_btn,zee_btn,vtv_btn,gstv_btn,city_btn,tv18_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        biuding();

        sandesh_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sandesh = "https://sandeshepaper.in/edition/42819/surat";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n1", sandesh);
                startActivity(intent);

            }
        });
        tv9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tv9 = "https://www.tv9hindi.com/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n2", tv9);
                startActivity(intent);

            }
        });
        gujrati_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gujrati = "https://gujarati.news18.com/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n3", gujrati);
                startActivity(intent);

            }
        });
        etv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String etv = "https://gujarati.news18.com/live-tv/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n4", etv);
                startActivity(intent);

            }
        });
        zee_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String zee = "https://zeenews.india.com/tags/paper.html";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n5", zee);
                startActivity(intent);

            }
        });
        vtv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String vtv = "https://www.vtvgujarati.com/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n6", vtv);
                startActivity(intent);

            }
        });
        gstv_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gstv = "https://www.gstv.in/live/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n7", gstv);
                startActivity(intent);

            }
        });
        city_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String city = "https://timesofindia.indiatimes.com/city";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n8", city);
                startActivity(intent);

            }
        });
        tv18_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tv18 = "https://www.news18.com/topics/tv18/";
                Intent intent = new Intent(MainActivity.this, webview.class);
                intent.putExtra("n9", tv18);
                startActivity(intent);

            }
        });
    }

    void biuding() {
        sandesh_btn = findViewById(R.id.sandesh_btn);
        tv9_btn = findViewById(R.id.tv9_btn);
        gujrati_btn = findViewById(R.id.gujrati_btn);
        etv_btn = findViewById(R.id.etv_btn);
        gstv_btn = findViewById(R.id.gstv_btn);
        zee_btn = findViewById(R.id.zee_btn);
        vtv_btn = findViewById(R.id.vtv_btn);
        city_btn = findViewById(R.id.city_btn);
        tv18_btn = findViewById(R.id.tv18_btn);
    }
}