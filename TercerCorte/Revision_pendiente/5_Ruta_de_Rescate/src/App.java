import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaEstaciones pila = new PilaEstaciones();


        pila.push(new Estacion("Entrada Norte", 0, 21.0));
        pila.push(new Estacion("Galería Rocosa", 50, 20.5));
        pila.push(new Estacion("Zona Húmeda", 120, 17.5));
        pila.push(new Estacion("Cámara Profunda", 200, 15.0));

        int opcion;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Agregar estación");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Eliminar estación del tope");
            System.out.println("5. Ver estación del tope");
            System.out.println("0. Salir");
            System.out.println("========================");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "\nIngrese el número de estaciones: "
                    );

                    int cantidad = scanner.nextInt();

                    for (int i = 0; i < cantidad; i++) {

                        System.out.println(
                                "\nESTACIÓN #" + (i + 1)
                        );

                        System.out.print(
                                "Nombre del punto: "
                        );

                        String nombre = scanner.next();

                        System.out.print(
                                "Profundidad: "
                        );

                        int profundidad = scanner.nextInt();

                        System.out.print(
                                "Nivel de oxígeno (%): "
                        );

                        double oxigeno = scanner.nextDouble();

                        Estacion nueva =
                                new Estacion(
                                        nombre,
                                        profundidad,
                                        oxigeno
                                );

                        pila.push(nueva);

                        System.out.println(
                                "Estación agregada correctamente."
                        );
                    }

                    break;

                case 2:

                    System.out.println(
                            "\n===== ESTACIONES REGISTRADAS ====="
                    );

                    if (pila.estaVacia()) {

                        System.out.println(
                                "La pila está vacía."
                        );

                    } else {

                        pila.mostrar();
                    }

                    break;

                case 3:

                    pila.retrocederASuperficie();

                    break;

                case 4:

                    System.out.println(
                            "\n===== ELIMINAR TOPE ====="
                    );

                    Estacion eliminada = pila.pop();

                    if (eliminada == null) {

                        System.out.println(
                                "La pila está vacía."
                        );

                    } else {

                        System.out.println(
                                "Estación eliminada:"
                        );

                        System.out.println(eliminada);
                    }

                    break;

                case 5:

                    System.out.println(
                            "\n===== VER TOPE ====="
                    );

                    if (pila.estaVacia()) {

                        System.out.println(
                                "La pila está vacía."
                        );

                    } else {

                        System.out.println(pila.peek());
                    }

                    break;

                case 0:

                    System.out.println(
                            "\nSaliendo del programa..."
                    );

                    break;

                default:

                    System.out.println(
                            "\nOpción inválida."
                    );

                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}