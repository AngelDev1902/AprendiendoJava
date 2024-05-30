public class Matrices_12 {
    public static void main(String[] args) {
        /*
            Una matriz es una estructura de datos bidimensional, que almacena informacion del mismo tipo
            Las matrices se utilizan para almacenar datos de forma ordenada. En direcciones de memoria contigua.
            se pueden declarar de dos formas:
                - Declaracion implicita.
                - Declaracion explicita.
        */

        // Declaracion implicita.
        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // matriz de 3x3 elementos de tipo int.

        // Declaracion explicita.
        int[][] numeros2 = new int[3][3]; // matriz de 3x3 elementos de tipo int.
        // para llenar la matriz explicita, se debe hacer de la siguiente forma:
        numeros2[0][0] = 1;
        numeros2[0][1] = 2;
        numeros2[0][2] = 3;
        numeros2[1][0] = 4;
        numeros2[1][1] = 5;
        numeros2[1][2] = 6;
        numeros2[2][0] = 7;
        numeros2[2][1] = 8;
        numeros2[2][2] = 9;

        /*
            Las matrices se pueden recorrer de dos formas:
                - Recorrido con for.
                - Recorrido con for each.
        */

        // Recorrido con for.
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        // Recorrido con for each.
        for (int[] fila : numeros) {
            for (int numero : fila) {
                System.out.println(numero);
            }
        }

        /*
            Las matrices se pueden inicializar de dos formas:
                - Inicializacion implicita.
                - Inicializacion explicita.
        */
    }
}
