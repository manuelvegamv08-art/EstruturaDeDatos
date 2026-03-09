// Analicis de transacion 
// un banco registra transacciones. tiene una lista de clientes vip ordenada (ej: 10, 25, 40, 80,150)

// Entrada de datos: El usuario debe ingresar los montos y los numeros de cuenta
// de las ultimas 5 transacciones del cajero automatica

// El Reto: Busca linealmente cualquier transacion cuyo monto supere los $5,000

// Para cada cuenta que supere ese monto, verifique con busqueda binaria si pertenece a las cuentasvip.
// Si no es vip imprimir : "Alerta de fraude :"Cuenta no autorisada para monto alto
// ¿por que para ambos? las ventas ocurren en desorden. pero la verificacion de estado vip es una consulta de 
// vase de datos indexada


import java.util.Scanner;

public class Reto_2 {

    
    public static boolean busquedaBinaria(int[] arreglo, int objetivo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;

            if (arreglo[medio] == objetivo) {
                return true;
            } else if (arreglo[medio] < objetivo) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] clientesVip = {10, 25, 40, 80, 150};

        int[] cuentas = new int[5];
        double[] montos = new double[5];

        System.out.println("Ingrese los datos de las ultimas 5 transacciones:");

        // Entrada de datos
        for (int i = 0; i < 5; i++) {
            System.out.println("\nTransaccion #" + (i + 1));

            System.out.print("Numero de cuenta: ");
            cuentas[i] = scanner.nextInt();

            System.out.print("Monto: ");
            montos[i] = scanner.nextDouble();
        }

        System.out.println("\n=== Analisis de Transacciones ===");

       
        for (int i = 0; i < 5; i++) {

            if (montos[i] > 5000) {

                System.out.println("\nTransaccion alta detectada:");
                System.out.println("Cuenta: " + cuentas[i]);
                System.out.println("Monto: $" + montos[i]);

                
                boolean esVip = busquedaBinaria(clientesVip, cuentas[i]);

                if (!esVip) {
                    System.out.println("Alerta de fraude: Cuenta no autorizada para monto alto");
                } else {
                    System.out.println("Cuenta VIP verificada. Transaccion permitida.");
                }
            }
        }

        scanner.close();
    }
}