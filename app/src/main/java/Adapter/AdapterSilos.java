package Adapter;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.alunos.prodapp.R;

import java.util.List;

import Interacao.Silos;
import util.Contexto;


/**
 * Created by Geison on 06/12/2016.
 */
public class AdapterSilos extends BaseAdapter {

    //Criando novos objetos
    private Context context;
    private List<Silos> lista;
    private String nomeProduto;


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


        // Pegando o nome do silo e setando na listagem
        TextView nomeDoSilo = (TextView) convertView.findViewById(R.id.textViewnomeSilo);
        nomeDoSilo.setText(silos.getNome_silo());

        Contexto.dados.put("nomeSilo",nomeDoSilo) ;

        // nomeProduto é uma variavel que recebe o nome do produto pra poder fazer os teste seguintes.
        nomeProduto = silos.getProduto_silo();

        //Testes pra ve que produto é, e ja coloca a IMAGEM do PRODUTO que ele é
        if(nomeProduto.equals("Arroz")) {
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenViewSilo);
            imageView.setImageResource(R.drawable.iconearroz);
        }else{
            if(nomeProduto.equals("Soja")) {
                ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenViewSilo);
                imageView.setImageResource(R.drawable.iconesoja);
            }else{
                if(nomeProduto.equals("Trigo")) {
                    ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenViewSilo);
                    imageView.setImageResource(R.drawable.iconetrigo);
                }else{
                    if(nomeProduto.equals("Milho")) {
                        ImageView imageView = (ImageView) convertView.findViewById(R.id.imagenViewSilo);
                        imageView.setImageResource(R.drawable.iconemilho);


                    }
                }
            }
        }

        return convertView ;
    }

}

