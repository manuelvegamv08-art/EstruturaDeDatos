public class Tren {
    private Vagon inicio;

    public Tren() {
    inicio = null;
}

    public void agregarVagon(int id,String contenedor, double pesoTonelada, String origen, String destino){
        
        Vagon nuevoVagon = new Vagon(id,contenedor, pesoTonelada, origen, destino);

        
        if (inicio == null){
            inicio = nuevoVagon;
            
            
            inicio.siguiente = inicio;
        }
        else{
            Vagon auxiliar = inicio;
            

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
