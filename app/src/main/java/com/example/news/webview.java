package com.example.news;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        binding();

        String sandesh=getIntent().getStringExtra("n1");
        webView.loadUrl(sandesh);

        String tv9=getIntent().getStringExtra("n2");
        webView.loadUrl(tv9);

        String gujrati=getIntent().getStringExtra("n3");
        webView.loadUrl(gujrati);

        String etv=getIntent().getStringExtra("n4");
        webView.loadUrl(etv);

        String zee=getIntent().getStringExtra("n5");
        webView.loadUrl(zee);

        String vtv=getIntent().getStringExtra("n6");
        webView.loadUrl(vtv);

        String gstv=getIntent().getStringExtra("n7");
        webView.loadUrl(gstv);

        String city=getIntent().getStringExtra("n8");
        webView.loadUrl(city);

        String tv18=getIntent().getStringExtra("n9");
        webView.loadUrl(tv18);



        webView.setWebViewClient(new WebViewClient());
    }
    void binding()
    {
        webView=findViewById(R.id.web_view);
    }

}