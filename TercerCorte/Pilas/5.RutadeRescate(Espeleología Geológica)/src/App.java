import java.util.Scanner;

public class App {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaEstaciones ruta = new PilaEstaciones();

        int opcion;

        do {

            System.out.println("\n======= RESCATE =======");
            System.out.println("1. Registrar estacion");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre del punto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Profundidad: ");
                    int profundidad = scanner.nextInt();

                    System.out.print("Nivel de oxigeno: ");
                    double oxigeno = scanner.nextDouble();
                    scanner.nextLine();

                    Estacion nueva =
                        new Estacion(
                            nombre,
                            profundidad,
                            oxigeno
                        );

                    ruta.apilar(nueva);

                    System.out.println(
                        "Estacion registrada."
                    );

                    break;

                case 2:

                    if (ruta.estaVacia()) {

                        System.out.println(
                            "No hay estaciones registradas."
                        );

                    } else {

                        ruta.mostrar();
                    }

                    break;

                case 3:

                    if (ruta.estaVacia()) {

                        System.out.println(
                            "No existen estaciones."
                        );

                    } else {

                        ruta.retrocederASuperficie();
                    }

                    break;

                case 4:

                    System.out.println(
                        "Fin del operativo."
                    );

                    break;

                default:

                    System.out.println(
                        "Opcion invalida."
                    );
            }

        } while (opcion != 4);

        scanner.close();
    }
}