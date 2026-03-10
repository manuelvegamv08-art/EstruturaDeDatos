// Ejercicio 3 — Localizador de Productos
// En un inventario de 10 productos (Strings), se desea saber si un producto específico existe.

// Recorre el arreglo buscando el nombre del producto.
// Indica la posición (índice) si se encuentra, o un mensaje de error si no existe.
import java.util.Scanner;
public class Araays_busqueda_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] productos = new String [10];
        productos[0] = "Laptop";
        productos[1] = "Smartphone";
        productos[2] = "Tablet";
        productos[3] = "Monitor";
        productos[4] = "Teclado";
        productos[5] = "Ratón";
        productos[6] = "Impresora";
        productos[7] = "Cámara";
        productos[8] = "Auriculares";
        productos[9] = "Altavoces";
        
        System.out.print("Ingresa el nombre del producto a buscar: ");
        String productoBuscado = scanner.nextLine(); // Cambia este valor para probar con otros productos
        boolean encontrado = false;
        int indiceEncontrado = -1;

        for (int i = 0; i < productos.length; i++) {
            if (productos[i].equalsIgnoreCase(productoBuscado)) {
                encontrado = true;
                indiceEncontrado = i;
                break; // Salir del bucle una vez encontrado
            }
        }

        if (encontrado) {
            System.out.println("Producto '" + productoBuscado + "' encontrado en el índice: " + indiceEncontrado);
        } else {
            System.out.println("Producto '" + productoBuscado + "' no encontrado en el inventario.");
        }
        scanner.close();
    } 

}