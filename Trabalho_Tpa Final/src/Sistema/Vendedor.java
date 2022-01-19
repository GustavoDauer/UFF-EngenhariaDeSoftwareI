package Sistema;

import java.io.Serializable;


public class Vendedor extends Funcionario{

    public Vendedor(String matricula, String nome, String Cpf, String identidade, String senha){
        super(matricula, nome, Cpf, identidade, senha, 1);
    }
   /* @Override
    public void trabalha() {
        throw new UnsupportedOperationException("Not supported yet.");
    }*/
    
}
