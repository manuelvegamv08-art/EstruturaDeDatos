public class ColaImpresion {
    
    private Documento frente;  
    private Documento finalCola; 
    private int tamaño;
    

    public ColaImpresion() {
        this.frente = null;
        this.finalCola = null;
        this.tamaño = 0;
    }
    
  
    public void encolar(Documento nuevoNodo) {
        if (finalCola == null) {
            
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            
            finalCola.setSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
        tamaño++;
        System.out.println(" Encolado: " + nuevoNodo);
    }
    
    
    public Documento desencolar() {
        if (frente == null) {
            System.out.println(" Cola vacía, no se puede desencolar");
            return null;
        }
        
        Documento nodoAEliminar = frente;
        frente = frente.getSiguiente();
        
        
        if (frente == null) {
            finalCola = null;
        }
        
        tamaño--;
        System.out.println(" Desencolado (enviado a imprimir): " + nodoAEliminar);
        return nodoAEliminar;
    }
    
   
    public int calcularPaginasTotales() {
        int totalPaginas = 0;
       
        Documento actual = frente;
        
        while (actual != null) {
            totalPaginas += actual.getNumeroPaginas();
            actual = actual.getSiguiente();  
        }
        
        return totalPaginas;
    }
    
   
    public Documento verFrente() {
        if (frente == null) {
            System.out.println("Cola vacía");
            return null;
        }
        return frente;
    }
    
   
    public boolean estaVacia() {
        return frente == null;
    }
    

    public int getTamaño() {
        return tamaño;
    }
    
    
    public void mostrarCola() {
        if (frente == null) {
            System.out.println(" COLA VACÍA");
            return;
        }
        
        System.out.println("\n === COLA DE IMPRESIÓN (FIFO) ===");
        System.out.println("   FRENTE → [primero en salir]");
        
        Documento actual = frente;
        int posicion = 1;
        
        while (actual != null) {
            System.out.println("   " + posicion + ". " + actual);
            actual = actual.getSiguiente();
            posicion++;
        }
        
        System.out.println("   FINAL → [último en salir]");
        System.out.println("    Total documentos: " + tamaño);
        System.out.println("    Total páginas: " + calcularPaginasTotales());
        System.out.println("================================\n");
    }
}