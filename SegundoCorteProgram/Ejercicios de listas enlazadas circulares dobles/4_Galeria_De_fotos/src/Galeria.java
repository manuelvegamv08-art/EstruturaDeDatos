public class Galeria {
    Foto cabeza;
    Foto actual;

    public Galeria() {
        this.cabeza = null;
        this.actual = null;
    }

    public void agregarFoto(String titulo, String fecha, boolean esFavorita) {
        Foto nuevaFoto = new Foto(titulo, fecha, esFavorita);
        
        if (cabeza == null) {
            cabeza = nuevaFoto;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            actual = cabeza;
        } else {
            Foto ultima = cabeza.anterior;
            
            ultima.siguiente = nuevaFoto;
            nuevaFoto.anterior = ultima;
            nuevaFoto.siguiente = cabeza;
            cabeza.anterior = nuevaFoto;
            
            actual = nuevaFoto;
        }
    }

    public void siguiente() {
        if (actual != null) {
            actual = actual.siguiente;
            System.out.println(" Siguiente foto: " + actual.titulo);
        }
    }

    public void anterior() {
        if (actual != null) {
            actual = actual.anterior;
            System.out.println("Foto anterior: " + actual.titulo);
        }
    }

    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
            String estado = actual.esFavorita ? "marcada como favorita " : "desmarcada como favorita";
            System.out.println(" '" + actual.titulo + "' " + estado);
        }
    }

    public void eliminarActual() {
        if (actual == null) return;
        
        if (actual.siguiente == actual) {
            cabeza = null;
            actual = null;
        } else {
            actual.anterior.siguiente = actual.siguiente;
            actual.siguiente.anterior = actual.anterior;

            if (actual == cabeza) {
                cabeza = actual.siguiente;
            }

            actual = actual.siguiente;
        }
        System.out.println(" Foto eliminada");
    }

    public void mostrarGaleria() {
        if (cabeza == null) {
            System.out.println("No hay fotos en la galería.");
            return;
        }
        
        Foto temp = cabeza;
        int numero = 1;
        
        System.out.println("\n=== GALERÍA DE FOTOS ===");
        do {
            String esActual = (temp == actual) ? " " : "    ";
            String esFav = temp.esFavorita ? " " : "    ";
            
            System.out.println(esActual + esFav + numero + ". " + temp.titulo + " | Fecha: " + temp.fecha);
            
            temp = temp.siguiente;
            numero++;
        } while (temp != cabeza);
    }
}