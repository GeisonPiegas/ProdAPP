package com.example.alunos.prodapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaDeSincronizacao extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButtonSincronizar ;
    private ImageView TelaDeSincronizacaoStatusDefinicao ;
    private TextView textVieTelaDeSincronizacaoStatusAlteranado ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_sincronizacao);

        imageButtonSincronizar = (ImageButton) findViewById(R.id.imageButtonSincronizar) ;
        textVieTelaDeSincronizacaoStatusAlteranado = (TextView) findViewById(R.id.textVieTelaDeSincronizacaoStatusAlteranado) ;

        imageButtonSincronizar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (imageButtonSincronizar.isPressed()){
            imageButtonSincronizar.setImageResource(R.drawable.sincromuda);
            textVieTelaDeSincronizacaoStatusAlteranado.setText("        Sincronizado");
            textVieTelaDeSincronizacaoStatusAlteranado.setTextColor(Color.parseColor("#008B45"));
        }

    }
}
