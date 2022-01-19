/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;

public class CarregaInformacao {

    /**
     * @param args the command line arguments
     */

//    public Produto leproduto(String nome) {
//        Produto produto;
//        try {
//            FileInputStream fileIn = new FileInputStream(nome);
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            produto = (Produto) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException e) {
//            produto = new Produto(); //não tem o produto salvo, cria um novo
//        } catch (ClassNotFoundException cnf) {
//            produto = new Produto();
//        }
//        return catalogo;
//    }

    public CadastroFuncionarios leCadastroFuncionario(String nome) {
        CadastroFuncionarios cf;
        try {
            FileInputStream fileIn = new FileInputStream(nome);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cf = (CadastroFuncionarios) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            cf = new CadastroFuncionarios();
        } catch (ClassNotFoundException cnf){
            cf = new CadastroFuncionarios();
        } catch (NullPointerException ne){
            cf = new CadastroFuncionarios();
        }
        
        return cf;
    }
//
//    public Gerente legerente(String nome) {
//        try {
//            FileInputStream fileIn = new FileInputStream(nome);
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            gerente = (Gerente) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException e) {
//            gerente = new Gerente(); //não tem o catalogo salvo, cria um novo
//        }
//        return gerente;
//    }

    public static void lehistoricodevendas(String nome) {
        List<Venda> lista;
        int nf = 1;
        Object o;
        try {
            FileInputStream fileIn = new FileInputStream(nome);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            o =  in.readObject();
            nf = (Integer) o;
            lista = (List<Venda>) in.readObject();
            HistoricoDeVendas.setHistorico(lista);
            HistoricoDeVendas.setNCupon(nf);

            in.close();
            fileIn.close();
            
            
            
        } catch (IOException e) {
            //hv = new HistoricoDeVendas(); //não tem o catalogo salvo, cria um novo
        } catch (ClassNotFoundException cnf){
            //hv = new HistoricoDeVendas();
        }catch (NullPointerException ne){
            //hv = new HistoricoDeVendas();
        }
    }

//    public HistoricoDeTrocas lehistoricodetrocas(String nome) {
//        try {
//            FileInputStream fileIn = new FileInputStream(nome);
//            ObjectInputStream in = new ObjectInputStream(fileIn);
//            historicodetrocas = (HistoricoDeTrocas) in.readObject();
//            in.close();
//            fileIn.close();
//        } catch (IOException e) {
//            historicodetrocas = new HistoricoDeTrocas(); //não tem o catalogo salvo, cria um novo
//        }
//        return historicodetrocas;
//    }
    
    public Cadastro leCadastro(String nome) {
        Cadastro c;
        try {
            FileInputStream fileIn = new FileInputStream(nome);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            c = (Cadastro) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException e) {
            c = new Cadastro(); //não tem o catalogo salvo, cria um novo
        } catch (ClassNotFoundException cnf){
            c = new Cadastro();
        } catch (NullPointerException ne){
            c = new Cadastro();
        }
        return c;
    }
    
   public static void readCadastroFuncionario(){
       /* String matricula;
        String nome;
        String cpf;
        String identidade;
        String senha;
        int perfil;
        
        InputStream input;
        Scanner in;
        try {
            input = new FileInputStream("fcadastro.txt");
            in = new Scanner(input);
            while(in.hasNext()){
                matricula = in.next();
                nome = in.next();
                cpf = in.next();
                identidade = in.next();
                senha = in.next();
                perfil = in.nextInt();
                CadastroFuncionarios.insereFuncionario(matricula, nome, cpf, identidade, senha, perfil);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleDados.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        Map<String,Funcionario> cadastro;
        try {
            FileInputStream fileIn = new FileInputStream("fcadastro.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            cadastro = (Map<String,Funcionario>) in.readObject();
            CadastroFuncionarios.setCadastro(cadastro);
            in.close();
            fileIn.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException cnf){
        } catch (NullPointerException ne){
        }
    }
   
   public static void readCatalogoDeProdutos(){
       Map<String,Produto> map;
        try {
            FileInputStream fileIn = new FileInputStream("catalogo.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            map = (Map<String, Produto>) in.readObject();
            Catalogo.setCadastro(map);
            in.close();
            fileIn.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException cnf){
        } catch (NullPointerException ne){
        }
       
   }
   
   public static void readCadastroCliente(){
       Map<String,Cliente> map;
       try {
            FileInputStream fileIn = new FileInputStream("cadastro.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            map = (Map<String,Cliente>) in.readObject();
            Cadastro.setCadastro(map);
            in.close();
            fileIn.close();
        } catch (IOException e) {
        } catch (ClassNotFoundException cnf){
        } catch (NullPointerException ne){
        }
   }
    
}