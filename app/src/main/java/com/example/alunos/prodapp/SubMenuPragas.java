package com.example.alunos.prodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SubMenuPragas extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LinearLayoutSoja;
    private LinearLayout LinearLayoutMilho;
    private LinearLayout LinearLayoutTrigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_pragas);

        LinearLayoutSoja = (LinearLayout) findViewById(R.id.LinearLayoutSoja);
        LinearLayoutMilho = (LinearLayout) findViewById(R.id.LinearLayoutMilho);
        LinearLayoutTrigo = (LinearLayout) findViewById(R.id.LinearLayoutTrigo);

        LinearLayoutSoja.setOnClickListener(this);
        LinearLayoutMilho.setOnClickListener(this);
        LinearLayoutTrigo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (LinearLayoutSoja.isPressed()) {
            Intent intentPragaSoja1 = new Intent(this, PragaSoja1.class);
            startActivity(intentPragaSoja1);

        }
        if (LinearLayoutMilho.isPressed()) {

        }
        if (LinearLayoutTrigo.isPressed()) {

        }
    }
}
