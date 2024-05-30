public class ClasesWrapper_9 {
    public static void main(String[] args) {
        /*
            Las clases wrapper son clases que representan a los tipos primitivos como objetos.
                - Byte -> byte
                - Short -> short
                - Integer -> int
                - Long -> long
                - Float -> float
                - Double -> double
                - Character -> char
                - Boolean -> boolean

            Tienen metodos para convertir de un tipo primitivo a un objeto y viceversa.
            Tambien tienen metodos para convertir de un tipo primitivo a otro tipo primitivo y viceversa.

            Funcionan como un envoltorio de los tipos primitivos.
        */

        // Integer
        Integer i = Integer.valueOf(112358);
        String s = i.toString();
        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();
        byte b = i.byteValue();
        short sh = i.shortValue();
        int k = Integer.parseInt("112358");

        /*
            Con los tipos short, byte, long, float y double se puede hacer lo mismo que con el tipo int.
            sustituyendo Integer por el tipo correspondiente.
        */

        // Character
        Character c = Character.valueOf('a'); // convierte a Character
        char ch = c.charValue(); // convierte a char
        String s2 = c.toString(); // convierte a String
        int i2 = c.compareTo('b'); // compara el valor
        boolean b2 = c.equals('a'); // compara el valor
        boolean b3 = Character.isDigit('a'); // digito
        boolean b4 = Character.isLetter('a'); // letra
        boolean b5 = Character.isLetterOrDigit('a'); // letra o digito
        boolean b6 = Character.isLowerCase('a'); // minuscula
        boolean b7 = Character.isUpperCase('a'); // mayuscula
        boolean b8 = Character.isWhitespace('a'); // espacio en blanco
        char ch2 = Character.toLowerCase('A'); // minuscula
        char ch3 = Character.toUpperCase('a'); // mayuscula
        String s3 = Character.toString('a'); // convierte a String

        // Boolean
        Boolean b9 = Boolean.valueOf(true); // convierte a Boolean
        boolean b10 = b9.booleanValue(); // convierte a boolean
        String s4 = b9.toString(); // convierte a String
        boolean b11 = b9.equals(true); // compara el valor
        boolean b12 = Boolean.parseBoolean("true"); // convierte a boolean

    }
}
