
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
        Scanner sc = new Scanner(System.in);
        GestionVuelos torre = new GestionVuelos();
        String opcion;

        do {
            System.out.println("\n--- TORRE DE CONTROL ---");
            System.out.println("1. Registrar llegada de vuelo (al final)");
            System.out.println("2. Reportar Emergencia (Mover al inicio)");
            System.out.println("3. Ver cola de aterrizaje");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextLine();

            switch(opcion) {
                case "1":
                    System.out.print("Número de Vuelo: ");
                    String num = sc.nextLine();
                    System.out.print("Aerolínea: ");
                    String aero = sc.nextLine();
                    System.out.print("Combustible: ");
                    int comb = Integer.parseInt(sc.nextLine());
                    System.out.print("Pasajeros: ");
                    int pas = Integer.parseInt(sc.nextLine());
                    
                    Vuelo nuevo = new Vuelo(num, aero, comb, pas);
                    torre.agregarVuelo(nuevo);
                    
                    // Verificación automática de combustible bajo
                    if(comb < 10) {
                        System.out.println("Alerta: Combustible bajo. Reubicando...");
                        torre.reportarEmergencia(num);
                    }
                    break;

                case "2":
                    System.out.print("Ingrese el número de vuelo en emergencia: ");
                    String emergencia = sc.nextLine();
                    torre.reportarEmergencia(emergencia);
                    break;

                case "3":
                    torre.mostrarCola();
                    break;
            }
        } while (!opcion.equals("4"));
        
        sc.close();
    }
}
