package Controle;

import Sistema.HistoricoDeVendas;
import Sistema.Venda;

public class ControleHistoricoDeVendas {
    
    
    public static String vizualizaHistorico(){
       return HistoricoDeVendas.vizualiza();
    }

    public static Object[][] getVizualizacao() {
        return HistoricoDeVendas.getInfos();
    }

    public static void removeVenda(int n) {
        HistoricoDeVendas.removeVenda(n);
    }
    
    public void cancelaVenda (int nf){
        HistoricoDeVendas.removeVenda(nf);
        
    }
}
