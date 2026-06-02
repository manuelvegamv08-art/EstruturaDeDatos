public class ColaLlamada {
    private Llamada frente; 
    private Llamada fin;    
    public ColaLlamada() {
        this.frente = null;
        this.fin = null;
    }

   
    public void encolar(Llamada nuevaLlamada) {
        if (frente == null) {
            frente = nuevaLlamada;
            fin = nuevaLlamada;
        } else {
            fin.siguiente = nuevaLlamada;
            fin = nuevaLlamada;
        }
    }

    
    public int contarPorMotivo(String motivo) {
        int contador = 0;
        
        Llamada actual = frente; 

        
        while (actual != null) {
            
            if (actual.getMotivoConsulta().equalsIgnoreCase(motivo)) {
                contador++;
            }
            actual = actual.siguiente; 
        }

        return contador;
    }

 
public int calcularTiempoPorMotivo(String motivo) {
    int tiempoTotal = 0;
    Llamada actual = frente; 

    while (actual != null) {
        if (actual.getMotivoConsulta().equalsIgnoreCase(motivo)) {
          
            tiempoTotal += actual.getDuracionEstimadaMinutos(); 
        }
        actual = actual.siguiente;
    }
    return tiempoTotal;
}
}
