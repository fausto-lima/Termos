package br.com.termos;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ProgressDialog pd;

    private TextView tvTermos ;
    private TextView tvContrato ;
    private TextView tvTermosAtual ;
    private TextView tvContratoAtual ;

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.ThreadPolicy policy =new
        StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        context = this;
        pd = new ProgressDialog(context);
        if (pd.isShowing()){
            pd.dismiss();
        }

        setTitle(R.string.app_name);
        setContentView(R.layout.activity_main);
        tvTermos = (TextView) findViewById(R.id.tvTermos);
        tvContrato = (TextView) findViewById(R.id.tvContrato);
        tvTermosAtual = (TextView) findViewById(R.id.tvTermosAtual);
        tvContratoAtual = (TextView) findViewById(R.id.tvContratoAtual);
        tvTermos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pd.show();
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "http://adroot1.ddns.net:3355/Privacidade.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);

            }
        });
        tvContrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.show();
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "http://adroot1.ddns.net:3355/Termos.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);
            }
        });
        tvTermosAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pd.show();
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "https://www.userede.com.br/pt-BR/Documents/MobileRede/PoliticaPrivacidade.htm"); //Your id
                //b.putString("url", "http://adroot1.ddns.net:3355/Privacidade.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);

            }
        });
        tvContratoAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd.show();
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "https://www.userede.com.br/TermosMobileRede/Paginas/Contrato_Credenciamento_Adesao.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);
            }
        });
    }
}
