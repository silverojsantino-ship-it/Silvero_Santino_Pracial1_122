package parcial.t2;

public class Guerrero extends Aventurero implements Entrenamiento{

    private int fuerza;

    public Guerrero(String codigo, String nombre, Rangos rango, int fuerza) {
        super(codigo, nombre, rango);
        if (fuerza <= 0) {
            throw new IllegalArgumentException("La fuerza no puede ser menor a 0"); // verificacion mayor a 0
        }
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }
    
    public double calcularPoder(){
        return this.fuerza * 2;
    }
    
    public String realizarAtaque(){
        return "El guerrero ataco con la espada";
    }
    
    public String realizarEntrenamiento(){
        return "El guerrero entrena";
    }
    
}
