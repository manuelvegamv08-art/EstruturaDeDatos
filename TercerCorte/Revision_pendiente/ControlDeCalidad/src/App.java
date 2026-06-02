import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaPiezas pila = new PilaPiezas();

        
        pila.push(new Pieza("Motor", "A101", false));
        pila.push(new Pieza("Tornillo", "A102", false));
        pila.push(new Pieza("Filtro", "A103", false));
        pila.push(new Pieza("Pistón", "A104", true));
        pila.push(new Pieza("Bujía", "A105", false));

        int opcion;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Agregar piezas");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Limpiar hasta encontrar defecto");
            System.out.println("4. Eliminar pieza del tope");
            System.out.println("5. Ver pieza del tope");
            System.out.println("0. Salir");
            System.out.println("========================");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese el número de piezas a agregar: ");
                    int numeroPiezas = scanner.nextInt();

                    for (int i = 0; i < numeroPiezas; i++) {

                        System.out.println("\nPIEZA #" + (i + 1));

                        System.out.print("Ingrese el nombre de la pieza: ");
                        String nombrePieza = scanner.next();

                        System.out.print("Ingrese el número de serie: ");
                        String numeroSerie = scanner.next();

                        System.out.print("¿Es defectuosa? (true/false): ");
                        boolean esDefectuoso = scanner.nextBoolean();

                        Pieza nuevaPieza = new Pieza(
                                nombrePieza,
                                numeroSerie,
                                esDefectuoso
                        );

                        pila.push(nuevaPieza);

                        System.out.println("Pieza agregada correctamente.");
                    }

                    break;

                case 2:

                    System.out.println("\n===== PILA DE PIEZAS =====");

                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        pila.mostrar();
                    }

                    break;

                case 3:

                    System.out.println("\n===== LIMPIANDO HASTA DEFECTO =====");

                    pila.limpiarHastaDefectuoso();

                    break;

                case 4:

                    System.out.println("\n===== ELIMINAR TOPE =====");

                    Pieza eliminada = pila.pop();

                    if (eliminada == null) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Pieza eliminada:");
                        System.out.println(eliminada);
                    }

                    break;

                case 5:

                    System.out.println("\n===== VER TOPE =====");

                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("Pieza en el tope:");
                        System.out.println(pila.peek());
                    }

                    break;

                case 0:

                    System.out.println("\nSaliendo del programa...");

                    break;

                default:

                    System.out.println("\nOpción inválida.");

                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}