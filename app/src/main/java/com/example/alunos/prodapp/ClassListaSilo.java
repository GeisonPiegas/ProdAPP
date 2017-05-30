package com.example.alunos.prodapp;

import android.graphics.drawable.Drawable;

/**
 * Created by Geison on 28/05/2017.
 */

public class ClassListaSilo {
    // Atributos declarados
    protected static Drawable imagem;
    protected static String nomeSilo;
    protected static String produtoSilo;
    protected long id;

    //Metodo construtor
    public ClassListaSilo(Drawable imagem, String nomeSilo, String produtoSilo){
        //Atributos sendo designados para seus parametros correspondentes
        this.imagem = imagem;
        this.nomeSilo = nomeSilo;
        this.produtoSilo = produtoSilo;
        this.id = id;
    }

    //Metodos get e set
    public static Drawable getImagem(){
        return imagem;
    }

    public void setImagem(Drawable imagem){
        this.imagem = imagem;
    }



    public static String getnomeSilo(){
        return nomeSilo;
    }
    public void setnomeSilo(String nomeSilo){
        this.nomeSilo = nomeSilo;
    }



    public static String getProdutoSilo(){
        return produtoSilo;
    }
    public void setProdutoSilo(String produtoSilo){
        this.produtoSilo = produtoSilo;
    }



    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;

    }
}
