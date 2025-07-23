package Ex03;

import java.util.Random;

public class Sala {

    private int id;
    private int andar;
    private int numeroSala;
    private int limiteAlunos;
    private String descricao;


    public Sala(int andar, int numeroSala, int limiteAlunos) {
        this.id = new Random().nextInt(1000);
        this.andar = andar;
        this.numeroSala = numeroSala;
        this.limiteAlunos = limiteAlunos;
    }

    public int getId() {
        return id;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getLimiteAlunos() {
        return limiteAlunos;
    }

    public void setLimiteAlunos(int limiteAlunos) {
        this.limiteAlunos = limiteAlunos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        String txt = "";

        txt += "Sala: " + this.numeroSala + " " + this.andar + "º andar, Capacidade de:" + limiteAlunos + "\n";

        return txt;
    }
}
