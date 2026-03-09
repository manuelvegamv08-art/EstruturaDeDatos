// Tema 1 — Arreglos Unidimensionales (Vectores)
// Ejercicio 1 — Registro de Temperaturas
// Un sistema meteorológico guarda las temperaturas de los últimos 7 días.

// Declara un arreglo de double para 7 días.
// Asigna valores manualmente.
// Imprime cada temperatura con su respectivo día (Día 1, Día 2, etc.).

import java.util.Scanner;
public class Arrays_busqueda_1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double [] temperaturas = new double [7];
        
        temperaturas[0] = 23.5;
        temperaturas[1] = 25.0;
        temperaturas[2] = 22.8;  
        temperaturas[3] = 24.2;
        temperaturas[4] = 21.7;
        temperaturas[5] = 26.3;
        temperaturas[6] = 20.9;
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas[i] + " °C");
        }     

    }
}