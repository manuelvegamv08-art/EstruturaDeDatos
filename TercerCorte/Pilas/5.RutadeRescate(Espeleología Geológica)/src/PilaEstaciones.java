public class PilaEstaciones {

    private Estacion cima;

    public PilaEstaciones() {
        cima = null;
    }

    // Verificar si está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Agregar estación
    public void apilar(Estacion nueva) {

        nueva.setSiguiente(cima);

        cima = nueva;
    }

    // Sacar estación
    public Estacion desapilar() {

        if (estaVacia()) {
            return null;
        }

        Estacion aux = cima;

        cima = cima.getSiguiente();

        aux.setSiguiente(null);

        return aux;
    }

    // Mostrar estaciones
    public void mostrar() {

        Estacion aux = cima;

        System.out.println("\nESTACIONES REGISTRADAS:");

        while (aux != null) {

            System.out.println(
                aux.getNombrePunto()
                + " | Profundidad: "
                + aux.getProfundidad()
                + "m | Oxigeno: "
                + aux.getNivelOxigeno()
                + "%"
            );

            aux = aux.getSiguiente();
        }
    }

    // Retroceder hasta la superficie
    public void retrocederASuperficie() {

        System.out.println(
            "\nINICIANDO RETORNO A LA SUPERFICIE..."
        );

        while (!estaVacia()) {

            Estacion actual = desapilar();

            System.out.println(
                "\nPasando por: "
                + actual.getNombrePunto()
            );

            System.out.println(
                "Profundidad: "
                + actual.getProfundidad()
                + " metros"
            );

            System.out.println(
                "Nivel de oxigeno: "
                + actual.getNivelOxigeno()
                + "%"
            );

            // Verificar oxígeno
            if (actual.getNivelOxigeno() < 18) {

                System.out.println(
                    "ALERTA: Uso de tanque de emergencia requerido"
                );
            }
        }

        System.out.println(
            "\nEl equipo ha salido de la cueva."
        );
    }
}