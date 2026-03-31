import java.util.Scanner;
public class App{

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[5];

        System.out.println("El cajero del supermercado");
        
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        double total = 0;
        for (double precio : precios) {
            total += precio;
        }
        System.out.println("El total de la compra es: " + total);
        if (total > 20000) {
            System.out.println("¡Felicidades! Has ganado un descuento del 10%.");
            total *= 0.9; // Aplica el descuento del 10%
        }
        System.out.println("El total a pagar es: " + total);
        scanner.close();
    }
}
