package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MenuCentral extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayout;
    private ScrollView ScrollView;
    private LinearLayout LinearLayoutVertical;
    private LinearLayout LinearLayoutHorizontal1;
    private ImageButton imageButtonSilo;
    private ImageButton imageButtonUsuario;
    private LinearLayout LinearLayoutHorizontal2;
    private ImageButton imageButtonNoticias;
    private ImageButton imageButtonCalendario;
    private LinearLayout LinearLayoutHorizontal3;
    private ImageButton imageButtonPragas;
    private ImageButton imageButtonSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_central);

        imageButtonSilo = (ImageButton) findViewById(R.id.imageButtonSilo);
        imageButtonUsuario = (ImageButton) findViewById(R.id.imageButtonUsuario);
        imageButtonNoticias = (ImageButton) findViewById(R.id.imageButtonNoticias);
        imageButtonCalendario = (ImageButton) findViewById(R.id.imageButtonCalendario);
        imageButtonPragas = (ImageButton) findViewById(R.id.imageButtonPragas);
        imageButtonSair = (ImageButton) findViewById(R.id.imageButtonSair);

        imageButtonSilo.setOnClickListener(this);
        imageButtonUsuario.setOnClickListener(this);
        imageButtonNoticias.setOnClickListener(this);
        imageButtonCalendario.setOnClickListener(this);
        imageButtonPragas.setOnClickListener(this);
        imageButtonSair.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (imageButtonSilo.isPressed()) {
            Intent intentListaSilos = new Intent(this, ListaSilos.class);
            startActivity(intentListaSilos);
        }
        if (imageButtonUsuario.isPressed()) {
            Intent intentListaUsuarios = new Intent(this, ListaUsuarios.class);
            startActivity(intentListaUsuarios);
        }
        if (imageButtonNoticias.isPressed()) {

        }
        if (imageButtonCalendario.isPressed()) {

        }
        if (imageButtonPragas.isPressed()) {
            Intent intentSubMenuPragas = new Intent(this, SubMenuPragas.class);
            startActivity(intentSubMenuPragas);

        }
        if (imageButtonSair.isPressed()) {
            finish();
        }

    }
}
