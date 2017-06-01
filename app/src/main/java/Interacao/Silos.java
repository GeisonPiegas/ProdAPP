package Interacao;

/**
 * Created by Geison on 01/06/2017.
 */

public class Silos {
    private int id;
    private String nome;
    private int imagem;


    public Silos(int id, String nome, int imagem){
        this.id = id;
        this.nome = nome;
        this.imagem = imagem;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
