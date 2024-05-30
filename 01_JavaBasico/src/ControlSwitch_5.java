public class ControlSwitch_5 {
    public static void main(String[] args) {
        /*
            - La estructura de control switch permite ejecutar un bloque de código dependiendo del valor de una variable.
            - Su sintaxis es la siguiente:
            switch (variable) {
                case valor1:
                    // codigo a ejecutar si la variable tiene el valor1
                    break;
                case valor2:
                    // codigo a ejecutar si la variable tiene el valor2
                    break;
                default:
                    // codigo a ejecutar si la variable no tiene ninguno de los valores anteriores
            }

            - La palabra reservada break es necesaria para indicar que se debe salir de la estructura switch.
            - La palabra reservada default es opcional y se ejecuta si la variable no tiene ninguno de los valores
            indicados en los case.
            - La variable puede ser de tipo int, char, String o enum.
            - Los valores de los case deben ser constantes, no se pueden utilizar variables.
            - Los valores de los case deben ser unicos, no se pueden repetir.
            - Los valores de los case deben ser del mismo tipo que la variable.

            Cuando se quiere ejecutar el mismo codigo para varios valores, se pueden agrupar los case:
            switch (variable) {
                case valor1:
                case valor2:
                case valor3:
                    // codigo a ejecutar si la variable tiene el valor1, valor2 o valor3
                    break;
                default:
                    // codigo a ejecutar si la variable no tiene ninguno de los valores anteriores
            }
        */
       int a = 10;
        int b = 20;

        switch (a) {
            case 10:
                System.out.println("a is equal to 10");
                break;
            case 20:
                System.out.println("a is equal to 20");
                break;
            default:
                System.out.println("a is not equal to 10 or 20");
        }

        switch (b) {
            case 10:
                System.out.println("b is equal to 10");
                break;
            case 20:
                System.out.println("b is equal to 20");
                break;
            default:
                System.out.println("b is not equal to 10 or 20");
        }

        String c = "Hello";

        switch (c) {
            case "Hello":
                System.out.println("c is equal to Hello");
                break;
            case "World":
                System.out.println("c is equal to World");
                break;
            default:
                System.out.println("c is not equal to Hello");
        }

        /*
            A partir de java 13 se introducen nuevas funcionalidades entre las cuales se incluyen las funciones de cambio
            en este caso se utiliza la palabra reservada yield para devolver un valor dependiendo del caso en el que
            entre el switch, automaticamente esta funcion devuelve el valor y sale del switch, no es necesario utilizar
            la palabra reservada break.

            De esta manera es posible asignar un valor a una variable dependiendo del caso en el que entre un switch.

            Solo es compatible con java 13 o superior.
        */

        String cadena = "Pepe";

        String name = switch (cadena) {
            case "Luis":
                yield "Hola Luis";

            case "Angel":
                yield "Hola Angel";

            default:
                yield "Hola desconocido";
        };

        String name2 = getSaludo("Angel");

        System.out.println(name);
        System.out.println(name2);
    }

    static String getSaludo(String cadena){
        switch (cadena){
            case "Luis":
                return "Hola Luis";
            case "Angel":
                return "Hola Angel";
            default:
                return "Hola desconocido";
        }
    }

}
