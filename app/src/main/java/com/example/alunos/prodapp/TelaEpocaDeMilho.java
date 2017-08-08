package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEpocaDeMilho extends AppCompatActivity implements View.OnClickListener{
    private Button buttonJaneiro;
    private Button buttonFevereiro;
    private Button buttonMarco;
    private Button buttonAbril;
    private Button buttonMaio;
    private Button buttonJunho;
    private Button buttonJulho;
    private Button buttonAgosto;
    private Button buttonSetembro;
    private Button buttonOutubro;
    private Button buttonNovembro;
    private Button buttonDezembro;
    private Button buttonAmarelo;
    private Button buttonVermelho;
    private Button buttonVerde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_epoca_de_milho);

        buttonJaneiro = (Button) findViewById(R.id.buttonJaneiro);
        buttonFevereiro = (Button) findViewById(R.id.buttonFevereiro);
        buttonMarco = (Button) findViewById(R.id.buttonMarco);
        buttonAbril = (Button) findViewById(R.id.buttonAbril);
        buttonMaio = (Button) findViewById(R.id.buttonMaio);
        buttonJunho = (Button) findViewById(R.id.buttonJunho);
        buttonJulho = (Button) findViewById(R.id.buttonJulho);
        buttonAgosto = (Button) findViewById(R.id.buttonAgosto);
        buttonSetembro = (Button) findViewById(R.id.buttonSetembro);
        buttonOutubro = (Button) findViewById(R.id.buttonOutubro);
        buttonNovembro = (Button) findViewById(R.id.buttonNovembro);
        buttonDezembro = (Button) findViewById(R.id.buttonDezembro);
        buttonAmarelo = (Button) findViewById(R.id.buttonAmarelo);
        buttonVermelho = (Button) findViewById(R.id.buttonVermelho);
        buttonVerde = (Button) findViewById(R.id.buttonVerde);

        buttonAmarelo.setOnClickListener(this);
        buttonVermelho.setOnClickListener(this);
        buttonVerde.setOnClickListener(this);
    }

    //Modifiicando as cores dos botões referente a epoca selecionada...
    @Override
    public void onClick(View v) {
        if (buttonAmarelo.isPressed()) {
            buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.Amarelo));
            buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.Amarelo));
            buttonMarco.setBackgroundColor(getResources().getColor(R.color.Amarelo));
            buttonAbril.setBackgroundColor(getResources().getColor(R.color.Amarelo));

            buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
        }
        if (buttonVermelho.isPressed()) {

            buttonMaio.setBackgroundColor(getResources().getColor(R.color.Vermelho));
            buttonJunho.setBackgroundColor(getResources().getColor(R.color.Vermelho));
            buttonJulho.setBackgroundColor(getResources().getColor(R.color.Vermelho));
            buttonAgosto.setBackgroundColor(getResources().getColor(R.color.Vermelho));
            buttonSetembro.setBackgroundColor(getResources().getColor(R.color.Vermelho));

            buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

        }
        if (buttonVerde.isPressed()) {

            buttonOutubro.setBackgroundColor(getResources().getColor(R.color.Verde));
            buttonNovembro.setBackgroundColor(getResources().getColor(R.color.Verde));
            buttonDezembro.setBackgroundColor(getResources().getColor(R.color.Verde));

            buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

        }

    }
}
