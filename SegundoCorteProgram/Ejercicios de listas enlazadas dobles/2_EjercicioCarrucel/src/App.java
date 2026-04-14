
import java.util.Scanner;
public class App {

    

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Galeria galeria = new Galeria();

        int opcion;

        do {
            System.out.println("\n===== CARRUSEL DE IMAGENES =====");
            System.out.println("1. Agregar fotografia");
            System.out.println("2. Siguiente foto");
            System.out.println("3. Foto anterior");
            System.out.println("4. Reproducir galería");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre del archivo: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Tamaño (MB): ");
                    double tamano = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.print("Resolución: ");
                    String resolucion = teclado.nextLine();

                    galeria.agregarFoto(nombre, tamano, resolucion);
                    System.out.println("Foto agregada correctamente.");
                    break;

                case 2:
                    galeria.siguienteFoto();
                    break;

                case 3:
                    galeria.fotoAnterior();
                    break;

                case 4:
                    galeria.reproducirGaleria();
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        teclado.close();
    }
}

