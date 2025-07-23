package Ex04;

import java.util.Random;

public class Processador {
    private int id;
    private String modelo;
    private int qntNucleos;
    private double gHz;
    private Marca marca;

    public Processador( String modelo, int qntNucleos, double gHz, Marca marca) {
        this.id = new Random().nextInt(1000);
        this.modelo = modelo;
        this.qntNucleos = qntNucleos;
        this.gHz = gHz;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public int getQntNucleos() {
        return qntNucleos;
    }

    public void setQntNucleos(int qntNucleos) {
        this.qntNucleos = qntNucleos;
    }

    public double getgHz() {
        return gHz;
    }

    public void setgHz(double gHz) {
        this.gHz = gHz;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }





}
