public class ControlIf_4 {
    public static void main(String[] args) {
        /*
            - La estructua de control if permite ejecutar un bloque de código si se cumple una condición.
            - su variante if else permite ejecutar un bloque de código si se cumple una condición
            y otro bloque de código si no se cumple la condición.
            - su variante if else if permite ejecutar un bloque de código si se cumple una condición
            y otro bloque de código si no se cumple la condición, pero además permite evaluar otra condición
            si la primera no se cumple.

            Su sintaxis es la siguiente:
            if (condicion) {
                // codigo a ejecutar si se cumple la condicion
            } else if (condicion) {
                // codigo a ejecutar si no se cumple la condicion anterior y se cumple esta
            } else {
                // codigo a ejecutar si no se cumple ninguna de las condiciones anteriores
            }

            cuando el codigo a ejecutar es de una sola linea, no es necesario utilizar llaves.
        */
        int a = 10;
        int b = 20;

        if (a > b)
            System.out.println("a is greater than b");
        else if (a < b)
            System.out.println("a is less than b");
        else if (a == b)
            System.out.println("a is equal to b");
    }
}
