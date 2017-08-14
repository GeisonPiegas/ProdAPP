package com.example.alunos.prodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class TelaComoDescartar extends AppCompatActivity implements View.OnClickListener {
    private ImageView imageViewLavagem;
    private ImageView imageViewDescarte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_como_descartar);

        imageViewLavagem = (ImageView) findViewById(R.id.imageViewLavagem);
        imageViewDescarte = (ImageView) findViewById(R.id.imageViewDescarte);

        imageViewLavagem.setOnClickListener(this);
        imageViewDescarte.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (imageViewLavagem.isPressed()) {
            Intent intentComoDescartar = new Intent(this, ZoomDescarte2.class);
            startActivity(intentComoDescartar);

            Context contexto = getApplicationContext();
            String texto = "Clique na imagem para voltar";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
        if (imageViewDescarte.isPressed()) {
            Intent intentComoDescartar = new Intent(this, ZoomDescarte1.class);
            startActivity(intentComoDescartar);

            Context contexto = getApplicationContext();
            String texto = "Clique na imagem para voltar";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
    }
}
