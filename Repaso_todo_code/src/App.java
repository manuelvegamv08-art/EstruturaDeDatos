public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int numero1, numero2, cambio;

        numero1 = 20;
        numero2 = 35;
        System.out.println(numero1);
        System.out.println(numero2);
        cambio = numero1;
        numero1 = numero2;
        numero2 = cambio;

        System.out.println(numero1);
        System.out.println(numero2);

    }
}
