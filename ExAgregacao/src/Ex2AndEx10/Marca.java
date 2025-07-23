package Ex2AndEx10;

import java.util.Random;

public class Marca {

    private int id;
    private String nome;
    private String nacionalidade;


    public Marca(String nome, String nacionalidade) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getId() {
        return id;
    }

}
