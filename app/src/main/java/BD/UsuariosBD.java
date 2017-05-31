package BD;
import android.database.sqlite.SQLiteDatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Interacao.Usuarios;


/**
 * Created by Marcos Martins on 31/05/2017.
 */

public class UsuariosBD {

    // /criado uma variavel para abrir e manipular o Banco de Dados
    private ConexaoBD dataBaseHelper;


    //Criando variavel que Permite que interações sejam feitas no Banco IMPORTA AUTOMATICAMENTE
    private SQLiteDatabase sqLiteDatabase;


    //criando o metodo contrutor ou Instanciando -> Recebe por padrão um contexto
    public UsuariosBD(Context context) { //Ira passar qual Activity que está chamando esta classe
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
    private Usuarios criarUsuarios(Cursor cursor) {

        //instanciando um novo objeto da classe USUARIOS
        Usuarios usuarios = new Usuarios(


                //Pega um valor inteiro - de dentro de um index(exemplo posição em um vetor)- chamado _ID que tá na classe
                //Conecta e Sub-Classe -  USUÁRIOs

                // Esta parte manda para a Classe USUÁRIO e manda para o metodo construtor que recebe parametros !

                cursor.getInt(cursor.getColumnIndex(ConexaoBD.usuarios.ID_USUARIO)), // Tem que ser GET IN POIS SE TRATA DE UM ID
                cursor.getString(cursor.getColumnIndex(ConexaoBD.usuarios.NOME_USUARIO)), // Tem que ser get String pois o tipo é este
                cursor.getString(cursor.getColumnIndex(ConexaoBD.usuarios.EMAIL_USUARIO)),
                cursor.getString(cursor.getColumnIndex(ConexaoBD.usuarios.SENHA_USUARIO)));
        return usuarios;
    }


    // Maneira de Listar Todos os USUÁRIOS do Banco de Dados
    public List<Usuarios> ListaUsuarios() {

        // Gerando um Cursor ( que via executar as QUERYS)
        Cursor cursor = getDataBase().query(ConexaoBD.usuarios.TABELA, //Cursor ta executando essa seleção que tá sendo feita
                ConexaoBD.usuarios.COLUNAS, null, null, null, null, null);


        //Criando uma Lista de Usuários
        List<Usuarios> usuarios = new ArrayList<Usuarios>();

        while (cursor.moveToNext()) { // Enquanto o cursos se mover para o proximo ou outra posição

            Usuarios modelo = criarUsuarios(cursor); // criando um novo objeto e passando parametros do cursor
            usuarios.add(modelo); //adcionando um novo Usuários a lista
        }

        cursor.close(); // fechando o cursor e retornando para enderecos


        return usuarios;
    }

    // Maneira de Salvar os dados no Banco de Dados seja eles não existente ou já existentes

    // Criando um novo metodo e passando um novo objeto da classe Usuário
    public long salvarUsuarios(Usuarios usuarios) {


        // Classe que recebe os valores que serão salvos no banco de dados
        //Tem que informar O nome da Coluna e a Tabela e tambem as informações que deseja salvar nessa Tabela
        ContentValues valores = new ContentValues();

        /* AINDA FALTA CONSEGUIR PEGAR O ID MAIOR E SETAR ELE COMO CHAVE ESTRANGEIRA
        E FALTA PEGAR A DATA ATUAL DO SISTEMA TAMBEM

        --> Esse comentário era refernete ao problema de interação entre as tabelas
         */

        //Metodo PUT recebe por parametro os tipos de dados String Key e Short Value
        valores.put(ConexaoBD.usuarios.ID_USUARIO, usuarios.getId_usuario());
        valores.put(ConexaoBD.usuarios.NOME_USUARIO , usuarios.getNome_usuario());
        valores.put(ConexaoBD.usuarios.EMAIL_USUARIO , usuarios.getEmail_usuario());
        valores.put(ConexaoBD.usuarios.SENHA_USUARIO , usuarios.getSenha_usuario());


        if (usuarios.getId_usuario() != null) {
            return sqLiteDatabase.update(ConexaoBD.usuarios.TABELA, valores, "id_usuario = ?",
                    new String[]{usuarios.getId_usuario().toString()});

        }


        return getDataBase().insert(ConexaoBD.usuarios.TABELA, null, valores);

    }


    // Maneira de REMOVER os dados no Banco de Dados seja eles não existente ou já existentes

    //REMOVENDO USUARIOS DE ACORDO COM O ID
    public boolean removerUsuarios(int id) {

        return getDataBase().delete(ConexaoBD.usuarios.TABELA, "id_usuario = ?", new String[]{(Integer.toString(id))}) > 0;


    }

    // Maneira de BUSCAR os dados no Banco de Dados seja eles não existente ou já existentes

    //BUSCANDO USUARIOS DE ACORDO COM O ID
    public Usuarios buscarUsuarios(int id) {
        Cursor cursor = getDataBase().query(ConexaoBD.usuarios.TABELA, ConexaoBD.usuarios.COLUNAS, "id_usuario = ?", new String[]{Integer.toString(id)}, null, null, null);

        List<Usuarios> usuarios = new ArrayList<Usuarios>();

        while (cursor.moveToNext()) {
            Usuarios modelo = criarUsuarios(cursor);
            usuarios.add(modelo);
            cursor.close();
            return modelo;
        }

        return null;
    }


    public boolean logar(String email, String senha) { // Criando novo objeto e recebendo parametros do "loginActivity"
        Cursor cursor = getDataBase().query(ConexaoBD.usuarios.TABELA, null, "EMAIL_USUARIO = ? AND SENHA_USUARIO = ?", new String[]{email, senha}, null, null, null);

        if (cursor.moveToFirst()) { // Procura e Retorna o Primeiro que for encontrado
            return true;

        } else {
            return false;
        }


    }
}













