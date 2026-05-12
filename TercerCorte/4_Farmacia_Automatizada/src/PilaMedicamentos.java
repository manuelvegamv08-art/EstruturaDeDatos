public class PilaMedicamentos {

    private Medicamento tope;

    
    public PilaMedicamentos() {

        this.tope = null;
    }

 
    public boolean estaVacia() {

        return tope == null;
    }

    
    public void push(Medicamento nuevo) {

        nuevo.setSiguiente(tope);

        tope = nuevo;
    }

 
    public Medicamento pop() {

        if (estaVacia()) {

            return null;
        }

        Medicamento aux = tope;

        tope = tope.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

   
    public Medicamento peek() {

        return tope;
    }

    
    public void mostrar() {

        Medicamento aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.getSiguiente();
        }
    }

   
    public void validarDespacho() {

        if (estaVacia()) {

            System.out.println("La pila está vacía.");

            return;
        }

        
        while (tope != null && tope.getDiasParaVencer() < 10) {

            Medicamento eliminado = pop();

            System.out.println(
                    "Medicamento retirado por vencimiento próximo: "
                            + eliminado.getNombre()
                            + " | Días para vencer: "
                            + eliminado.getDiasParaVencer()
            );
        }

   
        if (tope != null) {

            System.out.println("\nMedicamento seguro para despacho:");
            System.out.println(tope);

        } else {

            System.out.println(
                    "\nNo quedan medicamentos seguros para despachar."
            );
        }
    }
}