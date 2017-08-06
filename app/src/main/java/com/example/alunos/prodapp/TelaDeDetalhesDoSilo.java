package com.example.alunos.prodapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

import Interacao.Silos;
import util.Contexto;

public class TelaDeDetalhesDoSilo extends AppCompatActivity implements View.OnClickListener{

    private TextView FiltroTextViewTelaDeDetalhesDoSilo;
    private RadioGroup FiltroRadioGroupTelaDeDetalhesDoSilo;
    private RadioButton KgRadioButtonTelaDeDetalhesDoSilo;
    private RadioButton TonRadioButtonTelaDeDetalhesDoSilo;
    private TextView NomeDetalheTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeNomeDetalheTextViewTelaDeDetalhesDoSilo;
    private TextView TipoDeGraoTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeTipoDeGraoTextViewTelaDeDetalhesDoSilo;
    private TextView PorteDoSiloTextViewTelaDeDetalhesDoSilo;
    private TextView RecebePorteDoSiloTextViewTelaDeDetalhesDoSilo;
    private TextView CapacidadeTotalTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeCapacidadeTotalTextViewTelaDeDetalhesDoSilo;
    private TextView CapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeCapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo;
    private TextView CapacidadeDisponivelTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeCapacidadeDisponivelTextViewTelaDeDetalhesDoSilo;
    private TextView DataDaCriacaoTextViewTelaDeDetalhesDoSilo;
    private TextView RecebeDataDaCriacaoTextViewTelaDeDetalhesDoSilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_detalhes_do_silo);

        //FindView
        FiltroTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.FiltroTextViewTelaDeDetalhesDoSilo);
        FiltroRadioGroupTelaDeDetalhesDoSilo = (RadioGroup) findViewById(R.id.FiltroRadioGroupTelaDeDetalhesDoSilo);
        KgRadioButtonTelaDeDetalhesDoSilo = (RadioButton) findViewById(R.id.KgRadioButtonTelaDeDetalhesDoSilo);
        TonRadioButtonTelaDeDetalhesDoSilo = (RadioButton) findViewById(R.id.TonRadioButtonTelaDeDetalhesDoSilo);
        NomeDetalheTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.NomeDetalheTextViewTelaDeDetalhesDoSilo);
        RecebeNomeDetalheTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeNomeDetalheTextViewTelaDeDetalhesDoSilo);
        TipoDeGraoTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.TipoDeGraoTextViewTelaDeDetalhesDoSilo);
        RecebeTipoDeGraoTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeTipoDeGraoTextViewTelaDeDetalhesDoSilo);
        PorteDoSiloTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.PorteDoSiloTextViewTelaDeDetalhesDoSilo);
        RecebePorteDoSiloTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebePorteDoSiloTextViewTelaDeDetalhesDoSilo);
        CapacidadeTotalTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.CapacidadeTotalTextViewTelaDeDetalhesDoSilo);
        RecebeCapacidadeTotalTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeCapacidadeTotalTextViewTelaDeDetalhesDoSilo);
        CapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.CapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo);
        RecebeCapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeCapacidadeUtilizadaTextViewTelaDeDetalhesDoSilo);
        CapacidadeDisponivelTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.CapacidadeDisponivelTextViewTelaDeDetalhesDoSilo);
        RecebeCapacidadeDisponivelTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeCapacidadeDisponivelTextViewTelaDeDetalhesDoSilo);
        DataDaCriacaoTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.DataDaCriacaoTextViewTelaDeDetalhesDoSilo);
        RecebeDataDaCriacaoTextViewTelaDeDetalhesDoSilo = (TextView) findViewById(R.id.RecebeDataDaCriacaoTextViewTelaDeDetalhesDoSilo);


        Silos s = new Silos() ;

        RecebeNomeDetalheTextViewTelaDeDetalhesDoSilo.setText(Contexto.dados.remove("nomeSilo")+"");

    }




    @Override
    public void onClick(View v) {

    }
}
