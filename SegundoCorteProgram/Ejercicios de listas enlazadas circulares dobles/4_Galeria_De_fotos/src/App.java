public class App {
    public static void main(String[] args) {
        Galeria galeria = new Galeria();
        
        System.out.println("=== INICIALIZANDO GALERÍA ===\n");
        
        // 1. Cargar 5 fotos
        galeria.agregarFoto("Atardecer en la playa", "2024-03-15", false);
        galeria.agregarFoto("Mi mascota", "2024-03-20", false);
        galeria.agregarFoto("Vacaciones en París", "2024-04-01", false);
        galeria.agregarFoto("Comida favorita", "2024-04-10", false);
        galeria.agregarFoto("Atardecer", "2024-04-15", false);
        
        // Mostrar estado inicial
        galeria.mostrarGaleria();
        
        // 2. Avanzar dos veces (siguiente)
        System.out.println("--- AVANZANDO 2 VECES ---");
        galeria.siguiente();  // Foto #2
        galeria.siguiente();  // Foto #3
        galeria.mostrarGaleria();
        
        // 3. Marcar la actual como favorita
        System.out.println("--- MARCANDO COMO FAVORITA ---");
        galeria.toggleFavorita();  // Marca Foto #3 como favorita
        galeria.mostrarGaleria();
        
        // 4. Retroceder una (anterior)
        System.out.println("--- RETROCEDIENDO 1 VEZ ---");
        galeria.anterior();  // Vuelve a Foto #2
        galeria.mostrarGaleria();
        
        // 5. Eliminar esa foto (la actual, que es Foto #2)
        System.out.println("--- ELIMINANDO FOTO ACTUAL ---");
        galeria.eliminarActual();  // Elimina Foto #2, actual pasa a Foto #3
        galeria.mostrarGaleria();
        
        // 6. Mostrar estado final
        System.out.println("=== ESTADO FINAL DE LA GALERÍA ===");
        galeria.mostrarGaleria();
    }
}