package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class TelaDeCadastro extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayoutTelaDeCadastro;
    private ScrollView ScrollViewTelaDeCadastro;
    private LinearLayout LinearLayoutVerticalTelaDeCadastro;
    private ImageView IconeImageViewTelaDeCadastro;
    private TextView NomeTextViewTelaDeCadastro;
    private EditText NomeEditTextTelaDeCadastro;
    private TextView EmailTextViewTelaDeCadastro;
    private EditText EmailEditTextTelaDeCadastro;
    private TextView ConfirmarEmailTextViewTelaDeCadastro;
    private EditText ConfirmarEmailEditTextTelaDeCadastro;
    private TextView SenhaTextViewTelaDeCadastro;
    private EditText SenhaEditTextTelaDeCadastro;
    private TextView ConfirmarSenhaTextViewTelaDeCadastro;
    private EditText ConfirmarSenhaEditTextTelaDeCadastro;
    private Button CadastrarButtonTelaDeCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);
    }

    @Override
    public void onClick(View v) {

    }
}
