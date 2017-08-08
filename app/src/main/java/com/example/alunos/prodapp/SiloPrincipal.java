package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import util.Contexto;

public class SiloPrincipal extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView3;
    private Toolbar toolbar1;
    private Toolbar toolbar2;
    private Toolbar toolbar3;
    private Toolbar toolbar4;
    private Toolbar toolbar5;
    private Toolbar toolbar6;
    private Toolbar toolbar7;
    private Toolbar toolbar8;
    private Toolbar toolbar9;
    private Toolbar toolbar10;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textViewNomeSilo;
    private ImageButton imageButtonEsquerda;
    private ImageButton imageButtonDireita;

    private EditText editText;
    private Button button2;
    private String teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silo_principal);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        toolbar1 = (Toolbar) findViewById(R.id.toolbar1);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        toolbar3 = (Toolbar) findViewById(R.id.toolbar3);
        toolbar4 = (Toolbar) findViewById(R.id.toolbar4);
        toolbar5 = (Toolbar) findViewById(R.id.toolbar5);
        toolbar6 = (Toolbar) findViewById(R.id.toolbar6);
        toolbar7 = (Toolbar) findViewById(R.id.toolbar7);
        toolbar8 = (Toolbar) findViewById(R.id.toolbar8);
        toolbar9 = (Toolbar) findViewById(R.id.toolbar9);
        toolbar10 = (Toolbar) findViewById(R.id.toolbar10);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textViewNomeSilo = (TextView) findViewById(R.id.textViewNomeSilo);
        imageButtonEsquerda = (ImageButton) findViewById(R.id.imageButtonEsquerda);
        imageButtonDireita = (ImageButton) findViewById(R.id.imageButtonDireita);

        editText = (EditText) findViewById(R.id.editText);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(this);
        imageButtonEsquerda.setOnClickListener(this);
        imageButtonDireita.setOnClickListener(this);

        // Ainda Falta Ageitar aqui, pois ao voltar a activity, está zerando o valor que foi pego!!
        textViewNomeSilo.setText(Contexto.dados.get("nomeDoSilo")+"");


    }

    @Override
    public void onClick(View v) {

        //Contexto.dados.get("QuantidadeString");
        //Contexto.dados.get("QuantidadeDouble");

        // EditText string = (EditText) Contexto.dados.remove("QuantidadeString");


        if (button2.isPressed()) {
             teste = editText.getText().toString();
            switch (teste) {
                case "0":
                    imageView3.setImageResource(R.drawable.silo);

                    toolbar1.setVisibility(View.INVISIBLE);
                    toolbar2.setVisibility(View.INVISIBLE);
                    toolbar3.setVisibility(View.INVISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.INVISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);
                    textView5.setVisibility(View.INVISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "10":
                    imageView3.setImageResource(R.drawable.silo10);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.INVISIBLE);
                    toolbar3.setVisibility(View.INVISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.INVISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);
                    textView5.setVisibility(View.INVISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "20":
                    imageView3.setImageResource(R.drawable.silo20);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.INVISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.INVISIBLE);
                    textView4.setVisibility(View.INVISIBLE);
                    textView5.setVisibility(View.INVISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "30":
                    imageView3.setImageResource(R.drawable.silo30);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.INVISIBLE);
                    textView5.setVisibility(View.INVISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "40":
                    imageView3.setImageResource(R.drawable.silo40);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.INVISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "50":
                    imageView3.setImageResource(R.drawable.silo50);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "60":
                    imageView3.setImageResource(R.drawable.silo60);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    toolbar7.setVisibility(View.INVISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.INVISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "70":
                    imageView3.setImageResource(R.drawable.silo70);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    toolbar7.setVisibility(View.VISIBLE);
                    toolbar8.setVisibility(View.INVISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "80":
                    imageView3.setImageResource(R.drawable.silo80);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    toolbar7.setVisibility(View.VISIBLE);
                    toolbar8.setVisibility(View.VISIBLE);
                    toolbar9.setVisibility(View.INVISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "90":
                    imageView3.setImageResource(R.drawable.silo90);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    toolbar7.setVisibility(View.VISIBLE);
                    toolbar8.setVisibility(View.VISIBLE);
                    toolbar9.setVisibility(View.VISIBLE);
                    toolbar10.setVisibility(View.INVISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.INVISIBLE);

                    editText.setText("");
                    break;

                case "100":
                    imageView3.setImageResource(R.drawable.silo90);

                    toolbar1.setVisibility(View.VISIBLE);
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    toolbar7.setVisibility(View.VISIBLE);
                    toolbar8.setVisibility(View.VISIBLE);
                    toolbar9.setVisibility(View.VISIBLE);
                    toolbar10.setVisibility(View.VISIBLE);

                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.VISIBLE);

                    editText.setText("");
                    break;

                default:
                    editText.setError("informe o numero valido");
                    break;

            }

        }
        if (imageButtonEsquerda.isPressed()) {
            Intent intentGerenciamentoSilo = new Intent(this, TelaDeGerenciamentoDeSilo.class);
            startActivity(intentGerenciamentoSilo);
        }
        if (imageButtonDireita.isPressed()) {
            Intent intentDetalheSilo = new Intent(this, TelaDeDetalhesDoSilo.class);
            startActivity(intentDetalheSilo);
        }

    }
}
