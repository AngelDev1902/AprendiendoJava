public class DatosPrimitivos_1 {
    public static void main(String[] args) {
        /* Tipos de datos */

        /*
            Tipos Numericos

            Cada tipo de dato tiene un alcance especifico que depende de las combinaciones posibles que pueden generarse
            a partir de su capacidad, esta capacidad esta definida como: n bits = 2^n combinaciones.

            Asi, por ejemplo, para los tipos de dato byte, que tienen capacidad de 8 bits, tendremos que su alcance es:
            2⁸ = 256, este valor lo dividimos entre 2, para obtener el alcance tanto en valores positivos como negativos
            256 / 2 = 128, lo que nos da como resultado -128 y 127 ya que se incluye el 0.

             Aunque short y byte utilizan menos memoria que int, la diferencia es insignificante en la
             mayoría de los casos 1. Además, el uso de int es más eficiente en términos de velocidad de procesamiento,
             ya que los procesadores modernos están optimizados para trabajar con datos de 32 bits
        */

        // ---- Byte 1 byte (-128 a 127)
        byte b = 10;

        // ---- Short 2 bytes (-32,768 a 32,767)
        short s = 100;

        // ---- Enteros 4 bytes -2 147 483 648 a 2 144 483 647
        int i = 500;

        /*
            Para los tipos de dato decimales, la forma de almacenar la informacion es distinta,
            esta utiliza un estandar denominado IEEE 754 para la aritmetica en punto flotante. De ahi aparecen
            las dos preciciones en numeros flotantes

            - Simple precicion: utiliza 32 bits de base 2, se conoce como binary32
            - Doble precicion: utiliza 64 bits de base 2, se conoce como binary64
            que representan la cantidad de bits que se utilizan para almacenar la informacion.

            de manera resumida, la forma de distribucion de los bites se da de la siguiente manera en 32bits:
            - 1 bit para el signo
            - 8 bits para el exponente (parte entera)
            - 23 bits para la mantisa (parte decimal)
            esto ofrece una precision de 7 digitos decimales

            y en 64 bits:
            - 1 bit para el signo
            - 11 bits para el exponente (parte entera)
            - 52 bits para la mantisa (parte decimal)
            esto ofrece una precision de 15 digitos decimales

        */

        // ---- long 8 bytes
        long l = 41624998;

        // ---- Float 4 bytes
        float f = 10.5f;

        // ---- Double 8 bytes
        double d = 10.558741122684;

        // ---- Boleanos (verdadero o falso) 1 bit
        boolean bool = false;

        /*
            Para el caso de los caracteres se puede alamacenar un valor de dos formas:
            - Como un numero entero que representa el valor de la tabla ASCII
            - Como un caracter entre comillas simples
        */

        // --- Char 2 bytes
        char c = 'a';
        char n = 65; // A
    }
}
