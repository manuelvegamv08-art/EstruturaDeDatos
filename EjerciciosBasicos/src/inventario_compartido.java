// Ejercicio 7 — Inventario compartido
// Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el 
// sistema de reportes apuntan al mismo arreglo.

// Crea el arreglo stockAlmacen con valores iniciales.
// Asigna stockReportes = stockAlmacen.
// Simula una venta reduciendo el stock de un producto desde stockReportes.
// Muestra que stockAlmacen también cambió y explica en comentarios por qué.

public class inventario_compartido {

    static class Producto {
        String nombre;
        int cantidad;

        public Producto(String nombre, int cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }
    }

    public static void main(String[] args){

        Producto StockAlmacen [] = {
            new Producto("Camisa", 10),
            new Producto("Pantalon", 5),
            new Producto("Zapatos", 8),
            new Producto("Sombrero", 3)
        };
        System.out.println("Inventario del Almacén:");
        System.out.println("-----------------------");
        for (Producto producto : StockAlmacen) {
            System.out.println("Producto: " + producto.nombre + ", Cantidad: " + producto.cantidad);
        }
        System.out.println("-----------------------");
        Producto StockTienda[] = StockAlmacen;

        StockTienda[0].cantidad += 4;

        System.out.println("Producto en la Tienda:");
        System.out.println("-----------------------");
        for (Producto producto : StockTienda) {
            System.out.println("Producto: " + producto.nombre + ", Cantidad: " + producto.cantidad);
        }
    }
}