public class ControlInventario {
    private Producto inicio; //el inicio del estante o de la cabeza de la lista

    public ControlInventario(){
        this.inicio = null; //inicialmente el estante esta vacio

    }

    public void agregarProducto(String nombre, int cantidad, int diasParaVencer){
        Producto nuevProducto = new Producto(nombre, cantidad, diasParaVencer);

        if (inicio == null){
            inicio = nuevProducto;
        }else if (diasParaVencer < 3){
            nuevProducto.siguiente = inicio;
            inicio = nuevProducto;

        }else{
            Producto actual = inicio;
            while (actual.siguiente != null) {
                actual=actual.siguiente;

            }
            actual.siguiente = nuevProducto;
        }
    }

    public void mostrarProductosCriticos() {
        System.out.println("\n--- PRODUCTOS PRÓXIMOS A VENCER (< 5 DÍAS) ---");
        Producto actual = inicio;
        boolean hayCriticos = false;

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("- " + actual.nombre + " | Cant: " + actual.cantidad + 
                                   " | Vence en: " + actual.diasParaVencer + " días.");
                hayCriticos = true;
            }
            actual = actual.siguiente;
        }

        if (!hayCriticos) {
            System.out.println("No hay productos en estado crítico.");
        }

    }
}
