// Ejercicio 8 — Historial de mensajes
// Un chat guarda el último mensaje enviado. Se usan dos variables String:

// ultimoMensaje = "Hola"
// copiaTexto = ultimoMensaje
// Luego copiaTexto se cambia a "¿Cómo estás?"
// Muestra ambas variables y explica en un comentario por qué ultimoMensaje
//  no cambió (inmutabilidad de String).

public class Historial_de_mensajes {

    public static void main(String[] args) {
    String ultimoMensaje = "Hola";
    String copiaTexto = ultimoMensaje;
    copiaTexto = "¿Cómo estás?";

    System.out.println("ultimoMensaje: " + ultimoMensaje);
    System.out.println("copiaTexto: " + copiaTexto);

// Salida:
// ultimoMensaje: Hola
// copiaTexto: ¿Cómo estás?
    }
}