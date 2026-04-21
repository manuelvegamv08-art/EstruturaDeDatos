import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tren tren = new Tren();

        int opcion;

        do {

            System.out.println("---------------------------------------------------");
            System.out.println("Ingrese la opcion que desea escoger-->");
            System.out.println("1. Agregar vagones al tren");
            System.out.println("2. Mostrar la informacion de los vagones del tren");
            System.out.println("3. Calcular el peso total del tren");
            System.out.println("0. Salir del programa");
            System.out.println("---------------------------------------------------");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese la cantidad de vagones:");
                    int cantidadVagones = scanner.nextInt();

                    for (int i = 0; i < cantidadVagones; i++) {

                        System.out.println("Datos del vagon " + (i + 1));

                        System.out.println("Contenedor:");
                        String contenedor = scanner.next();

                        System.out.println("Peso en toneladas:");
                        double pesoTonelada = scanner.nextDouble();

                        System.out.println("Origen:");
                        String origen = scanner.next();

                        System.out.println("Destino:");
                        String destino = scanner.next();

                        tren.agregarVagon(contenedor, pesoTonelada, origen, destino);
                    }
                    break;

                case 2:
                    System.out.println("Mostrando vagones...");
                    tren.mostrarTren();
                    break;

                case 3:
                    System.out.println("Peso total del tren:");
                    tren.calcularPesoTotal();
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
