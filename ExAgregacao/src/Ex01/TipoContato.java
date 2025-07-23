package Ex01;

public enum TipoContato {
    CELULAR("Celular"),
    RESIDENCIAL("Residencial"),
    EMPRESARIAL("Empresarial"),
    EMAIL("Email");

    public String value;

    TipoContato(String value){
        this.value = value;
    }
    public String toString(){
        return this.value;
    }

}
