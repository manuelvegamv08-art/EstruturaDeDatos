import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        System.out.println("===== Sistema de Inventario =====");
        try {
            
            while (true) {
                int opcion;
                
                //ingrese las opciones a escojer del menu
                System.out.println("1. Agregar producto");
                System.out.println("2. Mostrar productos proximos a vencer");
                System.out.println("3. Salir");
                System.out.println("seleccione una opcion: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); //limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();

                        System.out.println("Ingrese la cantidad del producto: ");
                        int cantidad = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Ingrese los dias para vencer del producto: ");
                        int diasParaVencer = scanner.nextInt();
                        lista.insertar(nombre, cantidad, diasParaVencer);
                        break;
                    case 2:
                        System.out.println("Productos proximos a vencer: ");
                        lista.imprimirProximosAVencer();
                        
                        break;
                    case 3:
                        System.out.println("Saliendo del sistema...");
                        return;  
                
                    default:
                        System.out.println("Opcion no valida, por favor intente de nuevo. ");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
            scanner.nextLine();
            scanner.close();
        }
       
        
    }
}
