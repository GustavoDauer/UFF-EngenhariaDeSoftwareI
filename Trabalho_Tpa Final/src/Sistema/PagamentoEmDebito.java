package Sistema;

public class PagamentoEmDebito extends Pagamento{
    
    private String cardNumber;
    
    public PagamentoEmDebito(double valor, String data, String card){
        super(valor, data);
        cardNumber = card;
    }

    @Override
    void efetuaPagamento() {
    }
    
    public String toString(){
        return String.format("%sNúmero do Cartão: %s\n", super.toString(), cardNumber);
    }
    
}
