package com.example.alunos.prodapp;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import Adapter.AdapterUsuarios;
import BD.SilosBD;
import BD.UsuariosBD;
import Interacao.Silos;
import Interacao.Usuarios;
import Mensagem.MensagemGeral;

public class ListaUsuarios extends AppCompatActivity  implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<Silos> silosList;
    private AdapterUsuarios adapterUsuarios;
    private SilosBD silosBD;

    //----------

    private int idPosicao;
    private android.app.AlertDialog alertDialog;
    private android.app.AlertDialog alertConfirmacao;

    //------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);


        silosBD = new SilosBD(this);
        silosList = silosBD.ListaSilos();
        adapterUsuarios = new AdapterUsuarios(this, silosList); // ta passando a lista do banco de dados para o adaptador

        lista = (ListView) findViewById(R.id.listViewUsuarios);
        lista.setAdapter(adapterUsuarios);

        lista.setOnItemClickListener(this); // Setando a maneira SetonClick para interagir com a lista.
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Criando o menu e recebendo os parametros
        int id  =  item.getItemId() ;

        if(id == R.id.listViewUsuarios){ // fazendo os testes logicos apos escolher um botão, neste caso manda para outra activity, mas poderia fazer outras funções.
            startActivity(new Intent(this , MainActivity.class)); // se o teste der certo, inicia uma activity especifica.
        }
        return super.onOptionsItemSelected(item);
    }


    //Metodos gerados automaticamente pelo "Implemets"
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        idPosicao = position ;
        alertDialog.show() ;

    }
}
