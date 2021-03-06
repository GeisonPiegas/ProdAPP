package BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;

/**
 * Created by Marcos , Geison on 26/05/2017.
 */

public class ConexaoBD extends SQLiteOpenHelper{
    private final static String BANCO_DE_DADOS = "ProdAPP";
    private final static int VERSAO = 2;

    public ConexaoBD(Context context)
    {
        super(context, BANCO_DE_DADOS, null, VERSAO);

    }

    public void onCreate(SQLiteDatabase db) {
        /*
        * Cria a tabela "usuarios no SQLite"
        */
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE," +
                "nome_usuario TEXT(50) NULL," +
                "email_usuario TEXT(64) NULL," +
                "senha_usuario TEXT(64) NULL" +
                ")";

        db.execSQL(sql); // Executa o SQL, depois de definido a estrutura


        //INSERINDO DADOS PRÉ DEFINIDOS NA IMAGEM USUARIO
        sql = "insert into usuarios(id_usuario,nome_usuario,email_usuario,senha_usuario)" +
                "values (1 , 'prodapp' , 'prodapp@gmail.com' , 'prodapp')";

        db.execSQL(sql); // Executando a inserção dos dados


        sql = "CREATE TABLE IF NOT EXISTS silos (" +
                "id_usuario INTEGER REFERENCES usuarios (id_usuario) ON DELETE CASCADE NOT NULL," +
                "id_silo INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE," +
                "nome_silo TEXT NOT NULL," +
                "produto_silo TEXT NOT NULL," +
                "tamanho_silo DOUBLE NOT NULL" +
                ")";

        db.execSQL(sql);

        sql = "INSERT INTO silos(id_usuario, id_silo, nome_silo, produto_silo, tamanho_silo)" +
                "VALUES (1, 1, 'ProdaPP', 'Trigo', 25000)";

        db.execSQL(sql);

        //----------------------

         sql = "CREATE TABLE IF NOT EXISTS valor (" +
                "id_valor INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL UNIQUE," +
                "valor DOUBLE NOT NULL" +
                ")";

        db.execSQL(sql); // Executa o SQL, depois de definido a estrutura


        //INSERINDO DADOS PRÉ DEFINIDOS NA IMAGEM USUARIO
        sql = "insert into valor(id_valor,valor)" +
                "values (1 , 200)";

        db.execSQL(sql); // Executando a inserção dos dados



    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public static class usuarios{
        public static final String TABELA = "usuarios";
        public static final String ID_USUARIO = "id_usuario";
        public static final String NOME_USUARIO = "nome_usuario";
        public static final String EMAIL_USUARIO = "email_usuario";
        public static final String SENHA_USUARIO = "senha_usuario";

        public final static String [] COLUNAS = new String[]{
                ID_USUARIO, NOME_USUARIO, EMAIL_USUARIO, SENHA_USUARIO
        };
    }

    public static class valor{
        public static final String TABELA = "valor";
        public static final String ID_VALOR = "id_valor";
        public static final String VALOR = "valor" ;


        public final static String [] COLUNAS = new String[]{
                ID_VALOR, VALOR
        };
    }



    public static class silos{
        public static final String TABELA = "silos";
        public static final String ID_USUARIO = "id_usuario";
        public static final String ID_SILO = "id_silo";
        public static final String NOME_SILO = "nome_silo";
        public static final String PRODUTO_SILO = "produto_silo";
        public static final String TAMANHO_SILO = "tamanho_silo";


        public final static String [] COLUNAS = new String[]{
                ID_USUARIO, ID_SILO, NOME_SILO, PRODUTO_SILO, TAMANHO_SILO
        };
    }
}
