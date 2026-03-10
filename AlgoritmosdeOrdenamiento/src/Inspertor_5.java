// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más
//  "pesado" en términos de operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados.
// El programa aplicará AMBOS métodos al mismo conjunto de datos 
// (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda
// dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos 
// movimientos hizo Inserción. El estudiante debe concluir cuál 
// fue más eficiente para esos datos ingresados por el teclado.


import java.util.Scanner;
public class Inspertor_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese 6 números enteros desordenados:\n");
        
        int [] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

        }
        // Copia del arreglo original para ambos métodos
        int[] numerosSeleccion = numeros.clone();
        int[] numerosinsertados = numeros.clone();   
        // Contadores
        int intercambiosSeleccion = 0;
        int movimientosInsercion = 0;   
       
        // SELECTION SORT
        for (int i = 0; i < numerosSeleccion.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numerosSeleccion.length; j++) {
                if (numerosSeleccion[j] < numerosSeleccion[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                // Intercambio
                int temp = numerosSeleccion[i];
                numerosSeleccion[i] = numerosSeleccion[minIndex];
                numerosSeleccion[minIndex] = temp;
                intercambiosSeleccion++;
            }
        }
        // INSERTION SORT
        for (int i = 1; i < numerosinsertados.length; i++) {
            int key = numerosinsertados[i];
            int j = i - 1;
            while (j >= 0 && numerosinsertados[j] > key) {
                numerosinsertados[j + 1] = numerosinsertados[j];
                j--;
                movimientosInsercion++;
            }
            numerosinsertados[j + 1] = key;
        }
        // Resultados
        System.out.println("\nResultados:");
        System.out.println("Selección hizo " + intercambiosSeleccion + " intercambios.");
        System.out.println("Inserción hizo " + movimientosInsercion + " movimientos.");
        if (intercambiosSeleccion < movimientosInsercion) {
            System.out.println("Selección fue más eficiente para estos datos.");
        } else if (movimientosInsercion < intercambiosSeleccion) {
            System.out.println("Inserción fue más eficiente para estos datos.");
        } else {
            System.out.println("Ambos métodos tuvieron la misma eficiencia para estos datos.");
        }
        scanner.close();
    }        
}
