package com.example.alunos.prodapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class PragaSoja2 extends AppCompatActivity implements View.OnClickListener{
    private android.widget.RelativeLayout RelativeLayout;
    private android.widget.ScrollView ScrollView;
    private LinearLayout LinearLayoutVertical;
    private TextView textViewTitulo;
    private android.widget.HorizontalScrollView HorizontalScrollView;
    private LinearLayout LinerLayoutHorizontal;
    private ImageButton imageViewSoja1;
    private ImageButton imageViewSoja2;
    private ImageButton imageViewSoja3;
    private ImageButton imageViewSoja4;
    private TextView textViewSobre;
    private TextView textViewSubTitulo;
    private TextView textViewSubSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_praga_soja2);
    }

    @Override
    public void onClick(View v) {

    }
}
