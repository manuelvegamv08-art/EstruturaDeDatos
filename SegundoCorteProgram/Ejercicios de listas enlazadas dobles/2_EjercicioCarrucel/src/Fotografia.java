public class Fotografia {
    String nombreArchivo;
    String resolucion;
    double tamanoMB;

    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia(String nombreArchivo, String resolucion, double tamanoMB){
        this.nombreArchivo = nombreArchivo;
        this.resolucion = resolucion;
        this.tamanoMB = tamanoMB;
        this.siguiente = null;
        this.anterior = null;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println(
            "Archivo: " + nombreArchivo +
            " | Tamaño: " + tamanoMB + "MB" +
            " | Resolución: " + resolucion
        );
    }

}
