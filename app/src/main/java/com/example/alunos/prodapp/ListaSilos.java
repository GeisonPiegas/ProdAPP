package com.example.alunos.prodapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.List;

import Adapter.AdapterSilos;
import BD.SilosBD;
import Interacao.Silos;

public class ListaSilos extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView grid;
    private List<Silos> silosList;
    private AdapterSilos adapterSilos;
    private SilosBD silosBD;
    public Integer id_pedido;



    //----------

    private int idPosicao;
    private android.app.AlertDialog alertDialog;
    private android.app.AlertDialog alertConfirmacao;

    //------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_silos);


        silosBD = new SilosBD(this);
        silosList = silosBD.ListaSilos();
        adapterSilos = new AdapterSilos(this, silosList); // ta passando a lista do banco de dados para o adaptador

        grid = (GridView) findViewById(R.id.gridViewSilo);
        grid.setAdapter(adapterSilos);

        grid.setOnItemClickListener(this); // Setando a maneira SetonClick para interagir com a lista.
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Criando o menu e recebendo os parametros
        int id  =  item.getItemId() ;

        if(id == R.id.gridViewSilo){ // fazendo os testes logicos apos escolher um botão, neste caso manda para outra activity, mas poderia fazer outras funções.
            startActivity(new Intent(this , ListaUsuarios.class)); // se o teste der certo, inicia uma activity especifica.
        }
        return super.onOptionsItemSelected(item);
    }


    //Metodos gerados automaticamente pelo "Implemets"
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        idPosicao = position ;
        alertDialog.show() ;

    }


}
