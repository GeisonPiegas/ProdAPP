package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SiloPrincipal extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView3;
    private Toolbar toolbar2;
    private Toolbar toolbar3;
    private Toolbar toolbar4;
    private Toolbar toolbar5;
    private Toolbar toolbar6;
    private TextView textView7;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    private EditText editText;
    private Button button2;
    private String teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silo_principal);

        imageView3 = (ImageView) findViewById(R.id.imageView3);
        toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        toolbar3 = (Toolbar) findViewById(R.id.toolbar3);
        toolbar4 = (Toolbar) findViewById(R.id.toolbar4);
        toolbar5 = (Toolbar) findViewById(R.id.toolbar5);
        toolbar6 = (Toolbar) findViewById(R.id.toolbar6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView10 = (TextView) findViewById(R.id.textView10);
        textView11 = (TextView) findViewById(R.id.textView11);
        editText = (EditText) findViewById(R.id.editText);
        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(this);

        toolbar2.setVisibility(View.INVISIBLE);
        toolbar3.setVisibility(View.INVISIBLE);
        toolbar4.setVisibility(View.INVISIBLE);
        toolbar5.setVisibility(View.INVISIBLE);
        toolbar6.setVisibility(View.INVISIBLE);
        textView7.setVisibility(View.INVISIBLE);
        textView8.setVisibility(View.INVISIBLE);
        textView9.setVisibility(View.INVISIBLE);
        textView10.setVisibility(View.INVISIBLE);
        textView11.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {
        if (button2.isPressed()) {
            teste = editText.getText().toString();

            switch (teste) {
                case "10":
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.INVISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.INVISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);
                    textView11.setVisibility(View.INVISIBLE);
                    editText.setText("");
                    break;

                case "25":
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.INVISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.INVISIBLE);
                    textView10.setVisibility(View.INVISIBLE);
                    textView11.setVisibility(View.INVISIBLE);
                    editText.setText("");
                    break;

                case "50":
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.INVISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.INVISIBLE);
                    textView11.setVisibility(View.INVISIBLE);
                    editText.setText("");
                    break;

                case "75":
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.INVISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.VISIBLE);
                    textView11.setVisibility(View.INVISIBLE);
                    editText.setText("");
                    break;

                case "100":
                    toolbar2.setVisibility(View.VISIBLE);
                    toolbar3.setVisibility(View.VISIBLE);
                    toolbar4.setVisibility(View.VISIBLE);
                    toolbar5.setVisibility(View.VISIBLE);
                    toolbar6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.VISIBLE);
                    textView11.setVisibility(View.VISIBLE);
                    editText.setText("");
                    break;

                default:
                    editText.setError("informe o numero valido");
                    break;

            }

        }

    }
}
