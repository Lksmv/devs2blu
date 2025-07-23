package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Pessoa {

    private int id;
    private String nome;
    private String dataNascimento;
    private Endereco endereco;
    private List<Contato> contatos;

    public Pessoa(){
        this.id = new Random().nextInt(1000);
        this.contatos = new ArrayList<>();
    }

    public Pessoa(String nome, String dataNascimento, Endereco endereco) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contatos = new ArrayList<>();
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void addContato(Contato contato) {
        this.contatos.add(contato);
    }

    public Pessoa cadastrarPessoa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome:");
        setNome(scan.next());
        System.out.println("Data Nascimento");
        setDataNascimento(scan.next());
        System.out.println("Cadastrar um contato? 'S' ou 'N' ");
        String resp = scan.next();
        if (resp.equalsIgnoreCase("s")) {
            addContato(new Contato().cadastrarContato());
        }
        System.out.println("Cadastrar um endereco? 'S' ou 'N' ");
        resp = scan.next();
        if (resp.equalsIgnoreCase("s")) {
            setEndereco(new Endereco().cadastrar());
        }
        return this;
    }

    @Override
    public String toString(){
    String txt = "";
    txt = "Nome: "+nome+", Data Nascimento: "+dataNascimento+"\n";
    if(endereco != null) {
        txt += "Endereco: " + endereco.getLogradouro() + ", " + endereco.getBairro() + ", " + endereco.getCidade() +
                ", " + endereco.getEstado() + ", " + endereco.getPais() + "\n";
    }
    for (Contato contato : contatos) {
        txt+= contato.getTipoContato().toString()+": "+contato.getContato()+"\n";
    }
        return txt;
    }
}
