package Ex2AndEx10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Proprietario {

    private int id;
    private String nome;
    private String dataNascimento;
    private List<Carro> carros;

    public Proprietario(String nome, String dataNascimento) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.carros = new ArrayList<>();
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

    public List<Carro> getCarros() {
        return carros;
    }

    public void addCarro(Carro carro) {
        this.carros.add(carro);
    }

    public void removeCarro(Carro carro) {
        this.carros.remove(carro);
    }

    public void listarCarros() {
        System.out.println("Carro(s):");
        for (Carro carro : this.carros) {
            System.out.println(carro);
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome proprietario: " + this.nome + "\nData de nascimento: " + this.dataNascimento);
        System.out.println("------CARROS------");
        for (Carro carro : this.carros) {
            System.out.println(carro);
        }
        System.out.println("-----------------");
    }
}
