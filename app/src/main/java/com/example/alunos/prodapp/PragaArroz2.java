package com.example.alunos.prodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PragaArroz2 extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayout;
    private ImageButton imageButtonEsquerda;
    private ImageButton imageButtonDireita;
    private android.widget.ScrollView ScrollView;
    private LinearLayout LinearLayoutVertical;
    private LinearLayout LinearLayoutHorizontal1;
    private TextView textViewTitulo;
    private TextView textViewTituloAbaixo;
    private android.widget.HorizontalScrollView HorizontalScrollView;
    private LinearLayout LinerLayoutHorizontal2;
    private ImageButton imageViewArroz1;
    private ImageButton imageViewArroz2;
    private ImageButton imageViewArroz3;
    private ImageButton imageViewArroz4;
    private TextView textViewSobre;
    private TextView textViewSubTitulo;
    private TextView textViewSubSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praga_arroz2);

        imageButtonDireita = (ImageButton) findViewById(R.id.imageButtonDireita);
        imageButtonEsquerda = (ImageButton) findViewById(R.id.imageButtonEsquerda);

        imageButtonDireita.setOnClickListener(this);
        imageButtonEsquerda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (imageButtonDireita.isPressed()) {
            Context contexto = getApplicationContext();
            String texto = "2";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
        if (imageButtonEsquerda.isPressed()) {
            Intent intentPragaArroz1 = new Intent(this, PragaArroz1.class);
            startActivity(intentPragaArroz1);

            Context contexto = getApplicationContext();
            String texto = "1";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }

    }
}
