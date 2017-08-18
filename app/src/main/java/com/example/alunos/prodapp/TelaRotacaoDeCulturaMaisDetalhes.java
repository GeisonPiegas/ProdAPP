package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TelaRotacaoDeCulturaMaisDetalhes extends AppCompatActivity implements View.OnClickListener {

    private ImageView grafrico1 ;
    private ImageView grafrico2 ;
    private ImageView grafrico4 ;
    private ImageView grafrico5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_rotacao_de_cultura_mais_detalhes);
        grafrico1 = (ImageView) findViewById(R.id.grafico1) ;
        grafrico2 = (ImageView) findViewById(R.id.grafico2) ;
        grafrico4 = (ImageView) findViewById(R.id.grafico4) ;
        grafrico5 = (ImageView) findViewById(R.id.grafico5) ;

        grafrico1.setOnClickListener(this);
        grafrico2.setOnClickListener(this);
        grafrico4.setOnClickListener(this);
        grafrico5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (grafrico1.isPressed()){

        }

        if (grafrico2.isPressed()){

        }

        if (grafrico4.isPressed()){

        }

        if (grafrico5.isPressed()){

        }
    }
}
