/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author 20931093
 */
public class HistoricoDeTrocas implements Serializable {
    private static int nCupon = 1;
    private static List<Troca> historico = new LinkedList<Troca>();
    
    public static void adcionarTroca(Troca troca){
        historico.add(troca);
        troca.setNf(nCupon++);
        Venda add = troca.getVendaFinal();
        //TODO: adicionar novo produto, chamar uma venda
    }
    
    
    
    public static List<Troca> getHistorico(){
        return historico;
    }
    
    


}
