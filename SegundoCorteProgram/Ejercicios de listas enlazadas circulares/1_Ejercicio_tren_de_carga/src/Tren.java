public class Tren {
    private Vagon inicio;

    public Tren() {
    inicio = null;
}

    public void agregarVagon(String contenedor, double pesoTonelada, String origen, String destino){
        
        Vagon nuevoVagon = new Vagon(contenedor, pesoTonelada, origen, destino);

        // Si el tren está vacío, el nuevo vagón se convierte en el inicio
        if (inicio == null){
            inicio = nuevoVagon;
            
            // En una lista circular, el primero apunta a sí mismo
            inicio.siguiente = inicio;
        }
        else{
            Vagon auxiliar = inicio;
            // Buscamos el último vagón (el que apunta al inicio)

            while(auxiliar.siguiente != inicio){
                auxiliar = auxiliar.siguiente;
                
            }
            auxiliar.siguiente = nuevoVagon;
            nuevoVagon.siguiente = inicio;
        }
    }
    public void mostrarTren(){

            if (inicio == null){
                System.out.println("--El tren no tiene vagones--");
                return;
            }
            Vagon auxiliar = inicio;
            do{
                auxiliar.mostrarInfo();
                auxiliar = auxiliar.siguiente;
            }while(auxiliar != inicio);

        }

    public void calcularPesoTotal(){
        if (inicio == null){
            System.out.println("..El tren no tiene vagones..");
            return;

        }else{
            double pesoTotal = 0;
            Vagon auxiliar = inicio;
            do{
                pesoTotal += auxiliar.pesoTonelada;
                auxiliar = auxiliar.siguiente;
            }while(auxiliar != inicio);
            System.out.println("El peso total del tren es: " + pesoTotal + " toneladas");
        }
    }
}
