public class ControlWhile_7 {
    public static void main(String[] args) {
        /*
            La estructura de control while pertenece a las estructuras de control repetitivas o bucles.
            La estructura de control while se utiliza cuando no se conoce el numero de veces que se va a repetir
            un bloque de instrucciones. A esta estructura de control se le conoce como bucle indeterminado o indefinido.
            Se compone de dos partes:
                - Condicion de continuacion.
                - Incremento o decremento de la variable de control.

            Sintaxis:
                while (condicion) {
                    bloque de instrucciones;
                }

            Ejemplo:
                int i = 0;
                while (i < 10) {
                    System.out.println(i);
                    i++;
                }

             En donde i es la variable de control, la cual se inicializa en 0, la condicion es que i sea menor a 10
                y el incremento es de 1 en 1.
        */

        // ingresar numeros hasta que se ingrese un 0.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();
        }


        /*
            Una variante de la estructura de control while es la estructura de control do-while.
            La diferencia entre la estructura de control while y la estructura de control do-while es que
            la estructura de control do-while ejecuta el bloque de instrucciones al menos una vez.
            para depues evaluar la condicion de continuacion.
            su sintaxis es la siguiente:
                do {
                    bloque de instrucciones;
                } while (condicion);
        */

        // ingresar numeros hasta que se ingrese un 0.
        int numero2;

        do {
            System.out.print("Ingrese un numero: ");
            numero2 = scanner.nextInt();
        } while (numero2 != 0);
    }
}
