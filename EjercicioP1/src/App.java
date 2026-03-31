//objetivo: Organizar puntaje de atletas y buscar marcas
//pide 6 puntajes (int) y guardalos en un arreglo 
//Ordenamiento usa burbuja (buble sort) para ordenar de mayor a menor
//pide un puntaje y buscalo con busqueda lineal
//calculo:Muestra la diferencia entre el puntaje mas alto y el mas bajo.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int puntaje[] = new int[6];

        
        for (int i = 0; i < puntaje.length; i++) {
            System.out.println("Ingrese el puntaje del atleta " + (i + 1));
            puntaje[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < puntaje.length - 1; i++) {
            for (int j = 0; j < puntaje.length - 1 - i; j++) {
                if (puntaje[j] < puntaje[j + 1]) {
                    int aux = puntaje[j];
                    puntaje[j] = puntaje[j + 1];
                    puntaje[j + 1] = aux;
                }
            }
        }

        
        System.out.println("\nTabla de posiciones (Ordenada de mayor a menor):");
        for (int p : puntaje) {
            System.out.print(p + " ");
        }

        
        System.out.print("\n\nIngrese el puntaje que desea buscar: ");
        int buscar = scanner.nextInt();
        int posicionEncontrada = -1;

        for (int i = 0; i < puntaje.length; i++) {
            if (puntaje[i] == buscar) {
                posicionEncontrada = i + 1;
                break;
            }
        }

        if (posicionEncontrada != -1) {
            System.out.println("El puntaje " + buscar + " está en la posición: " + posicionEncontrada);
        } else {
            System.out.println("El puntaje no se encuentra.");
        }

       
        int diferencia = puntaje[0] - puntaje[puntaje.length - 1];
        System.out.println("La diferencia entre el mayor y el menor puntaje es: " + diferencia);

        scanner.close();
    }
}