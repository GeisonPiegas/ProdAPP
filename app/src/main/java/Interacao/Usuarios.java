package Interacao;

/**
 * Created by Marcos Martins on 31/05/2017.
 */

public class Usuarios {

    // Criando os Atributos da Classes
    private Integer id_usuario ;
    private String nome_usuario ;
    private String email_usuario ;
    private String senha_usuario ;

    public Usuarios () {
        // Por algum motivo divino esse método fica em branco

    }

    /**
     * criando o mesmo metodo construtor que vai recebrer os parametros externos
     */

    public Usuarios(Integer id_usuario , String nome_usuario , String email_usuario , String senha_usuario ){

        //A variavel da classe Construtora vai receber a variavel que está vindo por parametro (This faz referencia a classe)
        this.id_usuario = id_usuario ;
        this.nome_usuario = nome_usuario ;
        this.email_usuario = email_usuario ;
        this.senha_usuario = senha_usuario ;

    }


    // Métodos criados automáticamento pelos getters and Setters

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }


}
