package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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
import Interacao.Silos;
import Mensagem.MensagemGeral;
import util.Contexto;

public class TelaDeGerenciamentoDeSilo extends AppCompatActivity implements View.OnClickListener{
    private ScrollView AdicionarScrollViewTelaDeGerenciamentoDeSilos;
    private ImageButton RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private ImageButton AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos;
    private TextView OpcoesTextViewTelaDeGerenciamentoDeSilos ;
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

    private Boolean teste1;
    private Boolean teste2;

    // Criando os atributos do SILO
    private Silos silos;
    private SilosBD silosBD;
    private int id_silo;
    //-------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_gerenciamento_de_silo);

        //FindView
        OpcoesTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.OpcoesTextViewTelaDeGerenciamentoDeSilos) ;
        AdicionarScrollViewTelaDeGerenciamentoDeSilos = (ScrollView) findViewById(R.id.AdicionarScrollViewTelaDeGerenciamentoDeSilos);
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos = (ImageButton) findViewById(R.id.AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos);
        TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos);
        TipoDeProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TipoDeProdutoAdicionarTextViewTelaDeGerenciamentoDeSilos);
        TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos = (Spinner) findViewById(R.id.TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos);
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
        RemoverInicioToolbarTelaDeGerenciamentoDeSilos = (Toolbar) findViewById(R.id.RemoverInicioToolbarTelaDeGerenciamentoDeSilos);
        TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoRetirarTextViewTelaDeGerenciamentoDeSilos = (TextView) findViewById(R.id.QuantidadeDoProdutoRetirarTextViewTelaDeGerenciamentoDeSilos);
        QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos = (EditText) findViewById(R.id.QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos);
        RetirarButtonTelaDeGerenciamentoDeSilos = (Button) findViewById(R.id.RetirarButtonTelaDeGerenciamentoDeSilos);
        RemoverFimToolbarTelaDeGerenciamentoDeSilos = (Toolbar) findViewById(R.id.RemoverFimToolbarTelaDeGerenciamentoDeSilos);
        LinearLayoutVertical04TelaDeGerenciamentoDeSilos = (LinearLayout) findViewById(R.id.LinearLayoutVertical04TelaDeGerenciamentoDeSilos);

        //OnClick
        RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        AdicionarButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);
        RetirarButtonTelaDeGerenciamentoDeSilos.setOnClickListener(this);

        //Visibilidade
        AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
        RemoverScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);

        //Teste Logico Referente a Visibilidade
        teste1 = false;
        teste2 = false;

        // Alterando o valor dos SETTEXT e passando o objeto que foi pego
        TituloAdicaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setText("Adicionar Produto do Silo( "+Contexto.dados.remove("indice")+""+" )");
        TituloRemocaoDeProdutoTextViewTelaDeGerenciamentoDeSilos.setText("Remover Produto do Silo( "+Contexto.dados.remove("indice")+""+" )");
    }

    //-------------- Parte Referente ao Cadastro e edição de Dados de um Silo //----------------

    // Diminuir Quantidade do Silo

    public void AumentarQuntidadeSilo() {

        boolean validacaoSilo = true;

        // -----------------------------------------------------------------------------------------
        String produto_silo = TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos.getSelectedItem().toString();
        Double tamanho_silo = Double.parseDouble(QuantidadeDoProdutoAdicionarEditTextTelaDeGerenciamentoDeSilos.getText().toString());
        // -----------------------------------------------------------------------------------------

        if (validacaoSilo) {

            silos = new Silos();
            silos.setProduto_silo(produto_silo);
            silos.setTamanho_silo(tamanho_silo);

            // Se for Alteração de Dados
            if (id_silo > 0) {
                silos.setId_silo(id_silo);
            }

            long resultado = silosBD.salvarSilos(silos);

            if (resultado != -1) {

                if (id_silo > 0) {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_atualizar));

                    //Se for Cadastro de Dados
                } else {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_cadastrar));
                }

                finish();

                startActivity(new Intent(this, ListaUsuarios.class));

                // Caso de Algum Erro apresentará esta mensagem
            } else {
                MensagemGeral.Msg(this, getString(R.string.mensagem_erro));
            }

        }

    }

    // Diminuir Quantidade do Silo

    public void DiminuirValorSilo() {

        boolean validacaoSilo = true;

        // -----------------------------------------------------------------------------------------

        String produto_silo = TipoDeProdutoSpinnerTelaDeGerenciamentoDeSilos.getSelectedItem().toString();
        Double tamanho_silo = Double.parseDouble(QuantidadeDoProdutoRetirarEditTextTelaDeGerenciamentoDeSilos.getText().toString());
        OpcoesTextViewTelaDeGerenciamentoDeSilos.setText("teste");

        // -----------------------------------------------------------------------------------------

        if (validacaoSilo) {

            silos = new Silos();
            silos.setProduto_silo(produto_silo);
            silos.setTamanho_silo(tamanho_silo);

            // Se for Alteração de Dados
            if (id_silo > 0) {
                silos.setId_silo(id_silo);
            }

            long resultado = silosBD.salvarSilos(silos);

            if (resultado != -1) {

                if (id_silo > 0) {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_atualizar));

                    //Se for Cadastro de Dados
                } else {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_cadastrar));
                }

                finish();

                startActivity(new Intent(this, ListaUsuarios.class));

                // Caso de Algum Erro apresentará esta mensagem
            } else {
                MensagemGeral.Msg(this, getString(R.string.mensagem_erro));
            }

        }

    }

    @Override
    public void onClick(View v) {
        if (RetirarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {
            if(teste1 == false) {
                AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
                RemoverScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
                teste1 = true;
                teste2 = false;
                //-----
                if (RetirarButtonTelaDeGerenciamentoDeSilos.isPressed()){
                    this.DiminuirValorSilo();
                }
            } else {
                AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
                teste1 = false;


            }

        }

        if (AdicionarProdutoImageButtonTelaDeGerenciamentoDeSilos.isPressed()) {
            if(teste2 == false) {
                RemoverScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.VISIBLE);
                AdicionarScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
                teste2 = true;
                teste1 = false;
                //----
                if (AdicionarButtonTelaDeGerenciamentoDeSilos.isPressed()){
                    this.AumentarQuntidadeSilo();
                }

            } else {
                RemoverScrollViewTelaDeGerenciamentoDeSilos.setVisibility(View.GONE);
                teste2 = false;

            }

        }
    }
}
