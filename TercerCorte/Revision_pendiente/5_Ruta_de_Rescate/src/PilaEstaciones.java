public class PilaEstaciones {

    private Estacion tope;

    
    public PilaEstaciones() {

        this.tope = null;
    }

    
    public boolean estaVacia() {

        return tope == null;
    }

    
    public void push(Estacion nueva) {

        nueva.setSiguiente(tope);

        tope = nueva;
    }

    
    public Estacion pop() {

        if (estaVacia()) {

            return null;
        }

        Estacion aux = tope;

        tope = tope.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

    public Estacion peek() {

        return tope;
    }
    public void mostrar() {

        Estacion aux = tope;

        while (aux != null) {

            System.out.println(aux);

            aux = aux.getSiguiente();
        }
    }

    public void retrocederASuperficie() {

        if (estaVacia()) {

            System.out.println("No hay estaciones registradas.");

            return;
        }

        System.out.println(
                "\n===== INICIANDO RETORNO A LA SUPERFICIE ====="
        );

        while (!estaVacia()) {

            Estacion actual = pop();

            System.out.println("\nRetrocediendo por estación: "+ actual.getNombrePunto());

            System.out.println( "Profundidad: "+ actual.getProfundidad()+ " metros");

            System.out.println("Nivel de oxígeno: "+ actual.getNivelOxigeno()+ "%" );

        
            if (actual.getNivelOxigeno() < 18) {

                System.out.println(" ALERTA: Uso de Tanque de Emergencia Requerido");
            }
        }

        System.out.println(
                "\nEl equipo ha salido de la cueva."
        );
    }
}