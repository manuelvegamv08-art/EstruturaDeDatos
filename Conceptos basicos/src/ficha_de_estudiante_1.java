// import java.util.Scanner;

// public class ficha_de_estudiante_1 {
//     public static void main(String[] args) throws Exception {
//         Scanner scanner = new Scanner(System.in);
//         boolean matricula = false;
//         double acumulado = 0;

//         System.out.println("¿el estudiante esta matriculado? (si o no)");
//         String respuesta = scanner.nextLine();

//         if (respuesta == "si") {
//             System.out.println("ingrese el nombre del estudiante");
//             String nombre = scanner.nextLine();
//             System.out.println("ingrese el codigo");
//             int codigo = scanner.nextInt();
//             System.out.println("¿en que semestre se encuentra ?");
//             int semestre = scanner.nextInt();
//             matricula = true;

//             for (int i = 1; i <= 3; i++) {
//                 System.out.println("ingres la nota del " + i + " corte ");
//                 double nota = scanner.nextDouble();
//                 acumulado += nota;
//                 // System.out.println("el "+ i +"corte,la nota es de "+ nota);
//                 // System.out.println("acumulado es de " + acumulado );
//             }
//             double totalPromedi = acumulado / 3;

//             System.out.println("====dicha de estudiante===");
//             System.out.println("Nombre: " + nombre);
//             System.out.println("codigo: " + codigo);
//             System.out.println("semestre: " + semestre);
//             System.out.println("promedio: " + totalPromedi);
//             System.out.println("matricula: " + matricula);

//         }

//         else {
//             System.out.println("usted no se encuentra hiscrito ");
//         }
//         //Close.scanner();
//     }
// }
