
// La Clase Lectura (Nodo): Debe contener idSensor (int), 
// temperatura (double), presion (double) y hora (String).
public class Lectura {
    private int idSensor;
    private double temperatura;
    private double presion;
    private String hora;
    private Lectura siguiente;

    public Lectura(int idSensor, double temperatura, double presion, String hora) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
        this.presion = presion;
        this.hora = hora;
        this.siguiente = null;
    }

    // Getters y Setters
    public int getIdSensor() { return idSensor; }
    public double getTemperatura() { return temperatura; }
    public Lectura getSiguiente() { return siguiente; }
    public void setSiguiente(Lectura siguiente) { this.siguiente = siguiente; }

    @Override
    public String toString() {
        return String.format("[Sensor: %d | Hora: %s | Temp: %.2f°C | Pres: %.2f bar]", 
                             idSensor, hora, temperatura, presion);
    }
}