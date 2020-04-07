package com.example.i01webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wb=findViewById(R.id.webView);
        wb.loadUrl("https://www.google.ro/");
        wb.setWebViewClient(new WebViewClient());
    }
}
