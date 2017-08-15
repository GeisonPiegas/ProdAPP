package com.example.alunos.prodapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Spinner;

import static com.example.alunos.prodapp.R.id.imageButtonSilo;

public class TelaDePerguntasESobre extends AppCompatActivity implements View.OnClickListener{
    private ScrollView ScrollViewFAQ;
    private ScrollView ScrollViewSobreNos;
    private Button buttonFAQ;
    private Button buttonSobreNos;
    private Button buttonRelatarBug;
    private Button buttonPergunta1;
    private Button buttonPergunta2;
    private Button buttonPergunta3;
    private Button buttonPergunta4;
    private Button buttonPergunta5;
    private Button buttonPergunta6;
    private Button buttonPergunta7;
    private Button buttonPergunta8;
    private Button buttonPergunta9;
    private Button buttonPergunta10;
    private ScrollView ScrollViewBug;
    private ScrollView ScrollViewResposta1;
    private ScrollView ScrollViewResposta2;
    private ScrollView ScrollViewResposta3;
    private ScrollView ScrollViewResposta4;
    private ScrollView ScrollViewResposta5;
    private ScrollView ScrollViewResposta6;
    private ScrollView ScrollViewResposta7;
    private ScrollView ScrollViewResposta8;
    private ScrollView ScrollViewResposta9;
    private ScrollView ScrollViewResposta10;
    private Spinner spinnerProblema;
    private boolean teste0;
    private boolean teste1;
    private boolean teste2;
    private boolean teste3;
    private boolean teste4;
    private boolean teste5;
    private boolean teste6;
    private boolean teste7;
    private boolean teste8;
    private boolean teste9;
    private boolean teste10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_perguntas_esobre);

        ScrollViewFAQ = (ScrollView) findViewById(R.id.ScrollViewFAQ);
        ScrollViewSobreNos = (ScrollView) findViewById(R.id.ScrollViewSobreNos);
        buttonFAQ = (Button) findViewById(R.id.buttonFAQ);
        buttonRelatarBug = (Button) findViewById(R.id.buttonRelatarBug);
        buttonSobreNos = (Button) findViewById(R.id.buttonSobreNos);
        buttonPergunta1 = (Button) findViewById(R.id.buttonPergunta1);
        buttonPergunta2 = (Button) findViewById(R.id.buttonPergunta2);
        buttonPergunta3 = (Button) findViewById(R.id.buttonPergunta3);
        buttonPergunta4 = (Button) findViewById(R.id.buttonPergunta4);
        buttonPergunta5 = (Button) findViewById(R.id.buttonPergunta5);
        buttonPergunta6 = (Button) findViewById(R.id.buttonPergunta6);
        buttonPergunta7 = (Button) findViewById(R.id.buttonPergunta7);
        buttonPergunta8 = (Button) findViewById(R.id.buttonPergunta8);
        buttonPergunta9 = (Button) findViewById(R.id.buttonPergunta9);
        buttonPergunta10 = (Button) findViewById(R.id.buttonPergunta10);
        ScrollViewBug = (ScrollView) findViewById(R.id.ScrollViewBug);
        ScrollViewResposta1 = (ScrollView) findViewById(R.id.ScrollViewResposta1);
        ScrollViewResposta2 = (ScrollView) findViewById(R.id.ScrollViewResposta2);
        ScrollViewResposta3 = (ScrollView) findViewById(R.id.ScrollViewResposta3);
        ScrollViewResposta4 = (ScrollView) findViewById(R.id.ScrollViewResposta4);
        ScrollViewResposta5 = (ScrollView) findViewById(R.id.ScrollViewResposta5);
        ScrollViewResposta6 = (ScrollView) findViewById(R.id.ScrollViewResposta6);
        ScrollViewResposta7 = (ScrollView) findViewById(R.id.ScrollViewResposta7);
        ScrollViewResposta8 = (ScrollView) findViewById(R.id.ScrollViewResposta8);
        ScrollViewResposta9 = (ScrollView) findViewById(R.id.ScrollViewResposta9);
        ScrollViewResposta10 = (ScrollView) findViewById(R.id.ScrollViewResposta10);
        spinnerProblema = (Spinner) findViewById(R.id.spinnerProblema);

        buttonFAQ.setOnClickListener(this);
        buttonSobreNos.setOnClickListener(this);
        buttonRelatarBug.setOnClickListener(this);
        buttonPergunta1.setOnClickListener(this);
        buttonPergunta2.setOnClickListener(this);
        buttonPergunta3.setOnClickListener(this);
        buttonPergunta4.setOnClickListener(this);
        buttonPergunta5.setOnClickListener(this);
        buttonPergunta6.setOnClickListener(this);
        buttonPergunta7.setOnClickListener(this);
        buttonPergunta8.setOnClickListener(this);
        buttonPergunta9.setOnClickListener(this);
        buttonPergunta10.setOnClickListener(this);

        ScrollViewSobreNos.setVisibility(View.GONE);
        ScrollViewBug.setVisibility(View.GONE);
        ScrollViewResposta1.setVisibility(View.GONE);
        ScrollViewResposta2.setVisibility(View.GONE);
        ScrollViewResposta3.setVisibility(View.GONE);
        ScrollViewResposta4.setVisibility(View.GONE);
        ScrollViewResposta5.setVisibility(View.GONE);
        ScrollViewResposta6.setVisibility(View.GONE);
        ScrollViewResposta7.setVisibility(View.GONE);
        ScrollViewResposta8.setVisibility(View.GONE);
        ScrollViewResposta9.setVisibility(View.GONE);
        ScrollViewResposta10.setVisibility(View.GONE);

        ArrayAdapter adapterSpinner = ArrayAdapter.createFromResource(this, R.array.Problemas, android.R.layout.simple_spinner_dropdown_item);
        adapterSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerProblema.setAdapter(adapterSpinner);

        teste0 = true;
        teste1 = true;
        teste2 = true;
        teste3 = true;
        teste4 = true;
        teste5 = true;
        teste6 = true;
        teste7 = true;
        teste8 = true;
        teste9 = true;
        teste10 = true;
    }

    @Override
    public void onClick(View view) {
        //Botões Referentes aos Menus da Activity, ou seja, FAQ e Sobre Nós
        if (buttonFAQ.isPressed()) {
            ScrollViewFAQ.setVisibility(View.VISIBLE);
            buttonFAQ.setBackgroundColor(getResources().getColor(R.color.Verde));
            buttonSobreNos.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            ScrollViewSobreNos.setVisibility(View.GONE);
            buttonFAQ.setVisibility(View.VISIBLE);
        }
        if (buttonSobreNos.isPressed()) {
            ScrollViewSobreNos.setVisibility(View.VISIBLE);
            buttonSobreNos.setBackgroundColor(getResources().getColor(R.color.Verde));
            buttonFAQ.setBackgroundColor(getResources().getColor(R.color.PadraoBotao));
            ScrollViewFAQ.setVisibility(View.GONE);
            ScrollViewSobreNos.setVisibility(View.VISIBLE);

            ScrollViewBug.setVisibility(View.GONE);
            ScrollViewResposta1.setVisibility(View.GONE);
            ScrollViewResposta2.setVisibility(View.GONE);
            ScrollViewResposta3.setVisibility(View.GONE);
            ScrollViewResposta4.setVisibility(View.GONE);
            ScrollViewResposta5.setVisibility(View.GONE);
            ScrollViewResposta6.setVisibility(View.GONE);
            ScrollViewResposta8.setVisibility(View.GONE);
            ScrollViewResposta9.setVisibility(View.GONE);
            ScrollViewResposta10.setVisibility(View.GONE);

            buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
            buttonPergunta1.setTypeface(null, Typeface.NORMAL);
            buttonPergunta2.setTypeface(null, Typeface.NORMAL);
            buttonPergunta3.setTypeface(null, Typeface.NORMAL);
            buttonPergunta4.setTypeface(null, Typeface.NORMAL);
            buttonPergunta5.setTypeface(null, Typeface.NORMAL);
            buttonPergunta6.setTypeface(null, Typeface.NORMAL);
            buttonPergunta7.setTypeface(null, Typeface.NORMAL);
            buttonPergunta8.setTypeface(null, Typeface.NORMAL);
            buttonPergunta9.setTypeface(null, Typeface.NORMAL);
            buttonPergunta10.setTypeface(null, Typeface.NORMAL);

            teste0 = true;
            teste1 = true;
            teste2 = true;
            teste3 = true;
            teste4 = true;
            teste5 = true;
            teste6 = true;
            teste7 = true;
            teste8 = true;
            teste9 = true;
            teste10 = true;
        }

        if (buttonRelatarBug.isPressed()) {
            if(teste0==true){
                ScrollViewBug.setVisibility(View.VISIBLE);

                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.BOLD);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = false;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }

        //Referente as Perguntas
        if (buttonPergunta1.isPressed()) {
            if(teste1==true){
                ScrollViewResposta1.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.BOLD);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = false;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }


        }
        if (buttonPergunta2.isPressed()) {
            if(teste2==true){
                ScrollViewResposta2.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.BOLD);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = false;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }

        }
        if (buttonPergunta3.isPressed()) {
            if(teste3==true){
                ScrollViewResposta3.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.BOLD);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = false;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta4.isPressed()) {
            if(teste4==true){
                ScrollViewResposta4.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.BOLD);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = false;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta5.isPressed()) {
            if(teste5==true){
                ScrollViewResposta5.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.BOLD);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = false;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta6.isPressed()) {
            if(teste6==true){
                ScrollViewResposta6.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.BOLD);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = false;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta7.isPressed()) {
            if(teste7==true){
                ScrollViewResposta7.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.BOLD);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = false;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta8.isPressed()) {
            if(teste8==true){
                ScrollViewResposta8.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.BOLD);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = false;
                teste9 = true;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta9.isPressed()) {
            if(teste9==true){
                ScrollViewResposta9.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.BOLD);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = false;
                teste10 = true;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
        if (buttonPergunta10.isPressed()) {
            if(teste10==true){
                ScrollViewResposta10.setVisibility(View.VISIBLE);

                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.BOLD);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = false;
            }else{
                ScrollViewBug.setVisibility(View.GONE);
                ScrollViewResposta1.setVisibility(View.GONE);
                ScrollViewResposta2.setVisibility(View.GONE);
                ScrollViewResposta3.setVisibility(View.GONE);
                ScrollViewResposta4.setVisibility(View.GONE);
                ScrollViewResposta5.setVisibility(View.GONE);
                ScrollViewResposta6.setVisibility(View.GONE);
                ScrollViewResposta7.setVisibility(View.GONE);
                ScrollViewResposta8.setVisibility(View.GONE);
                ScrollViewResposta9.setVisibility(View.GONE);
                ScrollViewResposta10.setVisibility(View.GONE);

                buttonRelatarBug.setTypeface(null, Typeface.NORMAL);
                buttonPergunta1.setTypeface(null, Typeface.NORMAL);
                buttonPergunta2.setTypeface(null, Typeface.NORMAL);
                buttonPergunta3.setTypeface(null, Typeface.NORMAL);
                buttonPergunta4.setTypeface(null, Typeface.NORMAL);
                buttonPergunta5.setTypeface(null, Typeface.NORMAL);
                buttonPergunta6.setTypeface(null, Typeface.NORMAL);
                buttonPergunta7.setTypeface(null, Typeface.NORMAL);
                buttonPergunta8.setTypeface(null, Typeface.NORMAL);
                buttonPergunta9.setTypeface(null, Typeface.NORMAL);
                buttonPergunta10.setTypeface(null, Typeface.NORMAL);

                teste0 = true;
                teste1 = true;
                teste2 = true;
                teste3 = true;
                teste4 = true;
                teste5 = true;
                teste6 = true;
                teste7 = true;
                teste8 = true;
                teste9 = true;
                teste10 = true;
            }
        }
    }
}
