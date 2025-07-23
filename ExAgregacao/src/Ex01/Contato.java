package Ex01;

import java.util.Random;
import java.util.Scanner;

public class Contato {

    private int id;
    private String contato;
    private TipoContato tipoContato;

    public Contato(){
        this.id = new Random().nextInt(1000);
    }

    public Contato(String contato, TipoContato tipoContato) {
        this.id = new Random().nextInt(1000);
        this.contato = contato;
        this.tipoContato = tipoContato;
    }

    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getId() {
        return id;
    }

    public Contato cadastrarContato(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o tipo do contato? 1-Celular 2-Residencial 3-Empresarial 4-Email");
        Integer resp = scan.nextInt();
        switch (resp){
            case 1 -> setTipoContato(TipoContato.CELULAR);
            case 2 -> setTipoContato(TipoContato.RESIDENCIAL);
            case 3 -> setTipoContato(TipoContato.EMPRESARIAL);
            case 4 -> setTipoContato(TipoContato.EMAIL);
            default -> System.out.println("Resposta invalida");
        }
        System.out.println("Qual o valor do contato:");
        setContato(scan.next());
        return this;
    }

}
