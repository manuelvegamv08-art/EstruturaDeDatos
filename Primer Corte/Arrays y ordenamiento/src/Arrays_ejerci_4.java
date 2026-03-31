// 4. Control de Acceso (Gimnasio)
// Un gimnasio tiene una lista de códigos de acceso
// de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si el código
// está en la lista de "pagos al día". Si no está, se le niega la entrada.
// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.



import java.util.Scanner;
public class Arrays_ejerci_4 {

    public static void main(String[] args) {
        int [] codigosAccesor = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su código de acceso: ");
        int codigoSocio = scanner.nextInt();

        int inicio = 0;
        int fin = codigosAccesor.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            
            if (codigosAccesor[medio] == codigoSocio) {
                System.out.println("Acceso permitido. Bienvenido al gimnasio.");
                encontrado = true;
                break;
            } else if (codigosAccesor[medio] < codigoSocio) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (!encontrado) {
            System.out.println("Acceso denegado. Código no válido.");
        }
        
        scanner.close();
    }
}