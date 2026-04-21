public class Vuelo {
    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;
    Vuelo siguienteVuelo;

    public Vuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros){
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguienteVuelo = null;

    }

    public void mostrarInformacion(){
        System.out.println("Informacion del vuelo:");
        System.out.println("Numero de vuelo: " + numeroVuelo);
        System.out.println("Aerolinea: " + aerolinea);
        System.out.println("Combustible restante: " + combustibleRestante);
        System.out.println("Pasajeros: " + pasajeros);
        System.out.println("Siguiente vuelo: " + siguienteVuelo);

    }

    

}
