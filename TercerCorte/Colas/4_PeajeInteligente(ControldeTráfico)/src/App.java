
import java.util.Scanner;

public class App {

    private static void cargarDatosIniciales(ColaPeaje cola) {
        System.out.println("📋 CARGANDO VEHÍCULOS PREGUARDADOS...\n");
        
        Vehiculo v1 = new Vehiculo("ABC-123", "Automóvil", 2500.0, false);
        Vehiculo v2 = new Vehiculo("AMB-001", "Ambulancia", 0.0, true);   // Exento
        Vehiculo v3 = new Vehiculo("XYZ-789", "Camión", 8000.0, false);
        Vehiculo v4 = new Vehiculo("PQR-456", "Moto", 1200.0, false);
        Vehiculo v5 = new Vehiculo("BOM-002", "Bomberos", 0.0, true);      // Exento
        Vehiculo v6 = new Vehiculo("JKL-111", "Automóvil", 2500.0, false);
        Vehiculo v7 = new Vehiculo("POL-999", "Policía", 0.0, true);       // Exento
        
        cola.encolar(v1);
        cola.encolar(v2);
        cola.encolar(v3);
        cola.encolar(v4);
        cola.encolar(v5);
        cola.encolar(v6);
        cola.encolar(v7);
        
        System.out.println("\n " + cola.getTamaño() + " vehículos en el carril\n");
    }
    
    private static void mostrarMenu() {
        System.out.println("\n═══════════════════════════════════════════════════════");
        System.out.println("                SISTEMA DE PEAJE INTELIGENTE");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("1.  Registrar nuevo vehículo (encolar)");
        System.out.println("2.  Cobrar siguiente vehículo (desencolar)");
        System.out.println("3.  Ver siguiente vehículo en cabina");
        System.out.println("4.  Mostrar todos los vehículos en cola");
        System.out.println("5.  CERRAR TURNO (procesar todos y calcular total)");
        System.out.println("6.  Ver estadísticas actuales");
        System.out.println("7.  Salir");
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.print(" Seleccione una opción: ");
    }
    
    
    private static Vehiculo registrarVehiculo(Scanner scanner) {
        System.out.println("\n INGRESE LOS DATOS DEL VEHÍCULO:");
        
        System.out.print("   Placa: ");
        String placa = scanner.nextLine().toUpperCase();
        
        System.out.print("   Tipo (Automóvil/Camión/Moto/Ambulancia/etc): ");
        String tipo = scanner.nextLine();
        
        System.out.print("   Tarifa (COP): ");
        double tarifa = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("   ¿Es exento de pago? (true/false): ");
        boolean esExento = scanner.nextBoolean();
        scanner.nextLine();
        
      
        if (esExento && tarifa > 0) {
            System.out.println("    Vehículo exento - Tarifa ajustada a $0");
            tarifa = 0;
        }
        
        return new Vehiculo(placa, tipo, tarifa, esExento);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaPeaje colaPeaje = new ColaPeaje();
        
      
        System.out.println("       BIENVENIDO AL SISTEMA DE PEAJE INTELIGENTE      ");
       
        
      
        cargarDatosIniciales(colaPeaje);
        
    
        colaPeaje.mostrarCola();
        
        int opcion;
        boolean turnoCerrado = false;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (turnoCerrado) {
                        System.out.println("\n El turno ya fue cerrado. Reinicie el sistema para nuevos vehículos.");
                    } else {
                        Vehiculo nuevoVehiculo = registrarVehiculo(scanner);
                        colaPeaje.encolar(nuevoVehiculo);
                    }
                    break;
                    
                case 2:
                    if (turnoCerrado) {
                        System.out.println("\n Turno cerrado. No hay más vehículos para cobrar.");
                    } else {
                        colaPeaje.desencolar();
                    }
                    break;
                    
                case 3:
                    Vehiculo siguiente = colaPeaje.verFrente();
                    if (siguiente != null) {
                        System.out.println("\n SIGUIENTE EN CABINA:");
                        System.out.println("   Placa: " + siguiente.getPlaca());
                        System.out.println("   Tipo: " + siguiente.getTipoVehiculo());
                        System.out.println("   Tarifa: $" + siguiente.getTarifa());
                        System.out.println("   Exento: " + (siguiente.isEsExento() ? "Sí " : "No "));
                    } else {
                        System.out.println("\n No hay vehículos en espera");
                    }
                    break;
                    
                case 4:
                    colaPeaje.mostrarCola();
                    break;
                    
                case 5:
                   
                    System.out.println("\n INICIANDO CIERRE DE TURNO...");
                    double total = colaPeaje.cerrarTurno();
                    turnoCerrado = true;
                    System.out.println("\n Turno cerrado. Total recaudado: $" + total);
                    break;
                    
                case 6:
                    System.out.println("\n ESTADÍSTICAS ACTUALES:");
                
                    System.out.println("    Vehículos en cola: " + String.format("%3d", colaPeaje.getTamaño()) + "              ║");
                    System.out.println("    Turno cerrado:     " + (turnoCerrado ? "Sí" : "No"));
                    
                    break;
                    
                case 7:
                    System.out.println("\n Saliendo del sistema...");
                    if (!turnoCerrado && !colaPeaje.estaVacia()) {
                        System.out.println(" ADVERTENCIA: Hay " + colaPeaje.getTamaño() + 
                                         " vehículos sin procesar. Use 'Cerrar Turno' antes de salir.");
                    }
                    System.out.println("\n ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("\n Opción inválida. Intente nuevamente.");
                    break;
            }
            
        } while (opcion != 7);
        
        scanner.close();
    }
}