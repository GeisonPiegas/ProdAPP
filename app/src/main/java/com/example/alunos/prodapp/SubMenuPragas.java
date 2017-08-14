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

        //Setando os layouts na lista de cliques
        LinearLayoutArroz.setOnClickListener(this);
        LinearLayoutMilho.setOnClickListener(this);
        LinearLayoutSoja.setOnClickListener(this);
        LinearLayoutTrigo.setOnClickListener(this);
    }

    //testando se cada um dos layouts foram clicados, se sim, eles levão a uma determinada activity
    // cada layout foi diminuido o tamanho pra parecer tipo uma lista na parte grafica dessa activity
    @Override
    public void onClick(View v) {
        if (LinearLayoutArroz.isPressed()) {
            Intent intentSubPragaArroz = new Intent(this, SubSubMenuArroz.class);
            startActivity(intentSubPragaArroz);
            //Context contexto = getApplicationContext();
            //String texto = "1";
            //int duracao = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(contexto, texto,duracao);
            //toast.show();

        }
        if (LinearLayoutMilho.isPressed()) {
            Intent intentSubPragaMilho = new Intent(this, SubSubMenuMilho.class);
            startActivity(intentSubPragaMilho);
            //Context contexto = getApplicationContext();
            //String texto = "1";
            //int duracao = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(contexto, texto,duracao);
            //toast.show();

        }
        if (LinearLayoutSoja.isPressed()) {
            Intent intentSubPragaSoja = new Intent(this, SubSubMenuSoja.class);
            startActivity(intentSubPragaSoja);
            //Context contexto = getApplicationContext();
            //String texto = "1";
            //int duracao = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(contexto, texto,duracao);
            //toast.show();

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
