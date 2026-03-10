import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números:");

        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int[] seleccion = numeros.clone();
        int[] insercion = numeros.clone();

        int intercambios = 0;
        int movimientos = 0;

        
        for (int i = 0; i < seleccion.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < seleccion.length; j++) {
                if (seleccion[j] < seleccion[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = seleccion[i];
                seleccion[i] = seleccion[min];
                seleccion[min] = temp;
                intercambios++;
            }
        }

       
        for (int i = 1; i < insercion.length; i++) {

            int actual = insercion[i];
            int j = i - 1;

            while (j >= 0 && insercion[j] > actual) {
                insercion[j + 1] = insercion[j];
                j--;
                movimientos++;
            }

            insercion[j + 1] = actual;
        }

        
        System.out.println("\nIntercambios (Selección): " + intercambios);
        System.out.println("Movimientos (Inserción): " + movimientos);

        if (intercambios < movimientos) {
            System.out.println("Selección fue más eficiente.");
        } else if (movimientos < intercambios) {
            System.out.println("Inserción fue más eficiente.");
        } else {
            System.out.println("Ambos tuvieron la misma eficiencia.");
        }

        sc.close();
    }
}