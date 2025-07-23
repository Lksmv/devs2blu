package Ex03;

import java.util.Random;

public class Professor {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Professor(String nome, String cpf, String telefone, String email) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
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

        txt = "Professor: " + this.nome + " Contato: " + this.telefone + " ou " + this.email + "\n";

        return txt;
    }
}
