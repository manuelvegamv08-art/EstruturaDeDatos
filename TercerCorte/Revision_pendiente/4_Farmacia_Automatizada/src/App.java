import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PilaMedicamentos pila = new PilaMedicamentos();

        
        pila.push(new Medicamento("Paracetamol", "L001", 30));
        pila.push(new Medicamento("Ibuprofeno", "L002", 5));
        pila.push(new Medicamento("Amoxicilina", "L003", 3));
        pila.push(new Medicamento("Vitamina C", "L004", 20));

        int opcion;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Agregar medicamentos");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Validar despacho");
            System.out.println("4. Eliminar medicamento del tope");
            System.out.println("5. Ver medicamento del tope");
            System.out.println("0. Salir");
            System.out.println("========================");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print(
                            "\nIngrese el número de medicamentos: "
                    );

                    int cantidad = scanner.nextInt();

                    for (int i = 0; i < cantidad; i++) {

                        System.out.println(
                                "\nMEDICAMENTO #" + (i + 1)
                        );

                        System.out.print("Nombre: ");
                        String nombre = scanner.next();

                        System.out.print("Lote: ");
                        String lote = scanner.next();

                        System.out.print("Dias para vencer: ");
                        int dias = scanner.nextInt();

                        Medicamento nuevo =
                                new Medicamento(nombre, lote, dias);

                        pila.push(nuevo);

                        System.out.println(
                                "Medicamento agregado correctamente."
                        );
                    }

                    break;

                case 2:

                    System.out.println(
                            "\n===== MEDICAMENTOS EN PILA ====="
                    );

                    if (pila.estaVacia()) {

                        System.out.println("La pila está vacía.");

                    } else {

                        pila.mostrar();
                    }

                    break;

                case 3:

                    System.out.println(
                            "\n===== VALIDAR DESPACHO ====="
                    );

                    pila.validarDespacho();

                    break;

                case 4:

                    System.out.println(
                            "\n===== ELIMINAR TOPE ====="
                    );

                    Medicamento eliminado = pila.pop();

                    if (eliminado == null) {

                        System.out.println("La pila está vacía.");

                    } else {

                        System.out.println(
                                "Medicamento eliminado:"
                        );

                        System.out.println(eliminado);
                    }

                    break;

                case 5:

                    System.out.println(
                            "\n===== VER TOPE ====="
                    );

                    if (pila.estaVacia()) {

                        System.out.println("La pila está vacía.");

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