package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.alunos.prodapp.R.id.imageViewGrafico;

public class ZoomGrafico2 extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageViewGrafico2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_grafico2);


        imageViewGrafico2 = (ImageView) findViewById(R.id.imageViewGrafico2);

        imageViewGrafico2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(imageViewGrafico2.isPressed()){
            Intent intentZoomGrafico = new Intent(this, TelaRotacaoDeCulturaMaisDetalhes.class);
            startActivity(intentZoomGrafico);
            finish();
        }
    }
}
