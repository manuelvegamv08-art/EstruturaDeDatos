import java.util.Scanner;

public class App {

    public static class Inventario {

    public  int id;
    public  String nombre;
    public  double precio;
    public  int cantidad;

    public Inventario(int id, String nombre, double precio, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Inventario[] productos = new Inventario[3];

        for(int i = 0; i < productos.length; i++){

    try{

        System.out.println("Producto " + (i+1));

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la id del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        productos[i] = new Inventario(id, nombre, precio, cantidad);

    }
    catch(Exception e){

        System.out.println(" Error: dato inválido, intente nuevamente");

        scanner.nextLine(); // limpiar buffer
        i--; //  vuelve a pedir el mismo producto
    }
}

        
        int salto = productos.length / 2;

        while(salto > 0){

            for(int i = salto; i < productos.length; i++){

                Inventario aux = productos[i];
                int j = i;

                while(j >= salto && productos[j - salto].id > aux.id){
                    productos[j] = productos[j - salto];
                    j -= salto;
                }

                productos[j] = aux;
            }

            salto /= 2;
        }

        // MOSTRAR INVENTARIO ORDENADO
        System.out.println("\n--- INVENTARIO ORDENADO ---");

        for (int i = 0; i < productos.length; i++){
            System.out.println("ID: " + productos[i].id + ", Nombre: " + productos[i].nombre + ", Precio: " + productos[i].precio + ", Cantidad: " + productos[i].cantidad);

        }

        // BUSQUEDA BINARIA
        System.out.print("\nIngrese ID a buscar: ");
        int buscar = scanner.nextInt();

        int inicio = 0;
        int fin = productos.length - 1;
        boolean encontrado = false;

        while(inicio <= fin){

            int medio = (inicio + fin) / 2;

            if(productos[medio].id == buscar){
                System.out.println("Producto encontrado: " + productos[medio].nombre);
                encontrado = true;
                break;
            }
            else if(buscar < productos[medio].id){
                fin = medio - 1;
            }
            else{
                inicio = medio + 1;
            }
        }

        if(!encontrado){
            System.out.println("Producto no encontrado");
        }

        scanner.close();
    }
}