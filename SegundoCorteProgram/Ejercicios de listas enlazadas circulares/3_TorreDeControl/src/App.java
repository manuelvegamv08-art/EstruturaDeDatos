import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ListaVuelo listaVuelos = new ListaVuelo();

        // VUELOS POR DEFECTO
        listaVuelos.insertar("AV123", "Avianca", 15, 180);
        listaVuelos.insertar("LA456", "Latam", 8, 150);   // emergencia
        listaVuelos.insertar("CM789", "Copa", 20, 120);

        System.out.println("===== Torre de Control =====");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Insertar nuevo vuelo");
            System.out.println("2. Reportar emergencia");
            System.out.println("3. Mostrar vuelos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el número de vuelo: ");
                    String numeroVuelo = scanner.nextLine();

                    System.out.print("Ingrese la aerolínea: ");
                    String aerolinea = scanner.nextLine();

                    System.out.print("Ingrese el combustible restante: ");
                    int combustibleRestante = scanner.nextInt();

                    System.out.print("Ingrese el número de pasajeros: ");
                    int pasajeros = scanner.nextInt();
                    scanner.nextLine();

                    listaVuelos.insertar(numeroVuelo, aerolinea, combustibleRestante, pasajeros);

                    System.out.println("Vuelo agregado correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el número de vuelo para emergencia: ");
                    String numeroVueloEmergencia = scanner.nextLine();

                    listaVuelos.reportarEmergencia(numeroVueloEmergencia);
                    break;

                case 3:
                    System.out.println("\nLista de vuelos:");
                    listaVuelos.mostrarVuelos();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}