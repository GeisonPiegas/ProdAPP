package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SubSubMenuArroz extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LinearLayoutArroz1;
    private LinearLayout LinearLayoutArroz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_sub_menu_arroz);

        LinearLayoutArroz1 = (LinearLayout) findViewById(R.id.LinearLayoutArroz1);
        LinearLayoutArroz2 = (LinearLayout) findViewById(R.id.LinearLayoutArroz2);

        LinearLayoutArroz1.setOnClickListener(this);
        LinearLayoutArroz2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (LinearLayoutArroz1.isPressed()) {
            Intent intentPragaArroz1 = new Intent(this, PragaArroz1.class);
            startActivity(intentPragaArroz1);
        }
        if (LinearLayoutArroz2.isPressed()) {
            Intent intentPragaArroz2 = new Intent(this, PragaArroz2.class);
            startActivity(intentPragaArroz2);
        }

    }
}
