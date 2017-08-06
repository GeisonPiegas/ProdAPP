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
import Interacao.Usuarios;

/**
 * Created by Geison on 06/12/2016.
 */
public class AdapterUsuarios extends BaseAdapter {

    //Criando novos objetos
    private Context context;
    private List<Usuarios> lista;


    //Criando o metodo construtor
    public AdapterUsuarios(Context ctx, List<Usuarios> usuarios) { // Recebendo por parametro e setando.
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

        Usuarios usuario = lista.get(position);

        if (convertView == null) { //testando um componente grafico que está sendo pego pelo "getView" acima

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.item_usuarios, null);
        }



        /* AINDA NÃO É POSSIVEL CHAMAR INFORMAÇÕES DE OUTRAS TABELAS E ENVIAR PARA O TEXTVIEW E LISTVIEW  */

        TextView textView = (TextView) convertView.findViewById(R.id.textViewnomeSilo);
        textView.setText("ID : "+ usuario.getId_usuario()+"\n\nNOME: " + usuario.getNome_usuario() + "\n\nE-MAIL: " + usuario.getEmail_usuario()+"  \n\nSENHA:" + usuario.getSenha_usuario() +"  \n\n");

        return convertView ;
    }

}
