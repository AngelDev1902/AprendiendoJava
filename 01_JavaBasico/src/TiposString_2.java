public class TiposString_2 {
    public static void main(String[] args) {
        /*
            Los tipos de datos String son una secuencia de caracteres, es decir, una cadena de caracteres.
            Estos no pertenecen a los tipos de datos primitivos de Java, sino que son objetos.
            Por ello estos tienen sus propios metodos y atributos. A su vez que por estandar se escriben con la primera
            letra en mayuscula.

            Al ser una clase, los objetos de esta clase se crean utilizando el operador new, sin embargo, Java
            nos permite crear objetos de esta clase sin utilizar el operador new, esto se debe a que Java
            crea un objeto de esta clase cada vez que se crea una cadena de caracteres, por lo que no es necesario
            utilizar el operador new para crear objetos de esta clase
        */

        // ---- String
        String nombre = "Juan";
        String apellido = new String("Perez");

        System.out.println(nombre);
        System.out.println(apellido);

        // ---- Concatenar
        /*
            La concatenacion es un proceso mediante el cual se unen dos o mas cadenas de caracteres.
            En Java existen tres formas de concatenar cadenas de caracteres:
            - Utilizando el operador + (La forma mas comun)
            - Utilizando el metodo concat()
            - Utilizando el metodo StringBuilder

            Dentro de los cuales el operador + es el mas utilizado, sin embargo, este no es el mas eficiente
            ya que cada vez que se utiliza este operador se crea un nuevo objeto en memoria, lo que puede
            generar un consumo innecesario de recursos.
            El metodo concat() es mas eficiente que el operador +, ya que este no crea un nuevo objeto en memoria
            cada vez que se utiliza, sino que modifica el objeto existente.

            El metodo StringBuilder es el mas eficiente de todos, ya que este no crea un nuevo objeto en memoria
            cada vez que se utiliza, sino que modifica el objeto existente, ademas de que este es mutable, es decir,
            que se puede modificar.
        */

        // ---- Operador +
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

        // ---- Metodo concat()
        String nombreCompleto2 = nombre.concat(" ").concat(apellido);
        System.out.println(nombreCompleto2);

        // ---- Metodo StringBuilder
        StringBuilder sb = new StringBuilder(nombre);
        sb.append(" ");
        sb.append(apellido);
        String nombreCompleto3 = sb.toString();
        System.out.println(nombreCompleto3);

        // ---- Metodos de la clase String
        /*
            La clase String tiene muchos metodos que nos permiten realizar distintas operaciones con cadenas de caracteres,
            algunos de estos metodos son:
            - length(): Devuelve la longitud de la cadena de caracteres
            - charAt(int index): Devuelve el caracter que se encuentra en la posicion index de la cadena de caracteres
            - toUpperCase(): Devuelve la cadena de caracteres en mayusculas
            - toLowerCase(): Devuelve la cadena de caracteres en minusculas
            - trim(): Devuelve la cadena de caracteres sin espacios al inicio y al final
            - substring(int beginIndex, int endIndex): Devuelve una subcadena de la cadena de caracteres desde beginIndex hasta endIndex
            - substring(int beginIndex): Devuelve una subcadena de la cadena de caracteres desde beginIndex hasta el final
            - replace(char oldChar, char newChar): Devuelve una cadena de caracteres reemplazando el caracter oldChar por el caracter newChar
            - equals(String str): Devuelve true si la cadena de caracteres es igual a str (sensible a mayusculas y minusculas). Comparar cadenas de caracteres con == no es recomendable
            - equalsIgnoreCase(String str): Devuelve true si la cadena de caracteres es igual a str sin importar mayusculas o minusculas
            - startsWith(String str): Devuelve true si la cadena de caracteres comienza con str
            - endsWith(String str): Devuelve true si la cadena de caracteres termina con str
            - contains(String str): Devuelve true si la cadena de caracteres contiene str
            - indexOf(String str): Devuelve la posicion de la primera ocurrencia de str en la cadena de caracteres
            - lastIndexOf(String str): Devuelve la posicion de la ultima ocurrencia de str en la cadena de caracteres
            - isEmpty(): Devuelve true si la cadena de caracteres esta vacia
            - split(String str): Devuelve un arreglo de cadenas de caracteres separadas por str (separa la cadena de caracteres en base a str)
            - join(String str, String[] arr): Devuelve una cadena de caracteres uniendo los elementos del arreglo arr separados por str
        */

    }
}
