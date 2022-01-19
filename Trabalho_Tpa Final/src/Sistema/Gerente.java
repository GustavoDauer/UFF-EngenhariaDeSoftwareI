package Sistema;

import java.io.Serializable;


public class Gerente extends Funcionario implements Serializable{

    public Gerente(String matricula, String nome, String cpf,String id, String senha){
        super(matricula, nome, cpf, id, senha, 2);
    }
    
}
