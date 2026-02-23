public class Turno_en_un_banco {
    public static void main(String[] args){
        int TurnoActual = 123;
        int turnoEnpantalla = TurnoActual;
        System.out.println("Turno actual: " + TurnoActual);
        System.out.println("Turno en pantalla: " + turnoEnpantalla);

        // Esto ocurre porque los tipos primitivos se copian por valor.
        // Cada variable tiene su propio espacio en memoria.
        // Cambiar una no afecta la otra.


    }
}
