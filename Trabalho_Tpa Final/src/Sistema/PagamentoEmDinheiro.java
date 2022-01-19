package Sistema;

public class PagamentoEmDinheiro extends Pagamento{
    
    private double valorPago;

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
    public PagamentoEmDinheiro(double valor, double valorPago, String data){
        super(valor, data);
        this.valorPago = valorPago;
    }

    @Override
    void efetuaPagamento() {
    }
    
    public String toString(){
        return String.format("%sValor Pago: %.2f\n", super.toString(), valorPago);
    }
}
