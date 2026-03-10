// 3. El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

// Contexto: Una empresa de logística maneja paquetes
// con diferentes pesos y necesita ordenarlos de forma más eficiente que el método
// de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el
// peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de N/2
// . El estudiante debe explicar en comentarios por qué este método es generalmente más rápido
// que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de
// aplicar todas las fases de reducción de saltos.

import java.util.Scanner;
public class El_salto_De_shell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de paquetes: ");
        int cantidadPaquetes = scanner.nextInt();

        System .out.println("Ingrese el peso de cada paquete:");
        
        double[] pesos = new double[cantidadPaquetes];

        for (int i = 0; i< cantidadPaquetes; i++) {
            double Peso = scanner.nextDouble();
             while (Peso <= 0) {
                System.out.print("Peso inválido. Ingrese un peso positivo para el paquete " + (i + 1) + ": ");
                Peso = scanner.nextDouble();
            }
             pesos[i] = Peso;
        }
        // Mostrar arreglo original
        System.out.println("Pesos originales:");
        for (double peso : pesos) {
            System.out.print(peso + " ");
        }
        System.out.println();
        // Shell Sort
        for (int gap = cantidadPaquetes / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < cantidadPaquetes; i++) {
                double temp = pesos[i];
                int j;
                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {
                    pesos[j] = pesos[j - gap];
                }
                pesos[j] = temp;
            }
        }
        // Mostrar arreglo ordenado
        System.out.println("Pesos ordenados:");
        for (double peso : pesos) {
            System.out.print(peso + " ");
        }
        System.out.println();
        scanner.close();
    }
}
// Shell Sort mejora el algoritmo de inserción permitiendo comparar elementos
// que están lejos entre sí usando saltos (gap).
// Esto ayuda a mover rápidamente los valores muy desordenados hacia posiciones
// más cercanas a su lugar correcto.
//
// Cuando el gap se reduce gradualmente, el arreglo ya está casi ordenado,
// por lo que la inserción final es mucho más rápida.
//
// Por eso Shell Sort suele ser más eficiente que la inserción simple
// cuando los elementos están muy lejos de su posición final.