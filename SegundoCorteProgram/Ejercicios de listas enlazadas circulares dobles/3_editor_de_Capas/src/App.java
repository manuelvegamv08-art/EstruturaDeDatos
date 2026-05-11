import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        EditorCapas editor = new EditorCapas();

        System.out.println("=== EDITOR DE CAPAS ===");
       
        try {
            while (true) {
                System.out.println("\n=== MENÚ DE OPCIONES ===");
                System.out.println("1. Agregar capa");
                System.out.println("2. Subir capa (siguiente)");
                System.out.println("3. Bajar capa (anterior)");
                System.out.println("4. Toggle visibilidad (mostrar/ocultar)");
                System.out.println("5. Eliminar capa activa");
                System.out.println("6. Mostrar todas las capas");
                System.out.println("7. Salir");
                System.out.print("Elige una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre de la capa: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Tipo de capa (fondo/objeto/texto): ");
                        String tipo = scanner.nextLine();
                        System.out.print("¿Es visible? (true/false): ");
                        boolean visible = scanner.nextBoolean();
                        scanner.nextLine(); // limpiar buffer
                        
                        editor.agregarCapa(nombre, visible, tipo);
                        System.out.println(" Capa '" + nombre + "' agregada correctamente.");
                        break;

                    case 2:
                        editor.subirCapa();
                        System.out.println(" Subiendo a la capa superior...");
                        break;

                    case 3:
                        editor.bajarCapa();
                        System.out.println("Bajando a la capa inferior...");
                        break;

                    case 4:
                        editor.toggleVisibilidad();
                        // El mensaje ya se muestra dentro de toggleVisibilidad()
                        break;

                    case 5:
                        editor.eliminarActiva();
                        // El mensaje ya se muestra dentro de eliminarActiva()
                        break;

                    case 6:
                        editor.mostrarCapas();
                        break;

                    case 7:
                        System.out.println(" Saliendo del editor de capas...");
                        scanner.close();
                        return; // Sale del programa

                    default:
                        System.out.println(" Opción no válida. Elige un número del 1 al 7.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
            scanner.close();
        }
    }
}