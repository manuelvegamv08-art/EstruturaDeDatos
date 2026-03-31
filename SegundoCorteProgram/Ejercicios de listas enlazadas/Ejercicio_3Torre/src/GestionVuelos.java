public class GestionVuelos {
    private Vuelo inicio; 

    
    public GestionVuelos() {
        this.inicio = null;
    }

    // Método para agregar al final (Cola normal)
    public void agregarVuelo(String num, String linea, int comb, int pas) {
        Vuelo nuevo = new Vuelo(num, linea, comb, pas);

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

   
    public void moverAlInicio(String numBuscado) {
        
        if (inicio == null || inicio.numeroVuelo.equalsIgnoreCase(numBuscado)) {
            return;
        }

        Vuelo anterior = inicio;
        Vuelo actual = inicio.siguiente;

        
        while (actual != null) {
            if (actual.numeroVuelo.equalsIgnoreCase(numBuscado)) {
                
               
                anterior.siguiente = actual.siguiente;
                
                actual.siguiente = inicio;
                
                
                inicio = actual;
                
                System.out.println(" Vuelo " + numBuscado + " movido al inicio por EMERGENCIA.");
                return; 
            }
            
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("Vuelo no encontrado.");
    }

    //Metodo para mover al inicio por emergencia
    public void mostrarCola() {
        Vuelo aux = inicio;
        if (aux == null) {
            System.out.println("La cola está vacía.");
            return;
        }
        while (aux != null) {
            System.out.println("✈ [" + aux.numeroVuelo + " | " + aux.aeroLinea + 
                               " | Combustible: " + aux.combustibleRestante + "]");
            aux = aux.siguiente;
        }
    }
}