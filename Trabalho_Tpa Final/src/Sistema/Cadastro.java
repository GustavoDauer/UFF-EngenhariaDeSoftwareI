package Sistema;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Cadastro implements Serializable{

        
    private static Map<String,Cliente> cadastroDeClientes = new TreeMap<String, Cliente>();
    
    public static boolean inserirCliente(Cliente cliente){
           if(cadastroDeClientes.containsKey(cliente.getCpf()))
               return false;
           cadastroDeClientes.put(cliente.getCpf(), cliente);
           return true;
    }
    public static boolean removerCliente(String cpf){
        if(!cadastroDeClientes.containsKey(cpf))
            return false;
         cadastroDeClientes.remove(cpf);
         return true;
    }
    
    public static boolean atualizarEndereco(String cpf, String novoValor){
        if(!cadastroDeClientes.containsKey(cpf))
            return false;
        cadastroDeClientes.get(cpf).setEndereco(novoValor);
        return true;
    }
    
    public static boolean atualizarEmail(String cpf, String novoValor){
        if(!cadastroDeClientes.containsKey(cpf))
            return false;
        cadastroDeClientes.get(cpf).setEmail(novoValor);
        return true;
    }
    
    public static boolean atualizarEndereco(String cpf, int novoValor){
        if(!cadastroDeClientes.containsKey(cpf))
            return false;
        cadastroDeClientes.get(cpf).setBonus(novoValor);
        return true;
    }
    public static void imprime(){
        Set<String> aux= cadastroDeClientes.keySet();
        for(String p : aux)
            System.out.println(cadastroDeClientes.get(p));
    }
    
    public static Cliente busca(String chave){
        return cadastroDeClientes.get(chave);
    }
    
    public static Map<String,Cliente> getCadastro(){
        return cadastroDeClientes;
    }

    public static Object[][] buscaInfo() {
        Object resp [][] = new Object[cadastroDeClientes.size()][7];
        Set<String> chaves = cadastroDeClientes.keySet();
        int i = 0;
        for(String s : chaves){
            resp[i][0] = cadastroDeClientes.get(s).getCpf();
            resp[i][1] = cadastroDeClientes.get(s).getNome();
            resp[i][2] = cadastroDeClientes.get(s).getIdentidade();
            resp[i][3] = cadastroDeClientes.get(s).getEndereco();
            resp[i][4] = cadastroDeClientes.get(s).getDataDeCadastro();
            resp[i][5] = cadastroDeClientes.get(s).getBonus();
            resp[i][6] = cadastroDeClientes.get(s).getEmail();
            i++;
        }
        return resp;
    }

    public static boolean contemCpf(String cpf) {
        if(cadastroDeClientes.containsKey(cpf))
            return true;
        else
            return false;
    }

    public static Object[] buscaCliente(String cpf) {
        Object resp [] = new Object[7];
        resp[0] = cadastroDeClientes.get(cpf).getCpf();
        resp[1] = cadastroDeClientes.get(cpf).getNome();
        resp[2] = cadastroDeClientes.get(cpf).getIdentidade();
        resp[3] = cadastroDeClientes.get(cpf).getEndereco();
        resp[4] = cadastroDeClientes.get(cpf).getDataDeCadastro();
        resp[5] = cadastroDeClientes.get(cpf).getBonus();
        resp[6] = cadastroDeClientes.get(cpf).getEmail();
        return resp;
    }

    static void setCadastro(Map<String, Cliente> map) {
        cadastroDeClientes = map;
    }

}
