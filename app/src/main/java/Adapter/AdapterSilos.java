package Adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.alunos.prodapp.R;

import java.util.List;

import Interacao.Silos;


/**
 * Created by Geison on 06/12/2016.
 */
public class AdapterSilos extends BaseAdapter {

    //Criando novos objetos
    private Context context;
    private List<Silos> lista;


    //Criando o metodo construtor
    public AdapterSilos(Context ctx, List<Silos> usuarios) { // Recebendo por parametro e setando.
        this.context = ctx;
        this.lista = usuarios;
    }


    // Metodos Implementados Automaticamente
    @Override
    public int getCount() {
        return lista.size(); // pega o valor de tamanho total da lista
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Silos silos = lista.get(position);

        if (convertView == null) { //testando um componente grafico que está sendo pego pelo "getView" acima

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.item_silos, null);
        }



        /* AINDA NÃO É POSSIVEL CHAMAR INFORMAÇÕES DE OUTRAS TABELAS E ENVIAR PARA O TEXTVIEW E GRIDVIEW  */

        TextView textView = (TextView) convertView.findViewById(R.id.textViewnomeSilo);
        textView.setText(silos.getNome_silo());

        return convertView ;
    }

}

