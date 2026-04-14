public class Galeria {

    private Fotografia inicio;
    private Fotografia fin;
    private Fotografia actual;

    // Constructor
    public Galeria() {
        inicio = null;
        fin = null;
        actual = null;
    }

    // =============================
    // AGREGAR FOTO
    // =============================
    public void agregarFoto(String nombre, double tamano, String resolucion) {

        Fotografia nueva = new Fotografia(nombre, resolucion, tamano);

        
    if (inicio == null) {
        inicio = nueva;
        fin = nueva;
        actual = nueva;
    } else {
        fin.siguiente = nueva;
        nueva.anterior = fin;
        fin = nueva;
    }
}
    
    // SIGUIENTE FOTO
    public void siguienteFoto() {

        if (actual == null) {
            System.out.println("La galería está vacía.");
            return;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
            actual.mostrarInfo();
        } else {
            System.out.println("Ya estás en la última foto.");
        }
    }

    
    // FOTO ANTERIOR

    public void fotoAnterior() {

        if (actual == null) {
            System.out.println("La galería está vacía.");
            return;
        }

        if (actual.anterior != null) {
            actual = actual.anterior;
            actual.mostrarInfo();
        } else {
            System.out.println("Ya estás en la primera foto.");
        }
    }

    // =============================
    // REPRODUCIR GALERÍA
    // =============================
    public void reproducirGaleria() {

        if (inicio == null) {
            System.out.println("No hay fotos en la galería.");
            return;
        }

        System.out.println("\n=== HACIA ADELANTE ===");

        Fotografia aux = inicio;
        while (aux != null) {
            aux.mostrarInfo();
            aux = aux.siguiente;
        }

        System.out.println("\n=== HACIA ATRÁS ===");

        aux = fin;
        while (aux != null) {
            aux.mostrarInfo();
            aux = aux.anterior;
        }
    }
}
