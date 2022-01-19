package Sistema;

import java.io.Serializable;


public class ItemPedido implements Serializable{
    
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    
    public double calculaPrecoTotal(){
        return produto.getValor() * quantidade;
    }
    
    public String getCodigo(){
        return produto.getCodigo();
    }
    
    public String getNome(){
        return produto.getNome();
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }
    
    
    public double getValor(){
        return produto.getValor();
    }
    public String toString(){
        return this.getNome()+"        "+this.getQuantidade()+"         "+this.calculaPrecoTotal();
    }
    
    public void reduzEstoque(){
        produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() - quantidade);
    }
}
