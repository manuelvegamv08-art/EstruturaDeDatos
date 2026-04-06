// 5. Spotify Lite (Lista de Reproducción)
// Crea un reproductor de música simplificado que gestione una 
// lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista
//  (String), duracionSegundos (int) y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación"
//  (insertar después de la actual) o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas 
// las canciones y muestre el tiempo total de la lista en formato MM:SS.
import java.util.Scanner;

public class SpotifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReproduccion playlist = new ListaReproduccion();
        int opcion;

        do {
            System.out.println("\n--- SPOTIFY LITE ---");
            System.out.println("1. Agregar al final de la cola");
            System.out.println("2. Agregar a continuación (después de la 1ra)");
            System.out.println("3. Ver playlist");
            System.out.println("4. Ver duración total");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            if (opcion == 1 || opcion == 2) {
                System.out.print("Título: "); String t = sc.nextLine();
                System.out.print("Artista: "); String a = sc.nextLine();
                System.out.print("Duración (seg): "); int d = sc.nextInt();
                sc.nextLine();
                System.out.print("Género: "); String g = sc.nextLine();

                if (opcion == 1) playlist.agregarAlFinal(t, a, d, g);
                else playlist.agregarAContinuacion(t, a, d, g);
            } else if (opcion == 3) {
                playlist.mostrarPlaylist();
            } else if (opcion == 4) {
                playlist.mostrarTiempoTotal();
            }

        } while (opcion != 5);
        sc.close();
    }
}
