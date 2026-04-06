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
        StockTienda[1].cantidad = 2;
        StockTienda[2].cantidad -= 3;


        System.out.println("Producto en la Tienda:");
        System.out.println("-----------------------");
        for (Producto producto : StockTienda) {
            System.out.println("Producto: " + producto.nombre + ", Cantidad: " + producto.cantidad);
        }
            System.out.println("-----------------------");
            System.out.println("Inventario del Almacén después de las modificaciones en la tienda:");
            System.out.println("-----------------------");
        for (Producto producto : StockAlmacen) {
            System.out.println("Producto: " + producto.nombre + ", Cantidad: " + producto.cantidad);

    }
}
}