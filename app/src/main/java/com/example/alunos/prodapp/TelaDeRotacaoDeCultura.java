package com.example.alunos.prodapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import Mensagem.MensagemGeral;

public class TelaDeRotacaoDeCultura extends AppCompatActivity implements View.OnClickListener{
    private CheckBox checkBoxArroz;
    private CheckBox checkBoxMilho;
    private CheckBox checkBoxSoja;
    private CheckBox checkBoxTrigo;
    private CheckBox checkBoxGirassol;
    private CheckBox checkBoxMilhete;
    private CheckBox checkBoxSorgo;
    private CheckBox checkBoxTremoco;
    private Button buttonCriarDiagrama;
    private ImageView imageViewCima;
    private ImageView imageViewEsquerda;
    private ImageView imageViewDireita;
    private ImageView imageViewBaixo;
    int testeValor;
    boolean arroz;
    boolean milho;
    boolean soja;
    boolean trigo;
    boolean girassol;
    boolean milhete;
    boolean sorgo;
    boolean tremoco;
    private LinearLayout LinearLayout1;
    private LinearLayout LinearLayout2;
    private LinearLayout LinearLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_rotacao_de_cultura);

        checkBoxArroz = (CheckBox)  findViewById(R.id.checkBoxArroz);
        checkBoxMilho = (CheckBox)  findViewById(R.id.checkBoxMilho);
        checkBoxSoja = (CheckBox)  findViewById(R.id.checkBoxSoja);
        checkBoxTrigo = (CheckBox)  findViewById(R.id.checkBoxTrigo);
        checkBoxGirassol = (CheckBox) findViewById(R.id.checkBoxGirassol);
        checkBoxMilhete = (CheckBox) findViewById(R.id.checkBoxMilhete);
        checkBoxSorgo = (CheckBox) findViewById(R.id.checkBoxSorgo);
        checkBoxTremoco = (CheckBox) findViewById(R.id.checkBoxTremoco);
        buttonCriarDiagrama = (Button) findViewById(R.id.buttonCriarDiagrama);
        imageViewCima = (ImageView) findViewById(R.id.imageViewCima);
        imageViewEsquerda = (ImageView) findViewById(R.id.imageViewEsquerda);
        imageViewDireita = (ImageView) findViewById(R.id.imageViewDireita);
        imageViewBaixo = (ImageView) findViewById(R.id.imageViewBaixo);
        LinearLayout1 = (LinearLayout) findViewById(R.id.LinearLayout1);
        LinearLayout2 = (LinearLayout) findViewById(R.id.LinearLayout2);
        LinearLayout3 = (LinearLayout) findViewById(R.id.LinearLayout3);

        buttonCriarDiagrama.setOnClickListener(this);

        testeValor = 0;
        arroz = false;
        milho = false;
        soja = false;
        trigo = false;
        girassol = false;
        milhete = false;
        sorgo = false;
        tremoco = false;

    }

    //Parte responsável peli menuzinho de sair
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_rotacao, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId() ;

        // Teste de o id foi o que foi clickado e faz un teste com o usuário
        if (id == R.id.verInfoRotacao){
            Intent intentTelaMaisDetalheSilo = new Intent(this, TelaRotacaoDeCulturaMaisDetalhes.class); // criando um novo objeto da classe Intent e passado os parametros a outra activity
            startActivity(intentTelaMaisDetalheSilo); // comecando a activity
            return true ;
        }
        return super.onOptionsItemSelected(item) ;
    }

    @Override
    public void onClick(View view) {


        if (checkBoxArroz.isChecked()){
            testeValor = testeValor+1;
            arroz = true;
        }

        if (checkBoxMilho.isChecked()){
            testeValor = testeValor+1;
            milho = true;
        }

        if (checkBoxSoja.isChecked()){
            testeValor = testeValor+1;
            soja = true;
        }

        if (checkBoxTrigo.isChecked()){
            testeValor = testeValor+1;
            trigo = true;
        }

       if (checkBoxGirassol.isChecked()){
            testeValor = testeValor+1;
            girassol = true;
        }

        if (checkBoxMilhete.isChecked()){
            testeValor = testeValor+1;
            milhete = true;
        }

        if (checkBoxSorgo.isChecked()){
            testeValor = testeValor+1;
            sorgo = true;
        }

        if (checkBoxTremoco.isChecked()){
            testeValor = testeValor+1;
            tremoco = true;
        }

       if (buttonCriarDiagrama.isPressed()) {
           if(testeValor<4){
               Context contexto = getApplicationContext();
               String texto = "Selecione no minimo 4 sementes!";
               int duracao = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(contexto, texto,duracao);
               toast.show();
               testeValor = 0;
               arroz = false;
               milho = false;
               soja = false;
               trigo = false;
               girassol = false;
               milhete = false;
               sorgo = false;
               tremoco = false;
               LinearLayout1.setVisibility(View.GONE);
               LinearLayout2.setVisibility(View.GONE);
               LinearLayout3.setVisibility(View.GONE);
           }
           if(testeValor>4){
               Context contexto = getApplicationContext();
               String texto = "Selecione no maximo 4 sementes!";
               int duracao = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(contexto, texto,duracao);
               toast.show();
               testeValor = 0;
               arroz = false;
               milho = false;
               soja = false;
               trigo = false;
               girassol = false;
               milhete = false;
               sorgo = false;
               tremoco = false;
               LinearLayout1.setVisibility(View.GONE);
               LinearLayout2.setVisibility(View.GONE);
               LinearLayout3.setVisibility(View.GONE);
           }else{

               if ((arroz == true) && (milho == true) && (soja == true) && (trigo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.trigoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);

               }
               if ((arroz == true) && (milho == true) && (soja == true) && (girassol == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.girassolteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (arroz == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.arrozteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (milho == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milhoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (soja == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.sojateste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (trigo ==  true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.trigoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (milho == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (soja == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (soja == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((arroz == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (soja == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (soja == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((milho == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((soja == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               if ((soja == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);

                   LinearLayout1.setVisibility(View.VISIBLE);
                   LinearLayout2.setVisibility(View.VISIBLE);
                   LinearLayout3.setVisibility(View.VISIBLE);
               }
               testeValor = 0;
               arroz = false;
               milho = false;
               soja = false;
               trigo = false;
               girassol = false;
               milhete = false;
               sorgo = false;
               tremoco = false;
           }

        }
    }


}
