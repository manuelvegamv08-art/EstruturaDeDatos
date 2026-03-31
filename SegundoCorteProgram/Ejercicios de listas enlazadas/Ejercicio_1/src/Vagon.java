// La Clase Vagon (Nodo):
//  Debe contener contenido (String), pesoToneladas (double), 
//  origen (String) y destino (String).
public class Vagon {

    String contenido;
    double pesoToneladas;
    String origen;
    String destino;

    // El "gancho": Referencia al siguiente nodo
    Vagon siguiente;

    public Vagon(String contenido, double pesoToneladas, String origen, String destino){

        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
        this.destino = destino;
        this.siguiente = null; // Inicialmente, el siguiente es null
        
    }
}
