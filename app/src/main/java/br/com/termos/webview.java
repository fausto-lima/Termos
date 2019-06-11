package br.com.termos;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class webview extends AppCompatActivity {
    ProgressDialog pd;

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pd = new ProgressDialog(this);
        setContentView(R.layout.activity_webview);
        Bundle b = getIntent().getExtras();
        String url = "http://www.google.com"; // or other values
        if(b != null) {
            url = b.getString("url");
            pd.dismiss();
        }
        webView = findViewById(R.id.webview);
        webView.loadUrl(url);
        pd.dismiss();
    }
}
