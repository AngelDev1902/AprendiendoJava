public class Arrays_11 {
    public static void main(String[] args) {
        /*
            Un array es un conjunto de datos del mismo tipo de dato.
            Los arrays se utilizan para almacenar datos de forma ordenada. En direcciones de memoria contigua.
            Los arrays se pueden declarar de dos formas:
                - Declaracion implicita.
                - Declaracion explicita.
        */

        // Declaracion implicita.
        int[] numeros = {1, 2, 3, 4, 5}; // array de 5 elementos de tipo int.

        // Declaracion explicita.
        int[] numeros2 = new int[5]; // array de 5 elementos de tipo int.

        /*
            Los arrays se pueden recorrer de dos formas:
                - Recorrido con for.
                - Recorrido con for each.
        */

        // Recorrido con for.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Recorrido con for each.
        /*
            El bucle forEach es una variante del bucle for que nos permite recorrer los elementos de un array.
            La sintaxis del bucle forEach es la siguiente:
                for (tipo nombreVariable : nombreArray) {
                    // Cuerpo del bucle.
                }

                en este tipo de bucle no iteramos sobre el indice del array, sino sobre el valor de cada elemento del array.
                asi, la variable que definimos al principio del bucle (nombreVariable) contendra el valor de cada elemento del array
                dependiendo de la iteracion en la que nos encontremos.
        */
        for (int numero : numeros) {
            System.out.println(numero);
        }

        /*
            Los arrays se pueden inicializar de dos formas:
                - Inicializacion implicita.
                - Inicializacion explicita.
        */

        // Inicializacion implicita.
        int[] numeros3 = {1, 2, 3, 4, 5}; // array de 5 elementos de tipo int.

        // Inicializacion explicita.
        int[] numeros4 = new int[5]; // array de 5 elementos de tipo int.
        numeros4[0] = 1;
        numeros4[1] = 2;
        numeros4[2] = 3;
        numeros4[3] = 4;
        numeros4[4] = 5;

        /*
            Los arrays se pueden copiar de forma implicita
        */

        // Copia implicita.
        int[] numeros5 = {1, 2, 3, 4, 5}; // array de 5 elementos de tipo int.
        int[] numeros6 = numeros5; // copia implicita del array numeros5 en el array numeros6.
    }
}
