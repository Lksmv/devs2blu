package Ex03;

import java.util.Random;

public class Aluno {

    private int id;
    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private String email;

    public Aluno(String nome, String dataNascimento, String cpf, String telefone, String email) {
        this.id = new Random().nextInt(9999);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String txt = "";

        txt += "Nome: " + this.nome + " Data Nascimento: " + this.dataNascimento + "\n"
                + "Contato: " + this.telefone + " ou " + this.email + "\n";

        return txt;
    }

}
