package Ex04;

import java.util.Random;

public class Marca {

    private int id;
    private String nome;

    public Marca(String nome) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
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





}
