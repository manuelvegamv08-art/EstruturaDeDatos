import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaMedicamentos farmacia = new PilaMedicamentos();

        int opcion;

        do {

            System.out.println("\n======= FARMACIA =======");
            System.out.println("1. Ingresar medicamento");
            System.out.println("2. Retirar medicamento");
            System.out.println("3. Mostrar medicamentos");
            System.out.println("4. Validar despacho");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Lote: ");
                    String lote = scanner.nextLine();

                    System.out.print("Dias para vencer: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();

                    Medicamento nuevo =
                        new Medicamento(nombre, lote, dias);

                    farmacia.apilar(nuevo);

                    System.out.println("Medicamento agregado.");
                    break;

                case 2:

                    Medicamento retirado =
                        farmacia.desapilar();

                    if (retirado == null) {

                        System.out.println("La pila esta vacia.");

                    } else {

                        System.out.println(
                            "Medicamento retirado: "
                            + retirado.getNombre()
                        );
                    }

                    break;

                case 3:

                    if (farmacia.estaVacia()) {

                        System.out.println(
                            "No hay medicamentos."
                        );

                    } else {

                        farmacia.mostrar();
                    }

                    break;

                case 4:

                    farmacia.validarDespacho();

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