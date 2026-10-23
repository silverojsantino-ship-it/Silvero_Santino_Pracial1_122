package parcial.t2;
import java.util.ArrayList;
import java.util.List;

public class GremioAventureros {
    private String nombre;
    private List<Aventurero> aventureros;
    

    public GremioAventureros(String nombre) {
        this.nombre = nombre;
        this.aventureros = aventureros;
    }
    /*
    agregarAventurero()
    obtenerAventureros()
    filtrarPorRango()
    obtenerAventurerosPoderosos()
    */
    
    public void agregarAventurero(Aventurero a){ // A TESTEAR ESTO
        for (Aventurero existe : aventureros){
            if(existe.getCodigo() != a.getCodigo() && existe.getNombre() != a.getNombre()){
                aventureros.add(a);
            }
        throw new AventureroDuplicadoerror("No se permiten aventureros duplicados");    
        }
    }
    
    public List<Aventurero> obtenerAventureros(){
        return aventureros;
    }
    
    public List<Aventurero> filtrarPorRango(Rangos rangoaBuscar){
        List<Aventurero> filtrado = new ArrayList<>();
        for (Aventurero a : aventureros){
            if (a.getRango() == rangoaBuscar){
                filtrado.add(a);
            }
        }
        return filtrado;
    }
    
    public List<Aventurero> obtenerAventurerosPoderosos(int poderBuscado){
        List<Aventurero> poderosos = new ArrayList<>();
        for (Aventurero a : aventureros){
            if (a.calcularPoder() == poderBuscado){
                poderosos.add(a);
            }
        }
        return poderosos;
    }
    
}
