// Ejercicio 2 — Conversor de temperatura
// Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

// Fórmulas:

// F = (C × 9/5) + 32
// K = C + 273.15
// Dato de entrada: double temperatura en Celsius

// Salida esperada:



import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = celsius + 273.15;
        
        
        System.out.println("\n===== CONVERSIÓN DE TEMPERATURA =====");
        System.out.printf("Celsius    : %.2f °C%n", celsius);
        System.out.printf("Fahrenheit : %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin     : %.2f K%n", kelvin);
        
        scanner.close();
    }
}
