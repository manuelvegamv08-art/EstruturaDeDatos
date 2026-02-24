import java.util.Scanner;

public class App {

    static class Producto {
        String nombre;
        int cantidad;
        double precio;  // Añadimos el precio

        public Producto(String nombre, int cantidad, double precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
        
        // Método para calcular el subtotal por producto
        public double calcularSubtotal() {
            return cantidad * precio;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("   CAJERO DEL SUPERMERCADO");
        System.out.println("=================================");
        
        // Declaramos el array de productos
        Producto[] stockAlmacen = new Producto[4];
        double totalCompra = 0;  // Variable para acumular el total
        
        // Ingreso de datos para 4 productos
        for (int i = 0; i < 4; i++) {
            System.out.println("\n--- Producto " + (i+1) + " ---");
            
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();
            
            System.out.print("Ingrese el precio unitario: $");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer
            
            // Crear el producto y guardarlo en el array
            stockAlmacen[i] = new Producto(nombre, cantidad, precio);
        }
        
        // Mostrar ticket de compra
        System.out.println("\n=================================");
        System.out.println("         TICKET DE COMPRA");
        System.out.println("=================================");
        System.out.printf("%-15s %8s %10s %12s%n", "PRODUCTO", "CANTIDAD", "PRECIO", "SUBTOTAL");
        System.out.println("--------------------------------------------------");
        
        // Calcular y mostrar cada producto, acumulando el total
        for (int i = 0; i < stockAlmacen.length; i++) {
            Producto p = stockAlmacen[i];
            double subtotal = p.calcularSubtotal();
            totalCompra += subtotal;
            
            System.out.printf("%-15s %8d %10.2f %12.2f%n", 
                p.nombre, p.cantidad, p.precio, subtotal);
        }
        
        System.out.println("--------------------------------------------------");
        System.out.printf("%-37s %12.2f%n", "TOTAL A PAGAR:", totalCompra);
        System.out.println("=================================");
        
        // Preguntar si quiere pagar en efectivo o tarjeta
        System.out.println("\n¿Cómo desea pagar?");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        
        if (opcion == 1) {
            System.out.print("Ingrese el monto con que paga: $");
            double pago = scanner.nextDouble();
            double cambio = pago - totalCompra;
            System.out.printf("Su cambio es: $%.2f%n", cambio);
            System.out.println("¡Gracias por su compra!");
        } else if (opcion == 2) {
            System.out.println("Procesando pago con tarjeta...");
            System.out.println("¡Pago exitoso! ¡Gracias por su compra!");
        }
        
        scanner.close();
    }
}