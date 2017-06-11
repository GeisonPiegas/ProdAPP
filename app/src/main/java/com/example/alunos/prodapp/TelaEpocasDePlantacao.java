package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

import Adapter.AdapterProdutos;
import Interacao.Produtos;

public class TelaEpocasDePlantacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_epocas_de_plantacao);

        GridView lista = (GridView) findViewById(R.id.GridViewTelaListaProdutos);
        ArrayAdapter adapter = new AdapterProdutos(this, adicionarProdutos());
        lista.setAdapter(adapter);

    }

    private ArrayList<Produtos> adicionarProdutos(){
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        Produtos e = new Produtos(R.drawable.arroz, "Arroz");
        produtos.add(e);

        e = new Produtos(R.drawable.soja, "Soja");
        produtos.add(e);

        e = new Produtos(R.drawable.trigo, "Trigo");
        produtos.add(e);

        e = new Produtos(R.drawable.milho, "Milho");
        produtos.add(e);

        return produtos;
    }
}

