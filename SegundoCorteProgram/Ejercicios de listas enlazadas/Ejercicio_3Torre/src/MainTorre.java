
// 3. Torre de Control (Aterrizajes de Emergencia)
// Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

// La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String),
//  combustibleRestante (int) y pasajeros (int).
// El Problema: Normalmente los vuelos se forman al final de la cola. 
// Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, 
// debe ser movido inmediatamente al inicio de la lista (Cabeza).
// Reto: Implementar el método reportarEmergencia(String numeroVuelo) 
// que busque un vuelo en la cola y lo mueva al principio.

import java.util.Scanner;

public class MainTorre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionVuelos torre = new GestionVuelos();
        int opcion;

        do {
            System.out.println("\n--- TORRE DE CONTROL ---");
            System.out.println("1. Registrar Vuelo");
            System.out.println("2. Reportar Emergencia");
            System.out.println("3. Ver Cola de Aterrizaje");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = Integer.parseInt(scanner.nextLine());

            if (opcion == 1) {
                System.out.print("Número de vuelo: ");
                String n = scanner.nextLine();
                System.out.print("Aerolínea: ");
                String a = scanner.nextLine();
                System.out.print("Combustible: ");
                int c = Integer.parseInt(scanner.nextLine());
                System.out.print("Pasajeros: ");
                int p = Integer.parseInt(scanner.nextLine());

                torre.agregarVuelo(n, a, c, p);
                
                // Automatización: Si entra con poco combustible, moverlo ya
                if (c < 10) {
                    torre.moverAlInicio(n);
                }

            } else if (opcion == 2) {
                System.out.print("Ingrese número de vuelo en emergencia: ");
                String emer = scanner.nextLine();
                torre.moverAlInicio(emer);

            } else if (opcion == 3) {
                torre.mostrarCola();
            }

        } while (opcion != 4);
        
        System.out.println("Sistema apagado.");
        scanner.close();
    }
    
}
