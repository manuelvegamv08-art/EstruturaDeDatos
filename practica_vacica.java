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
