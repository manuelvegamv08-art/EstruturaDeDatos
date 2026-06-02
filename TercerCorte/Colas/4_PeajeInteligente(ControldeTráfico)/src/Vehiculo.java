public class Vehiculo {
    private String placa;
    private String tipoVehiculo;
    private double tarifa;
    private boolean esExento;

    private Vehiculo siguiente;

    public Vehiculo (String placa, String tipoVehiculo, double tarifa, boolean esExento){
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifa = tarifa;
        this.esExento = esExento;

        this.siguiente = null;
    }

    public String getPlaca(){
        return placa;
    }

    public String getTipoVehiculo(){
        return tipoVehiculo;
    }

    public double getTarifa(){
        return tarifa;
    }

    public boolean isEsExento(){
        return esExento;
    }

    public Vehiculo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Vehiculo siguiente) {
        this.siguiente = siguiente; 
    }

    @Override
    public String toString() {
        String estado = esExento ? " EXENTO" : " PAGA " + tarifa;
        return placa + " (" + tipoVehiculo + ") - " + estado;
    }
   
}
