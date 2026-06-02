public class PilaPiezas {

    private Pieza tope;

    public PilaPiezas(){
        this.tope = null;
    }
    
    public boolean estaVacia(){
        return tope == null;
    }

    public void push(Pieza nueva){
        nueva.setSiguiente(nueva);
        tope = nueva;
    }

    public Pieza pop(){
        if (estaVacia()){
            return null;
        }

        Pieza aux = tope;
        tope = tope.getSiguiente();

        aux.setSiguiente(null);

        return aux;

    }
    public Pieza peek() {

        return tope;
    }

    public void mostrar(){

        if (estaVacia()){
            System.out.println("La pila esta vacia");
            return;
        }
        Pieza actual = tope;
        while (actual != null){
            System.out.println(actual);
            actual = actual.getSiguiente();
        }
    }

    public void limpiarHastaDefectuoso(){
        if (estaVacia()){
            System.out.println("la pilla esta vacia");
            return;
        }

        while (tope != null && !tope.getEsDefectuoso()){

            Pieza eliminada = pop();
            System.out.println("Pieza eliminada: " + eliminada.getNombrePieza());

        }

        if (tope != null && tope.getEsDefectuoso()) {

            System.out.println("\nSe encontró la pieza defectuosa:");
            System.out.println(tope);

        } else {

            System.out.println("\nNo se encontró ninguna pieza defectuosa");
        }
    }
}
