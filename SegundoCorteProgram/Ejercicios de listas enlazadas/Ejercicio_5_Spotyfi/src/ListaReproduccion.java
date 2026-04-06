public class ListaReproduccion {
    private Cancion cabeza = null;

    // Insertar al final de la cola
    public void agregarAlFinal(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracionSegundos, genero, null);
        if (cabeza == null) {
            cabeza = nueva;
            return;
        }
        Cancion actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }
        actual.setSiguiente(nueva);
    }

    // Insertar "A continuación" (después de la cabeza/actual)
    public void agregarAContinuacion(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracionSegundos, genero, null);
        if (cabeza == null) {
            cabeza = nueva;
        } else {
            nueva.setSiguiente(cabeza.getSiguiente());
            cabeza.setSiguiente(nueva);
        }
    }

    // RETO: Sumar duración total en formato MM:SS
    public void mostrarTiempoTotal() {
        int totalSegundos = 0;
        Cancion actual = cabeza;
        
        while (actual != null) {
            totalSegundos += actual.getDuracionSegundos();
            actual = actual.getSiguiente();
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;
        
        System.out.printf("\nDuración total de la playlist: %02d:%02d\n", minutos, segundos);
    }

    public void mostrarPlaylist() {
        if (cabeza == null) {
            System.out.println("La playlist está vacía.");
            return;
        }
        Cancion actual = cabeza;
        int i = 1;
        while (actual != null) {
            System.out.println(i + ". " + actual);
            actual = actual.getSiguiente();
            i++;
        }
    }
}