public class Navegador {

    

    private Pestana inicio;
    private Pestana fin;
    private Pestana actual;

    public Navegador() {
        inicio = null;
        fin = null;
        actual = null;
    }


        public void abrirPestana(String titulo, String url, String hora) {

        Pestana nueva = new Pestana(titulo, url, hora);

        if (inicio == null) {
            inicio = nueva;
            fin = nueva;
            actual = nueva;
        } else {
            fin.siguiente = nueva;
            nueva.anterior = fin;
            fin = nueva;
            actual = nueva;
        }
    }

        public void cerrarPestanaActual(String url) {

        if (inicio == null) {
            System.out.println("No hay pestañas abiertas.");
            return;
        }

        Pestana aux = inicio;

        // Buscar pestaña
        while (aux != null && !aux.url.equals(url)) {
            aux = aux.siguiente;
        }

        if (aux == null) {
            System.out.println("Pestaña no encontrada.");
            return;
        }

        // ===== CASO 1: única pestaña =====
        if (inicio == fin) {
            inicio = null;
            fin = null;
            actual = null;
        }

        // ===== CASO 2: eliminar inicio =====
        else if (aux == inicio) {
            inicio = inicio.siguiente;
            inicio.anterior = null;
            actual = inicio;
        }

        // ===== CASO 3: eliminar final =====
        else if (aux == fin) {
            fin = fin.anterior;
            fin.siguiente = null;
            actual = fin;
        }

        // ===== CASO 4: eliminar en medio =====
        else {
            aux.anterior.siguiente = aux.siguiente;
            aux.siguiente.anterior = aux.anterior;
            actual = aux.anterior;
        }

        System.out.println("Pestaña cerrada correctamente.");
    }

        public void mostrarPestanas() {
        if (inicio == null) {
            System.out.println("No hay pestañas abiertas.");
            return;
        }

        Pestana aux = inicio;
        while (aux != null) {
            aux.mostrar();
            aux = aux.siguiente;
        }
    }

}
