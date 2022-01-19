package Sistema;

import java.io.Serializable;

public abstract class Funcionario implements Serializable{
    
    private String matricula;
    private String nome;
    private String cpf;
    private String identidade;
    private String senha;
    private int perfil;
    
    public Funcionario(String mat, String n, String cpf, String id, String senha, int perfil){
        matricula = mat;
        nome = n;
        this.cpf = cpf;
        this.perfil = perfil;
        identidade = id;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    @Override
    public String toString(){
        return String.format("Matricula: %s\nNome: %s\nCpf: %s\nIdentidade: %s\n", matricula,
                 nome, cpf, identidade);
    }
    
   // public abstract void trabalha();
    
}
