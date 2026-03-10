// 1.Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar
// quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). 
// Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido)
// en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
// adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar),
// Plata (2do lugar) y 
// Bronce (3er lugar).

import java.util.Scanner;

public class El_Podio_de_la_Competencia {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numCorredores;

        System.out.print("Ingrese el número de corredores (entre 5 y 10): ");
        numCorredores = scanner.nextInt();

        while (numCorredores < 5 || numCorredores > 10) {
            System.out.print("Número inválido. Ingrese un número entre 5 y 10: ");
            numCorredores = scanner.nextInt();
        }

        double[] tiempos = new double[numCorredores];
        int[] corredores = new int[numCorredores]; // guarda número del corredor

        // Inicializar números de corredor
        for (int i = 0; i < numCorredores; i++) {
            corredores[i] = i + 1;
        }

        // Ingreso de tiempos con validación
        for (int i = 0; i < numCorredores; i++) {

            while (true) {

                try {
                    System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " en segundos: ");
                    tiempos[i] = scanner.nextDouble();
                    break;

                } catch (Exception e) {
                    System.out.println("Error: Debe ingresar un número válido.");
                    scanner.next(); // limpiar entrada incorrecta
                }

            }
        }

        // SELECTION SORT
        for (int i = 0; i < tiempos.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < tiempos.length; j++) {

                if (tiempos[j] < tiempos[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercambiar tiempos
            double tempTiempo = tiempos[i];
            tiempos[i] = tiempos[minIndex];
            tiempos[minIndex] = tempTiempo;

            // Intercambiar corredores
            int tempCorredor = corredores[i];
            corredores[i] = corredores[minIndex];
            corredores[minIndex] = tempCorredor;
        }

        // Mostrar resultados
        System.out.println("\nTiempos ordenados (de menor a mayor):");

        for (int i = 0; i < tiempos.length; i++) {
            System.out.printf("Posición %d - Corredor %d : %.2f segundos\n",
                    i + 1, corredores[i], tiempos[i]);
        }

        // Podio
        System.out.println("\nPodio de la competencia:");
        System.out.printf(" Oro: Corredor %d con %.2f segundos\n", corredores[0], tiempos[0]);
        System.out.printf(" Plata: Corredor %d con %.2f segundos\n", corredores[1], tiempos[1]);
        System.out.printf(" Bronce: Corredor %d con %.2f segundos\n", corredores[2], tiempos[2]);

        scanner.close();
    }
}