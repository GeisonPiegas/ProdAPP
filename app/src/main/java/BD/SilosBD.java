package BD;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Interacao.Silos;

/**
 * Created by Geison on 01/06/2017.
 */

public class SilosBD {

    // /criado uma variavel para abrir e manipular o Banco de Dados
    private ConexaoBD dataBaseHelper;


    //Criando variavel que Permite que interações sejam feitas no Banco IMPORTA AUTOMATICAMENTE
    private SQLiteDatabase sqLiteDatabase;


    //criando o metodo contrutor ou Instanciando -> Recebe por padrão um contexto
    public SilosBD(Context context) { //Ira passar qual Activity que está chamando esta classe
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


    // Criando um novo método que irá criar os novos silos
    private Silos criarSilos(Cursor cursor) {

                //instanciando um novo objeto da classe SILOS
                Silos silos = new Silos(


                //Pega um valor inteiro - de dentro de um index(exemplo posição em um vetor)- chamado _ID que tá na classe
                //Conecta e Sub-Classe -  SILOS

                // Esta parte manda para a Classe SILOS e manda para o metodo construtor que recebe parametros !

                cursor.getInt(cursor.getColumnIndex(ConexaoBD.silos.ID_SILO)), // Tem que ser GET IN POIS SE TRATA DE UM ID
                cursor.getInt(cursor.getColumnIndex(ConexaoBD.silos.ID_USUARIO)),
                cursor.getString(cursor.getColumnIndex(ConexaoBD.silos.NOME_SILO)), // Tem que ser get String pois o tipo é este
                cursor.getString(cursor.getColumnIndex(ConexaoBD.silos.PRODUTO_SILO)),
                cursor.getDouble(cursor.getColumnIndex(ConexaoBD.silos.TAMANHO_SILO)));
        return silos;
    }


    // Maneira de Listar Todos os SILOS do Banco de

    //Pega id do usuario para achar os silos cadastrados por ele
    public List<Silos> ListaSilos() {

        // Gerando um Cursor ( que via executar as QUERYS)
        Cursor cursor = getDataBase().query(ConexaoBD.silos.TABELA, //Cursor ta executando essa seleção que tá sendo feita
                ConexaoBD.silos.COLUNAS, null, null, null, null, null);

        //Criando uma Lista de Silos
        List<Silos> silos = new ArrayList<Silos>();

        while (cursor.moveToNext()) { // Enquanto o cursos se mover para o proximo ou outra posição

            Silos modelo = criarSilos(cursor); // criando um novo objeto e passando parametros do cursor
            silos.add(modelo); //adcionando um novo Silos a lista
        }

        cursor.close(); // fechando o cursor e retornando para enderecos


        return silos;
    }

    // Maneira de Salvar os dados no Banco de Dados seja eles não existente ou já existentes

    // Criando um novo metodo e passando um novo objeto da classe Silos
    public long salvarSilos(Silos silos) {


        // Classe que recebe os valores que serão salvos no banco de dados
        //Tem que informar O nome da Coluna e a Tabela e tambem as informações que deseja salvar nessa Tabela
        ContentValues silosValores = new ContentValues();

        /* AINDA FALTA CONSEGUIR PEGAR O ID MAIOR E SETAR ELE COMO CHAVE ESTRANGEIRA
        E FALTA PEGAR A DATA ATUAL DO SISTEMA TAMBEM

        --> Esse comentário era refernete ao problema de interação entre as tabelas
         */

        //Metodo PUT recebe por parametro os tipos de dados String Key e Short Value
        silosValores.put(ConexaoBD.silos.ID_USUARIO, "1");
        silosValores.put(ConexaoBD.silos.ID_SILO, silos.getId_silo());
        silosValores.put(ConexaoBD.silos.NOME_SILO, silos.getNome_silo());
        silosValores.put(ConexaoBD.silos.PRODUTO_SILO, silos.getProduto_silo());
        silosValores.put(ConexaoBD.silos.TAMANHO_SILO, silos.getTamanho_silo());


        return getDataBase().insert(ConexaoBD.silos.TABELA, null, silosValores);

    }


    // Maneira de REMOVER os dados no Banco de Dados seja eles não existente ou já existentes

    //REMOVENDO USUARIOS DE ACORDO COM O ID
    public boolean removerSilos(int id) {

        return getDataBase().delete(ConexaoBD.silos.TABELA, "id_silo = ?", new String[]{(Integer.toString(id))}) > 0;


    }

    // Maneira de BUSCAR os dados no Banco de Dados seja eles não existente ou já existentes

    //BUSCANDO USUARIOS DE ACORDO COM O ID
    public Silos buscarSilos(int id) {
        Cursor cursor = getDataBase().query(ConexaoBD.silos.TABELA, ConexaoBD.silos.COLUNAS, "id_silo = ?", new String[]{Integer.toString(id)}, null, null, null);

        List<Silos> silos = new ArrayList<Silos>();

        while (cursor.moveToNext()) {
            Silos modelo = criarSilos(cursor);
            silos.add(modelo);
            cursor.close();
            return modelo;
        }

        return null;
    }

    //TESTE "APAGAR"

}
