public class HistorialPlantas {
    private Lectura cabeza = null;

    // Agregar al inicio (Más reciente primero)
    public void agregarLectura(int id, double temp, double pres, String hora) {
        Lectura nueva = new Lectura(id, temp, pres, hora);
        nueva.setSiguiente(cabeza);
        cabeza = nueva;
    }

    // Algoritmo para encontrar el máximo
    public void mostrarTemperaturaMaxima() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        Lectura max = cabeza;
        Lectura actual = cabeza;

        while (actual != null) {
            if (actual.getTemperatura() > max.getTemperatura()) {
                max = actual;
            }
            actual = actual.getSiguiente();
        }

        System.out.println("\n>>> REGISTRO DE TEMPERATURA MÁXIMA <<<");
        System.out.println(max);
    }

    public void mostrarHistorial() {
        Lectura actual = cabeza;
        while (actual != null) {
            System.out.println(actual);
            actual = actual.getSiguiente();
        }
    }
}