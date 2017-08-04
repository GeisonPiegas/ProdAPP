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
import android.widget.Toast;

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
        /**
         * Não está funcionando essa
         */
        int id = item.getItemId();

        if (id == R.id.gridViewSilo) { // fazendo os testes logicos apos escolher um botão, neste caso manda para outra activity, mas poderia fazer outras funções.
            startActivity(new Intent(this, TelaDeGerenciamentoDeSilo.class)); // se o teste der certo, inicia uma activity especifica.
        }
        return super.onOptionsItemSelected(item);
    }


    //Metodos gerados automaticamente pelo "Implemets"

    /**
     *Este método pega o id e a posição do item que foi clickado, ambos são iguais
     */
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(getBaseContext(), "Silo" + position, Toast.LENGTH_SHORT).show(); // mensagem é apenas temporaria.

        pega = id ;

        // Está testando a posição que o usuário clickou
        switch (position) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:

                // Pegando a posição e adcionando em um objetivo do tipo Contexto.
                Contexto.dados.put("indice",position) ;

                // Inicia a activity desejada
                Intent intentPosi = new Intent(this, SiloPrincipal.class);
                startActivity(intentPosi);
                break;

            /**
             * AQUI SERVE COMO UM LIMITE PARA O USUÁRIO N FICA CRIANDo
             */
            default:
                Toast.makeText(getBaseContext(), "ERRO " + position, Toast.LENGTH_SHORT).show();
                break ;

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







