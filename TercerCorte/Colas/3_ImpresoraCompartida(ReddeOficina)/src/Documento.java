// NodoDocumento.java
public class Documento {
    // Atributos del documento
    private String nombreArchivo;
    private String usuario;
    private int numeroPaginas;
    private boolean esColor;
    
    
    private Documento siguiente;
    
    
    public Documento(String nombreArchivo, String usuario, int numeroPaginas, boolean esColor) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.numeroPaginas = numeroPaginas;
        this.esColor = esColor;
        this.siguiente = null; 
    }
    
    // Getters y Setters
    public String getNombreArchivo() { return nombreArchivo; }
    public String getUsuario() { return usuario; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public boolean isEsColor() { return esColor; }
    
    public Documento getSiguiente() { return siguiente; }
    public void setSiguiente(Documento siguiente) { this.siguiente = siguiente; }
    
    @Override
    public String toString() {
        return nombreArchivo + " (" + usuario + ", " + numeroPaginas + " págs.)";
    }
}