public class Capa {

    public String nombre;
    public boolean visible;
    public String tipo;

    public Capa siguiente;
    public Capa anterior;

    public Capa(String nombre, boolean visible, String tipo){
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;  
        this.siguiente = null;
        this.anterior = null;  
    }

}
