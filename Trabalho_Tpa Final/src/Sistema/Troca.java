/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author 20931093
 */
public class Troca {
    private int nf;
    private Venda vendaInicial;
    private Venda vendaFinal;
    private Vendedor vendedor;

    public int getNf() {
        return nf;
    }

    public Venda getVendaFinal() {
        return vendaFinal;
    }

    public Venda getVendaInicial() {
        return vendaInicial;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setNf(int nf) {
        this.nf = nf;
    }

    public Troca(int nf, Venda vendaInicial, Venda vendaFinal, Vendedor vendedor) {
        this.nf = nf;
        this.vendaInicial = vendaInicial;
        this.vendaFinal = vendaFinal;
        this.vendedor = vendedor;
    }
    
}
