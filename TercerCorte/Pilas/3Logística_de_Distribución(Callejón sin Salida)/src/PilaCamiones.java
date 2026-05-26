public class PilaCamiones {

    private Camion cima;

    public PilaCamiones() {
        cima = null;
    }

    
    public boolean estaVacia() {
        return cima == null;
    }


    public void apilar(Camion nuevo) {

        nuevo.setSiguiente(cima);
        cima = nuevo;
    }

    
    public Camion desapilar() {

        if (estaVacia()) {
            return null;
        }

        Camion aux = cima;
        cima = cima.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

   
    public void mostrar() {

        Camion aux = cima;

        System.out.println("\nCAMIONES EN EL CALLEJON:");

        while (aux != null) {

            System.out.println(
                aux.getPlaca()
                + " - "
                + aux.getConductor()
                + " - "
                + aux.getCargaTonelada()
                + " toneladas"
            );

            aux = aux.getSiguiente();
        }
    }

    public double calcularCargaTotal() {

        double total = 0;

        
        PilaCamiones auxiliar = new PilaCamiones();

        
        while (!estaVacia()) {

            Camion camion = desapilar();

            total += camion.getCargaTonelada();

            auxiliar.apilar(camion);
        }

        
        while (!auxiliar.estaVacia()) {

            apilar(auxiliar.desapilar());
        }

        return total;
    }
}