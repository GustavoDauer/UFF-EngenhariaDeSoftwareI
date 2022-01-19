package Sistema;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class HistoricoDeVendas implements Serializable{

    private static int nCupon = 1;
    private static List<Venda> historico = new LinkedList<Venda>();
    
    public static void adcionarVendas(Venda venda){
        historico.add(venda);
        venda.setNf(nCupon++);
    }
    
    public static String vizualiza(){
        String retorno = "";
        for(Venda venda : historico){
            retorno += venda.toString();
        }
        return retorno;
    }
    
    public static void removeVenda(int nf){
        boolean removeu = false;
        int index = 0;
        for(Venda v: historico){
            if (v.getNf()==nf){
                index = historico.indexOf(v);
            }
        }
        
        historico.remove(index);       
    }
    
    public static void setHistorico(List<Venda> l){
        historico = l;
    }
    public static List<Venda> getHistorico(){
        return historico;
    }
    
    public static void setNCupon(int nf){
        nCupon = nf;
    }

    public static Object[][] getInfos() {
        Object resp [][] = new Object[historico.size()][3];
        for(int i = 0; i < historico.size(); i++){
            Venda v = historico.get(i);
            int nf  = v.getNf();
            resp[i][0] = nf;
            resp[i][1] = v.getVendedor().getNome();
            resp[i][2] = v.getPedido().calculaPedido();
        }
        return resp;
        
    }

    static Object getNCupom() {
        return nCupon;
    }
}
