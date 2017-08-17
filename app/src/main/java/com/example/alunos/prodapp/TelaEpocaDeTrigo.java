package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaEpocaDeTrigo extends AppCompatActivity implements View.OnClickListener{
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
        setContentView(R.layout.activity_tela_epoca_de_trigo);

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
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));

                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonVermelho.setVisibility(View.INVISIBLE);
                buttonVerde.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                teste = false;
            }else{
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                teste = true;
            }

        }

        if (buttonVermelho.isPressed()) {

            if (teste == true) {
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));

                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonAmarelo.setVisibility(View.INVISIBLE);
                buttonVerde.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                teste = false;
            }else{
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonAmarelo.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                teste = true;
            }


        }
        if (buttonVerde.isPressed()) {

            if (teste == true) {
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonVermelho.setVisibility(View.INVISIBLE);
                buttonAmarelo.setVisibility(View.INVISIBLE);
                buttonPadraoCinza.setVisibility(View.INVISIBLE);

                teste = false;
            }else{
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);

                teste = true;
            }
        }
        if (buttonPadraoCinza.isPressed()) {

            if (teste == true) {
                buttonJaneiro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonSetembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonOutubro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonNovembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonDezembro.setBackgroundColor(getResources().getColor(R.color.MenuUsuario));
                buttonFevereiro.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonMarco.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAbril.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonAgosto.setBackgroundColor(getResources().getColor(R.color.MenuEpocas));
                buttonMaio.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonJunho.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));
                buttonJulho.setBackgroundColor(getResources().getColor(R.color.MenuNoticias));

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);

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

                buttonVermelho.setVisibility(View.VISIBLE);
                buttonVerde.setVisibility(View.VISIBLE);
                buttonPadraoCinza.setVisibility(View.VISIBLE);
                buttonAmarelo.setVisibility(View.VISIBLE);

                teste = true;
            }

        }
    }
}
