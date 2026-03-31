// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y
// requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar
//  sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y 
// aplicar el método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que
//  si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

import java.util.Scanner;
public class Ejercicio_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        String[] nombres = new String[cantidadEstudiantes];
        System.out.println("Ingrese los nombres de los estudiantes:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            nombres[i] = scanner.nextLine();
        }

        // Insertion Sort para Strings
        for (int i = 0; i < nombres.length; i++) {
            String key = nombres[i];
            int j = i - 1;
            while (j >= 0 && nombres[j].compareToIgnoreCase(key) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = key;
        }

        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }    
        scanner.close();
    }
}
