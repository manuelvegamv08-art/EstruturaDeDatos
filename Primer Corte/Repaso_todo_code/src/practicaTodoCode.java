public class practicaTodoCode {
    public static void main(String[] args) {
        int opcion = 2;
        double repositores,cajero,supervisor;

        repositores = 15.890;
        cajero = 25.630;
        supervisor = 35.53029;
        System.out.println("ingrese la categoria que desea saber el calculo");
        System.out.println("1.respositor 2.cajero 3.supervisor");

        switch (opcion) {
            case 1:
                System.out.println("el sueldo del repositor es de"+repositores);
                System.out.println("calculando el vono...");
                double bono =repositores+(15.890*0.10);
                System.out.println("su sueldo total es de "+ bono);

                break;
            case 2:
                System.out.println("el sueldo del cajero es de " +cajero);    
                break;

            case 3:
                System.out.println("el pago del supervisor es de: "+supervisor);
                System.out.println("se le restara el porsentaje de pencion:...");
                double pencion = supervisor -(supervisor*0.11);
                System.out.println("valor total es de: " + pencion);
            default:
                
                break;
        }
    }
}
