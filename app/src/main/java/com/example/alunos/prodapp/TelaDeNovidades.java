package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TelaDeNovidades extends AppCompatActivity implements View.OnClickListener{
    private ImageButton imageButtonAgroeste;
    private ImageButton imageButtonDeklab;
    private ImageButton imageButtonDimicron;
    private ImageButton imageButtonSementesEstrela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_novidades);

        imageButtonAgroeste = (ImageButton) findViewById(R.id.imageButtonAgroeste);
        imageButtonDeklab = (ImageButton) findViewById(R.id.imageButtonDeklab);
        imageButtonDimicron = (ImageButton) findViewById(R.id.imageButtonDimicron);
        imageButtonSementesEstrela = (ImageButton) findViewById(R.id.imageButtonSementesEstrela);

        imageButtonAgroeste.setOnClickListener(this);
        imageButtonDeklab.setOnClickListener(this);
        imageButtonDimicron.setOnClickListener(this);
        imageButtonSementesEstrela.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (imageButtonAgroeste.isPressed()) {
            Intent intentAgroeste = new Intent(this, NoticiaAgroeste.class);
            startActivity(intentAgroeste);
        }
        if (imageButtonDeklab.isPressed()) {
            Intent intentDeklab = new Intent(this, NoticiaDeklab.class);
            startActivity(intentDeklab);
        }
        if (imageButtonDimicron.isPressed()) {
            Intent intentDimicron = new Intent(this, NoticiaDimicron.class);
            startActivity(intentDimicron);
        }
        if (imageButtonSementesEstrela.isPressed()) {
            Intent intentSementesEstreka = new Intent(this, NoticiaSementesEstrela.class);
            startActivity(intentSementesEstreka);
        }

    }
}
