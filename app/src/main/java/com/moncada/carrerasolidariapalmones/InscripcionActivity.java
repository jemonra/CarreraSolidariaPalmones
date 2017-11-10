package com.moncada.carrerasolidariapalmones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InscripcionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion);

        WebView webView= (WebView)findViewById(R.id.webView);
        //findViewById returns an instance of View ,which is casted to target class

        //Permite al usuario hacer zoom
        webView.getSettings().setBuiltInZoomControls(true);

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);
        //This statement is used to enable the execution of JavaScript.

        webView.setVerticalScrollBarEnabled(false);
        //This statement hides the Vertical scroll bar and does not remove it.

        webView.setHorizontalScrollBarEnabled(false);
        //This statement hides the Horizontal scroll bar and does not remove it.

        webView.loadUrl("http://www.dorsalchip.es/carrera/2018/4/15/3_Carrera_Solidaria_Palmones.aspx");
        //This statement hides the scroll bar and does not remove it.
    }
}
