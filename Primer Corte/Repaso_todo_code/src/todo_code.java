public class todo_code {
    
    public static void main(String[] args) {
        
        String derecha="derecha",izquierda="izquierda";
        String personaje = izquierda;
        if (personaje == derecha){
            System.out.println("su personaje se esta mobiendo a la"+ derecha);

        }
        else if (personaje==izquierda){
            System.out.println("su personaje se esta mobiendo a la"+ izquierda);
        }
        

        else{
            System.out.println("su personaje esta en reposo");
        }
    }
}
