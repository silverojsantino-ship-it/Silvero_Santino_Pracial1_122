package parcial.t2;

public class Mago extends Aventurero {

    private int mana;

    public Mago(String codigo, String nombre, Rangos rango, int mana) {
        super(codigo, nombre, rango);
        if (mana <= 0) {
            throw new IllegalArgumentException("El mana no puede ser menor a 0");
        }
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }
    
    public double calcularPoder(){
        return this.mana + 10;
    }
    
    public String realizarAtaque(){
        return "El mago realiza un ataque";
    }
    
}
