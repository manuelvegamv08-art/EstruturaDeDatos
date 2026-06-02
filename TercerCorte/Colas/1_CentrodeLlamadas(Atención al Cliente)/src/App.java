import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ColaLlamada cola = new ColaLlamada();

        
        cola.encolar(new Llamada("LL01", "Carlos Pérez", "Facturación", 5));
        cola.encolar(new Llamada("LL02", "Ana Gómez", "Soporte Técnico", 15));
        cola.encolar(new Llamada("LL03", "Luis Martínez", "Facturación", 8));
        cola.encolar(new Llamada("LL04", "María Rodríguez", "Cancelación", 12));
        cola.encolar(new Llamada("LL05", "Jorge López", "Soporte Técnico", 20));
        cola.encolar(new Llamada("LL06", "Elena Beltrán", "Información", 4));
        cola.encolar(new Llamada("LL07", "Pedro Picapiedra", "Soporte Técnico", 10));

        
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        System.out.println("=================================================");
        System.out.println("  SISTEMA DE MONITOREO - CENTRO DE LLAMADAS     ");
        System.out.println("=================================================");

        
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Consultar llamadas por motivo específico");
            System.out.println("2. Ver resumen rápido para asignación de agentes");
            System.out.println("3. Salir del sistema");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(teclado.nextLine()); 
            } catch (NumberFormatException e) {
                opcion = 0; 
            }

            switch (opcion) {
                case 1:
                    System.out.print("\nIngrese el motivo a consultar (Facturación, Soporte Técnico, Cancelación, Información): ");
                    String motivoBuscado = teclado.nextLine().trim();
                    
                    
                    int cantidad = cola.contarPorMotivo(motivoBuscado);
                    
                    System.out.println("\n>>> RESULTADO: Hay " + cantidad + " llamada(s) en espera para el motivo: \"" + motivoBuscado + "\".");
                    break;

                case 2:
                    System.out.println("\n--- ESTADO ACTUAL DE LA COLA ---");
                    System.out.println("Facturación: " + cola.contarPorMotivo("Facturación") + " en espera.");
                    System.out.println("Soporte Técnico: " + cola.contarPorMotivo("Soporte Técnico") + " en espera.");
                    System.out.println("Cancelación: " + cola.contarPorMotivo("Cancelación") + " en espera.");
                    System.out.println("Información: " + cola.contarPorMotivo("Información") + " en espera.");
                    break;

                case 3:
                    System.out.println("\nCerrando el sistema de monitoreo. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("\n[Error] Opción no válida. Por favor, intente de nuevo.");
                    break;
            }

        } while (opcion != 3);

        teclado.close(); 
    }
}