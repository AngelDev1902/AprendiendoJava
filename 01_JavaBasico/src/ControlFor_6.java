public class ControlFor_6 {
    public static void main(String[] args) {
        /*
            La estructura de control for pertenece alas estructuras de control repetitivas o bucles.
            La estructura de control for se utiliza cuando se conoce el numero de veces que se va a repetir
            un bloque de instrucciones. A esta estructura de control se le conoce como bucle determinado o definido.
            Se compone de tres partes:
                - Inicializacion de la variable de control.
                - Condicion de continuacion.
                - Incremento o decremento de la variable de control.

            Sintaxis:
                for (inicializacion; condicion; incremento/decremento) {
                    bloque de instrucciones;
                }

            Ejemplo:
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }

             En donde i es la variable de control, la cual se inicializa en 0, la condicion es que i sea menor a 10
                y el incremento es de 1 en 1.
        */

        // Imprimir los numeros del 1 al 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Imprimir los numeros del 10 al 1.
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Imprimir los numeros pares del 1 al 10.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // otra forma de imprimir los numeros pares del 1 al 10.
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
