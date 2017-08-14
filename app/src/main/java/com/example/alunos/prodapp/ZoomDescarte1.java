package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ZoomDescarte1 extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageViewDescarte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_descarte1);

        imageViewDescarte = (ImageView) findViewById(R.id.imageViewDescarte);

        imageViewDescarte.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (imageViewDescarte.isPressed()) {
            Intent intentComoDescartar = new Intent(this, TelaComoDescartar.class);
            startActivity(intentComoDescartar);
        }
    }
}
