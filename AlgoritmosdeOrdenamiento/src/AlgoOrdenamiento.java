// 2.Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el
//  estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN
//  (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, 
// el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya
//  están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va 
// quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver 
// cómo los elementos se desplazan para abrir espacio al nuevo valor.

import java.util.Scanner;
public class AlgoOrdenamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de libros: ");
        int cantidadLibros = scanner.nextInt();
        System.out.println("Ingrese los códigos ISBN de los libros:");
        int[] codigosISBN = new int[cantidadLibros];
        for (int i = 0; i < cantidadLibros; i++) {
            codigosISBN[i] = scanner.nextInt();
        }   
        // Insertion Sort
        for (int i = 1; i < codigosISBN.length; i++) {
            int key = codigosISBN[i];
            int j = i - 1;
            while (j >= 0 && codigosISBN[j] > key) {
                codigosISBN[j + 1] = codigosISBN[j];
                j--;
            }
            codigosISBN[j + 1] = key;
            // Visualización paso a paso
            System.out.print("Paso " + i + ": ");
            for (int k = 0; k < codigosISBN.length; k++) {
                System.out.print(codigosISBN[k] + " ");
            }
            System.out.println();
        }
        System.out.println("Libros ordenados por código ISBN:");
        for (int codigo : codigosISBN) {
            System.out.print(codigo + " ");
        }
        scanner.close();

    }

}
