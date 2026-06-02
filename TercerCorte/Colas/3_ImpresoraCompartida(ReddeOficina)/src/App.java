
import java.util.Scanner;

public class App {
    
    
    private static void cargarDatosIniciales(ColaImpresion cola) {
        System.out.println(" CARGANDO DOCUMENTOS PREGUARDADOS...\n");
        
        Documento doc1 = new Documento("plano_planta_baja.pdf", "Juan", 15, true);
        Documento doc2 = new Documento("fachada_norte.pdf", "María", 8, false);
        Documento doc3 = new Documento("detalles_estructurales.pdf", "Pedro", 25, true);
        Documento doc4 = new Documento("cortes_y_elevaciones.pdf", "Ana", 12, false);
        Documento doc5 = new Documento("presupuesto_obra.xlsx", "Carlos", 3, false);
        
        cola.encolar(doc1);
        cola.encolar(doc2);
        cola.encolar(doc3);
        cola.encolar(doc4);
        cola.encolar(doc5);
        
        System.out.println(cola.getTamaño() + " documentos cargados automáticamente\n");
    }
    
    
    private static void mostrarMenu() {
        System.out.println("         SISTEMA DE IMPRESIÓN");
        System.out.println("═══════════════════════════════════════");
        System.out.println("1.  Encolar nuevo documento");
        System.out.println("2.  Desencolar (imprimir siguiente)");
        System.out.println("3.  Calcular páginas totales pendientes");
        System.out.println("4.  Ver frente de la cola");
        System.out.println("5.  Mostrar toda la cola");
        System.out.println("6.  Ver estadísticas de la cola");
        System.out.println("7.  Salir");
        
        System.out.print(" Seleccione una opción: ");
    }
    
    
    private static Documento crearDocumento(Scanner scanner) {
        System.out.println("\n INGRESE LOS DATOS DEL DOCUMENTO:");
        
        System.out.print("   Nombre del archivo: ");
        String nombre = scanner.nextLine();
        
        System.out.print("   Nombre del usuario: ");
        String usuario = scanner.nextLine();
        
        System.out.print("   Número de páginas: ");
        int paginas = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("  ¿Es a color? (true/false): ");
        boolean esColor = scanner.nextBoolean();
        scanner.nextLine(); 
        
        return new Documento(nombre, usuario, paginas, esColor);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColaImpresion colaImpresion = new ColaImpresion();
        
        System.out.println("===  OFICINA DE ARQUITECTURA ===\n");
        
        
        cargarDatosIniciales(colaImpresion);
        
        
        colaImpresion.mostrarCola();
        
        int opcion;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("\n NUEVO DOCUMENTO A ENCOLAR:");
                    Documento nuevoDoc = crearDocumento(scanner);
                    colaImpresion.encolar(nuevoDoc);
                    break;
                    
                case 2:
                    
                    System.out.println("\n PROCESANDO IMPRESIÓN:");
                    Documento impreso = colaImpresion.desencolar();
                    if (impreso != null) {
                        System.out.println("    Documento enviado a impresora");
                        System.out.println("    Páginas impresas: " + impreso.getNumeroPaginas());
                        System.out.println("    Color: " + (impreso.isEsColor() ? "Sí" : "No"));
                    }
                    break;
                    
                case 3:
                    
                    System.out.println("\n CÁLCULO DE PÁGINAS PENDIENTES:");
                    int totalPaginas = colaImpresion.calcularPaginasTotales();
                
                    System.out.println("       TOTAL DE PÁGINAS: " + String.format("%4d", totalPaginas));
                    
                    
                    System.out.println("\n    Verificación: La cola NO se ha modificado");
                    System.out.println("    Documentos en espera: " + colaImpresion.getTamaño());
                    break;
                    
                case 4:
                    
                    System.out.println("\n FRENTE DE LA COLA:");
                    Documento frente = colaImpresion.verFrente();
                    if (frente != null) {
                        System.out.println("   Siguiente en imprimir: " + frente);
                        System.out.println("   Páginas: " + frente.getNumeroPaginas());
                    }
                    break;
                    
                case 5:
                    
                    colaImpresion.mostrarCola();
                    break;
                    
                case 6:
                    
                    System.out.println("\n ESTADÍSTICAS DE LA COLA:");
                    
                    System.out.println("    Documentos en cola: " + String.format("%3d", colaImpresion.getTamaño()) + "               ║");
                    System.out.println("    Total páginas:      " + String.format("%3d", colaImpresion.calcularPaginasTotales()) + "               ║");
                    System.out.println("    ¿Cola vacía?        " + (colaImpresion.estaVacia() ? "Sí" : "No") + "               ║");
                
                    break;
                    
                case 7:
                    System.out.println("\n Saliendo del sistema...");
                    System.out.println(" Resumen final:");
                    System.out.println("    Documentos no impresos: " + colaImpresion.getTamaño());
                    System.out.println("    Páginas pendientes: " + colaImpresion.calcularPaginasTotales());
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