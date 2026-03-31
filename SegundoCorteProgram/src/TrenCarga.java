public class TrenCarga {

    private Vagon inicio; // El primer vagón del tren

    public TrenCarga(){
        this.inicio = null; //el tren inicia vacio

    }

    public void engancharVagon(String contenido, double pesoToneladas, String origen, String destino){
        Vagon nuevoVagon = new Vagon(contenido,pesoToneladas,origen,destino);
        if (inicio == null){
            inicio = nuevoVagon;// si no hay vagones, el nuevo se convierte en el inicio

        }else{
            Vagon auxiliar = inicio;
            //recorremos asta llegar al ultio vagon
            while(auxiliar.siguiente !=null){
                auxiliar = auxiliar.siguiente;
            }
            auxiliar.siguiente = nuevoVagon;//el nuevo vagon se engancha al final del tren

        }

    }

    public double calcularPesoTotal(){
        double sumaPeso = 0.0;
        Vagon auxiliar = inicio;

        while(auxiliar != null){
            sumaPeso += auxiliar.pesoToneladas; //sumamos el peso del vagon actual al total
            auxiliar = auxiliar.siguiente; //avanzamos al siguiente vagon

        }
        return sumaPeso;
    }

}
