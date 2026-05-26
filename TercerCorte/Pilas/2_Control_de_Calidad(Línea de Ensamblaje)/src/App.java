import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        PilaComponentes pila = new PilaComponentes();

        
        pila.apilar(new Pieza("Motor", "M001", false));
        pila.apilar(new Pieza("Piston", "P002", false));
        pila.apilar(new Pieza("Valvula", "V003", true));

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Sacar pieza");
            System.out.println("3. Ver pieza de arriba");
            System.out.println("4. Limpiar hasta defecto");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Numero de serie: ");
                    String serie = scanner.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defectuosa = scanner.nextBoolean();
                    scanner.nextLine();

                    Pieza nueva = new Pieza(nombre, serie, defectuosa);

                    pila.apilar(nueva);

                    System.out.println("Pieza agregada.");
                    break;

                case 2:

                    Pieza eliminada = pila.desapilar();

                    if (eliminada == null) {
                        System.out.println("La pila esta vacia.");
                    } else {
                        System.out.println("Pieza retirada: "
                                + eliminada.getNombrePieza());
                    }

                    break;

                case 3:

                    if (pila.estaVacia()) {

                        System.out.println("La pila esta vacia.");

                    } else {

                        Pieza cima = pila.desapilar();

                        System.out.println("Pieza en la cima:");
                        System.out.println(cima.getNombrePieza());

                        pila.apilar(cima);
                    }

                    break;

                case 4:

                    pila.limpiarHastaDefecto();

                    break;

                case 5:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}