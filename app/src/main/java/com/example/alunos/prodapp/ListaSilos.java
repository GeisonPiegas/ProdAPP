package com.example.alunos.prodapp;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import Adapter.AdapterSilos;
import BD.SilosBD;
import Interacao.Silos;
import util.Contexto;

public class ListaSilos extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener{

    private GridView grid;
    private List<Silos> silosList;
    private AdapterSilos adapterSilos;
    private SilosBD silosBD;
    public Integer id_pedido;
    private ImageButton imageButtonMaisSilo;

    //----------
public long pega  ;

    private int idPosicao;
    private android.app.AlertDialog alertDialog;
    private android.app.AlertDialog alertConfirmacao;

    //------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_silos);

        imageButtonMaisSilo = (ImageButton) findViewById(R.id.imageButtonMaisSilo);

        silosBD = new SilosBD(this);
        silosList = silosBD.ListaSilos();
        adapterSilos = new AdapterSilos(this, silosList); // ta passando a lista do banco de dados para o adaptador

        grid = (GridView) findViewById(R.id.gridViewSilo);
        grid.setAdapter(adapterSilos);

        grid.setOnItemClickListener(this); // Setando a maneira SetonClick para interagir com a lista.
        imageButtonMaisSilo.setOnClickListener(this);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Criando o menu e recebendo os parametros

        int id = item.getItemId();

        if (id == R.id.gridViewSilo) { // fazendo os testes logicos apos escolher um botão, neste caso manda para outra activity, mas poderia fazer outras funções.

        }
        return super.onOptionsItemSelected(item);
    }


    //Metodos gerados automaticamente pelo "Implemets"

    /**
     *Este método pega o id e a posição do item que foi clickado, ambos são iguais
     */
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Silos silo = silosList.get(position) ;

        Toast.makeText(getBaseContext(), "Silo" + position, Toast.LENGTH_SHORT).show(); // mensagem é apenas temporaria.

        pega = id ;



        switch (position){
            case 0:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }

        switch (position){
            case 1:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }

        switch (position){
            case 2:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 3:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 4:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 5:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 6:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 7:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 8:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 9:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 10:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 11:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 12:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 13:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 14:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 15:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 16:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 17:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 18:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 19:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
        switch (position){
            case 20:
                Contexto.dados.put("nomeDoSilo",silo.getNome_silo()) ;
                Contexto.dados.put("tamanhoDoSilo",silo.getTamanho_silo()) ;
                Contexto.dados.put("produtoDoSilo",silo.getProduto_silo()) ;
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;
        }
    }


    public void onClick(DialogInterface dialog, int which) { //recebendo por parametros o que foi clicado,

    }
/*
        switch (which){

            case 0 : //Editar
                Intent intent = new Intent(this , TelaDeGerenciamentoDeSilo.class) ;
                intent.putExtra("id" , 1) ; // no putExtra se utiliza (String name e short Value)
                startActivity(intent);
                finish();
                break ;



            case 1 :
                alertConfirmacao.show();
                break ;

            //Remove os Silo pela posição do ID
            case  DialogInterface.BUTTON_POSITIVE:
                silosList.remove(idPosicao) ; //Remove apenas da lista o silo de acordo com o ID
                silosBD.removerSilos(id) ; // Remove do Banco de Dados o silo de acordo com o ID
                grid.invalidateViews(); // Atualiza os dados depois de feito as remoções.
                break ;

            case DialogInterface.BUTTON_NEGATIVE:
                alertConfirmacao.dismiss(); // comando que faz com que ela não seja exibida, saia fora do alert confirmation.
                break ;
        }

        */

    //Metodo que veio quando foi implementado o segundo negocio depois da virgula la em cima em "implements"...
    //Metodo para o flout falso...
    @Override
    public void onClick(View v) {
        if (imageButtonMaisSilo.isPressed()) {
            Intent intentCadastroSilo = new Intent(this, TelaCadastroSilos.class);
            startActivity(intentCadastroSilo);
        }

    }
}







