
package Controle;
import Sistema.*;
/**
 *
 * @author 11031065
 */
public class ControleDados {
    public static Catalogo catalogo;
    public static HistoricoDeVendas historicodevendas;
    public static Cadastro cadastro;
    public static CadastroFuncionarios cadastrofuncionario;
    
    private CarregaInformacao carrega;
    private SalvaInformacao salva;

    public ControleDados() {
        catalogo = new  Catalogo();
        cadastrofuncionario = new  CadastroFuncionarios();
        historicodevendas = new  HistoricoDeVendas();
        cadastro = new  Cadastro();
        carrega = new CarregaInformacao();
        salva = new SalvaInformacao();
        inicia();
    }
    
    
    
    public void inicia(){
        
        //catalogo = carrega.lecatalogo("catalogo.ser");
        //historicodevendas = carrega.lehistoricodevendas("hvendas.ser");
        //cadastro = carrega.leCadastro("cadastro.ser");
        //cadastrofuncionario = carrega.leCadastroFuncionario("fcadastro.ser");
    }
    
    public void termina(){
        
//        System.out.println
//        (cadastrofuncionario.toString());
//        salva.salvaArquivo("catalogo.ser", catalogo);
//        salva.salvaArquivo("hvendas.ser", historicodevendas);
//        salva.salvaArquivo("cadastro.ser", cadastro);
//        salva.salvaArquivo("fcadastro.ser", cadastrofuncionario);
    }
    
    public static void encerraSistema(){
        SalvaInformacao.writeCadastroFuncionario();
        SalvaInformacao.writeCadastroCliente();
        SalvaInformacao.writeEstoqueProdutos();
        SalvaInformacao.writeHistoricoDeVendas();
    }
    
    public static void inicializaSistema(){
        CarregaInformacao.readCadastroFuncionario();
        CarregaInformacao.readCadastroCliente();
        CarregaInformacao.readCatalogoDeProdutos();
        CarregaInformacao.lehistoricodevendas("hvendas.txt");
    }
 
    
}
