package BD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.support.annotation.RequiresApi;

/**
 * Created by Alunos on 26/05/2017.
 */

public class ConexaoBD extends SQLiteOpenHelper{
    private final static String BANCO_DE_DADOS = "ProdAPP";
    private final static int VERSAO = 1;

    public ConexaoBD(Context context){
        super(context, BANCO_DE_DADOS, null, VERSAO);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onCreate(SQLiteDatabase db) {
        /*
        * Cria a tabela "usuarios no SQLite"
        */
        String sql = "CREATE TABLE IF NOT EXISTS usuarios (" +
                "id_usuario INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE NOT NULL," +
                "nome_usuario TEXT(50) NOT NULL," +
                "email_usuario TEXT(64) UNIQUE NOT NULL," +
                "senha_usuario TEXT(64) NOT NULL" +
                ")";


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
}
