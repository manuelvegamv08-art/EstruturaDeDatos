import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Competencia de Atletismo");
        Scanner scanner = new Scanner(System.in);

        // creamos un arrays para almacenar los datos
        int puntajes [] = new int [5];

        for(int i = 0; i < puntajes.length; i++){
            System.out.println("Ingrese el puntaje del atleta " + (i+1) + ": ");
            puntajes[i] = scanner.nextInt();

        }

        for (int i = 0; i < puntajes.length; i++){
            int clave = puntajes[i];
            int j = i - 1;

            while (j>= 0 && puntajes[j]< clave) {
                puntajes [j+1]= puntajes[j];
                j--;

            }
            puntajes[j+1]=clave;

        }

                // Mostrar tabla ordenada
        System.out.println("\nTabla de posiciones (Ordenada de mayor a menor):");
        for (int p : puntajes) {
            System.out.print(p + " ");
        }


        // --- BÚSQUEDA LINEAL ---
        System.out.print("\n\nIngrese el puntaje que desea buscar: ");
        int buscar = scanner.nextInt();
        int posicionEncontrada = -1;

        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == buscar) {
                posicionEncontrada = i + 1; // Sumamos 1 para que sea "Puesto 1", "Puesto 2", etc.
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.println("El puntaje " + buscar + " se encuentra en la posición (lugar): " + posicionEncontrada);
        } else {
            System.out.println("El puntaje no se encuentra en la tabla.");
        }

        scanner.close();

    }
}
