// 3. Sensor de Temperatura (Control de Calidad)
// Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

// El Problema: Al final del día, el supervisor quiere saber cuál fue la
// temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
// Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor
// para encontrar el mayor de todos.




public class Arrays_ejerci_3 {
    public static void main(String[] args) {
        int [] temperaturas = {75, 80, 78, 85, 90, 88, 92, 87, 91, 89};
        int temperaturaMaxima = temperaturas[0];
        for (int inicio = 0; inicio < temperaturas.length; inicio++) {
            if (temperaturas[inicio] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[inicio];
            }
        }
        System.out.println("La temperatura más alta registrada es: " + temperaturaMaxima);
    }

}
