// Ejercicio 2 — Calculadora de una tienda
// Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

// Precio unitario de un producto (double)
// Cantidad comprada (int)
// Descuento aplicado en porcentaje (double)
// Total a pagar después del descuento
// Declara las variables, realiza el cálculo y muestra el resultado por consola.


public class Calculadora_de_una_tienda {
    public static void main(String[] args) {
        String nombreProducto = "Camiseta";
        double precioUnitario = 19.99;
        int cantidad = 3;
        double total = precioUnitario * cantidad;
        double descuento = 0.1; // 10% de descuento
        double totalConDescuento = total - (total * descuento);

        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a Pagar: $" + total);
        System.out.println("Total con Descuento: $" + totalConDescuento);
    }
}
