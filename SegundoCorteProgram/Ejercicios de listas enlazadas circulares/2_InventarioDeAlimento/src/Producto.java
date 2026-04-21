public class Producto {
    String nombre;
    int cantidad;
    int diasParaVencer;
    Producto siguiente;

    public Producto(String nombre, int cantidad, int diasParaVencer){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Días para vencer: " + diasParaVencer);
        System.out.println("----------------------");
    }
}