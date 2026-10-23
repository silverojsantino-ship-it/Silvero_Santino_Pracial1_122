package parcial.t2;
import java.util.List;
import java.util.ArrayList;


public class ParcialT2 {

 
    public static void main(String[] args) {
        

        GremioAventureros gremio = new GremioAventureros("Guardianes de Eldoria");

        gremio.agregarAventurero(new Guerrero("G-01", "Arin", Rangos.ORO, 30));
        gremio.agregarAventurero(new Mago("M-02", "Lyra", Rangos.PLATA, 45));
        gremio.agregarAventurero(new Arquero("A-03", "Nox", Rangos.BRONCE, 18));
        gremio.agregarAventurero(new Guerrero("G-04", "Borin", Rangos.PLATA, 20));
        gremio.agregarAventurero(new Mago("G-01", "Arin", Rangos.BRONCE, 99));

        System.out.println("Aventureros registrados:");
        mostrarAventureros(gremio.obtenerAventureros());
        System.out.println("\nAtaques:");
        mostrarAtaques(gremio.obtenerAventureros());
        System.out.println("\nEntrenamientos:");
        mostrarEntrenamientos(gremio.obtenerAventureros());
        System.out.println("\nPoder de combate:");
        mostrarPoderes(gremio.obtenerAventureros());
        System.out.println("\nAventureros de rango PLATA:");
        mostrarAventureros(gremio.filtrarPorRango(Rangos.PLATA));
        System.out.println("\nAventureros con poder >= 55:");
        mostrarAventureros(gremio.obtenerAventurerosPoderosos(55));
    }

    private static void mostrarAventureros(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros){
            System.out.println("nombre" + a.getNombre() + "codigo" + a.getCodigo() + "rango" + a.getRango());
        }
    }
        

    private static void mostrarAtaques(List<Aventurero> aventureros){
        for (Aventurero a : aventureros){
            System.out.println("Nombre: " + a.getNombre() + "Ataque" + a.realizarAtaque());
        }
    }
       
    private static void mostrarEntrenamientos(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros){
            System.out.println(a.getNombre() + ": ");
            a.realizarEntrenamiento();
        }
    }

    private static void mostrarPoderes(List<Aventurero> aventureros) {
        for (Aventurero a : aventureros){
            System.out.println("Nombre: " + "Poder de combate" + a.calcularPoder());
        }
    }
}


