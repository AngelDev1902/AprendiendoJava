public class ControlFlujo_8 {
    public static void main(String[] args) {
        /*
            El flujo de ejecucion de las estructuras de control repetitivas o bucles se puede alterar con las
            estructuras de control break y continue.

            La estructura de control break se utiliza para salir de un bucle.
            La estructura de control continue se utiliza para saltar una iteracion de un bucle.

            Ejemplo:
                for (int i = 1; i <= 10; i++) {
                    if (i == 5) {
                        break;
                    }
                    System.out.println(i);
                }

                en este ejemplo se imprimen los numeros del 1 al 4, pero cuando i es igual a 5 se sale del bucle.

                for (int i = 1; i <= 10; i++) {
                    if (i == 5) {
                        continue;
                    }
                    System.out.println(i);
                }

                   en este ejemplo se imprimen los numeros del 1 al 10, pero cuando i es igual a 5 se salta la iteracion.
                   y continua con el flujode ejecucion del bucle.
        */

        // Imprimir los numeros del 1 al 10, pero cuando i es igual a 5 se sale del bucle.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // Imprimir los numeros del 1 al 10, pero cuando i es igual a 5 se salta la iteracion.
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        /*
            Cuanto existen estructuras de control anidadas, las estructuras de control break y continue
            afectan a la estructura de control mas cercana.

            Si lo que queremos es afectar a una estructura de control mas externa, podemos utilizar etiquetas.
            Las etiquetas se colocan antes de la estructura de control que queremos afectar y se cierran con dos puntos.
            Asi, cuando invoque a la estructura de control break o continue, se colocara el nombre de la etiqueta a la que
            queremos afectar.
        */

        // Imprimir los numeros del 1 al 10, 10 veces, pero cuando i es igual a 5 se sale del bucle.
        etiqueta1: for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 5) {
                    break etiqueta1;
                }
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        // Imprimir los numeros del 1 al 10, 10 veces, pero cuando i es igual a 5 se salta la iteracion.
        etiqueta2: for (int i = 1; i <= 10; i++) {
            etiqueta3: for (int j = 1; j <= 10; j++) {
                if (i == 5) {
                    continue etiqueta2;
                } else if (i == 6) {
                    continue etiqueta3;
                }
                System.out.println(j + "\t");
            }
            System.out.println();
        }


    }
}
