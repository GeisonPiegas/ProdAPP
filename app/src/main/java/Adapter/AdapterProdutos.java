package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

<<<<<<< HEAD
import com.example.alunos.prodapp.ListaSilos;
=======
>>>>>>> origin/master
import com.example.alunos.prodapp.R;

import java.util.ArrayList;
import java.util.List;

import Interacao.Produtos;

/**
 * Created by Geison on 11/06/2017.
 */

public class AdapterProdutos extends ArrayAdapter<Produtos> {
    private final Context context;
    private final ArrayList<Produtos> elementos;


    public AdapterProdutos(Context context, ArrayList<Produtos> elementos){
        super(context, R.layout.item_produtos,(List<Produtos>) elementos);
        this.context = context;
        this.elementos = elementos;
    }

<<<<<<< HEAD
    public View getView(int position, View convertView, ViewGroup parent){
        Produtos produtos = elementos.get(position);
=======


    public View getView(int position, View convertView, ViewGroup parent){
>>>>>>> origin/master
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.item_produtos, parent, false);

        ImageView imagem = (ImageView) rowView.findViewById(R.id.ImagemViewTelaListaProdutos);
        TextView produto = (TextView) rowView.findViewById(R.id.TextViewTelaListaProdutos);

        imagem.setImageResource(elementos.get(position).getImagem());
        produto.setText(elementos.get(position).getProduto());

        return rowView;
    }
<<<<<<< HEAD




}
=======
}
>>>>>>> origin/master
