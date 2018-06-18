package com.brillica_services.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class webcode extends AppCompatActivity {
    WebView browser;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webcode);
        browser=(WebView) findViewById(R.id.web_view);
        progressBar=(ProgressBar)findViewById(R.id.progress_bar);
        browser.loadUrl("https://www.google.com/");
        browser.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view,int progress){
                if(progress==100){
                    progressBar.setVisibility(View.GONE);
                    browser.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
