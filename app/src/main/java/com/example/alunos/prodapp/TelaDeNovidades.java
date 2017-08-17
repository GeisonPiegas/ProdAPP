package com.example.alunos.prodapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class TelaDeNovidades extends AppCompatActivity implements View.OnClickListener{
    private ImageButton imageButtonAgroeste;
    private ImageButton imageButtonDeklab;
    private ImageButton imageButtonDimicron;
    private ImageButton imageButtonSementesEstrela;

    private Button buttonNovidades;
    private Button buttonForcedores;
    private ScrollView ScrollViewNovidades;
    private ScrollView ScrollViewFornecedores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_novidades);

        imageButtonAgroeste = (ImageButton) findViewById(R.id.imageButtonAgroeste);
        imageButtonDeklab = (ImageButton) findViewById(R.id.imageButtonDeklab);
        imageButtonDimicron = (ImageButton) findViewById(R.id.imageButtonDimicron);
        imageButtonSementesEstrela = (ImageButton) findViewById(R.id.imageButtonSementesEstrela);
        buttonNovidades = (Button) findViewById(R.id.buttonNovidades);
        buttonForcedores = (Button) findViewById(R.id.buttonForcedores);
        ScrollViewNovidades = (ScrollView) findViewById(R.id.ScrollViewNovidades);
        ScrollViewFornecedores = (ScrollView) findViewById(R.id.ScrollViewFornecedores);

        buttonForcedores.setOnClickListener(this);
        buttonNovidades.setOnClickListener(this);
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
        if (buttonNovidades.isPressed()) {
            ScrollViewNovidades.setVisibility(View.VISIBLE);
            ScrollViewFornecedores.setVisibility(View.GONE);

            buttonNovidades.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
            buttonForcedores.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

            buttonNovidades.setTypeface(null, Typeface.BOLD);
            buttonForcedores.setTypeface(null, Typeface.NORMAL);
        }
        if (buttonForcedores.isPressed()) {
            ScrollViewFornecedores.setVisibility(View.VISIBLE);
            ScrollViewNovidades.setVisibility(View.GONE);

            buttonForcedores.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
            buttonNovidades.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

            buttonForcedores.setTypeface(null, Typeface.BOLD);
            buttonNovidades.setTypeface(null, Typeface.NORMAL);
        }

    }
}
