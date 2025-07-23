package Ex01;

import java.util.Random;
import java.util.Scanner;

public class Endereco {

    private int id;
    private String pais;
    private String estado;
    private String cidade;
    private String bairro;
    private String logradouro;

    public Endereco(){
        this.id = new Random().nextInt(1000);
    }

    public Endereco(String pais, String estado, String cidade, String bairro, String logradouro) {
        this.id = new Random().nextInt(1000);
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public int getId() {
        return id;
    }


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public Endereco cadastrar(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Pais:");
        setPais(scan.next());
        System.out.println("Estado:");
        setEstado(scan.next());
        System.out.println("Cidade:");
        setCidade(scan.next());
        System.out.println("Bairro:");
        setBairro(scan.next());
        System.out.println("Logradouro:");
        setLogradouro(scan.nextLine());
        return this;
    }
}
