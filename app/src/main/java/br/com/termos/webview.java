package br.com.termos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class webview extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Bundle b = getIntent().getExtras();
        String url = "http://www.google.com"; // or other values
        if(b != null)
            url = b.getString("url");
        webView = findViewById(R.id.webview);
        webView.loadUrl(url);


    }
}
