package Sistema;

import java.io.Serializable;

public class Produto implements Serializable{

    private String nome;
    private double valor;
    private String codigo;
    private String fornecedor;
    private int quantidadeEmEstoque;

    public Produto(String nome, double valor, String codigo, String fornecedor, int quantidadeEmEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.codigo = codigo;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

   public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String toString(){
        return String.format("Nome: %s\nValor: %s\nCódigo: %s\nQuantidade: %s\n", nome, valor, codigo, quantidadeEmEstoque);
    }
         
}
