import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Historial h = new Historial();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Agregamos 5 comandos de ejemplo
        h.agregar("ls -la", true, "/home/user");
        h.agregar("cd Documents", true, "/home/user");
        h.agregar("rm secreto.txt", false, "/home/user/Documents");
        h.agregar("sudo apt update", true, "/home/user");
        h.agregar("echo 'hola mundo'", true, "/home/user");

        System.out.println("=== SIMULADOR DE HISTORIAL DE TERMINAL ===");
        System.out.println("(Historial circular - flecha arriba/abajo)\n");

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nuevo comando");
            System.out.println("2. Flecha ARRIBA (comando anterior)");
            System.out.println("3. Flecha ABAJO (comando siguiente)");
            System.out.println("4. Mostrar comando actual (cursor)");
            System.out.println("5. Eliminar comando actual");
            System.out.println("6. Mostrar historial completo");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Comando: ");
                    String cmd = scanner.nextLine();
                    System.out.print("¿Exitoso? (true/false): ");
                    boolean ok = scanner.nextBoolean();
                    scanner.nextLine();
                    System.out.print("Directorio: ");
                    String dir = scanner.nextLine();
                    h.agregar(cmd, ok, dir);
                    System.out.println(" Comando agregado y cursor movido al nuevo comando.");
                    break;

                case 2:
                    h.arriba();
                    System.out.print(" Cursor movido a arriba: ");
                    h.mostrarCursor();
                    break;

                case 3:
                    h.abajo();
                    System.out.print(" Cursor movido a bajo: ");
                    h.mostrarCursor();
                    break;

                case 4:
                    System.out.print(" Comando actual: ");
                    h.mostrarCursor();
                    break;

                case 5:
                    System.out.print(" Eliminando: ");
                    h.mostrarCursor();
                    h.eliminarActual();
                    System.out.print("Cursor ahora en: ");
                    h.mostrarCursor();
                    break;

                case 6:
                    System.out.println("\n=== HISTORIAL COMPLETO ===");
                    h.mostrarHistorial();
                    break;

                case 7:
                    System.out.println(" Saliendo...");
                    break;

                default:
                    System.out.println(" Opción no válida.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
