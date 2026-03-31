// Tema 1 — Variables y tipos de datos
// Ejercicio 1 — Ficha de un estudiante
// Un sistema universitario necesita registrar la información básica de un 
// estudiante: nombre completo, código (número entero), semestre actual, promedio 
// acumulado y si está matriculado o no.

// Declara las variables con los tipos de datos apropiados.
// Asigna valores de ejemplo.
// Imprime un reporte por consola con el siguiente formato:
// === Ficha del Estudiante ===
// Nombre: Ana Torres
// Código: 20241001
// Semestre: 3
// Promedio: 3.85
// Matriculado: true



public class practica_vacica {
    public static void main(String[] args) {
      String nombre = "manuel";
      int codigo = 12345;
      int semestre = 5;
      double promedio = 3.8;
      boolean matriculado = true;

        while (true) {
            System.out.println("Ingrese la ficha del estudiante (o 'salir' para terminar):");
            System.out.println("========================================================");
            System.out.println("nombre: " + nombre);
            System.out.println("codigo: " + codigo);
            System.out.println("semestre: " + semestre);
            System.out.println("promedio: " + promedio);
            System.out.println("matriculado: " + matriculado);
            System.out.println("========================================================");
            break; // Salir del bucle después de mostrar la ficha una vez
        }
        
    }
}
