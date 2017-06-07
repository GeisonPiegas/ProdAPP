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

        //Essa Parte Ta Com Erro, tive qquee comentar pra poder continuar

        /*silosBD = new SilosBD(this);
        silosList = silosBD.ListaSilos();
        adapterSilos = new AdapterSilos(this, silosList); // ta passando a lista do banco de dados para o adaptador

        grid = (GridView) findViewById(R.id.gridViewSilo);
        grid.setAdapter(adapterSilos); */

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

    public void onClick(DialogInterface dialog, int which) { //recebendo por parametros o que foi clicado
        int id  =  silosList.get(idPosicao).getId_silo() ; // enviando para id o a a posição do id que foi capturado pelo onclick

        switch (which){

            case 0 : //Editar
                Intent intent = new Intent(this , TelaDeCadastro.class) ;
                intent.putExtra("SILO_ID" , id) ; // no putExtra se utiliza (String name e short Value)
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

    }

}
