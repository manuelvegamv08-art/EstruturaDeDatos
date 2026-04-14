public class Fotografia {
    String nombreArchivo;
    String resolucion;
    double tamañoMB;

    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia(String nombreArchivo, String resolucion, double tamañoMB){
        this.nombreArchivo = nombreArchivo;
        this.resolucion = resolucion;
        this.tamañoMB = tamañoMB;
        this.siguiente = null;
        this.anterior = null;
    }

    public String getNombreArchivo(){
        return nombreArchivo;
    }

    public String getResolucion(){
        return resolucion;
    
    }

    public double getTamañoMB(){
        return tamañoMB;
    }

    public void setNombreArchivo(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }

    public void setResolucion(String resolucion){
        this.resolucion = resolucion;
    }

    public void setTamañoMB(double tamañoMB){
        this.tamañoMB = tamañoMB;
    }

    public Void mostrarInformacion(){
        System.out.println("Nombre del Archivo: " + nombreArchivo);
        System.out.println("Resolución: " + resolucion);
        System.out.println("Tamaño (MB): " + tamañoMB);
        
    }

}
