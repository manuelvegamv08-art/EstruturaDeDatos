import java.util.Scanner; // Siempre al inicio del archivo 

// Clase Producto con sus atributos [cite: 8]
class Producto {
    int id;
    String nombre;
    double precio;
    int stock;

    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Arreglo para guardar 5 productos [cite: 9]
        Producto[] inventario = new Producto[5];

        // 1. ENTRADA DE DATOS [cite: 9, 13]
        System.out.println("REGISTRO DE PRODUCTOS");
        for (int i = 0; i < 5; i++) {
            System.out.println("Producto " + (i + 1) + ":");
            System.out.print("Ingrese ID: ");
            int id = leer.nextInt();
            leer.nextLine(); // LIMPIEZA DE BUFFER 
            
            System.out.print("Ingrese Nombre: ");
            String nombre = leer.nextLine();
            
            System.out.print("Ingrese Precio: ");
            double precio = leer.nextDouble();
            
            System.out.print("Ingrese Stock: ");
            int stock = leer.nextInt();
            
            inventario[i] = new Producto(id, nombre, precio, stock);
        }

        // 2. ORDENAMIENTO SHELL SORT (Ascendente por ID) [cite: 10, 20]
        int n = inventario.length;
        for (int salto = n / 2; salto > 0; salto /= 2) {
            for (int i = salto; i < n; i++) {
                Producto auxiliar = inventario[i];
                int j = i;
                // Comparamos IDs para ordenar de menor a mayor 
                while (j >= salto && inventario[j - salto].id > auxiliar.id) {
                    inventario[j] = inventario[j - salto];
                    j -= salto;
                }
                inventario[j] = auxiliar;
            }
        }

        // Mostrar inventario ordenado [cite: 20, 70]
        System.out.println("\nINVENTARIO ORDENADO POR ID (Shell Sort)");
        for (Producto p : inventario) {
            System.out.println("ID: " + p.id + " | Nombre: " + p.nombre + " | Precio: " + p.precio + " | Stock: " + p.stock);
        }

        // 3. BÚSQUEDA BINARIA [cite: 11, 28, 71]
        System.out.print("\nBÚSQUEDA DE PRODUCTO\nIngrese el ID a buscar: ");
        int idBuscado = leer.nextInt();

        int inferior = 0;
        int superior = n - 1;
        int posicionEncontrada = -1;

        // Requiere que el arreglo esté ordenado previamente 
        




        while (inferior <= superior) {
            int centro = (inferior + superior) / 2;
            if (inventario[centro].id == idBuscado) {
                posicionEncontrada = centro;
                break; 
            } else if (idBuscado < inventario[centro].id) {
                superior = centro - 1; // Mitad izquierda
            } else {
                inferior = centro + 1; // Mitad derecha
            }
        }

        // Mostrar resultado final [cite: 30, 31]
        if (posicionEncontrada != -1) {
            Producto encontrado = inventario[posicionEncontrada];
            System.out.println(">> PRODUCTO ENCONTRADO: " + encontrado.nombre);
            System.out.println("Precio: $" + encontrado.precio + " Stock: " + encontrado.stock);
        } else {
            System.out.println(">> Error: Producto no encontrado.");
        }
    }
}