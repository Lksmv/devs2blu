package Ex2AndEx10;

public class Main {
    public static void main(String[] args) {

        Marca m = new Marca("Tesla","EUA");
        Marca m2 = new Marca("Ferrari","Italia");
        Marca m3 = new Marca("Nissan","Japao");
        Marca m4 = new Marca("Ford","EUA");


        Motor motor = new Motor(120,TipoMotor.GASOLINA);
        Motor motor2 = new Motor(560,TipoMotor.ELETRICO);
        Motor motor3 = new Motor(89,TipoMotor.DIESEL);
        Motor motor4 = new Motor(625,TipoMotor.GASOLINA);

        Carro carro = new Carro("TR78S","Cyber Truck","CINZA",m,motor2,2025);
        Carro carro2 = new Carro("Y8SA","F40","AMARELO",m2,motor,1980);
        Carro carro3 = new Carro("BAS443","Frontier","CINZA",m3,motor3,2023);
        Carro carro4 = new Carro("V7DS23","Mustang","AZUL",m4,motor4,2000);

        Proprietario p = new Proprietario("Fernando", "1985-10-10");

        p.addCarro(carro);
        p.addCarro(carro2);
        p.addCarro(carro3);
        p.addCarro(carro4);

        //p.listarCarros();

        p.exibirInformacoes();

    }
}