import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaCamiones pila = new PilaCamiones();

        pila.push(new Camion("ABC123", "Carlos", 5.5));
        pila.push(new Camion("DEF456", "Juan", 3.2));
        pila.push(new Camion("GHI789", "Pedro", 7.8));

        int opcion;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Agregar camiones");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Eliminar camión del tope");
            System.out.println("5. Ver camión del tope");
            System.out.println("0. Salir");
            System.out.println("========================");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese el número de camiones a agregar: ");

                    int numeroCamiones = scanner.nextInt();

                    for (int i = 0; i < numeroCamiones; i++) {

                        System.out.println("\nCAMIÓN #" + (i + 1));

                        System.out.print("Ingrese la placa: ");
                        String placa = scanner.next();

                        System.out.print("Ingrese el nombre del conductor: ");
                        String conductor = scanner.next();

                        System.out.print("Ingrese la carga en toneladas: ");
                        double carga = scanner.nextDouble();

                        Camion nuevoCamion =
                                new Camion(placa, conductor, carga);

                        pila.push(nuevoCamion);

                        System.out.println("Camión agregado correctamente.");
                    }

                    break;

                case 2:

                    System.out.println("\n===== CAMIONES EN EL CALLEJÓN =====");

                    if (pila.estaVacia()) {

                        System.out.println("La pila está vacía.");

                    } else {

                        pila.mostrar();
                    }

                    break;

                case 3:

                    System.out.println("\n===== CARGA TOTAL =====");

                    double total = pila.calcularCargaTotal();

                    System.out.println(
                            "La carga total es: "
                                    + total
                                    + " toneladas"
                    );

                    break;

                case 4:

                    System.out.println("\n===== ELIMINAR TOPE =====");

                    Camion eliminado = pila.pop();

                    if (eliminado == null) {

                        System.out.println("La pila está vacía.");

                    } else {

                        System.out.println("Camión eliminado:");
                        System.out.println(eliminado);
                    }

                    break;

                case 5:

                    System.out.println("\n===== VER TOPE =====");

                    if (pila.estaVacia()) {

                        System.out.println("La pila está vacía.");

                    } else {

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