package com.example.alunos.prodapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Geison on 28/05/2017.
 */

public class AdapterClassListaSilo extends BaseAdapter {

    protected Activity activity;
    // Dentro do ArrayList é declarado a ClassListaSilo, tudo os dados pego dela são guardados nessa ArrayList
    protected ArrayList<ClassListaSilo> silos;

    public AdapterClassListaSilo(Activity activity, ArrayList<ClassListaSilo> silos){
        this.activity = activity;
        this.silos = silos;
    }


    @Override
    public int getCount() {
        //Obtem o tamanho da lista de Silos
        return silos.size();
    }

    @Override
    public Object getItem(int position) {
        //Obtem a posição da lista de Silos
        return silos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return silos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Foi gerado uma convertView por motivos de eficiencia
        View v = convertView;


        // Associa o Layout item_silos que foi criado
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_silos, null);
        }

        //Cria um objeto da classe ClassListaSilo
        ClassListaSilo classListaSilo = silos.get(position);

        ImageView imagem = (ImageView) v.findViewById(R.id.imageViewSilo);
        imagem.setImageDrawable(ClassListaSilo.getImagem());

        TextView nomeSilo = (TextView) v.findViewById(R.id.textViewnomeSilo);
        nomeSilo.setText(ClassListaSilo.getnomeSilo());

        TextView produtoSilo = (TextView) v.findViewById(R.id.textViewProdutoSilo);
        produtoSilo.setText(ClassListaSilo.getProdutoSilo());

        return v;

    }

}
