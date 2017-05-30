package com.example.alunos.prodapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TelaEscolhaSilo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha_silo);

        ListView lista = (ListView) findViewById(R.id.ListaSilosID);
        ArrayList<ClassListaSilo> ArrayClass = new ArrayList<ClassListaSilo>();
        ClassListaSilo classListaSilo;

        classListaSilo = new ClassListaSilo(getResources().getDrawable(R.drawable.icon_silos), "Silo 1", "Produto: Milho");
        ArrayClass.add(classListaSilo);

        classListaSilo = new ClassListaSilo(getResources().getDrawable(R.drawable.icon_silos), "Silo 2", "Produto: Trigo");
        ArrayClass.add(classListaSilo);



        AdapterClassListaSilo adapter = new AdapterClassListaSilo(this, ArrayClass);

        lista.setAdapter(adapter);
    }

}
