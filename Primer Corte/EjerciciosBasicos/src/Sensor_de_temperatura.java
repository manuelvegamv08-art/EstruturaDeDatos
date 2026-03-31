// Ejercicio 3 — Sensor de temperatura
// Un sensor industrial registra temperaturas. El sistema recibe:

// Temperatura actual en Celsius (double)
// Nombre del sensor (String)
// Número de lectura (int)
// Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
// Imprime el estado del sensor con todos sus datos.



public class Sensor_de_temperatura {

    double temperatura = 25.5;
    String NomCensor = "Sensor de Temperatura XYZ";
    int numLecturas = 100;
    boolean sensorActivo = true;
    int limiteMaximoTemperatura = 80;
    boolean enAlarma = false;
    public static void main(String[] args) {
        Sensor_de_temperatura sensor = new Sensor_de_temperatura();
        
        if (sensor.temperatura > sensor.limiteMaximoTemperatura) {
            sensor.enAlarma = true;
            System.out.println("Alerta: Temperatura excede el límite máximo!"+sensor.enAlarma);
        } else {
            System.out.println("Temperatura dentro del rango seguro.");
        }
    }

}