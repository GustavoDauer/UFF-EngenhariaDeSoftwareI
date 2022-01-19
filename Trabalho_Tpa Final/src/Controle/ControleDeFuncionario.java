package Controle;

import Sistema.CadastroFuncionarios;
import Sistema.Gerente;
import Sistema.Vendedor;
import java.io.Serializable;

public class ControleDeFuncionario implements Serializable{

    public static boolean insereFuncionario(String matricula, String nome, String cpf, String identidade, String senha,int perfil ){
        return CadastroFuncionarios.insereFuncionario(matricula, nome, cpf, identidade, senha, perfil);
    }
    
    public static boolean contemMatricula(String matricula){
        return CadastroFuncionarios.contemMatricula(matricula);
    }
    
    public static boolean verificaSenha(String matricula, String senha){
        return CadastroFuncionarios.verificaSenha(matricula, senha);
    }
    public static int retornaPerfil(String matricula){
        return CadastroFuncionarios.getPerfil(matricula);
    }
    
    public static Vendedor retornaVendedor(String matricula){
        return (Vendedor)CadastroFuncionarios.getFuncionario(matricula);
    }
    
    public static Gerente retornaGerente(String matricula){
        return (Gerente)CadastroFuncionarios.getFuncionario(matricula);
    }
    
    public static Object[][] buscaInfo(){
        return CadastroFuncionarios.buscaInfo();
    }

    public static Object[] buscaFuncionario(String matricula) {
        return CadastroFuncionarios.busca(matricula);
    }

    public static void removeFuncionario(String matricula) {
        CadastroFuncionarios.removeFuncionario(matricula);
    }

}
