import java.util.Scanner;

public class ejercicio3 {

    public static class Estudiante {
        String nombre;
        double nota;

        public Estudiante(String nombre, double nota){
            this.nombre = nombre;
            this.nota = nota;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Requisito: 5 notas
        int cantidad = 5; 
        Estudiante listaEstudiante [] = new Estudiante[cantidad];

        // ENTRADA DE DATOS
        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese el nombre del estudiante " + (i+1) + ":");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese la nota de " + nombre + ":");
            double nota = scanner.nextDouble();
            scanner.nextLine(); 

            listaEstudiante[i] = new Estudiante(nombre, nota);
        }

        // 2. ESTADÍSTICAS (Encontrar extremos)
        double notaAlta = listaEstudiante[0].nota;
        double notaBaja = listaEstudiante[0].nota;

        for (int i = 1; i < listaEstudiante.length; i++) {
            if (listaEstudiante[i].nota > notaAlta) notaAlta = listaEstudiante[i].nota;
            if (listaEstudiante[i].nota < notaBaja) notaBaja = listaEstudiante[i].nota;
        }

        // 3. ORDENAMIENTO: SELECCIÓN (Menor a Mayor)
        for (int i = 0; i < listaEstudiante.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < listaEstudiante.length; j++) {
                // Buscamos la nota más pequeña
                if (listaEstudiante[j].nota < listaEstudiante[indiceMinimo].nota) {
                    indiceMinimo = j;
                }
            }
            // Intercambio de objetos completos
            Estudiante temp = listaEstudiante[indiceMinimo];
            listaEstudiante[indiceMinimo] = listaEstudiante[i];
            listaEstudiante[i] = temp;
        }

        // SALIDA DE RESULTADOS
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Nota más alta: " + notaAlta);
        System.out.println("Nota más baja: " + notaBaja);

        System.out.println("\n--- Lista Ordenada (Menor a Mayor) ---");
        for (Estudiante est: listaEstudiante){
            System.out.println("Estudiante: " + est.nombre + " | Nota: " + est.nota);
        }
        
        scanner.close();        
    }
}