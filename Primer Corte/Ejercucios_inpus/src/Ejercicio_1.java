// Ejercicio 1 — Recibo de compra
// Pide al usuario el nombre de un producto, 
// la cantidad comprada y el precio unitario. Calcula el subtotal, aplica un IVA del 19% y muestra 
// el recibo con el total a pagar.

// Datos de entrada:

// String nombre del producto
// int cantidad
// double precio unitario
// Salida esperada:

// ===== Recibo =====
// Producto  : Arroz
// Cantidad  : 3
// Precio c/u: $2500.00
// Subtotal  : $7500.00
// IVA (19%) : $1425.00
// Total     : $8925.00

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad comprada: ");
        int cantidad = scanner.nextInt();
        
        System.out.print("Ingrese el precio unitario: $");
        double precioUnitario = scanner.nextDouble();
        
        
        double subtotal = cantidad * precioUnitario;
        
        
        double iva = subtotal * 0.19;
        
       
        double total = subtotal + iva;
        
        
        System.out.println("\n===== Recibo =====");
        System.out.printf("Producto  : %s%n", nombreProducto);
        System.out.printf("Cantidad  : %d%n", cantidad);
        System.out.printf("Precio c/u: $%.2f%n", precioUnitario);
        System.out.printf("Subtotal  : $%.2f%n", subtotal);
        System.out.printf("IVA (19%%) : $%.2f%n", iva);
        System.out.printf("Total     : $%.2f%n", total);
        
        scanner.close();
    }
}
