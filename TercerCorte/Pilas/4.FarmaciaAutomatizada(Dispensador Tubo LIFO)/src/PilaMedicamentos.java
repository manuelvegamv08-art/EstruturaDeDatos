public class PilaMedicamentos {

    private Medicamento cima;

    public PilaMedicamentos() {
        cima = null;
    }

    
    public boolean estaVacia() {
        return cima == null;
    }

    
    public void apilar(Medicamento nuevo) {

        nuevo.setSiguiente(cima);
        cima = nuevo;
    }
    public Medicamento desapilar() {

        if (estaVacia()) {
            return null;
        }

        Medicamento aux = cima;

        cima = cima.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

    
    public void mostrar() {

        Medicamento aux = cima;

        System.out.println("\nMEDICAMENTOS EN EL TUBO:");

        while (aux != null) {

            System.out.println(
                aux.getNombre()
                + " | Lote: " + aux.getLote()
                + " | Dias para vencer: "
                + aux.getDiasParaVencer()
            );

            aux = aux.getSiguiente();
        }
    }

    
    public void validarDespacho() {

        while (!estaVacia()) {


            Medicamento actual = cima;

            
            if (actual.getDiasParaVencer() < 10) {

                System.out.println(
                    "Retirando medicamento vencido o riesgoso:"
                );

                System.out.println(
                    actual.getNombre()
                    + " | Dias restantes: "
                    + actual.getDiasParaVencer()
                );

                desapilar();

            } else {

                System.out.println(
                    "\nMedicamento seguro para despacho:"
                );

                System.out.println(
                    actual.getNombre()
                    + " | Dias restantes: "
                    + actual.getDiasParaVencer()
                );

                return;
            }
        }

        System.out.println(
            "\nNo quedan medicamentos seguros en el tubo."
        );
    }
}