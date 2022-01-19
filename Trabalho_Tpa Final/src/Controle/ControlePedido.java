package Controle;

import Sistema.*;

public class ControlePedido {

    private int nf;
    private Pedido pedido;
    private Vendedor vendedor;
    private double bonus;
    
    public ControlePedido(Vendedor vendedor) {
        pedido = new Pedido();
        this.vendedor = vendedor;
        bonus = 0;
    }
    
    public Object[] getLastItem(){
        ItemPedido item = pedido.getLast();
        Object resp[] = new Object[4];
        resp[0] = item.getCodigo();
        resp[1] = item.getNome();
        resp[2] = ""+item.getQuantidade();
        resp[3] = ""+item.getValor();
        
        return resp;
    }
    
    
    public int inserePedido(String codigo, int quantidade){
        Produto p = Catalogo.busca(codigo);
        if(p == null)
            return -1;
        
        if(p.getQuantidadeEmEstoque() < quantidade)
            return 0;
        
        pedido.adcionarItem(p, quantidade);
                
        return 1;        
    }
    

    
    public String getTotal(){
        double valor = pedido.calculaPedido() - bonus;
        return String.format("%.2f", valor);
    }
    
   public int setNf(int nf) {
        return this.nf = nf;
    }
        
    public void geraVenda(){
        nf++;
        Venda venda = new Venda(pedido, vendedor, nf);
        HistoricoDeVendas.adcionarVendas(venda);
        pedido.atualizaEstoque();
    }
    
    public double getValorTotal(){
        return pedido.calculaPedido() - bonus;
    }

    public void setBonus(double valor) {
        bonus = valor;
    }
    
    
}
