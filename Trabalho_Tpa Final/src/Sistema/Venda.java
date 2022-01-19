package Sistema;

import java.io.Serializable;

public class Venda implements Serializable{

    private int nf;
    private Pedido pedido;
    private Vendedor vendedor;

    public Venda(Pedido pedido, Vendedor vendedor, int nf) {
        this.pedido = pedido;
        this.vendedor = vendedor;
        this.nf = nf;
    }

    public int getNf() {
        return nf;
    }
    
    public void setNf(int nf){
        this.nf = nf;
    }
    
    
    public Pedido getPedido(){
        return pedido;
    }
    
    public Vendedor getVendedor(){
        return vendedor;
    }
   
    public String toString(){
        return "Número do pedido: "+nf+"   Valor: "+pedido.calculaPedido()+"     Vendedor: "+vendedor.getNome()+"\n";
    }
    
    
}
