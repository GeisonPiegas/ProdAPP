package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import BD.SilosBD;
import BD.UsuariosBD;
import Interacao.Silos;
import Interacao.Usuarios;
import Mensagem.MensagemGeral;

/**
 * Criado por MARCOS MARTINS
 */

public class TelaCadastroSilos extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout RelativeLayoutTelaDeCadastroSilos ;
    private ScrollView ScrollViewTelaDeCadastroSilos ;
    private LinearLayout LinearLayoutVerticalTelaDeCadastroSilos ;
    private ImageView IconeImageViewTelaDeCadastroSilo ;
    private TextView IdentificacaoTextViewTelaDeCadastroSilo ;
    private EditText IdentificacaoEditTextTelaDeCadastroSilo ;
    private TextView CapacidadeTextViewTelaDeCadastroSilo ;
    private EditText CapacidadeEditTextTelaDeCadastroSilo;
    private TextView EstocagemTextViewTelaDeCadastroSilo;
    private Spinner  EstocagemSpinnerTelaDeCadastroSilo;
    private Button   CadastrarButtonTelaDeCadastroSilo ;

    // Criando os atributos do SILO
    private Silos silos ;
    private SilosBD silosBD ;
    private int id_silo ;
    //-------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_silos);

          /**
         * Aqui falta por o THIS depois que estiver pronto a classes SILOS BD
         */
        silosBD = new SilosBD(); //Atribuindo a activity atual ao silosBD
        //-------------
        RelativeLayoutTelaDeCadastroSilos = (RelativeLayout) findViewById(R.id.RelativeLayoutTelaDeCadastroSilos) ;
        ScrollViewTelaDeCadastroSilos = (ScrollView) findViewById(R.id.ScrollViewTelaDeCadastroSilos) ;
        LinearLayoutVerticalTelaDeCadastroSilos = (LinearLayout) findViewById(R.id.LinearLayoutVerticalTelaDeCadastro) ;
        IconeImageViewTelaDeCadastroSilo = (ImageView) findViewById(R.id.IconeImageViewTelaDeCadastroSilo) ;
        IdentificacaoTextViewTelaDeCadastroSilo = (TextView) findViewById(R.id.IdentificacaoTextViewTelaDeCadastroSilo) ;
        IdentificacaoEditTextTelaDeCadastroSilo = (EditText) findViewById(R.id.IdentificacaoEditTextTelaDeCadastroSilo) ;
        CapacidadeTextViewTelaDeCadastroSilo = (TextView) findViewById(R.id.CapacidadeTextViewTelaDeCadastroSilo) ;
        CapacidadeEditTextTelaDeCadastroSilo = (EditText) findViewById(R.id.CapacidadeEditTextTelaDeCadastroSilo) ;
        EstocagemTextViewTelaDeCadastroSilo = (TextView) findViewById(R.id.EstocagemTextViewTelaDeCadastroSilo) ;
        EstocagemSpinnerTelaDeCadastroSilo = (Spinner) findViewById(R.id.EstocagemSpinnerTelaDeCadastroSilo) ;
        CadastrarButtonTelaDeCadastroSilo  = (Button) findViewById(R.id.CadastrarButtonTelaDeCadastroSilo) ;

        // On Clicks
        CadastrarButtonTelaDeCadastroSilo.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

    }
}
