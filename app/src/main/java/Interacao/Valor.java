package Interacao;

/**
 * Created by Marcos on 14/08/2017.
 */

public class Valor {

    // Criando os Atributos da Classes
    private Integer id_valor ;
    private String valor ;


    public Valor () {
        // Por algum motivo divino esse método fica em branco

    }

    /**
     * criando o mesmo metodo construtor que vai recebrer os parametros externos
     */

    public Valor(Integer id_valor, String valor){

        //A variavel da classe Construtora vai receber a variavel que está vindo por parametro (This faz referencia a classe)
        this.id_valor = id_valor ;
        this.valor = valor ;
    }

    public Integer getId_valor() {
        return id_valor;
    }

    public void setId_valor(Integer id_valor) {
        this.id_valor = id_valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
