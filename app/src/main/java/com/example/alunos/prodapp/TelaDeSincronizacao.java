package com.example.alunos.prodapp;

import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static com.example.alunos.prodapp.R.id.textView;

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
        textVieTelaDeSincronizacaoStatusAlteranado.setText("        Sincronizado");
            textVieTelaDeSincronizacaoStatusAlteranado.setTextColor(Color.parseColor("#008B45"));
        }

    }
}
