public class Historial {
    Comando cabeza;
    Comando cursor;

    public Historial(){
        this.cabeza= null;
        this.cursor = null;
    }

    //agregar comando al historial
    public void agregar(String texto, boolean exitoso, String directorio){
        Comando nuevoComando = new Comando(texto, exitoso, directorio);

        if (cabeza == null) {
            cabeza = nuevoComando;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Comando ultimo = cabeza.anterior;

            ultimo.siguiente = nuevoComando;
            nuevoComando.anterior = ultimo;

            nuevoComando.siguiente = cabeza;
            cabeza.anterior = nuevoComando;
        }

        cursor = nuevoComando;  
    }

    public void arriba(){
    if (cursor != null){
        cursor = cursor.anterior; 
    }
}

public void abajo(){
    if (cursor != null){
        cursor = cursor.siguiente; 
    }
}

    // mostramos el comando actual 
    public void mostrarCursor(){
            if (cursor != null){
                System.out.println(">> " + cursor.texto + 
                               " | Exitoso: " + cursor.exitoso + 
                               " | Dir: " + cursor.directorio);
            }
    }

    //eliminar actual comando del historial
    public void eliminarActual(){
        if (cursor == null) return;

        //si solo hay un comando 
        if (cursor.siguiente == cursor){
            cabeza = null;
            cursor = null;
            return;
        }

        Comando anterior = cursor.anterior;
        Comando siguiente = cursor.siguiente;
        
        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        //si el comando a eliminar es la cabeza, movemos la cabeza 

        if (cursor == cabeza){
            cabeza = siguiente;
        }

        cursor = siguiente; // movemos el cursor al siguiente comando

    }

    // mostramos todo el historial 

    public void mostrarHistorial() {
        if (cabeza == null) return;

        Comando temp = cabeza;

        do {
            if (temp == cursor) {
                System.out.println(" [" + temp.texto + "]");
            } else {
                System.out.println(temp.texto);
            }
            temp = temp.siguiente;
        } while (temp != cabeza);
    }
}
