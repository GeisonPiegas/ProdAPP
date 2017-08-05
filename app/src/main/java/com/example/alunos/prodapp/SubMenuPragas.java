package com.example.alunos.prodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SubMenuPragas extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LinearLayoutArroz;
    private LinearLayout LinearLayoutMilho;
    private LinearLayout LinearLayoutSoja;
    private LinearLayout LinearLayoutTrigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_pragas);

        LinearLayoutArroz = (LinearLayout) findViewById(R.id.LinearLayoutArroz);
        LinearLayoutMilho = (LinearLayout) findViewById(R.id.LinearLayoutMilho);
        LinearLayoutSoja = (LinearLayout) findViewById(R.id.LinearLayoutSoja);
        LinearLayoutTrigo = (LinearLayout) findViewById(R.id.LinearLayoutTrigo);

        LinearLayoutArroz.setOnClickListener(this);
        LinearLayoutMilho.setOnClickListener(this);
        LinearLayoutSoja.setOnClickListener(this);
        LinearLayoutTrigo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (LinearLayoutArroz.isPressed()) {
            Intent intentPragaArroz1 = new Intent(this, PragaArroz1.class);
            startActivity(intentPragaArroz1);
            Context contexto = getApplicationContext();
            String texto = "1";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();

        }
        if (LinearLayoutMilho.isPressed()) {
            Intent intentPragaMilho1 = new Intent(this, PragaMilho1.class);
            startActivity(intentPragaMilho1);
            Context contexto = getApplicationContext();
            String texto = "1";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();

        }
        if (LinearLayoutSoja.isPressed()) {
            Intent intentPragaSoja1 = new Intent(this, PragaSoja1.class);
            startActivity(intentPragaSoja1);
            Context contexto = getApplicationContext();
            String texto = "1";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();

        }
        if (LinearLayoutTrigo.isPressed()) {
            Context contexto = getApplicationContext();
            String texto = "Não Possui Pragas Cadastradas!";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
    }
}
