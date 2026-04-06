
// 4. Monitoreo Industrial (Sensores en Tiempo Real)
// Una planta química registra lecturas de sus tanques cada hora en una lista
//  enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int),
//  temperatura (double), presion (double) y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente
//  sea siempre la primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con 
// la temperatura más alta registrada en el historial.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistorialPlantas historial = new HistorialPlantas();
        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE MONITOREO QUÍMICO ---");
            System.out.println("1. Registrar nueva lectura (Hora actual)");
            System.out.println("2. Ver historial completo (Auditoría)");
            System.out.println("3. Consultar temperatura más alta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID del Sensor: ");
                    int id = sc.nextInt();
                    System.out.print("Temperatura (°C): ");
                    double temp = sc.nextDouble();
                    System.out.print("Presión (bar): ");
                    double pres = sc.nextDouble();
                    System.out.print("Hora (HH:mm): ");
                    String hora = sc.next();
                    
                    historial.agregarLectura(id, temp, pres, hora);
                    System.out.println("Lectura guardada con éxito.");
                    break;
                case 2:
                    historial.mostrarHistorial();
                    break;
                case 3:
                    historial.mostrarTemperaturaMaxima();
                    break;
                case 4:
                    System.out.println("Cerrando sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}