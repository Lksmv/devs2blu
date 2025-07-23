package Ex2AndEx10;

public enum TipoMotor {
    GASOLINA("Motor a gasolina"),
    ELETRICO("Motor Eletrico"),
    DIESEL("Motor a diesel");

    private String value;

    TipoMotor(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
