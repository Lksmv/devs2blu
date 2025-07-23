package Ex2AndEx10;

import java.util.Random;

public class Motor {

    private int id;
    private TipoMotor tipoMotor;
    private int potencia;

    public Motor(int potencia, TipoMotor tipoMotor) {
        this.id = new Random().nextInt(1000);
        this.potencia = potencia;
        this.tipoMotor = tipoMotor;
    }

    public int getId() {
        return id;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString(){
        return tipoMotor.getValue()+ " com "+ potencia +" cavalos.";
    }
}
