import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ColaUrgencias salaEspera = new ColaUrgencias();
        Scanner teclado = new Scanner(System.in);

        
        salaEspera.registrarPaciente(new Paciente("102030", "Juan Pinto", 45, "Dolor abdominal agudo"));
        salaEspera.registrarPaciente(new Paciente("405060", "María Consuegra", 72, "Dificultad respiratoria"));
        salaEspera.registrarPaciente(new Paciente("708090", "Pedro Infante", 19, "Fractura de muñeca"));
        salaEspera.registrarPaciente(new Paciente("112233", "Lucía Gómez", 34, "Fiebre alta y escalofríos"));

        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE TRIAJE - URGENCIAS ---");
            System.out.println("1. Registrar nuevo paciente");
            System.out.println("2. Finalizar turno y ATENDER A TODOS (Generar Reporte)");
            System.out.println("3. Salir de la aplicación");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRO DE PACIENTE ---");
                    System.out.print("Cédula: ");
                    String cedula = teclado.nextLine();
                    System.out.print("Nombre Completo: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Edad: ");
                    int edad = Integer.parseInt(teclado.nextLine());
                    System.out.print("Síntoma Principal: ");
                    String sintoma = teclado.nextLine();

                    salaEspera.registrarPaciente(new Paciente(cedula, nombre, edad, sintoma));
                    System.out.println("[Éxito] Paciente ingresado a la fila.");
                    break;

                case 2:
                    salaEspera.atenderTodos();
                    break;

                case 3:
                    System.out.println("\nSaliendo de la aplicación médica...");
                    break;

                default:
                    System.out.println("\n[Error] Opción inválida.");
                    break;
            }

        } while (opcion != 3);

        teclado.close();
    }
}