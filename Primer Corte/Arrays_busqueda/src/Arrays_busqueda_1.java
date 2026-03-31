// Tema 1 — Arreglos Unidimensionales (Vectores)
// Ejercicio 1 — Registro de Temperaturas
// Un sistema meteorológico guarda las temperaturas de los últimos 7 días.

// Declara un arreglo de double para 7 días.
// Asigna valores manualmente.
// Imprime cada temperatura con su respectivo día (Día 1, Día 2, etc.).

import java.util.Scanner;

public class Arrays_busqueda_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperaturas = new double[7];
        
        System.out.println("=== REGISTRO DE TEMPERATURAS SEMANAL ===");
        System.out.println("Ingresa las temperaturas de los 7 días:\n");
        
        // Asignación con validación simple
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Temperatura del día " + (i + 1) + ": ");
            
            // Validar que sea un número válido
            while (!scanner.hasNextDouble()) {
                System.out.println("❌ Error: Ingresa un número válido");
                System.out.print("Temperatura del día " + (i + 1) + ": ");
                scanner.next(); // Limpiar el buffer
            }
            
            temperaturas[i] = scanner.nextDouble();
        }
        
        // Mostrar resultados
        System.out.println("\n📋 TEMPERATURAS REGISTRADAS:");
        System.out.println("==============================");
        
        double suma = 0;
        double max = temperaturas[0];
        double min = temperaturas[0];
        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Día %d: %.1f °C%n", (i + 1), temperaturas[i]);
            
            // Calcular estadísticas
            suma += temperaturas[i];
            if (temperaturas[i] > max) max = temperaturas[i];
            if (temperaturas[i] < min) min = temperaturas[i];
        }
        
        // Mostrar estadísticas
        System.out.println("==============================");
        System.out.printf("📊 Temperatura promedio: %.1f °C%n", suma / temperaturas.length);
        System.out.printf("🔥 Temperatura máxima: %.1f °C%n", max);
        System.out.printf("❄️ Temperatura mínima: %.1f °C%n", min);
        
        scanner.close();
    }
}