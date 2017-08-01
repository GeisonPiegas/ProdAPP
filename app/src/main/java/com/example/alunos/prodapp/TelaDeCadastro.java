package com.example.alunos.prodapp;

import android.content.Intent;
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

import BD.UsuariosBD;
import Interacao.Usuarios;
import Mensagem.MensagemGeral;

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
    private TextView LoginTextViewTelaDeCadastro ;

    // Criando os atributos do usuário
    private Usuarios usuarios;
    private UsuariosBD usuariosBD;
    private int id_usuario;
    //-------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_cadastro);

        usuariosBD = new UsuariosBD(this); //Atribuindo a activity atual ao usuariosBD


        RelativeLayoutTelaDeCadastro = (RelativeLayout) findViewById(R.id.RelativeLayoutTelaDeCadastro) ;
        ScrollViewTelaDeCadastro = (ScrollView) findViewById(R.id.ScrollViewTelaDeCadastro) ;
        LinearLayoutVerticalTelaDeCadastro = (LinearLayout) findViewById(R.id.LinearLayoutVerticalTelaDeCadastro) ;
        IconeImageViewTelaDeCadastro = (ImageView) findViewById(R.id.IconeImageViewTelaDeCadastro) ;


         NomeTextViewTelaDeCadastro = (TextView) findViewById(R.id.NomeTextViewTelaDeCadastro) ;
        NomeEditTextTelaDeCadastro = (EditText) findViewById(R.id.NomeEditTextTelaDeCadastro) ;
        EmailTextViewTelaDeCadastro =  (TextView) findViewById(R.id.EmailTextViewTelaDeCadastro) ;
         EmailEditTextTelaDeCadastro =  (EditText) findViewById(R.id.EmailEditTextTelaDeCadastro) ;
        ConfirmarEmailTextViewTelaDeCadastro = (TextView) findViewById(R.id.ConfirmarEmailTextViewTelaDeCadastro) ;
        ConfirmarEmailEditTextTelaDeCadastro = (EditText) findViewById(R.id.ConfirmarEmailEditTextTelaDeCadastro) ;
         SenhaTextViewTelaDeCadastro = (TextView) findViewById(R.id.SenhaTextViewTelaDeCadastro) ;
        SenhaEditTextTelaDeCadastro = (EditText) findViewById(R.id.SenhaEditTextTelaDeCadastro) ;
       ConfirmarSenhaTextViewTelaDeCadastro = (TextView) findViewById(R.id.ConfirmarSenhaTextViewTelaDeCadastro) ;
        ConfirmarSenhaEditTextTelaDeCadastro = (EditText) findViewById(R.id.ConfirmarSenhaEditTextTelaDeCadastro) ;

        CadastrarButtonTelaDeCadastro = (Button) findViewById(R.id.CadastrarButtonTelaDeCadastro) ;
        CadastrarButtonTelaDeCadastro.setOnClickListener(this);

        LoginTextViewTelaDeCadastro = (TextView) findViewById(R.id.LoginTextViewTelaDeCadastro)  ;
        LoginTextViewTelaDeCadastro.setOnClickListener(this);




        //---------------------
        // PARTE REFERENTE AO CRUD

        id_usuario = getIntent().getIntExtra("ID_USUARIO", 0);

        if (id_usuario > 0) {

            Usuarios model = usuariosBD.buscarUsuarios(id_usuario);

            NomeEditTextTelaDeCadastro.setText(model.getNome_usuario());
            EmailEditTextTelaDeCadastro.setText(model.getEmail_usuario());
            SenhaEditTextTelaDeCadastro.setText(model.getSenha_usuario());

            setTitle(R.string.CadastrarButtonTelaDeCadastro); // Não sei de onde vem essa parte ainda

        }

    }

    protected void onDestroyUsuarios() {

        usuariosBD.fechar();
        super.onDestroy();
    }


    public void cadastrarUsuarios() {

        boolean validacao = true;

        String nome_usuario = NomeEditTextTelaDeCadastro.getText().toString();
        String email_usuario = EmailEditTextTelaDeCadastro.getText().toString();
        String senha_usuario = SenhaEditTextTelaDeCadastro.getText().toString();
        String confirma_email_usuario = ConfirmarEmailEditTextTelaDeCadastro.getText().toString();
        String confirma_senha_usuario = ConfirmarSenhaEditTextTelaDeCadastro.getText().toString();

        // Validação de E-mail e Confirmar Email (@ e .)
        if (email_usuario.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+") && email_usuario.length() > 0) {
            validacao = true;
        } else {
            validacao = false;
            EmailEditTextTelaDeCadastro.setError("Insira um E-mail Válido");
        }

        if (confirma_email_usuario.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+") && confirma_email_usuario.length() > 0) {
            validacao = true;
        } else {
            validacao = false;
            ConfirmarEmailEditTextTelaDeCadastro.setError("Insira um E-mail Válido");
        }

        // Resposável por fazer os Testes Lógicos e Exibir pro usuário ao se logar
        if ((nome_usuario == null) || (nome_usuario.equals(""))) {
            validacao = false;
            NomeEditTextTelaDeCadastro.setError(getString(R.string.CampoNomeUsuario));
        }

        if ((email_usuario == null) || (email_usuario.equals(""))) {
            validacao = false;
            EmailEditTextTelaDeCadastro.setError(getString(R.string.CampoEmailUsuario));
        }

        if ((senha_usuario == null) || (senha_usuario.equals(""))) {
            validacao = false;
            SenhaEditTextTelaDeCadastro.setError(getString(R.string.CampoSenhaUsuario));

        }

        // Validação da validação da senha e email, mas ta dando pau
        /* if (confirma_email_usuario != email_usuario) {
            validacao = false;
            ConfirmarEmailEditTextTelaDeCadastro.setError(getString(R.string.CamposEmailDiferentes));
        }

        if (confirma_senha_usuario != senha_usuario) {
            validacao = false;
            ConfirmarSenhaEditTextTelaDeCadastro.setError(getString(R.string.CamposSenhaDiferentes));
        } */




        if (validacao) {

            usuarios = new Usuarios();

            usuarios.setNome_usuario(nome_usuario);
            usuarios.setEmail_usuario(email_usuario);
            usuarios.setSenha_usuario(senha_usuario);

            // Se for Alteração de Dados
            if (id_usuario > 0) {
                usuarios.setId_usuario(id_usuario);
            }

            long resultado = usuariosBD.salvarUsuarios(usuarios);

            if (resultado != -1) {

                if (id_usuario > 0) {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_atualizar));

                    //Se for Cadastro de Dados
                } else {
                    MensagemGeral.Msg(this, getString(R.string.mensagem_cadastrar));
                }

                finish();

                startActivity(new Intent(this, ListaUsuarios.class));

                // Caso de Algum Erro apresentará esta mensagem
            } else {
               MensagemGeral.Msg(this, getString(R.string.mensagem_erro));
            }
        }
    }



    @Override
    public void onClick(View v) {

        if (LoginTextViewTelaDeCadastro.isPressed()) {

            Intent intentTelaLogin = new Intent(this, TelaDeLogin.class); // criando um novo objeto da classe Intent e passado os parametros a outra activity

            startActivity(intentTelaLogin); // comecando a activity

            finish(); // finaliza a activity anterior

          // overridePendingTransition(android.R.anim.slide_out_right, android.R.anim.slide_in_left);
        }

        if (CadastrarButtonTelaDeCadastro.isPressed()){
            this.cadastrarUsuarios();
        }

    }

}
