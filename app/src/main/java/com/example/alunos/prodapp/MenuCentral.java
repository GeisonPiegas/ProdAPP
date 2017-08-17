package com.example.alunos.prodapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

import Mensagem.MensagemGeral;

public class MenuCentral extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayout;
    private ScrollView ScrollView;
    private LinearLayout LinearLayoutVertical;
    private LinearLayout LinearLayoutHorizontal1;
    private ImageButton imageButtonSilo;
    private ImageButton imageButtonPragas;
    private LinearLayout LinearLayoutHorizontal2;
    private ImageButton imageButtonNoticias;
    private ImageButton imageButtonCalendario;
    private ImageButton imageButtonRotacao;
    private LinearLayout LinearLayoutHorizontal3;
    private ImageButton imageButtonAgrotoxicos;
    private ImageButton imageButtonSobre;
    private ImageButton imageButtonWifi;
    private ImageButton imageButtonSincronizar ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_central);

        imageButtonSilo = (ImageButton) findViewById(R.id.imageButtonSilo);
        imageButtonPragas = (ImageButton) findViewById(R.id.imageButtonPragas);
        imageButtonNoticias = (ImageButton) findViewById(R.id.imageButtonNoticias);
        imageButtonCalendario = (ImageButton) findViewById(R.id.imageButtonCalendario);
        imageButtonRotacao = (ImageButton) findViewById(R.id.imageButtonRotacao);
        imageButtonAgrotoxicos = (ImageButton) findViewById(R.id.imageButtonAgrotoxicos);
        imageButtonSobre = (ImageButton) findViewById(R.id.imageButtonSobre);
        imageButtonWifi = (ImageButton) findViewById(R.id.imageButtonSair);
        imageButtonSincronizar = (ImageButton) findViewById(R.id.imageButtonSincronizar) ;

        imageButtonSilo.setOnClickListener(this);
        imageButtonPragas.setOnClickListener(this);
        imageButtonNoticias.setOnClickListener(this);
        imageButtonCalendario.setOnClickListener(this);
        imageButtonRotacao.setOnClickListener(this);
        imageButtonAgrotoxicos.setOnClickListener(this);
        imageButtonSobre.setOnClickListener(this);
        imageButtonWifi.setOnClickListener(this);
    }

    //Parte responsável peli menuzinho de sair
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_flutuante, menu);
       return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId() ;

        // Teste de o id foi o que foi clickado e faz un teste com o usuário
        if (id == R.id.sair){
            MensagemGeral.MsgConfirmar(this, "Sair", "Deseja realmente sair?", R.drawable.question, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();

                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            });
            return true ;
        }
        return super.onOptionsItemSelected(item) ;
    }

    @Override
    public void onClick(View v) {
        if (imageButtonSilo.isPressed()) {
            Intent intentListaSilos = new Intent(this, ListaSilos.class);
            startActivity(intentListaSilos);
        }
        if (imageButtonPragas.isPressed()) {
            Intent intentSubMenuPragas = new Intent(this, SubMenuPragas.class);
            startActivity(intentSubMenuPragas);

        }
        if (imageButtonNoticias.isPressed()) {
            Intent intentNovidades = new Intent(this, TelaDeNovidades.class);
            startActivity(intentNovidades);
        }
        if (imageButtonCalendario.isPressed()) {
            Intent intentEpocas = new Intent(this, TelaEpocasDePlantacao.class);
            startActivity(intentEpocas);
        }
        if (imageButtonRotacao.isPressed()) {
            Intent intentRotacao = new Intent(this, TelaDeRotacaoDeCultura.class);
            startActivity(intentRotacao);
        }
        if (imageButtonAgrotoxicos.isPressed()) {
            Intent intentAgrotoxicos = new Intent(this, TelaColetaAgrotoxicos.class);
            startActivity(intentAgrotoxicos);
        }
        if (imageButtonSobre.isPressed()) {
            Intent intentListaUsuarios = new Intent(this, TelaDePerguntasESobre.class);
            startActivity(intentListaUsuarios);
        }
        if (imageButtonWifi.isPressed()) {
            Intent intentWifi = new Intent(this, TelaDeSincronizacao.class);
            startActivity(intentWifi);
        }

    }
}
