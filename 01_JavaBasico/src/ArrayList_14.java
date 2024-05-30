import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_14 {
    public static void main(String[] args) {
        /*
            Un ArrayList es una estructura de datos dinamica, que almacena informacion del mismo tipo.
            Los ArrayList se utilizan para almacenar datos de forma ordenada. En direcciones de memoria contigua.

            Funcionan bajo el principio FIFO (First In First Out),
            es decir, el primer elemento en entrar es el primero en salir.

            En otras palabras, el primer elemento que se agrega al ArrayList es el primero que se elimina del ArrayList.
            el cual permanece en su posicion original dentro del ArrayList durante todo el tiempo que este en el.
            Y cuando se agrega un nuevo elemento al ArrayList, este se agrega al final del ArrayList.

            Los ArrayList se pueden inicializar de dos formas:
                - Inicializacion implicita.
                - Inicializacion explicita.
        */

        // Inicializacion implicita.
        List<String> nombres = new ArrayList<>(){
            {
                add("Juan");
                add("Pedro");
                add("Maria");
                add("Jose");
            }
        }; // ArrayList de tipo String.

        // Inicializacion explicita.
        List<String> nombres2 = new ArrayList<>(); // ArrayList de tipo String.
        nombres2.add("Juan");
        nombres2.add("Pedro");
        nombres2.add("Maria");
        nombres2.add("Jose");

        /*
            Los ArrayList se pueden recorrer de tres formas:
                - Recorrido con for.
                - Recorrido con for each.
                - Recorrido con iterator.
        */

        // Recorrido con for.
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // Recorrido con for each.
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Recorrido con iterator.
        Iterator iterator = nombres.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Eliminar el primer elemento del ArrayList.
        nombres.remove(0);

        // Eliminar el ultimo elemento del ArrayList.
        nombres.remove(nombres.size() - 1);

        // Eliminar un elemento del ArrayList.
        nombres.remove("Pedro");

        // Eliminar todos los elementos del ArrayList.
        nombres.clear();

        // Copia implicita.
        List<String> nombres3 = new ArrayList<>(nombres2);

        // tamaño del ArrayList.
        System.out.println(nombres2.size());

        // comprobar si el ArrayList esta vacio.
        System.out.println(nombres2.isEmpty());

        // comprobar si el ArrayList contiene un elemento.
        System.out.println(nombres2.contains("Juan"));

        // obtener el indice de un elemento.
        System.out.println(nombres2.indexOf("Juan"));

        // obtener el elemento de un indice.
        System.out.println(nombres2.get(0));

        // convertir un ArrayList en un array.
        String[] nombresArray = nombres2.toArray(new String[0]);
    }
}
