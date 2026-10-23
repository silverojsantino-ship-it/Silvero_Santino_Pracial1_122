package parcial.t2;

public abstract class Aventurero implements Ataque {

    private String codigo;
    private String nombre;
    private Rangos rango;

    public Aventurero(String codigo, String nombre, Rangos rango) {
        if (codigo == null || codigo.isBlank() || nombre == null || nombre.isBlank() || rango == null) {
            throw new IllegalArgumentException("Todos los valores son obligatorios");
        }

        this.codigo = codigo;
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Rangos getRango() {
        return rango;
    }

    public abstract double calcularPoder();

    public String realizarEntrenamiento() {
        return "Los magos no entrenan";
        
    }

    public String realizarAtaque() {
        return "El aventurero realiza su ataque";
    }

}
