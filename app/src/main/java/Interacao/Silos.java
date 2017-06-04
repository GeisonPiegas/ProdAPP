package Interacao;

/**
 * Created by Geison e Adaptado por Marcos on 04/06/2017.
 */

public class Silos {
    private int id_usuario ;
    private int id_silo ;
    private String nome_silo ;
    private String produto_silo ;
    private float tamanho_silo ;

    public Silos(){
        // Deixar este vazio, por que sem ele pode ser FATALL !!!
    }

    public Silos(int id_usuario, int id_silo, String nome_silo, String produto_silo, float tamanho_silo){
        this.id_usuario = id_usuario ;
        this.id_silo = id_silo ;
        this.nome_silo = nome_silo ;
        this.produto_silo = produto_silo ;
        this.tamanho_silo = tamanho_silo ;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

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

    public float getTamanho_silo() {
        return tamanho_silo;
    }

    public void setTamanho_silo(float tamanho_silo) {
        this.tamanho_silo = tamanho_silo;
    }

}



