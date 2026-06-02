public class ColaPeaje {
    private NodoVehiculo frente;
    private NodoVehiculo finalCola;
    private int tamaño;
    
    
    public ColaPeaje() {
        this.frente = null;
        this.finalCola = null;
        this.tamaño = 0;
    }
    
   
    public void encolar(Vehiculo vehiculo) {
        NodoVehiculo nuevoNodo = new NodoVehiculo(vehiculo);
        
        if (finalCola == null) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.setSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
        tamaño++;
        System.out.println(" VEHÍCULO INGRESA AL CARRIL: " + vehiculo);
    }
    
    public Vehiculo desencolar() {
        if (frente == null) {
            System.out.println(" No hay vehículos en el carril");
            return null;
        }
        
        NodoVehiculo nodoAEliminar = frente;
        Vehiculo vehiculoAtendido = nodoAEliminar.getVehiculo();
        frente = frente.getSiguiente();
        
        if (frente == null) {
            finalCola = null;
        }
        
        tamaño--;
        
    
        if (vehiculoAtendido.isEsExento()) {
            System.out.println(" VEHÍCULO EXENTO - SIN COBRO: " + vehiculoAtendido.getPlaca());
        } else {
            System.out.println(" COBRANDO $" + vehiculoAtendido.getTarifa() + " a: " + vehiculoAtendido.getPlaca());
        }
        
        return vehiculoAtendido;
    }
   
    public double cerrarTurno() {
        double totalRecaudado = 0.0;
        int contadorExentos = 0;
        int contadorPagantes = 0;
        
    
        System.out.println("          CERRANDO TURNO - PEAJE                ");

        
        
        while (frente != null) {
            Vehiculo vehiculo = desencolar();
            
            if (vehiculo != null) {
                if (!vehiculo.isEsExento()) {
                    
                    totalRecaudado += vehiculo.getTarifa();
                    contadorPagantes++;
                    System.out.println("    Acumulado: $" + totalRecaudado);
                } else {
                    contadorExentos++;
                    System.out.println("    Exento - No se suma al total");
                }
            }
        }
        
  
       
        System.out.println("                 RESUMEN DEL TURNO                    ");
        
        System.out.println("║   Vehículos pagantes: " + String.format("%3d", contadorPagantes) + "                         ║");
        System.out.println("║   Vehículos exentos:   " + String.format("%3d", contadorExentos) + "                         ║");
        System.out.println("║   Total vehículos:     " + String.format("%3d", (contadorPagantes + contadorExentos)) + "                         ║");
        
        System.out.println("║    TOTAL RECAUDADO:     $" + String.format("%9.2f", totalRecaudado) + "              ║");
     
        
        return totalRecaudado;
    }
    
    public Vehiculo verFrente() {
        if (frente == null) {
            return null;
        }
        return frente.getVehiculo();
    }
    
    
    public boolean estaVacia() {
        return frente == null;
    }
    
    
    public int getTamaño() {
        return tamaño;
    }
    
    
    public void mostrarCola() {
        if (frente == null) {
            System.out.println(" CARRIL VACÍO");
            return;
        }
        
        System.out.println("\n=== CARRIL DE PEAJE (FIFO) ===");
        System.out.println("   CABINA → [siguiente en pagar]");
        
        NodoVehiculo actual = frente;
        int posicion = 1;
        
        while (actual != null) {
            Vehiculo v = actual.getVehiculo();
            String indicador = v.isEsExento() ? "" : "";
            System.out.println("   " + posicion + ". " + indicador + " " + v.getPlaca() + 
                             " (" + v.getTipoVehiculo() + ") - $" + v.getTarifa());
            actual = actual.getSiguiente();
            posicion++;
        }
        
        System.out.println("   FINAL → [último en la fila]");
        System.out.println("    Total vehículos: " + tamaño);
        System.out.println("===============================\n");
    }
}