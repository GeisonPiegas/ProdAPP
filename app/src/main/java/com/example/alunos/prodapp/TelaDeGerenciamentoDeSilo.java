package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import BD.SilosBD;
import BD.ValorBD;
import Interacao.Silos;

import Interacao.Usuarios;
import Interacao.Valor;
import Mensagem.MensagemGeral;
import util.Contexto;

import static com.example.alunos.prodapp.R.id.ConfirmarEmailEditTextTelaDeCadastro;
import static com.example.alunos.prodapp.R.id.EmailEditTextTelaDeCadastro;
import static com.example.alunos.prodapp.R.id.NomeEditTextTelaDeCadastro;

public class TelaDeGerenciamentoDeSilo extends AppCompatActivity implements View.OnClickListener {
    private ScrollView AdicionarScrollViewTelaDeGerenciamentoDeSilos;
    private ImageButton RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private ImageButton AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private TextView OpcoesTextViewTelaDeGerenciamentoDeSilos;
    private TextView TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos;
    private TextView TipoDeProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos;
    private Spinner TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos;
    private TextView QuantidadeDoProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos;
    private EditText QuantidadeDoProdutoAdicionarEditTextTelaDeGerenciamentoDeSilos;
    private Button AdicionarButtonTelaDeGerenciamentoDeSilos;
    private RelativeLayout RelativeLayout01TelaDeGerenciamentoDeSilos;
    private ScrollView ScrollView01TelaDeGerenciamentoDeSilos;
    private LinearLayout LinearLayoutVertical01TelaDeGerenciamentoDeSilos;
    private ImageView IconeImageViewTelaDeGerenciamentoDeSilos;
    private HorizontalScrollView HorizontalScrollView01TelaDeGerenciamentoDeSilos;
    private LinearLayout LinearLayout02TelaDeGerenciamentoDeSilos;
    private LinearLayout LinearLayoutVertical02TelaDeGerenciamentoDeSilos;
    private LinearLayout LinearLayoutVertical03TelaDeGerenciamentoDeSilos;
    private ScrollView RemoverScrollViewTelaDeGerenciamentoDeSilos;
    private Toolbar RemoverInicioToolbarTelaDeGerenciamentoDeSilos;
    private TextView TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos;
    private TextView QuantidadeDoProdutoRetirarTextViewTelaDeGerenciamentoDeSilos;
    private EditText QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos;
    private Button RetirarButtonTelaDeGerenciamentoDeSilos;
    private Toolbar RemoverFimToolbarTelaDeGerenciamentoDeSilos;
    private LinearLayout LinearLayoutVertical04TelaDeGerenciamentoDeSilos;


    private EditText apenasTeste;
    private Button buttonTeste;


    private Boolean teste1;
    private Boolean teste2;

    private double QuantidadeDoubleConvertido;

    Valor valor ;
    ValorBD valorBD ;
    private int id_valor ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_gerenciamento_de_silo);

        //FindView
        OpcoesTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.OpcoesTextViewTelaDeGerenciamentoDeSilos);
        AdicionarScrollViewTelaDeGerenciamentoDeSilos = (ScrollView) findViewById(R.id.AdicionarScrollViewTelaDeGerenciamentoDeSilos);
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos);

        QuantidadeDoProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.QuantidadeDoProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoAdicionarEditTextTelaDeGerenciamentoDeSilos = (EditText) findViewById(R.id.QuantidadeDoProdutoAdicionarEditTextTelaDeGerenciamentoDeSilos);
        AdicionarButtonTelaDeGerenciamentoDeSilos = (Button) findViewById(R.id.AdicionarButtonTelaDeGerenciamentoDeSilos);
        RelativeLayout01TelaDeGerenciamentoDeSilos = (RelativeLayout) findViewById(R.id.RelativeLayout01TelaDeGerenciamentoDeSilos);
        ScrollView01TelaDeGerenciamentoDeSilos = (ScrollView) findViewById(R.id.ScrollView01TelaDeGerenciamentoDeSilos);
        LinearLayoutVertical01TelaDeGerenciamentoDeSilos = (LinearLayout) findViewById(R.id.LinearLayoutVertical01TelaDeGerenciamentoDeSilos);
        IconeImageViewTelaDeGerenciamentoDeSilos = (ImageView) findViewById(R.id.IconeImageViewTelaDeGerenciamentoDeSilos);
        HorizontalScrollView01TelaDeGerenciamentoDeSilos = (HorizontalScrollView) findViewById(R.id.HorizontalScrollView01TelaDeGerenciamentoDeSilos);
        LinearLayoutVertical02TelaDeGerenciamentoDeSilos = (LinearLayout) findViewById(R.id.LinearLayoutVertical02TelaDeGerenciamentoDeSilos);
        LinearLayoutVertical03TelaDeGerenciamentoDeSilos = (LinearLayout) findViewById(R.id.LinearLayoutVertical03TelaDeGerenciamentoDeSilos);
        RemoverScrollViewTelaDeGerenciamentoDeSilos = (ScrollView) findViewById(R.id.RemoverScrollViewTelaDeGerenciamentoDeSilos);
        //RemoverInicioToolbarTelaDeGerenciamentoDeSilos = (Toolbar) findViewById(R.id.RemoverInicioToolbarTelaDeGerenciamentoDeSilos);
        TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoRetirarTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.QuantidadeDoProdutoRetirarTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos = (EditText) findViewById(R.id.QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos);
        RetirarButtonTelaDeGerenciamentoDeSilos = (Button) findViewById(R.id.RetirarButtonTelaDeGerenciamentoDeSilos);
        //RemoverFimToolbarTelaDeGerenciamentoDeSilos = (Toolbar) findViewById(R.id.RemoverFimToolbarTelaDeGerenciamentoDeSilos);
        LinearLayoutVertical04TelaDeGerenciamentoDeSilos = (LinearLayout) findViewById(R.id.LinearLayoutVertical04TelaDeGerenciamentoDeSilos);


        buttonTeste = (Button) findViewById(R.id.buttonTeste);
        apenasTeste = (EditText) findViewById(R.id.apenasTeste);


        //OnClick
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);


        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        AdicionarButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        RetirarButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);

        buttonTeste.setOnClickListener(this);

        //Visibilidade
        AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
        RemoverScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);

        //Teste Logico Referente a Visibilidade
        teste1 = false;
        teste2 = false;

        // Alterando o valor dos SETTEXT e passando o objeto que foi pego
        TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setText("Adicionar Produto do Silo( " + Contexto.dados.remove("indice") + "" + " )");
        TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setText("Remover Produto do Silo( " + Contexto.dados.remove("indice") + "" + " )");

        //---------------------

        }

    protected void onDestroyValor() {

        valorBD.fechar();
        super.onDestroy();
    }


    public void cadastrarValor() {

        boolean validacao = true;

        String valor_pego = apenasTeste.getText().toString();


        if (validacao) {

            valor = new Valor();

            valor.setId_valor(id_valor);

            // Se for Alteração de Dados
            if (id_valor > 0) {
                valor.setValor(valor_pego);
            }

            valorBD.salvarValor(valor);

        }
    }

    @Override
    public void onClick(View v) {
        if (RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {
            String QuantidadePega = apenasTeste.getText().toString();
            Contexto.dados.put("QuantidadeString", QuantidadePega);


            String QuantidadeDouble = apenasTeste.getText().toString();
            QuantidadeDoubleConvertido = Double.parseDouble(QuantidadeDouble);
            QuantidadeDoubleConvertido = QuantidadeDoubleConvertido * (-1);

            Contexto.dados.put("QuantidadeDouble", QuantidadeDoubleConvertido);

            buttonTeste.setText("Cadastrou = " + QuantidadePega);

        }

        if (buttonTeste.isPressed()){
            this.cadastrarValor();
        }

/*
        if (AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {
            String QuantidadePega = apenasTeste.getText().toString();
            Contexto.dados.put("QuantidadeString", QuantidadePega);

            String QuantidadeDouble = apenasTeste.getText().toString();

            QuantidadeDoubleConvertido = Double.parseDouble(QuantidadeDouble);
            Contexto.dados.put("QuantidadeDouble", QuantidadeDoubleConvertido);

            buttonTeste.setText("Cadastrou = " + QuantidadePega);
        }

        */


    }


}







