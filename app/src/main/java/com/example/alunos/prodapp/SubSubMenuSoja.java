package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SubSubMenuSoja extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LinearLayoutSoja1;
    private LinearLayout LinearLayoutSoja2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_sub_menu_soja);

        LinearLayoutSoja1 = (LinearLayout) findViewById(R.id.LinearLayoutSoja1);
        LinearLayoutSoja2 = (LinearLayout) findViewById(R.id.LinearLayoutSoja2);

        LinearLayoutSoja1.setOnClickListener(this);
        LinearLayoutSoja2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (LinearLayoutSoja1.isPressed()) {
            Intent intentSubPragaSoja1 = new Intent(this, PragaSoja1.class);
            startActivity(intentSubPragaSoja1);
        }
        if (LinearLayoutSoja2.isPressed()) {
            Intent intentSubPragaSoja2 = new Intent(this, PragaSoja2.class);
            startActivity(intentSubPragaSoja2);
        }

    }
}
