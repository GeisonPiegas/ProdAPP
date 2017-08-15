package BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import Interacao.Valor;

/**
 * Created by Marcos on 14/08/2017.
 */

public class ValorBD {

    // /criado uma variavel para abrir e manipular o Banco de Dados
    private ConexaoBD dataBaseHelper;


    //Criando variavel que Permite que interações sejam feitas no Banco IMPORTA AUTOMATICAMENTE
    private SQLiteDatabase sqLiteDatabase;


    //criando o metodo contrutor ou Instanciando -> Recebe por padrão um contexto
    public ValorBD(Context context) { //Ira passar qual Activity que está chamando esta classe
        dataBaseHelper = new ConexaoBD(context); // abrindo o banco de dados.
    }

    //Metodo com Retorno então não usa-se VOID
    public SQLiteDatabase getDataBase() {

        if (sqLiteDatabase == null) {
            sqLiteDatabase = dataBaseHelper.getWritableDatabase(); // Prepara o Banco de Dados para a manipulação (Escrita, Remoção ETC)

        }
        return sqLiteDatabase;
    }

    // Criando um Metodo para fechar o Banco de Dados de maneira pratica
    public void fechar() {

        dataBaseHelper.close(); // fechando o banco
        dataBaseHelper = null; // atribuindo null pra ele

    }


    // Criando um novo método que irá criar os novos usuários
    private Valor criarValor(Cursor cursor) {

        //instanciando um novo objeto da classe USUARIOS
        Valor valor = new Valor(
                cursor.getInt(cursor.getColumnIndex(ConexaoBD.valor.ID_VALOR)), // Tem que ser GET IN POIS SE TRATA DE UM ID
                cursor.getString(cursor.getColumnIndex(ConexaoBD.valor.VALOR))); // Tem que ser get String pois o tipo é este

        return valor;
    }

    // Maneira de Salvar os dados no Banco de Dados seja eles não existente ou já existentes

    // Criando um novo metodo e passando um novo objeto da classe Usuário
    public long salvarValor(Valor valor) {


        // Classe que recebe os valores que serão salvos no banco de dados
        //Tem que informar O nome da Coluna e a Tabela e tambem as informações que deseja salvar nessa Tabela
        ContentValues valores = new ContentValues();

        /* AINDA FALTA CONSEGUIR PEGAR O ID MAIOR E SETAR ELE COMO CHAVE ESTRANGEIRA
        E FALTA PEGAR A DATA ATUAL DO SISTEMA TAMBEM

        --> Esse comentário era refernete ao problema de interação entre as tabelas
         */

        //Metodo PUT recebe por parametro os tipos de dados String Key e Short Value
        valores.put(ConexaoBD.valor.ID_VALOR, valor.getId_valor());
        valores.put(ConexaoBD.valor.VALOR , valor.getValor());



        if (valor.getId_valor() != null) {
            return sqLiteDatabase.update(ConexaoBD.valor.TABELA, valores, "id_valor = ?",
                    new String[]{valor.getId_valor().toString()});

        }

        return getDataBase().insert(ConexaoBD.valor.TABELA, null, valores);

    }


}
