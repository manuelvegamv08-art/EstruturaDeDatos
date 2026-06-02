public class Paciente {
    private String cedula;
    private String nombreCompleto;
    private int edad;
    private String sintomaPrincipal;
    
    protected Paciente siguiente; 

    public Paciente(String cedula, String nombreCompleto, int edad, String sintomaPrincipal) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sintomaPrincipal = sintomaPrincipal;
        this.siguiente = null;
    }

  
    @Override
    public String toString() {
        return "Cédula: " + cedula + " | Nombre: " + nombreCompleto + 
               " | Edad: " + edad + " años | Síntoma: " + sintomaPrincipal;
    }
}