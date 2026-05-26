
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaCamiones callejon = new PilaCamiones();

        int opcion;

        do {

            System.out.println("\n======= MENU =======");
            System.out.println("1. Ingresar camion");
            System.out.println("2. Sacar camion");
            System.out.println("3. Mostrar camiones");
            System.out.println("4. Calcular carga total");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = scanner.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = scanner.nextDouble();
                    scanner.nextLine();

                    Camion nuevo = new Camion(placa, conductor, carga);

                    callejon.apilar(nuevo);

                    System.out.println("Camion ingresado correctamente.");
                    break;

                case 2:

                    Camion retirado = callejon.desapilar();

                    if (retirado == null) {

                        System.out.println("No hay camiones en el callejon.");

                    } else {

                        System.out.println("Camion retirado:");
                        System.out.println("Placa: " + retirado.getPlaca());
                        System.out.println("Conductor: " + retirado.getConductor());
                    }

                    break;

                case 3:

                    if (callejon.estaVacia()) {

                        System.out.println("El callejon esta vacio.");

                    } else {

                        callejon.mostrar();
                    }

                    break;

                case 4:

                    double total = callejon.calcularCargaTotal();

                    System.out.println("Carga total: "
                            + total + " toneladas");

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