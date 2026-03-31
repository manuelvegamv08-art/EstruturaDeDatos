public class vector {

    public static void main(String[] args) {
        
        String[] marcas = {"Toyota", "Honda", "Ford", "BMW", "Mercedes", "Audi", "Volkswagen", "Chevrolet"};

            // Creando el vector usando new
            String[] marcas2 = new String[8];
            marcas2[0] = "Toyota";
            marcas2[1] = "Honda";
            marcas2[2] = "Ford";
            marcas2[3] = "BMW";
            marcas2[4] = "Mercedes";
            marcas2[5] = "Audi";
            marcas2[6] = "Volkswagen";
            marcas2[7] = "Chevrolet";

        for (String marca : marcas) {
            System.out.println(marca);
        }

        for(int i = 0; i<marcas2.length;i++){
            System.out.println("el vector esta en la posicion: "+i);
            System.out.println("y su marca es la: "+marcas2[i]);
        }
    }
    
}