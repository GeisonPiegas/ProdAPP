package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

public class TelaDeGerenciamentoDeSilo extends AppCompatActivity implements View.OnClickListener{
    private ScrollView AdicionarScrollViewTelaDeGerenciamentoDeSilos;
    private ImageButton RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private ImageButton AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private TextView TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos;
    private TextView TipoDeProdutoTextViewTelaDeGerenciamentoDeSilos;
    private Spinner TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos;
    private TextView QuantidadeDoProdutoTextViewTelaDeGerenciamentoDeSilos;
    private EditText QuantidadeDoProdutoEditTextTelaDeGerenciamentoDeSilos;
    private Button AdicionarButtonTelaDeGerenciamentoDeSilos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_gerenciamento_de_silo);

        //FindView
        AdicionarScrollViewTelaDeGerenciamentoDeSilos = (ScrollView) findViewById(R.id.AdicionarScrollViewTelaDeGerenciamentoDeSilos);
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos);
        TipoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TipoDeProdutoTextViewTelaDeGerenciamentoDeSilos);
        TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos = (Spinner) findViewById(R.id.TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.QuantidadeDoProdutoTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoEditTextTelaDeGerenciamentoDeSilos = (EditText) findViewById(R.id.QuantidadeDoProdutoEditTextTelaDeGerenciamentoDeSilos);

        //OnClick
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);

        //Visibilidade
        /*TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);
        TipoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);
        TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);
        QuantidadeDoProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);
        QuantidadeDoProdutoEditTextTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);
        AdicionarButtonTelaDeGerenciamentoDeSilos.setVisibility(View.INVISIBLE);*/

        AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View v) {
        if (RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {
            /*TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
            TipoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
            TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
            QuantidadeDoProdutoTextViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
            QuantidadeDoProdutoEditTextTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
            AdicionarButtonTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);*/
            AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);

        }

        if (AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {


        }
    }
}
