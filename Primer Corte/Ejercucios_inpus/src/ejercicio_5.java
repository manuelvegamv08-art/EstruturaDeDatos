// Ejercicio 5 — Calculadora de IMC
// Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.

// Fórmula: IMC = peso / (altura × altura)

// Clasificación:

// IMC < 18.5 → Bajo peso
// 18.5 ≤ IMC < 25 → Normal
// 25 ≤ IMC < 30 → Sobrepeso
// IMC ≥ 30 → Obesidad
// Datos de entrada: String nombre, double peso, double altura

import java.util.Scanner;
public class ejercicio_5{

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String clasificacion;
        if (imc < 18.5) {
            clasificacion = "Bajo peso";
        } else if (imc < 25) {
            clasificacion = "Normal";
        } else if (imc < 30) {
            clasificacion = "Sobrepeso";
        } else {
            clasificacion = "Obesidad";
        }

        System.out.println("\n===== RESULTADOS DE IMC =====");
        System.out.printf("Nombre       : %s%n", nombre);
        System.out.printf("Peso (kg)    : %.2f%n", peso);
        System.out.printf("Altura (m)   : %.2f%n", altura);
        System.out.printf("IMC          : %.2f%n", imc);
        System.out.printf("Clasificación: %s%n", clasificacion);

        scanner.close();

    }
}