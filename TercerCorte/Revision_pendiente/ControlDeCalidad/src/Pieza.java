public class Pieza {
    public String nombrePieza;
    public String numeroSerie;
    public boolean esDefectuoso;
    public Pieza siguiente;


    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuoso){
        
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuoso = esDefectuoso; 
        this.siguiente = null;

    }

    public String getNombrePieza(){
        return nombrePieza;
    }

    public String getNumeroSerie(){
        return numeroSerie;
    }

    public boolean getEsDefectuoso(){
        return esDefectuoso;
    }
    
    public Pieza getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Pieza siguiente){
        this.siguiente = siguiente;
    }
    
    public void setEsDefectuoso(boolean esDefectuoso){
        this.esDefectuoso = esDefectuoso;
    }

    public void setNombrePieza(String nombrePieza){
        this.nombrePieza = nombrePieza;
    }

    public void setnumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "nombrePieza='" + nombrePieza + '\'' +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", esDefectuoso=" + esDefectuoso +
                '}';
    }
}
