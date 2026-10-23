package parcial.t2;

public class Arquero extends Aventurero implements Entrenamiento{

    private int precision;

    public Arquero(String codigo, String nombre, Rangos rango, int precision) {
        super(codigo, nombre, rango);
        if (precision <= 0) {
            throw new IllegalArgumentException("La precision no puede ser menor a 0");
        }
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }
    
    public double calcularPoder(){
        return this.precision * 3;
    }
    
    public String realizarAtaque(){
        return "El arquero tira una flecha";
    }
    
    public String realizarEntrenamiento(){
        return "El arquero entrena";
    }
}
