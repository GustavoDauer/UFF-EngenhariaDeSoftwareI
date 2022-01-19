package Controle;

import Sistema.Catalogo;
import Sistema.Produto;

public class ControleProduto {

    public static boolean insereProduto(String codigo, String nome, String fornecedor, double valor, int qtd){
        return Catalogo.inserirProduto(new Produto(nome, valor, codigo, fornecedor, qtd));
    }
    public static String buscaInfoProduto(String codigo){
        Produto produto = Catalogo.busca(codigo);
        if(produto == null)
            return"";
        return produto.toString();
    }
    
    
    public static boolean pertence(String cod){
        Produto produto = Catalogo.busca(cod);
        if(produto == null)
            return false;
        return true;
    }

    public static String getQuantidade(String cod) {
        return ""+Catalogo.busca(cod).getQuantidadeEmEstoque();
    }

    public static String getPreco(String cod) {
        return ""+Catalogo.busca(cod).getValor();
    }

    public static String getFornecedor(String cod) {
        return ""+Catalogo.busca(cod).getFornecedor();
    }

    public static String getNomeProduto(String cod) {
        return Catalogo.busca(cod).getNome();
    }

    public static boolean removeProduto(String codigo) {
        return Catalogo.removerProduto(codigo);
    }
    
    public static Object[][] buscaInfo(){
        return Catalogo.buscaDados();
    }

    public static Object[] buscaProduto(String codigo) {
        return Catalogo.buscaProduto(codigo);
    }

    public static void atualizaProduto(String codigo, String nome, String fornecedor, String preco, String quantidade) {
        Catalogo.atualizaProduto(codigo, nome, fornecedor, preco, quantidade);
    }
    
}
