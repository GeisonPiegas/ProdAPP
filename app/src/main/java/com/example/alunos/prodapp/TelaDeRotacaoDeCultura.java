package com.example.alunos.prodapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class TelaDeRotacaoDeCultura extends AppCompatActivity implements View.OnClickListener{
    private CheckBox checkBoxArroz;
    private CheckBox checkBoxMilho;
    private CheckBox checkBoxSoja;
    private CheckBox checkBoxTrigo;
    private CheckBox checkBoxGirassol;
    private CheckBox checkBoxMilhete;
    private CheckBox checkBoxSorgo;
    private CheckBox checkBoxTremoco;
    private Button buttonSaberMais;
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
        buttonSaberMais = (Button) findViewById(R.id.buttonSaberMais);
        buttonCriarDiagrama = (Button) findViewById(R.id.buttonCriarDiagrama);
        imageViewCima = (ImageView) findViewById(R.id.imageViewCima);
        imageViewEsquerda = (ImageView) findViewById(R.id.imageViewEsquerda);
        imageViewDireita = (ImageView) findViewById(R.id.imageViewDireita);
        imageViewBaixo = (ImageView) findViewById(R.id.imageViewBaixo);

        buttonSaberMais.setOnClickListener(this);
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

        /* if (buttonSaberMais.isPressed()) {

        }*/

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
           }else{

               if ((arroz == true) && (milho == true) && (soja == true) && (trigo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.trigoteste);

               }
               if ((arroz == true) && (milho == true) && (soja == true) && (girassol == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.girassolteste);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((arroz == true) && (milho = true) && (soja = true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sojateste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (arroz == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.arrozteste);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (milho == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milhoteste);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (soja == true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.sojateste);
               }
               if ((girassol == true) && (milhete == true) && (sorgo == true) && (trigo ==  true)){
                   imageViewCima.setImageResource(R.drawable.girassolteste);
                   imageViewEsquerda.setImageResource(R.drawable.milheteteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.trigoteste);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((arroz == true) && (milho == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((arroz == true) && (soja == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((arroz == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((milho == true) && (soja == true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((milho == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (sorgo == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.sorgoteste);
               }
               if ((soja == true) && (trigo ==  true) && (girassol == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.girassolteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((arroz == true) && (milho == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (milho == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.milhoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((arroz == true) && (soja == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (soja == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((arroz == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((arroz == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.arrozteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((milho == true) && (soja == true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((milho == true) && (soja == true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.sojateste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((milho == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((milho == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.milhoteste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
               }
               if ((soja == true) && (trigo ==  true) && (sorgo == true) && (milhete == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.milheteteste);
               }
               if ((soja == true) && (trigo ==  true) && (sorgo == true) && (tremoco == true)){
                   imageViewCima.setImageResource(R.drawable.sojateste);
                   imageViewEsquerda.setImageResource(R.drawable.trigoteste);
                   imageViewDireita.setImageResource(R.drawable.sorgoteste);
                   imageViewBaixo.setImageResource(R.drawable.tremocoteste);
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
