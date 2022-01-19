package Sistema;

import java.io.Serializable;

public class Cliente implements Serializable{

    private String nome;
    private String cpf;
    private String identidade;
    private String endereco;
    private String email;
    private double bonus;
    private String dataDeCadastro;



    public Cliente(String nome, String cpf, String identidade, String endereco, String email, String dataDeCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.endereco = endereco;
        this.email = email;
        this.dataDeCadastro = dataDeCadastro;
        bonus = 0;
    }

    public String getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(String dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return String.format("Nome: %s\nCpf: %s\nIdentidade: %s\nEndereco: %s\nEMail: %s\nBonus: %d\nData de"
                + " cadastro: %s\n ", nome, cpf, identidade, endereco, email, bonus, dataDeCadastro);
    }
          
}
