// Ejercicio 4 — Perfil de usuario
// Pide al usuario los datos de su perfil: nombre, edad, ciudad,
//  correo y si acepta términos y condiciones. Muestra un resumen indicando el tipo 
//  de dato que se usó para cada campo.

// Datos de entrada: String, int, String, String, boolean

// Salida esperada:

// ========= Perfil creado =========
// Nombre  (String)  : Ana Pérez
// Edad    (int)     : 22
// Ciudad  (String)  : Bogotá
// Correo  (String)  : ana@mail.com
// T&C     (boolean) : true

import java.util.Scanner;

public class ejercicio_4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Ingrese su correo: ");
        String correo = scanner.nextLine();

        System.out.print("¿Acepta términos y condiciones? (true/false): ");
        boolean acepta = scanner.nextBoolean();

        System.out.println("\n========= Perfil creado =========");
        System.out.printf("Nombre  (String)  : %s%n", nombre);
        System.out.printf("Edad    (int)     : %d%n", edad);
        System.out.printf("Ciudad  (String)  : %s%n", ciudad);
        System.out.printf("Correo  (String)  : %s%n", correo);
        System.out.printf("T&C     (boolean) : %b%n", acepta);

        scanner.close();
    }
}