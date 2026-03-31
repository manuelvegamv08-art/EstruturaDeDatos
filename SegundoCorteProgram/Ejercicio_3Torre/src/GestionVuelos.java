public class GestionVuelos {
    private Vuelo inicio;

    public void agregarVuelo(Vuelo nuevo) {
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Vuelo aux = inicio;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    // RETO: Buscar y mover al inicio
    public void reportarEmergencia(String numeroVuelo) {
        if (inicio == null || inicio.numeroVuelo.equals(numeroVuelo)) {
            return; // La lista está vacía o ya está al inicio
        }

        Vuelo anterior = inicio;
        Vuelo actual = inicio.siguiente;

        while (actual != null) {
            if (actual.numeroVuelo.equalsIgnoreCase(numeroVuelo)) {
                // 1. "Saltamos" el nodo actual: el anterior ahora apunta al siguiente del actual
                anterior.siguiente = actual.siguiente;
                
                // 2. Movemos el actual al inicio
                actual.siguiente = inicio;
                inicio = actual;
                
                System.out.println("¡EMERGENCIA! El vuelo " + numeroVuelo + " ha sido movido al inicio.");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("Vuelo no encontrado en la cola.");
    }

    public void mostrarCola() {
        Vuelo aux = inicio;
        while (aux != null) {
            System.out.println("[" + aux.numeroVuelo + " | Combustible: " + aux.combustibleRestante + "]");
            aux = aux.siguiente;
        }
    }
}