// La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), 
// aerolinea (String), combustibleRestante (int) y pasajeros (int
public class Vuelo {
    String numeroVuelo;
    String aeroLinea;
    int combustibleRestante;
    int pasajeros;
    Vuelo siguiente;

    public Vuelo (String numeroVuelo,String aeroLinea, int combustibleRestante, int pasajeros){
        this.numeroVuelo = numeroVuelo;
        this.aeroLinea = aeroLinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguiente = null;
        

    }

}
