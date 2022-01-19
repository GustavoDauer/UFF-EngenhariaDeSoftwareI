package Sistema;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Pedido implements Serializable{

    private List<ItemPedido> itensDePedido = new LinkedList<ItemPedido>();
    
    public boolean adcionarItem(Produto produto, int quantidade){
        return itensDePedido.add(new ItemPedido(produto, quantidade));
    }
    
    public void removerItem(int indice){
        itensDePedido.remove(indice);
    }
    
    public double calculaPedido(){
        double precoTotal = 0;
        for(ItemPedido i : itensDePedido){
            precoTotal += i.calculaPrecoTotal();
        }
        return precoTotal;
    }


    
    public void atualizaEstoque (){
        for (ItemPedido p:itensDePedido) {
            p.reduzEstoque();
            
        }
    }
    
    public ItemPedido getLast(){
        return itensDePedido.get(itensDePedido.size()-1);
    }
   
}
