public class Conversor_deu_nidades {
    public static void main(String[] args) {
        double Cantidad_tasa = 2.5; // Cantidad a convertir
        double mililitros = Cantidad_tasa*236.588;
        double litros = mililitros/1000;
        System.out.println("Cantidad en tazas: " + Cantidad_tasa);
        System.out.println("Cantidad en mililitros: " + mililitros);
        System.out.println("Cantidad en litros: " + litros);

    }
}
