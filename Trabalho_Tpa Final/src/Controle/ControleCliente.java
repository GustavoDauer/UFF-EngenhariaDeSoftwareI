package Controle;

import Sistema.Cadastro;
import Sistema.Cliente;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleCliente {
    
    public static boolean cadastrarCliente(String nome, String cpf, String identidade,String endereco,String email){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        if(!Cadastro.inserirCliente(new Cliente(nome, cpf, identidade, endereco,email,dateFormat.format(date))))
            return false;
        return true;
    }
    
    public static double buscaCliente(String cpf){
        Cliente cliente = Cadastro.busca(cpf);
        if(cliente==null)
            return -1;
        return cliente.getBonus();
    }
    
    public static void atualizarBonus(String cpf, double valor){
        Cliente cliente = Cadastro.busca(cpf);
        if(cliente != null)
            cliente.setBonus(valor);
    }
    
    public static void incrementaBonus(String cpf, double valor){
        Cliente cliente = Cadastro.busca(cpf);
        if(cliente != null)
            cliente.setBonus(cliente.getBonus()+valor);
    }
    public static boolean removeCliente(String cpf){
        return Cadastro.removerCliente(cpf);
    }
    
    public static Object[][] buscaInfo(){
        return Cadastro.buscaInfo();
    }

    public static boolean contemCpf(String cpf) {
        return Cadastro.contemCpf(cpf);
    }

    public static Object[] buscaTupla(String cpf) {
        return Cadastro.buscaCliente(cpf);
    }
}
