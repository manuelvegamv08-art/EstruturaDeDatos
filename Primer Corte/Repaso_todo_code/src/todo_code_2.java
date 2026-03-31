import java.util.Scanner;


public class todo_code_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String catalogo [] = new String[nombre];
        int opcion = scanner.nextInt();
        

        for (int i = 0; ){}

        System.out.println("---concecionario de veiculos---");
        System.out.println("opciones del concepcionario");
        System.out.println("opcion :1. registrar un veiculo");
        System.out.println("opcion :2. ver catalogo de vehiculos");
        System.out.println("opcion :3. comprar un vehiculo");


        switch (opcion) {
            case 1:
                System.out.println("registrar un vehiculos: llene la siguiente informacion");
                break;

            case 2:
                System.out.println("que tipo de catalogo desea ver");
                System.out.println("opcion :1. carros");
                System.out.println("opcion :1. motos");
                System.out.println("opcion :1. lanchas");
                break;
            case 3:
                System.out.println("que carro del catalogo desea comprar");    
        
            default:
                break;
        }
    }
}
