package Sistema;

public class PagamentoEmCredito extends Pagamento{

    private String cardNumber;
    private String operadoraCartao;
    
    public PagamentoEmCredito(double valor, String data, String card){
        super(valor, data);
        cardNumber = card;
    }

    @Override
    void efetuaPagamento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
