package com.example.alunos.prodapp;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NoticiaAgroeste extends AppCompatActivity implements View.OnClickListener{
    private TextView textViewLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_agroeste);

        textViewLink = (TextView) findViewById(R.id.textViewLink);

        textViewLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (textViewLink.isPressed()) {

            /*
            //Codigo pra tentar abrir um link no google chrome, mas crasha o app

            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setData(Uri.parse("http://www.agroeste.com.br/"));
            startActivity(intent);
            */
        }

    }
}
