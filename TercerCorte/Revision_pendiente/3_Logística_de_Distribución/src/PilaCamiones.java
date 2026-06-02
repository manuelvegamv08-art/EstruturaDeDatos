public class PilaCamiones {

    private Camion tope;

    
    public PilaCamiones() {

        this.tope = null;
    }


    public boolean estaVacia() {

        return tope == null;
    }

    // metodo PUSH
    public void push(Camion nuevo) {

        nuevo.setSiguiente(tope);

        tope = nuevo;
    }

    // metodo POP
    public Camion pop() {

        if (estaVacia()) {

            return null;
        }

        Camion aux = tope;

        tope = tope.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

    // Mostrar pila
    public void mostrar() {

        Camion aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.getSiguiente();
        }
    }

    // metodo para calcular la carga
    public double calcularCargaTotal() {

        double suma = 0;

        
        PilaCamiones auxiliar = new PilaCamiones();

        
        while (!estaVacia()) {

            Camion actual = pop();

            suma += actual.getCargaToneladas();

            auxiliar.push(actual);
        }

    
        while (!auxiliar.estaVacia()) {

            push(auxiliar.pop());
        }

        return suma;
    }
}