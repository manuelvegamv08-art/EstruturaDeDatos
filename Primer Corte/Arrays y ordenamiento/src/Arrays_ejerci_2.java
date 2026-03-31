// 2. Buscador de Cédulas (Base de Datos Bancaria)
// Un banco tiene una lista de 1.000 clientes organizados de 
// forma estricta y ascendente por su número de cédula o ID.

// El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la
//  manera más rápida posible (en pocos pasos).
// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están 
// ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

public class Arrays_ejerci_2 {
    public static void main(String[] args){

        int[] ID = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        int cedulaCliente = 1005;
        int inicio = 0;
        int fin = ID.length - 1;
        boolean encontrado = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (ID[medio] == cedulaCliente) {
                System.out.println("Cliente encontrado en la posición: " + medio);
                encontrado = true;
                break;
            } else if (ID[medio] < cedulaCliente) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        if (!encontrado) {
            System.out.println("Cliente no encontrado.");
        }
    }
}
