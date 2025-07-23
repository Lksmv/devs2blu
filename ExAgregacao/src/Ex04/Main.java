package Ex04;

public class Main {
    public static void main(String[] args) {

        Marca m = new Marca("Intel");

        Processador p = new Processador("i7 10800",12,2.8,m);

        Computador c = new Computador("Meu computador","Alienware",p);

        System.out.println(c.getEspecificacao());


    }
}