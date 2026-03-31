public class Producto {
    String nombre;
    int cantidad;
    int diasParaVencer;
    Producto siguiente; // El enlace al siguiente en el estante

    public Producto(String nombre, int cantidad, int diasParaVencer){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;

    }
}
