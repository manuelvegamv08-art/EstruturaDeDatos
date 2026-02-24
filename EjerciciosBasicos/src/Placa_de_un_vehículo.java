// Ejercicio 4 — Placa de un vehículo
// El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

// Placa (String)
// Año de fabricación (int)
// Cilindraje en cc (int)
// Precio de compra (double)
// Inicial del color (char)
// Si tiene SOAT vigente (boolean)
// Muestra todos los datos en consola.

public class Placa_de_un_vehículo {
 public static void main(String[] args) {
    String numeroPlaca = "ABC-1234";
    String ciudadRegistro = "Ciudad de México";
    String tipoVehiculo = "Automóvil";
    int añoFabricacion = 2020;
    boolean esElectrico = false;
    boolean SOAT = true;

    System.out.println("Número de Placa: " + numeroPlaca);
    System.out.println("Ciudad de Registro: " + ciudadRegistro);
    System.out.println("Tipo de Vehículo: " + tipoVehiculo);
    System.out.println("Año de Fabricación: " + añoFabricacion);
    System.out.println("¿Es Eléctrico? " + esElectrico);
   System.out.println("------------------------");
      if (SOAT) {
         System.out.println("El vehículo tiene SOAT vigente.");
      } else {
         System.out.println("El vehículo no tiene SOAT vigente.");
      }
    
 }   
}
