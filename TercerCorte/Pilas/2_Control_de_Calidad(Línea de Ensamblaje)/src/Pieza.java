public class Pieza {
    String nombrePieza;
    String numeroSerie;
    boolean esDefectuoso;
    Pieza siguiente;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuoso) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuoso = esDefectuoso;
        this.siguiente = null;
    }

    public String getNombrePieza() { return nombrePieza; }
    public String getNumeroSerie() { return numeroSerie; }
    public boolean isDefectuoso() { return esDefectuoso; }
    
    public Pieza getSiguiente() { return siguiente; }
    public void setSiguiente(Pieza siguiente) { this.siguiente = siguiente; }

}
