public class Vagon {
    String contenedor;
    double pesoTonelada;
    String origen;
    String destino;

    Vagon siguiente;

    public Vagon(String contenedor, double pesoTonelada, String origen, String destino){

    this.contenedor = contenedor;
    this.pesoTonelada = pesoTonelada;
    this.origen = origen;
    this.destino = destino;

    this.siguiente = null;

    }

    public void mostrarInfo(){
        System.out.println("======Informacion de vagon:=======");
        System.out.println("Contenedor: " + contenedor);
        System.out.println("peso en toneladas: " + pesoTonelada);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("==================================");
    }
}
