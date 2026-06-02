public class Llamada {
    
    private String idLlamada;
    private String nombreCliente;
    private String motivoConsulta; 
    private int duracionEstimadaMinutos;
    
    protected Llamada siguiente;

    
    public Llamada(String idLlamada, String nombreCliente, String motivoConsulta, int duracionEstimadaMinutos) {
        this.idLlamada = idLlamada;
        this.nombreCliente = nombreCliente;
        this.motivoConsulta = motivoConsulta;
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
        this.siguiente = null;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public String getIdLlamada() {
        return idLlamada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getDuracionEstimadaMinutos(){
        return duracionEstimadaMinutos;
    }
}
