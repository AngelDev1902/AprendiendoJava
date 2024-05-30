import java.util.LinkedList;
import java.util.List;

public class LinkedList_15 {
    public static void main(String[] args) {
        /*
            Una lista enlazada es una estructura de datos dinamica, que funciona de manera similar a un ArrayList.

            La diferencia entre una lista enlazada y un ArrayList es que la lista enlazada no almacena los elementos
            en direcciones de memoria contigua, sino que almacena los elementos en direcciones de memoria no contigua.
            es decir, cada elemento de la lista enlazada apunta a la direccion de memoria del siguiente elemento de la lista.

        */

        // Declaracion  e inicializacion implicita.
        LinkedList<String> nombres2 = new LinkedList<>(); // lista enlazada de elementos de tipo String.
        // para llenar la lista explicita, se debe hacer de la siguiente forma:
        nombres2.add("Juan");
        nombres2.add("Pedro");
        nombres2.add("Maria");
        nombres2.add("Jose");
        nombres2.add("Luis");

        // Inicializacion explicita.
        LinkedList<String> nombres = new LinkedList<>(){
            {
                add("Juan");
                add("Pedro");
                add("Maria");
                add("Jose");
                add("Luis");
            }
        }; // lista enlazada de elementos de tipo String.

        // Recorrido con for.
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }

        // Recorrido con for each.
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Recorrido con iterator.
        java.util.Iterator iterator = nombres.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Eliminar el primer elemento de la lista.
        nombres.removeFirst();

        // Eliminar el ultimo elemento de la lista.
        nombres.removeLast();

        // Eliminar un elemento de la lista por su valor.
        String cadena = "Pedro";

        for (String nombre: nombres) {
            if (nombre.equals(cadena)) {
                nombres.remove(nombre);
                break; // Estom permite a la linkedlist reacomodar los punteros
            }

        }

        // Eliminar todos los elementos de la lista.
        nombres.clear();

        // Copia implicita.
        LinkedList<String> nombres3 = new LinkedList<>(nombres2);

        // Copia explicita.
        LinkedList<String> nombres4 = new LinkedList<>();
        nombres4.addAll(nombres2);

        // Obtener el primer elemento de la lista.
        String primerElemento = nombres2.getFirst();

        // Obtener el ultimo elemento de la lista.
        String ultimoElemento = nombres2.getLast();

        // Obtener un elemento de la lista por su indice.
        String elemento = nombres2.get(1);

        // Obtener el indice de un elemento de la lista.
        int indice = nombres2.indexOf("Pedro");

        // Obtener el tamaño de la lista.
        int tamaño = nombres2.size();

        // Saber si la lista esta vacia.
        boolean estaVacia = nombres2.isEmpty();

        // Saber si la lista contiene un elemento.
        boolean contiene = nombres2.contains("Pedro");

        // Saber si la lista contiene todos los elementos de otra lista.
        boolean contieneTodos = nombres2.containsAll(nombres3);

        // Saber si dos listas son iguales.
        boolean sonIguales = nombres2.equals(nombres3);
    }
}
