package com.example.navendu.engi2018;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class webViewUpdate extends AppCompatActivity {



    WebView w;
    ProgressBar pb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_update);
        pb=(ProgressBar)findViewById(R.id.pb);
        w=(WebView)findViewById(R.id.web);
        w.setVisibility(View.INVISIBLE);
    w.getSettings().setJavaScriptEnabled(true);
    w.setWebChromeClient(new WebChromeClient());
w.setWebViewClient(new WebViewClient(){


    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
    }

    @Override
    public void onPageFinished(WebView view, String url) {

        pb.setVisibility(View.GONE);
        w.setVisibility(View.VISIBLE);
        super.onPageFinished(view, url);
    }
});

w.loadUrl("http://touch.facebook.com/engifest/");






    }
}
