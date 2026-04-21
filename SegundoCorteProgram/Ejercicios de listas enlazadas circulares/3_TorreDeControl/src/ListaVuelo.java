public class ListaVuelo {
    Vuelo cabeza;

    public ListaVuelo(){
        this.cabeza = null;
    }

    public void insertar(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros){
        Vuelo nuevoVuelo = new Vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);

        // Caso lista vacía
        if (cabeza == null) {
            cabeza = nuevoVuelo;
            cabeza.siguienteVuelo = cabeza;
            return;
        }

        // 🚨 PRIORIDAD: si combustible < 10 → insertar al inicio
        if (combustibleRestante < 10) {

            Vuelo ultimo = cabeza;
            while (ultimo.siguienteVuelo != cabeza){
                ultimo = ultimo.siguienteVuelo;
            }

            nuevoVuelo.siguienteVuelo = cabeza;
            cabeza = nuevoVuelo;
            ultimo.siguienteVuelo = cabeza;

        } else {
            // Insertar al final
            Vuelo ultimo = cabeza;
            while (ultimo.siguienteVuelo != cabeza){
                ultimo = ultimo.siguienteVuelo;
            }

            ultimo.siguienteVuelo = nuevoVuelo;
            nuevoVuelo.siguienteVuelo = cabeza;
        }
    }

    public void reportarEmergencia(String numeroVuelo) {

        if (cabeza == null) {
            System.out.println("No hay vuelos en la lista");
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        do {
            if (actual.numeroVuelo.equals(numeroVuelo)) {

                // 🚨 VALIDAR COMBUSTIBLE
                if (actual.combustibleRestante >= 10) {
                    System.out.println("El vuelo no está en emergencia");
                    return;
                }

                // Si ya es cabeza
                if (actual == cabeza) {
                    System.out.println("El vuelo ya está en prioridad");
                    return;
                }

                // Buscar el último
                Vuelo ultimo = cabeza;
                while (ultimo.siguienteVuelo != cabeza) {
                    ultimo = ultimo.siguienteVuelo;
                }

                // Desconectar nodo
                anterior.siguienteVuelo = actual.siguienteVuelo;

                // Mover al inicio
                actual.siguienteVuelo = cabeza;
                cabeza = actual;

                // Mantener circularidad
                ultimo.siguienteVuelo = cabeza;

                System.out.println("Vuelo movido a prioridad (emergencia)");
                return;
            }

            anterior = actual;
            actual = actual.siguienteVuelo;

        } while (actual != cabeza);

        System.out.println("Vuelo no encontrado");
    }

    public void mostrarVuelos(){
        if (cabeza == null) {
            System.out.println("No hay vuelos en la lista.");
            return;
        }

        Vuelo vueloActual = cabeza;
        do {
            vueloActual.mostrarInformacion();
            vueloActual = vueloActual.siguienteVuelo;
        } while (vueloActual != cabeza);
    }
}