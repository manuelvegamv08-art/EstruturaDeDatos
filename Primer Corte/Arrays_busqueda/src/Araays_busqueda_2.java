// jercicio 2 — Estadísticas de Ventas
// Una tienda quiere analizar sus ventas diarias en un periodo de 5 días.

// Calcula la suma total de las ventas.
// Encuentra la venta más alta y la más baja.
// Calcula el promedio de ventas.


public class Araays_busqueda_2 {
    public static void main(String[] args) {
        double [] ventas = new double [5];
        ventas[0] = 1500.75;
        ventas[1] = 2300.50;
        ventas[2] = 1800.25;
        ventas[3] = 2100.00;
        ventas[4] = 1950.75;

        double VentaMaxima = 0;
        double VentaMinima = 0;
        double SumaVentas = 0;
        for (int i = 0; i < ventas.length; i++) {
            SumaVentas += ventas[i];  
        }
        for (int i = 0; i < ventas.length; i++){
            if (i == 0) {
                VentaMaxima = ventas[i];
                VentaMinima = ventas[i];
            } else {
                if (ventas[i] > VentaMaxima) {
                    VentaMaxima = ventas[i];
                }
                if (ventas[i] < VentaMinima) {
                    VentaMinima = ventas[i];
                }
            }
        }
        double promedioVentas = SumaVentas / ventas.length;
        
        System.out.println("Suma total de ventas: " + SumaVentas);
        System.out.println("Venta más alta: " + VentaMaxima);
        System.out.println("Venta más baja: " + VentaMinima);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }   
}
