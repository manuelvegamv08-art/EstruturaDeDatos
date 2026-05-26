public class PilaComponentes {

    private Pieza cima;

    
    public PilaComponentes() {
        cima = null;
    }

    
    public boolean estaVacia() {
        return cima == null;
    }

    
    public void apilar(Pieza nuevaPieza) {
        nuevaPieza.setSiguiente(cima);
        cima = nuevaPieza;
    }

    
    public Pieza desapilar() {

        if (estaVacia()) {
            return null;
        }

        Pieza piezaExtraida = cima;
        cima = cima.getSiguiente();

        piezaExtraida.setSiguiente(null);

        return piezaExtraida;
    }

    
    public void limpiarHastaDefecto() {

        System.out.println("=== INICIANDO LIMPIEZA ===");

        while (!estaVacia()) {

            Pieza pieza = desapilar();

            
            if (pieza.isDefectuoso()) {

                System.out.println("Pieza defectuosa encontrada:");
                System.out.println(pieza.getNombrePieza()
                        + " | S/N: " + pieza.getNumeroSerie());

                System.out.println("=== FIN DE LIMPIEZA ===");
                return;
            }

            
            System.out.println("Descartando pieza: "
                    + pieza.getNombrePieza()
                    + " | S/N: " + pieza.getNumeroSerie());
        }

        System.out.println("No se encontró ninguna pieza defectuosa.");
        System.out.println("=== FIN DE LIMPIEZA ===");
    }
}