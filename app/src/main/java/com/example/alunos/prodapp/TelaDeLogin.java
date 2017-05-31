package com.example.alunos.prodapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import BD.UsuariosBD;
import Mensagem.MensagemGeral;

public class TelaDeLogin extends AppCompatActivity implements View.OnClickListener{
    private RelativeLayout RelativeLayoutTelaDeLogin;
    private ScrollView ScrollViewTelaDeLogin;
    private LinearLayout LinearLayoutVerticalTelaDeLogin;
    private ImageView IconeImageViewTelaDeLogin;
    private TextView EmailTextViewTelaDeLogin;
    private EditText EmailEditTextTelaDeLogin;
    private TextView SenhaTextViewTelaDeLogin;
    private EditText SenhaEditTextTelaDeLogin;
    private CheckBox SalvarSenhaCheckBoxTelaDeLogin;
    private Button EntrarButtonTelaDeLogin;
    private TextView EsqueceuSenhaTextViewTelaDeLogin;

    //-----------
    //Criando as contantes FINAL DEFINE QUE É UMA CONSTANTE
    private static final String MANTER_CONECTADO = "manter conectado";
    private static final String PREFERENCE_NAME = "LoginActivityPreference";


    // Criando um objeto da classe criada pro banco de dados.
    private UsuariosBD helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_de_login);

        //find's
        RelativeLayoutTelaDeLogin = (RelativeLayout) findViewById(R.id.RelativeLayoutTelaDeLogin);
        ScrollViewTelaDeLogin = (ScrollView) findViewById(R.id.ScrollViewTelaDeLogin);
        LinearLayoutVerticalTelaDeLogin = (LinearLayout) findViewById(R.id.LinearLayoutVerticalTelaDeLogin);
        IconeImageViewTelaDeLogin = (ImageView) findViewById(R.id.IconeImageViewTelaDeLogin);

        EmailTextViewTelaDeLogin = (TextView) findViewById(R.id.EmailTextViewTelaDeLogin);
        EmailEditTextTelaDeLogin = (EditText) findViewById(R.id.EmailEditTextTelaDeLogin);
        SenhaTextViewTelaDeLogin = (TextView) findViewById(R.id.SenhaTextViewTelaDeLogin);
        SenhaEditTextTelaDeLogin = (EditText) findViewById(R.id.SenhaEditTextTelaDeLogin);

        SalvarSenhaCheckBoxTelaDeLogin = (CheckBox) findViewById(R.id.SalvarSenhaCheckBoxTelaDeLogin);
        EntrarButtonTelaDeLogin = (Button) findViewById(R.id.EntrarButtonTelaDeLogin);
        EsqueceuSenhaTextViewTelaDeLogin = (TextView) findViewById(R.id.EsqueceuSenhaTextViewTelaDeLogin);

        //onclick's
       // SalvarSenhaCheckBoxTelaDeLogin.setOnClickListener(this);
        EntrarButtonTelaDeLogin.setOnClickListener(this);

        //------------------
        // Irá Pegar o Arquivo de Preferencia que foi salvo e testar
        SharedPreferences sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE);


        //Caso não tenha encontrado nada no 'Manter_Conectado' será Atribuido o Valor Falso
        boolean conectado = sharedPreferences.getBoolean(MANTER_CONECTADO, false);


        if (conectado==true) {
            chamarMenuNavegacao(); // Se o teste for correto, irá chamar a Activity Desejada.
        }

    }


    // Criando um Metodo pra a partir de uma activity atual- chamar uma outra e encerrar a que chamou.
    public void chamarMenuNavegacao() {
        startActivity(new Intent(this, MainActivity.class)); // comando para iniciar a Activity que recebe 2 parametros( qual local que tá chamando ,  e qual tela que tá sendo chamada )
        //finish(); // finalizando a activity que está chamando.

    }


    @Override
    public void onClick(View v) {
        logar() ;
    }

    //--------

    //Criando um Novo Metodo para Logar

    public void logar() {

        String email = EmailEditTextTelaDeLogin.getText().toString(); // Criando variaveis que recebem o que foi digitado nos EditTexts
        String senha = SenhaEditTextTelaDeLogin.getText().toString();

        boolean validacao = true; // criando um nova variavel que já começa com um valor definido.


        // Fazendo o teste logico e testanto se o usuario não digitou nada ou deixou nulo
        if ((email == null) || (email.equals(""))) {
            validacao = false;
            EmailEditTextTelaDeLogin.setError("E-mail inválido !!"); // mostrando de erro criado no <String>

        }
        if ((senha == null) || (senha.equals(""))) {
            validacao = false;
            SenhaEditTextTelaDeLogin.setError("Senha Inválida");

        }

        if (validacao) { // A condição assim, significa que é Verdadeiro, pois no inicio do codigo da classe foi definido como True.

            // Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();

            // Se a validação tiver sido POSITIVA irá fazer os comando abaixo e enviar os parametros para a classe UsuárioDB
            if (helper.logar(email, senha)) {

                //   startActivity(new Intent(this, MenuNavegacaoActivity.class));
                chamarMenuNavegacao(); // chamando a Activity Expecifica
            } else {
                // Se o Login for Incorreto ele cai nesta condição, E chama o metodo mensagem - o objeto criado - por parametros recebe obrigatoriamente
                // (A Activity que deseja que apareça a mensagem neste caso usa-se THIS pois é nesta activity atual 'LoginActivity', com o comando 'getString' está sendo
                // setada a mensagem -> usa-se a Classe 'R' -  o Tipo de dados(String) e o metodo que foi criado com as mensagens)
                MensagemGeral.Msg(this, "Usuário e/ou Senha inválido!");
            }
        }

    }


}
