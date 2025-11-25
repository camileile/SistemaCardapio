
package com.mycompany.restaurante;

/**
 *
 * @author CAMILEDAANUNCIAÇÃOLI
 */
public class ItemCardapio {
    private String nome;
    private double preco;
    private int codigo;
    private String descrcao;
    
    
    public ItemCardapio (String nome, double preco, int codigo){
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco ()
    {
        return preco; 
    }
    
    public int geteCodigo (){
        return codigo; 
    }
    
    public void setPreco (double preco){
        this.preco = preco;
    }
}

    public void exibirInformacoes (){
    System.out.println("Nome: " + nome);
}
