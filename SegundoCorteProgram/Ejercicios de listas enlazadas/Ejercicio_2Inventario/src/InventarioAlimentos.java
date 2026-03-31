
// 2. Inventario de Alimentos (Control de Caducidad)
// Un supermercado necesita gestionar su estante de lácteos.
//  Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.

// La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
// El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista 
// (prioridad de venta). Si vence en más tiempo, se pone al final.
// Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.

import java.util.Scanner;

public class InventarioAlimentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ControlInventario estante = new ControlInventario();
        String opcion = "";

        do {
            System.out.println("\n--- GESTIÓN DE LÁCTEOS ---");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Ver productos críticos (< 5 días)");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = teclado.nextLine();

            if (opcion.equals("1")) {
                System.out.print("Nombre del producto: ");
                String nombre = teclado.nextLine();

                System.out.print("Cantidad: ");
                int cant = Integer.parseInt(teclado.nextLine());

                System.out.print("Días para vencer: ");
                int dias = Integer.parseInt(teclado.nextLine());

                estante.agregarProducto(nombre, cant, dias);
                System.out.println("¡Producto organizado en el estante!");

            } else if (opcion.equals("2")) {
                estante.mostrarProductosCriticos();
            }

        } while (!opcion.equals("3"));

        System.out.println("Programa finalizado.");
        teclado.close();
    }
}
