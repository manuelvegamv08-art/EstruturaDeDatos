// // 1. Declaración sin inicialización
// int[] numeros;
// String[] nombres;

// // 2. Declaración con tamaño específico
// int[] numeros = new int[5];
// String[] nombres = new String[10];

// // 3. Declaración e inicialización con valores
// int[] numeros = {1, 2, 3, 4, 5};
// String[] nombres = {"Juan", "María", "Pedro"};

// // 4. Declaración con new y valores
// int[] numeros = new int[]{10, 20, 30, 40};

// // 5. Sintaxis alternativa (corchetes al final)
// int numeros[] = new int[5];
// String nombres[] = {"Ana", "Luis"};

// // 6. Arrays multidimensionales
// int[][] matriz = new int[3][3];
// int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// // 7. Arrays de objetos
// Object[] objetos = new Object[5];
// Integer[] enteros = {1, 2, 3};  

// // 8. Agregar datos a un vector (después de la declaración)
// int[] numeros = new int[5];
// numeros[0] = 10;
// numeros[1] = 20;
// numeros[2] = 30;

// // 9. Recorrer e inicializar con bucle
// int[] valores = new int[10];
// for (int i = 0; i < valores.length; i++) {
//     valores[i] = i * 2;
// }

// // 10. Usar ArrayList para agregar datos dinámicamente
// ArrayList<Integer> lista = new ArrayList<>();
// lista.add(100);
// lista.add(200);
// lista.add(300);
// int[] arrayDeLista = lista.stream().mapToInt(Integer::intValue).toArray();

// // 11. Copiar datos a otro array
// int[] original = {1, 2, 3, 4, 5};
// int[] copia = Arrays.copyOf(original, original.length);

// // 12. Arrays.fill() para llenar con un valor
// int[] lleno = new int[5];
// Arrays.fill(lleno, 7);  // Todos los elementos serán 7

// 

// // 13. Llenar un vector usando Scanner
// Scanner scanner = new Scanner(System.in);

// // Opción 1: Solicitar tamaño y llenar
// int[] numeros = new int[5];
// System.out.println("Ingrese 5 números:");
// for (int i = 0; i < numeros.length; i++) {
//     System.out.print("Número " + (i + 1) + ": ");
//     numeros[i] = scanner.nextInt();
// }

// // Opción 2: Llenar String[]
// String[] nombres = new String[3];
// System.out.println("Ingrese 3 nombres:");
// for (int i = 0; i < nombres.length; i++) {
//     System.out.print("Nombre " + (i + 1) + ": ");
//     nombres[i] = scanner.nextLine();
// }

// // Opción 3: Llenar con tamaño dinámico
// System.out.print("¿Cuántos elementos? ");
// int tamaño = scanner.nextInt();
// int[] valores = new int[tamaño];
// for (int i = 0; i < valores.length; i++) {
//     System.out.print("Elemento " + (i + 1) + ": ");
//     valores[i] = scanner.nextInt();
// }

// // Opción 4: Usando ArrayList (sin tamaño fijo)
// ArrayList<Integer> lista = new ArrayList<>();
// System.out.println("Ingrese números (0 para terminar):");
// int num;
// do {
//     num = scanner.nextInt();
//     if (num != 0) lista.add(num);
// } while (num != 0);

// scanner.close();