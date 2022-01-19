
package Sistema;

import Controle.ControleDados;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SalvaInformacao {

    
    public static void writeHistoricoDeVendas(){
        List<Venda> lista = HistoricoDeVendas.getHistorico();
        try {
            FileOutputStream fileOut = new FileOutputStream("hvendas.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(HistoricoDeVendas.getNCupom());
            out.writeObject(lista);
            
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Falha inesperada");
        }
    }
    public static void writeCadastroCliente() {
        Map<String,Cliente> map = Cadastro.getCadastro();
        try {
            FileOutputStream fileOut = new FileOutputStream("cadastro.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(map);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Falha inesperada");
        }
    }

    public static void writeEstoqueProdutos() {
        
        Map<String,Produto> listaDeProdutos = Catalogo.getListaDeProdutos();
        /*Set<String> chaves = listaDeProdutos.keySet();
        
        OutputStream output;
        OutputStreamWriter writer;
        BufferedWriter bw;
            
        try {
            output = new FileOutputStream("catalogo.txt", false);
            writer = new OutputStreamWriter(output);
            bw = new BufferedWriter(writer);
            
            for(String s : chaves){
                Produto p = listaDeProdutos.get(s);
                //bw.write(p.getCodigo()+" "+p.getNome()+" "+p.getFornecedor()+" "+p.getValor()+" "+p.getQuantidadeEmEstoque());
                bw.write(p.getCodigo());
                bw.newLine();
                bw.write(p.getNome());
                bw.newLine();
                bw.write(p.getFornecedor());
                bw.newLine();
                bw.write(p.getValor()+" "+p.getQuantidadeEmEstoque());
                bw.newLine();
            }
            bw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleDados.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(ControleDados.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        try {
            FileOutputStream fileOut = new FileOutputStream("catalogo.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(listaDeProdutos);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Falha inesperada");
        }
    }
    
//    public void salvaHistoricodevendas(String nome, HistoricoDeVendas hv) {
//        
//        try {
//            FileOutputStream fileOut = new FileOutputStream(nome);
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(hv);
//            out.close();
//            fileOut.close();
//        } catch (IOException i) {
//            System.out.println("Falha inesperada");
//        }
//    }
//    public void salvaCadastro(String nome, Cadastro cadastro) {
//        
//        try {
//            FileOutputStream fileOut = new FileOutputStream(nome);
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(cadastro);
//            out.close();
//            fileOut.close();
//        } catch (IOException i) {
//            System.out.println("Falha inesperada");
//        }
//    }
    
    public void salvaArquivo(String nome, Serializable object) {
        
        try {
            FileOutputStream fileOut = new FileOutputStream(nome);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(object);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Falha inesperada");
        }
    }
    
  public static void writeCadastroFuncionario(){
        Map<String, Funcionario> teste = CadastroFuncionarios.getCadastroFuncionarios();
        /*Set<String> chaves = teste.keySet();
       
       OutputStream output;
       OutputStreamWriter writer;
       BufferedWriter bw;
            
        try {
            output = new FileOutputStream("fcadastro.txt", false);
            writer = new OutputStreamWriter(output);
            bw = new BufferedWriter(writer);
            
            for(String c : chaves){
                Funcionario f = teste.get(c);
                bw.write(f.getMatricula()+" "+f.getNome()+" "+f.getCpf()+" "+f.getIdentidade()+" "+f.getSenha()+" "+ f.getPerfil());
                bw.newLine();
            }
            bw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleDados.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(ControleDados.class.getName()).log(Level.SEVERE, null, ex);
            }*/
         try {
            FileOutputStream fileOut = new FileOutputStream("fcadastro.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(teste);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            System.out.println("Falha inesperada");
        }
        
    }
}
