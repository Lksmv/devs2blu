package Ex03;

public enum Turno {
    NOTURNO("Noturno"),
    VESPERTINO("Vespertino"),
    MATUTINO("Matutino"),;

    private String value;

    Turno(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
