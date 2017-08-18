package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapter.AdapterProdutos;
import Interacao.Produtos;

public class TelaEpocasDePlantacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_epocas_de_plantacao);

        ListView lista = (ListView) findViewById(R.id.GridViewTelaListaProdutos);
        ArrayAdapter adapter = new AdapterProdutos(this, adicionarProdutos());
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new GridView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                // Toast: Mostra uma menssagem na tela com a posição da imagem, so pra teste!
                //Toast.makeText(getBaseContext(), "Imagem" + position, Toast.LENGTH_SHORT).show();

                //IF: Fazem o teste de qual posição o usuario clickou, e leva para a pagina indicada.
                //Ele pega a POSIÇÂO do click e nao ID, e a posição comeca em "0"
                if(position == 0){
                    Intent intent = new Intent(TelaEpocasDePlantacao.this, TelaEpocaDeArroz.class) ;
                    startActivity(intent);
                    finish();
                }else{
                    if(position == 1){
                        Intent intent = new Intent(TelaEpocasDePlantacao.this, TelaEpocaDeMilho.class) ;
                        startActivity(intent);
                        finish();
                    }else{
                        if(position == 2){
                            Intent intent = new Intent(TelaEpocasDePlantacao.this, TelaEpocaDeSoja.class) ;
                            startActivity(intent);
                            finish();
                        }else{
                            if(position == 3){
                                Intent intent = new Intent(TelaEpocasDePlantacao.this, TelaEpocaDeTrigo.class) ;
                                startActivity(intent);
                                finish();
                            }
                        }
                    }
                }
            }
        });

    }

    private ArrayList<Produtos> adicionarProdutos(){
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();
        Produtos e = new Produtos(R.drawable.arrozquadradooutro, "Arroz");
        produtos.add(e);

        e = new Produtos(R.drawable.milhoquadradooutro, "Milho");
        produtos.add(e);

        e = new Produtos(R.drawable.sojaquadradooutro, "Soja");
        produtos.add(e);

        e = new Produtos(R.drawable.trigoquadradooutro, "Trigo");
        produtos.add(e);



        return produtos;
    }
}

