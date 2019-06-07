package br.com.termos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvTermos ;
    private TextView tvContrato ;
    private TextView tvTermosAtual ;
    private TextView tvContratoAtual ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTermos = (TextView) findViewById(R.id.tvTermos);
        tvContrato = (TextView) findViewById(R.id.tvContrato);
        tvTermosAtual = (TextView) findViewById(R.id.tvTermosAtual);
        tvContratoAtual = (TextView) findViewById(R.id.tvContratoAtual);
        tvTermos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "http://adroot1.ddns.net:3355/Privacidade.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);
                //finish();

            }
        });
        tvContrato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "https://www.userede.com.br/pt-BR/Documents/MobileRede/PoliticaPrivacidade.htm"); //Your id
                //b.putString("url", "http://adroot1.ddns.net:3355/Privacidade.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);
                //finish();

            }
        });
        tvContratoAtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, webview.class);
                Bundle b = new Bundle();
                b.putString("url", "https://www.userede.com.br/TermosMobileRede/Paginas/Contrato_Credenciamento_Adesao.htm"); //Your id
                intent.putExtras(b); //Put your id to your next Intent
                startActivity(intent);

            }
        });
    }
}
