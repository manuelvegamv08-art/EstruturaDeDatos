public class ColaUrgencias {
    private Paciente frente;
    private Paciente fin;

    public ColaUrgencias() {
        this.frente = null;
        this.fin = null;
    }

    public void registrarPaciente(Paciente nuevoPaciente) {
        if (frente == null) {
            frente = nuevoPaciente;
            fin = nuevoPaciente;
        } else {
            fin.siguiente = nuevoPaciente;
            fin = nuevoPaciente;
        }
    }

   
    public void atenderTodos() {
        if (frente == null) {
            System.out.println("\n[Info] No hay pacientes en la cola de urgencias.");
            return;
        }

        int totalAtendidos = 0;
        System.out.println("\n=== INICIANDO ORDEN DE ATENCIÓN DE PACIENTES ===");

        
        while (frente != null) {
           
            Paciente atendido = frente;
            totalAtendidos++;

           
            System.out.println("Paciente #" + totalAtendidos + " -> " + atendido.toString());

           
            frente = frente.siguiente;
        }

       
        fin = null; 

        System.out.println("------------------------------------------------");
        System.out.println("REPORTE: Turno finalizado. Total de pacientes atendidos: " + totalAtendidos);
        System.out.println("=================================================");
    }
}