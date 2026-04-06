//La Clase Cancion (Nodo): Debe contener titulo (String), artista
// (String), duracionSegundos (int) y genero (String).
public class Cancion {
    String titulo;
    String artista;
    int duracionSegundos;
    String genero;
    Cancion siguiente;  // Referencia al siguiente nodo (cancion) en la lista

    public Cancion(String titulo, String artista, int duracionSegundos, String genero,Cancion siguiente ){
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.siguiente = siguiente;

    }
    public String getTitulo()
    {
        return titulo;
    }
    public String getArtista()
    {
        return artista;
    }
    public int getDuracionSegundos()
    {
        return duracionSegundos;
    }
    public String getGenero()
    {
        return genero;
    }

    public Cancion getSiguiente()
    {
        return siguiente;        
    }
// se implemeta los set de las variables de instancia para modificar los datos de la cancion
    public void setSiguiente(Cancion siguiente)
    { 
        this.siguiente = siguiente; 
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo; 
    }

    public void setArtista(String artista)
    {
        this.artista = artista;
    }

    public void setDuracionSegundos(int duracionSegundos)
    {
        this.duracionSegundos = duracionSegundos;

    }

    public void setGenero(String genero)
    {
        this.genero = genero;

    }

    


    @Override
    public String toString() {
        return String.format("[%s - %s (%ds)]", titulo, artista, duracionSegundos);
    }
    
}
