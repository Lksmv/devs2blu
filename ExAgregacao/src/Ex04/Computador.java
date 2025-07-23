package Ex04;

import java.util.Random;

public class Computador {

    private int id;
    private String nome;
    private String modelo;
    private Processador processador;

    public Computador( String nome, String modelo, Processador processador) {
        this.id = new Random().nextInt(1000);
        this.nome = nome;
        this.modelo = modelo;
        this.processador = processador;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }


    public String getEspecificacao(){
        String txt = "";
        txt += "Especificacao: "+this.processador.getMarca().getNome()+" "+this.processador.getModelo()+" "+
                +processador.getQntNucleos()+" Nucleos "+processador.getgHz()+"Ghz";
        return txt;
    }


}
