import java.util.Scanner;

// 1. El Tren de Carga (Logística Ferroviaria)
// Diseña un sistema para gestionar los vagones de un tren de carga internacional.

// La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), 
// origen (String) y destino (String).
// El Problema: El tren sale de una estación y se le van enganchando vagones al final.
// Reto: Implementa un método que recorra el tren y calcule el peso total de toda la 
// carga transportada.

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        TrenCarga tren = new TrenCarga();
        int opcion;
        // Enganchamos algunos vagones al tren

        System.out.println("-----Bienvenido al sistema de gestion de trenes de carga-----");
        
        do {
            System.out.println("que desea hacer?");
            System.out.println("1.Enganchar un nuevo vagon");
            System.out.println("2.Calcular el peso total del tren");
            System.out.println("3.salir");
            opcion = scanner.nextInt();
            scanner.nextLine(); // "Limpiar" el buffer después de leer un número
            if (opcion == 1){
                System.out.println("Ingrese el conteniado del vagon: ");
                String contenido = scanner.nextLine();

                System.out.println("Ingrese el peso del vagon en toneladas: ");
                double pesoToneladas = scanner.nextDouble();
                scanner.nextLine(); // "Limpiar" el buffer después de leer un número;

                System.out.println("Ingrese el origen del vagon:");
                String origen = scanner.nextLine();

                System.out.println("Ingrese el destino del vagon: ");
                String destino = scanner.nextLine();
                tren.engancharVagon(contenido,pesoToneladas,origen,destino);
                System.out.println("vagon enganchado exitosamente!");

            }else if (opcion == 2){
                double pesoTotal = tren.calcularPesoTotal();
                System.out.println("El peso total del tren es: " + pesoTotal + " toneladas.");

            }


        } while (opcion != 3);
        System.out.println("Cerrando Sistema de Logistica Ferroviaria. ");
        scanner.close();

    }
}
