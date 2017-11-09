package com.moncada.carrerasolidariapalmones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
        WebView webView= (WebView)findViewById(R.id.webView);
//findViewById returns an instance of View ,which is casted to target class
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
//This statement is used to enable the execution of JavaScript.

        webView.setVerticalScrollBarEnabled(false);
//This statement hides the Vertical scroll bar and does not remove it.

        webView.setHorizontalScrollBarEnabled(false);
//This statement hides the Horizontal scroll bar and does not remove it.

        webView.loadUrl("https://photos.google.com/share/AF1QipNe8UKRY62ey-x2g0iMRr6LQgxRmqF0eRyI7b8FaPiWCqisZPyP6T7BnFtJ0vvDPQ?key=cW5BQXVXekVqU3VWMmJmZGVNMFAwRkRRam53MnN3");
//This statement hides the scroll bar and does not remove it.
    }
}
