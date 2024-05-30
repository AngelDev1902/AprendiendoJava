import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * Las colecciones son estructuras de datos que nos permiten almacenar
        * objetos del mismo tipo de manera eficiente.
        *
        * Dentro de java existen dos tipos de colecciones:
        *
        * 1. Colecciones: Son las colecciones que se crearon antes de la version 1.5
        * 2. Mapas: Son las colecciones que se crearon a partir de la version 1.5
        *
        * Dentro de las colecciones tenemos:
        * - Listas
        * - Conjuntos
        * - Colas
        * - Pilas
        *
        * Dentro de los mapas tenemos:
        * - HashMap
        * - TreeMap
        * - LinkedHashMap
        *
        * Las formas de iterar sobre una coleccion son:
        * */

        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Desde");
        lista.add("Java");

        // 1. For each
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // 2. For tradicional
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        // 3. While
        int i = 0;
        while (i < lista.size()) {
            System.out.println(lista.get(i));
            i++;
        }

        // 4. Iterator
        Iterator iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // 5. Stream
        lista.stream().forEach(elemento -> {
            System.out.println(elemento);
        });
    }
}