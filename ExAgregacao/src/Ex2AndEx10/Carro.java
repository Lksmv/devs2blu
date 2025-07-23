package Ex2AndEx10;

import java.util.Random;

public class Carro {

    private int id;
    private String placa;
    private String modelo;
    private String cor;
    private Marca marca;
    private Motor motor;
    private int anoFabricacao;

    public Carro(String placa, String modelo, String cor, Marca marca, Motor motor, int anoFabricacao) {
        this.id = new Random().nextInt(10000);
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.motor = motor;
        this.anoFabricacao = anoFabricacao;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString(){
        String txt = "";

        txt += "-"+this.marca.getNome() + " " + this.modelo + " " + anoFabricacao + " " + this.cor + "\n"+ "Placa:" + this.placa + " " + this.motor;

        return txt;
    }
}
