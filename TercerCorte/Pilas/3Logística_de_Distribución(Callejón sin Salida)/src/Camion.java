public class Camion {
    private String placa;
    private String conductor;
    private double cargaTonelada;

    private Camion siguiente;

    public Camion(String placa, String conductor, double cargaTonelada){

        this.placa = placa;
        this.conductor = conductor;
        this.cargaTonelada = cargaTonelada; 
        this.siguiente = null;
    }

     public String getPlaca() {
        return placa;
    }

    public String getConductor() {
        return conductor;
    }

    public double getCargaTonelada() {
        return cargaTonelada;
    }

    public Camion getSiguiente() {
        return siguiente;
    }

    
    public void setSiguiente(Camion siguiente) {
        this.siguiente = siguiente;
    }
}
