package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaColetaAgrotoxicos extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButtonComoDescartar;
    private ImageButton imageButtonOndeDescartar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_coleta_agrotoxicos);

        imageButtonComoDescartar = (ImageButton) findViewById(R.id.imageButtonComoDescartar);
        imageButtonOndeDescartar = (ImageButton) findViewById(R.id.imageButtonOndeDescartar);

        imageButtonComoDescartar.setOnClickListener(this);
        imageButtonOndeDescartar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (imageButtonComoDescartar.isPressed()) {
            Intent intentComo = new Intent(this, TelaComoDescartar.class);
            startActivity(intentComo);
        }

        if (imageButtonOndeDescartar.isPressed()) {
            Intent intentOnde = new Intent(this, TelaOndeDescartar.class);
            startActivity(intentOnde);
        }
    }
}

