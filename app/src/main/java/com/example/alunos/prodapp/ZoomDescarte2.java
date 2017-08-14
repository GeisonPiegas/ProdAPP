package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ZoomDescarte2 extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageViewLavagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_descarte2);

        imageViewLavagem = (ImageView) findViewById(R.id.imageViewLavagem);

        imageViewLavagem.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (imageViewLavagem.isPressed()) {
            Intent intentComoDescartar = new Intent(this, TelaComoDescartar.class);
            startActivity(intentComoDescartar);
        }
    }
}
