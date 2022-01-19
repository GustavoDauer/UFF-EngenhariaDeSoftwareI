package Sistema;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Catalogo implements Serializable{
    
    private static Map<String,Produto> listaDeProdutos = new TreeMap<String, Produto>();

    
    public static boolean inserirProduto(Produto produto){
           if(listaDeProdutos.containsKey(produto.getCodigo()))
               return false;
           listaDeProdutos.put(produto.getCodigo(), produto);
           return true;
    }
    public static boolean removerProduto(String cod){
        if(!listaDeProdutos.containsKey(cod))
            return false;
         listaDeProdutos.remove(cod);
         return true;
    }
    
    public static boolean atualizarPreco(String cod, double novoValor){
        if(!listaDeProdutos.containsKey(cod))
            return false;
        listaDeProdutos.get(cod).setValor(novoValor);
        return true;
    }
    
    public static boolean atualizaEstoque(String cod, int qtd){
       if(!listaDeProdutos.containsKey(cod))
            return false;
        listaDeProdutos.get(cod).setQuantidadeEmEstoque(qtd);
        return true;
    }
    
    public static Object[][] buscaDados(){
        int linhas = listaDeProdutos.size();
        Object resp[][] = new Object[linhas][5];
        int i = 0;
        Set<String> chaves = listaDeProdutos.keySet();
        for(String s : chaves){
            resp[i][0] = listaDeProdutos.get(s).getCodigo();
            resp[i][1] = listaDeProdutos.get(s).getNome();
            resp[i][2] = listaDeProdutos.get(s).getFornecedor();
            resp[i][3] = listaDeProdutos.get(s).getValor();
            resp[i][4] = listaDeProdutos.get(s).getQuantidadeEmEstoque();
            i++;
        }
        return resp;
    }
    
    public static Produto busca(String chave){
        return listaDeProdutos.get(chave);
    }
    
    public static Map<String,Produto> getListaDeProdutos(){
        return listaDeProdutos;
    }

    public static Object[] buscaProduto(String codigo) {
        Object resp [] = new Object[5];
            resp[0] = listaDeProdutos.get(codigo).getCodigo();
            resp[1] = listaDeProdutos.get(codigo).getNome();
            resp[2] = listaDeProdutos.get(codigo).getFornecedor();
            resp[3] = listaDeProdutos.get(codigo).getValor();
            resp[4] = listaDeProdutos.get(codigo).getQuantidadeEmEstoque();
        return resp;
    }

    public static void atualizaProduto(String codigo, String nome, String fornecedor, String preco, String quantidade) {
        listaDeProdutos.get(codigo).setNome(nome);
        listaDeProdutos.get(codigo).setFornecedor(fornecedor);
        listaDeProdutos.get(codigo).setQuantidadeEmEstoque(Integer.parseInt(quantidade));
        listaDeProdutos.get(codigo).setValor(Double.parseDouble(preco));
    }

    public static void setCadastro(Map<String, Produto> map) {
        listaDeProdutos = map;
    }
    
    public static Map<String, Produto> getCadastri(){
        return listaDeProdutos;
    }
}
