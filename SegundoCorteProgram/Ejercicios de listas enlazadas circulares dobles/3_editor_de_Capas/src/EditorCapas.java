public class EditorCapas {
    Capa cabeza;
    Capa capaActiva;

    public EditorCapas() {
        this.cabeza = null;
        this.capaActiva = null;
    }

    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Capa nuevaCapa = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = nuevaCapa;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            capaActiva = cabeza;
        } else {
            Capa ultima = cabeza.anterior;
            ultima.siguiente = nuevaCapa;
            nuevaCapa.anterior = ultima;
            nuevaCapa.siguiente = cabeza;
            cabeza.anterior = nuevaCapa;
            capaActiva = nuevaCapa;
        }
    }

    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
            System.out.println("Capa '" + capaActiva.nombre + "' ahora es " + 
                               (capaActiva.visible ? "visible" : "oculta"));
        }
    }

    public void eliminarActiva() {  //  nombre corregido
        if (capaActiva == null) return;
        
        if (capaActiva.siguiente == capaActiva) {
            cabeza = null;
            capaActiva = null;
        } else {
            capaActiva.anterior.siguiente = capaActiva.siguiente;
            capaActiva.siguiente.anterior = capaActiva.anterior;

            if (capaActiva == cabeza) {
                cabeza = capaActiva.siguiente;
            }

            capaActiva = capaActiva.siguiente;
        }
        System.out.println("Capa eliminada");
    }

    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas");
            return;
        }
        
        Capa actual = cabeza;
        int numero = 1;
        
        System.out.println("\n=== LISTA DE CAPAS ===");
        do {
            String activa = (actual == capaActiva) ? " " : "    ";
            String visibilidad = actual.visible ? " visible" : " oculta";
            
            System.out.println(activa + numero + ". " + actual.nombre + 
                             " | Tipo: " + actual.tipo + 
                             " | " + visibilidad);
            
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
    }
}