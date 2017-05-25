package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TelaDeLogin extends AppCompatActivity implements View.OnClickListener{
    private ImageView IconeImageViewTelaDeLogin;
    private TextView EmailTextViewTelaDeLogin;
    private EditText EmailEditTextTelaDeLogin;
    private TextView SenhaTextViewTelaDeLogin;
    private EditText SenhaEditTextTelaDeLogin;
    private CheckBox SalvarSenhaCheckBoxTelaDeLogin;
    private Button EntrarButtonTelaDeLogin;
    private TextView EsqueceuSenhaTextViewTelaDeLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        //find's
        IconeImageViewTelaDeLogin = (ImageView) findViewById(R.id.IconeImageViewTelaDeLogin);
        EmailTextViewTelaDeLogin = (TextView) findViewById(R.id.EmailTextViewTelaDeLogin);
        EmailEditTextTelaDeLogin = (EditText) findViewById(R.id.EmailEditTextTelaDeLogin);
        SenhaTextViewTelaDeLogin = (TextView) findViewById(R.id.SenhaTextViewTelaDeLogin);
        SenhaEditTextTelaDeLogin = (EditText) findViewById(R.id.SenhaEditTextTelaDeLogin);
        SalvarSenhaCheckBoxTelaDeLogin = (CheckBox) findViewById(R.id.SalvarSenhaCheckBoxTelaDeLogin);
        EntrarButtonTelaDeLogin = (Button) findViewById(R.id.EntrarButtonTelaDeLogin);
        EsqueceuSenhaTextViewTelaDeLogin = (TextView) findViewById(R.id.EsqueceuSenhaTextViewTelaDeLogin);

        //onclick's
        SalvarSenhaCheckBoxTelaDeLogin.setOnClickListener(this);
        EntrarButtonTelaDeLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(SalvarSenhaCheckBoxTelaDeLogin.isChecked()){

        }
        if(EntrarButtonTelaDeLogin.isClickable()){

        }
    }
}
