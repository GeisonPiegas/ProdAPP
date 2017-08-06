package com.example.alunos.prodapp;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import Adapter.AdapterUsuarios;
import BD.SilosBD;
import BD.UsuariosBD;
import Interacao.Silos;
import Interacao.Usuarios;
import Mensagem.MensagemGeral;
import util.Contexto;

public class ListaUsuarios extends AppCompatActivity  implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<Usuarios> usuariosList;
    private AdapterUsuarios adapterUsuarios;
    private UsuariosBD usuariosBD;

    //----------

    private int idPosicao;
    private android.app.AlertDialog alertDialog;
    private android.app.AlertDialog alertConfirmacao;

    //------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_usuarios);


        usuariosBD = new UsuariosBD(this);
        usuariosList = usuariosBD.ListaUsuarios();
        adapterUsuarios = new AdapterUsuarios(this, usuariosList); // ta passando a lista do banco de dados para o adaptador

        lista = (ListView) findViewById(R.id.listViewUsuarios);
        lista.setAdapter(adapterUsuarios);

        lista.setOnItemClickListener(this); // Setando a maneira SetonClick para interagir com a lista.
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { // Criando o menu e recebendo os parametros
        int id = item.getItemId();

        if (id == R.id.listViewUsuarios) { // fazendo os testes logicos apos escolher um botão, neste caso manda para outra activity, mas poderia fazer outras funções.
            startActivity(new Intent(this, MainActivity.class)); // se o teste der certo, inicia uma activity especifica.
        }
        return super.onOptionsItemSelected(item);
    }


    //Metodos gerados automaticamente pelo "Implemets"
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // ESSA PARTE ESTÁ EXATAMENTE IGUAL AO LISTAR SILOS, POREM ELA LEVA PRA TELA DE CADASTRO DE USUÁRIOS!!

        Toast.makeText(getBaseContext(), "Usuário" + position, Toast.LENGTH_SHORT).show(); // mensagem é apenas temporaria.

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
                Contexto.dados.put("indice", position);

                // Inicia a activity desejada
                Intent intentPosi = new Intent(this, TelaDeCadastro.class);
                startActivity(intentPosi);
                break;

            /**
             * AQUI SERVE COMO UM LIMITE PARA O USUÁRIO N FICA CRIANDo
             */
            default:
                Toast.makeText(getBaseContext(), "ERRO " + position, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
