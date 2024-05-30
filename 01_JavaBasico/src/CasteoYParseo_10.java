public class CasteoYParseo_10 {
    public static void main(String[] args) {
        /*
            El casteo y parseo son conversiones de un tipo de dato a otro tipo de dato.
            se puede realizar de dos formas:
                - Implicito.
                - Explicito.
        */

        // Casteo implicito.
        int i = 10;
        long l = i; // casteo implicito de int a long.

        // Casteo explicito.
        long l2 = 10;
        int i2 = (int) l2; // casteo explicito de long a int.

        // Parseo implicito.
        String s = "10";
        int i3 = Integer.parseInt(s); // parseo implicito de String a int.

        // Parseo explicito.
        int i4 = 10;
        String s2 = String.valueOf(i4); // parseo explicito de int a String.

        /*
            El parseo implicito se realiza cuando se convierte de un tipo de dato a otro tipo de dato
            que es mas grande que el tipo de dato original.
            El parseo explicito se realiza cuando se convierte de un tipo de dato a otro tipo de dato
            que es mas pequeño que el tipo de dato original.

            El parseo implicito se realiza de forma automatica por el compilador.
            El parseo explicito se realiza de forma manual por el programador.

            La diferencia entre el casteo y el parseo es que el casteo se realiza entre tipos de datos
            que son compatibles entre si, mientras que el parseo se realiza entre tipos de datos que no son
            compatibles entre si.
        */
    }
}
