//gestion de carga
// 1.implementamos una lista Enlazada simple
// Estruturar (3 Archivos): Vagon.java (nodo) listaTren.java (logica) y 
// app.java (menu)

// 2.meu interactivo: implementar un Switch con:

public class Vagon {
    int id;
    String contenedor;
    double pesoTonelada;
    String origen;
    String destino;

    Vagon siguiente;

    public Vagon(int id, String contenedor, double pesoTonelada, String origen, String destino){
    
    this.id = id;
    this.contenedor = contenedor;
    this.pesoTonelada = pesoTonelada;
    this.origen = origen;
    this.destino = destino;

    this.siguiente = null;

    }

    public void mostrarInfo(){
        System.out.println("======Informacion de vagon:=======");
        System.out.println("mostrar id " + id);
        System.out.println("Contenedor: " + contenedor);
        System.out.println("peso en toneladas: " + pesoTonelada);
        // System.out.println("Origen: " + origen);
        // System.out.println("Destino: " + destino);
        System.out.println("==================================");
    }
}
