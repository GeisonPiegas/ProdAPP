package Interacao;

/**
 * Created by Geison on 01/06/2017.
 */

public class Silos {
    // Criando os Atributos da Classes
    private int id_silo;
    private String nome_silo;
    private String produto_silo;
    private Double tamanho_silo;


    public Silos() {
        // Por algum motivo divino esse método fica em branco

    }


    // Criando metodo construtor que vai recebrer os parametros externos
    public Silos(int id_silo, String nome_silo, String produto_silo, Double tamanho_silo){
        //A variavel da classe Construtora vai receber a variavel que está vindo por parametro (This faz referencia a classe)
        this.id_silo = id_silo;
        this.nome_silo = nome_silo;
        this.produto_silo = produto_silo;
        this.tamanho_silo = tamanho_silo;
    }



    // Métodos criados automáticamento pelos getters and Setters
    public int getId_silo() {
        return id_silo;
    }

    public void setId_silo(int id_silo) {
        this.id_silo = id_silo;
    }

    public String getNome_silo() {
        return nome_silo;
    }

    public void setNome_silo(String nome_silo) {
        this.nome_silo = nome_silo;
    }

    public String getProduto_silo() {
        return produto_silo;
    }

    public void setProduto_silo(String produto_silo) {
        this.produto_silo = produto_silo;
    }

    public Double getTamanho_silo() {
        return tamanho_silo;
    }

    public void setTamanho_silo(Double tamanho_silo) {
        this.tamanho_silo = tamanho_silo;
    }

}
