// Tema 2 — Variables por referencia
// Ejercicio 6 — Turno en un banco
// Un cajero de banco trabaja con el número del turno actual. Se crea una
//  variable turnoActual y se asigna a turnoEnPantalla.

// Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
// Explica en un comentario por qué ocurre esto.

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
