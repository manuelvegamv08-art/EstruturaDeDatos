import java.util.Scanner;
public class App {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Navegador nav = new Navegador();

        int opcion;

        do {
            System.out.println("\n===== NAVEGADOR WEB =====");
            System.out.println("1. Abrir nueva pestaña");
            System.out.println("2. Mostrar pestañas abiertas");
            System.out.println("3. Cerrar pestaña por URL");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) {

                case 1:
                    System.out.print("Título de la página: ");
                    String titulo = teclado.nextLine();

                    System.out.print("URL: ");
                    String url = teclado.nextLine();

                    System.out.print("Hora de apertura: ");
                    String hora = teclado.nextLine();

                    nav.abrirPestana(titulo, url, hora);
                    System.out.println(" Pestaña abierta correctamente.");
                    break;

                case 2:
                    System.out.println("\nPestañas abiertas:");
                    nav.mostrarPestanas();
                    break;

                case 3:
                    System.out.print("Ingrese la URL a cerrar: ");
                    String urlCerrar = teclado.nextLine();

                    nav.cerrarPestanaActual(urlCerrar);
                    break;

                case 4:
                    System.out.println("Saliendo del navegador...");
                    break;

                default:
                    System.out.println(" Opción inválida.");
            }

        } while (opcion != 4);

        teclado.close();
    }
}

