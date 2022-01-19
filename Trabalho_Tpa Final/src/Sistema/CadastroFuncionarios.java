package Sistema;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CadastroFuncionarios implements Serializable{
    private static Map<String, Funcionario> cadastroDeFuncionario = new TreeMap<String, Funcionario>();
    
    public static boolean insereFuncionario(String matricula, String nome, String cpf, String id, String senha, int perfil){
        if(cadastroDeFuncionario.containsKey(matricula)){
            return false;
        }
        if(perfil == 2){
            Funcionario f = new Gerente(matricula, nome, cpf, id, senha);
            cadastroDeFuncionario.put(matricula, f);
            return true;
        }
        else{
            Funcionario f = new Vendedor(matricula, nome, cpf, id, senha);
            cadastroDeFuncionario.put(matricula, f);
            return true;
        }        
    }
    
    public static void removeFuncionario(String matricula){
        cadastroDeFuncionario.remove(matricula);
    }
    
    public static boolean contemMatricula(String matricula){
        if(cadastroDeFuncionario.containsKey(matricula))
            return true;
        else 
            return false;
    }
    public static Map<String,Funcionario> getCadastroFuncionarios(){
        return cadastroDeFuncionario;
    }
    
    public static boolean verificaSenha(String matricula, String senha){
        String senhaSalva = cadastroDeFuncionario.get(matricula).getSenha();
        if(senhaSalva.equals(senha))
            return true;
        return false;
    }
    
    public static int getPerfil(String matricula){
        return cadastroDeFuncionario.get(matricula).getPerfil();
    }
    
    public static Funcionario getFuncionario(String matricula){
        return cadastroDeFuncionario.get(matricula);
    }

    public static Object[][] buscaInfo() {
        Object resp[][] = new Object[cadastroDeFuncionario.size()][5];
        Set<String> chaves = cadastroDeFuncionario.keySet();
        int i = 0;
        for(String s : chaves){
            resp[i][0] = cadastroDeFuncionario.get(s).getMatricula();
            resp[i][1] = cadastroDeFuncionario.get(s).getNome();
            resp[i][2] = cadastroDeFuncionario.get(s).getCpf();
            resp[i][3] = cadastroDeFuncionario.get(s).getIdentidade();
            resp[i][4] = cadastroDeFuncionario.get(s).getPerfil();
            i++;
        }
        
        return resp;
    }

    public static Object[] busca(String matricula) {
        Object resp[] = new Object[5];
        resp[0] = cadastroDeFuncionario.get(matricula).getMatricula();
        resp[1] = cadastroDeFuncionario.get(matricula).getNome();
        resp[2] = cadastroDeFuncionario.get(matricula).getCpf();
        resp[3] = cadastroDeFuncionario.get(matricula).getIdentidade();
        resp[4] = cadastroDeFuncionario.get(matricula).getPerfil();
        return resp;
    }
    
    public static Map<String,Funcionario> getCadastro(){
        return cadastroDeFuncionario;
    }
    
    public static void setCadastro(Map<String,Funcionario> cadastro){
        cadastroDeFuncionario = cadastro;
    }
}
