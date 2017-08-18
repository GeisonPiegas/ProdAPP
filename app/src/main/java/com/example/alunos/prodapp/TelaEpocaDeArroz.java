package com.example.alunos.prodapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEpocaDeArroz extends AppCompatActivity implements View.OnClickListener {
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
    private Button buttonPadraoCinza;
    boolean teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_epoca_de_arroz);

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
        buttonPadraoCinza = (Button) findViewById(R.id.buttonPadraoCinza);

        buttonAmarelo.setOnClickListener(this);
        buttonVermelho.setOnClickListener(this);
        buttonVerde.setOnClickListener(this);
        buttonPadraoCinza.setOnClickListener(this);

        teste = true;
    }

    //Modifiicando as cores dos botões referente a epoca selecionada...
    @Override
    public void onClick(View v) {

        if (buttonAmarelo.isPressed()) {

            if (teste == true) {
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));

                buttonJaneiro.setTypeface(null, Typeface.BOLD);
                buttonFevereiro.setTypeface(null, Typeface.BOLD);
                buttonMarco.setTypeface(null, Typeface.BOLD);
                buttonAbril.setTypeface(null, Typeface.BOLD);

                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);
                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonVermelho.setVisibility(View.INVISIBLE);
                buttonVerde.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.BOLD);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = false;
            }else{
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);

                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);
                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = true;
            }

        }

        if (buttonVermelho.isPressed()) {

            if (teste == true) {
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));

                buttonMaio.setTypeface(null, Typeface.BOLD);
                buttonJunho.setTypeface(null, Typeface.BOLD);
                buttonJulho.setTypeface(null, Typeface.BOLD);
                buttonAgosto.setTypeface(null, Typeface.BOLD);
                buttonSetembro.setTypeface(null, Typeface.BOLD);

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);
                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonAmarelo.setVisibility(View.INVISIBLE);
                buttonVerde.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.BOLD);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = false;
            }else{
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);
                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonAmarelo.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = true;
            }


        }
        if (buttonVerde.isPressed()) {

            if (teste == true) {
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));

                buttonOutubro.setTypeface(null, Typeface.BOLD);
                buttonNovembro.setTypeface(null, Typeface.BOLD);
                buttonDezembro.setTypeface(null, Typeface.BOLD);

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);
                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);

                buttonVermelho.setVisibility(View.INVISIBLE);
                buttonAmarelo.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.BOLD);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = false;
            }else{
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);
                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = true;
            }
        }
        if (buttonPadraoCinza.isPressed()) {

            if (teste == true) {
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));

                buttonJaneiro.setTypeface(null, Typeface.BOLD);
                buttonFevereiro.setTypeface(null, Typeface.BOLD);
                buttonMarco.setTypeface(null, Typeface.BOLD);
                buttonAbril.setTypeface(null, Typeface.BOLD);
                buttonMaio.setTypeface(null, Typeface.BOLD);
                buttonJunho.setTypeface(null, Typeface.BOLD);
                buttonJulho.setTypeface(null, Typeface.BOLD);
                buttonAgosto.setTypeface(null, Typeface.BOLD);
                buttonSetembro.setTypeface(null, Typeface.BOLD);
                buttonOutubro.setTypeface(null, Typeface.BOLD);
                buttonNovembro.setTypeface(null, Typeface.BOLD);
                buttonDezembro.setTypeface(null, Typeface.BOLD);

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.BOLD);

                teste = false;
            }else{
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setTypeface(null, Typeface.NORMAL);
                buttonFevereiro.setTypeface(null, Typeface.NORMAL);
                buttonMarco.setTypeface(null, Typeface.NORMAL);
                buttonAbril.setTypeface(null, Typeface.NORMAL);
                buttonMaio.setTypeface(null, Typeface.NORMAL);
                buttonJunho.setTypeface(null, Typeface.NORMAL);
                buttonJulho.setTypeface(null, Typeface.NORMAL);
                buttonAgosto.setTypeface(null, Typeface.NORMAL);
                buttonSetembro.setTypeface(null, Typeface.NORMAL);
                buttonOutubro.setTypeface(null, Typeface.NORMAL);
                buttonNovembro.setTypeface(null, Typeface.NORMAL);
                buttonDezembro.setTypeface(null, Typeface.NORMAL);

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);

                buttonAmarelo.setTypeface(null, Typeface.NORMAL);
                buttonVermelho.setTypeface(null, Typeface.NORMAL);
                buttonVerde.setTypeface(null, Typeface.NORMAL);
                buttonPadraoCinza.setTypeface(null, Typeface.NORMAL);

                teste = true;
            }

        }
    }
}



