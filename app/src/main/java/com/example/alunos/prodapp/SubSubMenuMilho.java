package com.example.alunos.prodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SubSubMenuMilho extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout LinearLayoutMilho1;
    private LinearLayout LinearLayoutMilho2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_sub_menu_milho);

        LinearLayoutMilho1 = (LinearLayout) findViewById(R.id.LinearLayoutMilho1);
        LinearLayoutMilho2 = (LinearLayout) findViewById(R.id.LinearLayoutMilho2);

        LinearLayoutMilho1.setOnClickListener(this);
        LinearLayoutMilho2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (LinearLayoutMilho1.isPressed()) {
            Intent intentSubPragaMilho1 = new Intent(this, PragaMilho1.class);
            startActivity(intentSubPragaMilho1);
        }
        if (LinearLayoutMilho2.isPressed()) {
            Intent intentSubPragaMilho2 = new Intent(this, PragaMilho2.class);
            startActivity(intentSubPragaMilho2);
        }

    }
}
