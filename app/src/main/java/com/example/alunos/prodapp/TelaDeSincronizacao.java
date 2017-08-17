package com.example.alunos.prodapp;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TelaDeSincronizacao extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButtonSincronizar ;
    private ImageView TelaDeSincronizacaoStatusDefinicao ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_sincronizacao);

        imageButtonSincronizar = (ImageButton) findViewById(R.id.imageButtonSincronizar) ;
        TelaDeSincronizacaoStatusDefinicao = (ImageView) findViewById(R.id.TelaDeSincronizacaoStatusDefinicao) ;

        imageButtonSincronizar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (imageButtonSincronizar.isPressed()){
            TelaDeSincronizacaoStatusDefinicao.setImageResource(R.drawable.ic_menu_camera) ;
            //Toast.makeText(getBaseContext(), "Os dados foram sincronizados com sucesso !" , Toast.LENGTH_LONG).show();
        }

    }
}
