public class ListaCircular {
    Producto cabeza;

    public ListaCircular(){
        this.cabeza = null;
    }
    
    public void insertar(String nombre, int cantidad, int diasParaVencer){
        Producto nuevoProducto = new Producto(nombre, cantidad, diasParaVencer);

        // Caso 1: lista vacía
        if (cabeza == null){
            cabeza = nuevoProducto;
            cabeza.siguiente = cabeza;
            return;
        }

        // Insertar al inicio si vence pronto
        if (diasParaVencer < 3){
            Producto ultimo = cabeza;

            while (ultimo.siguiente != cabeza){
                ultimo = ultimo.siguiente;     
            }

            nuevoProducto.siguiente = cabeza;
            cabeza = nuevoProducto;
            ultimo.siguiente = cabeza;

        } else {
            // Insertar al final
            Producto ultimo = cabeza;

            while (ultimo.siguiente != cabeza){
                ultimo = ultimo.siguiente;
            }

            ultimo.siguiente = nuevoProducto;
            nuevoProducto.siguiente = cabeza;
        }
    }

    public void imprimirProximosAVencer(){
        if (cabeza == null){
            System.out.println("La lista está vacía");
            return;
        }

        Producto actual = cabeza;

        do {
            if (actual.diasParaVencer < 5){
                actual.mostrarInformacion();
            }
            actual = actual.siguiente;

        } while (actual != cabeza);
    }
}
