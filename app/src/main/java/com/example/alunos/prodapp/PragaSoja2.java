package com.example.alunos.prodapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class PragaSoja2 extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayout;
    private ImageButton imageButtonEsquerda;
    private ImageButton imageButtonDireita;
    private ScrollView ScrollView;
    private LinearLayout LinearLayoutVertical;
    private LinearLayout LinearLayoutHorizontal1;
    private TextView textViewTitulo;
    private TextView textViewTituloAbaixo;
    private HorizontalScrollView HorizontalScrollView;
    private LinearLayout LinerLayoutHorizontal2;
    private ImageButton imageViewSoja1;
    private ImageButton imageViewSoja2;
    private ImageButton imageViewSoja3;
    private ImageButton imageViewSoja4;
    private TextView textViewSobre;
    private TextView textViewSubTitulo;
    private TextView textViewSubSobre;
    private Button buttonVerProdutos;
    private RelativeLayout RelativeLayoutVerMais;
    private boolean teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praga_soja2);


        imageButtonDireita = (ImageButton) findViewById(R.id.imageButtonDireita);
        imageButtonEsquerda = (ImageButton) findViewById(R.id.imageButtonEsquerda);
        buttonVerProdutos = (Button) findViewById(R.id.buttonVerProdutos);
        RelativeLayoutVerMais = (android.widget.RelativeLayout) findViewById(R.id.RelativeLayoutVerMais);

        imageButtonDireita.setOnClickListener(this);
        imageButtonEsquerda.setOnClickListener(this);
        buttonVerProdutos.setOnClickListener(this);

        RelativeLayoutVerMais.setVisibility(View.GONE);
        teste = true;
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
            Intent intentPragaSoja1 = new Intent(this, PragaSoja1.class);
            startActivity(intentPragaSoja1);

            Context contexto = getApplicationContext();
            String texto = "1";
            int duracao = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
        if (buttonVerProdutos.isPressed()) {
            if(teste == true){
                RelativeLayoutVerMais.setVisibility(View.VISIBLE);
                buttonVerProdutos.setText("FECHAR PRODUTOS PARA CONTROLE");
                teste = false;
            }else{
                RelativeLayoutVerMais.setVisibility(View.GONE);
                buttonVerProdutos.setText("VER PRODUTOS PARA CONTROLE");
                teste = true;
            }
        }

    }
}
