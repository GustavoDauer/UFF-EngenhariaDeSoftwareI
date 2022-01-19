package Sistema;

import java.io.Serializable;

public abstract class Pagamento implements Serializable{
   
    private double valor;
    private String data;
    
    public Pagamento(double valor, String data){
        this.valor = valor;
        this.data = data;
    }
    
    public String toString(){
        return String.format("Valor: %.2f\nData de Pagamento: %s\n", valor, data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    abstract void efetuaPagamento();
    
}
