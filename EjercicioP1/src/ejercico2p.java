//control de pacientes con poo y busqueda por historial
// clase mascota con historial (int), nombre (String) y edad(int)
//entrada:pide datos de 5 mascotas y guardalas en mascota[]
//Ordenamiento: usa seleccion(selecion sort) para ordenar por historial (acendente)
//busqueda:pide un historial y buscalo con busqueda binaria. muestra nombre
//Estadistica:calcula el promedio de edad de todas las mascota
import java.util.Scanner;

public class ejercico2p {

    
    public static class Mascota {
        int historial;
        String nombre;
        int edad;

        public Mascota(int historial, String nombre, int edad) {
            this.historial = historial;
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        Mascota mascotas[] = new Mascota[5];

        
        for (int i = 0; i < mascotas.length; i++) {

            System.out.println("\nMascota " + (i + 1));

            System.out.print("Ingrese historial: ");
            int historial = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();

            mascotas[i] = new Mascota(historial, nombre, edad);
        }

        
        for (int i = 0; i < mascotas.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < mascotas.length; j++) {
                if (mascotas[j].historial < mascotas[min].historial) {
                    min = j;
                }
            }

            Mascota aux = mascotas[i];
            mascotas[i] = mascotas[min];
            mascotas[min] = aux;
        }

        
        System.out.println("\nMascotas ordenadas por historial:");
        for (Mascota m : mascotas) {
            System.out.println(m.historial + " - " + m.nombre + " - " + m.edad);
        }

        
        System.out.print("\nIngrese historial a buscar: ");
        int buscar = scanner.nextInt();

        int inicio = 0;
        int fin = mascotas.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (mascotas[medio].historial == buscar) {
                System.out.println("Mascota encontrada: " + mascotas[medio].nombre);
                encontrado = true;
                break;
            } 
            else if (buscar < mascotas[medio].historial) {
                fin = medio - 1;
            } 
            else {
                inicio = medio + 1;
            }
        }

        if (!encontrado) {
            System.out.println("No existe mascota con ese historial.");
        }

        int suma = 0;
        for (Mascota m : mascotas) {
            suma += m.edad;
        }

        double promedio = (double) suma / mascotas.length;
        System.out.println("Promedio de edad: " + promedio);

        scanner.close();
    }
}
