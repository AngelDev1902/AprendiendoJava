import java.util.Stack;

public class Stack_16 {
    public static void main(String[] args) {
        /*
            Una pila es una estructura de datos dinamica, que funciona de manera similar a una Lista.

            La diferencia entre una pila y una Lista es que la pila es una estructura de datos LIFO (Last In First Out),
            es decir, el ultimo elemento en entrar es el primero en salir.

            Las pilas se utilizan para almacenar datos de forma ordenada. En direcciones de memoria contigua.
        */

        // Declaracion implicita.
        Stack<String> nombres2 = new Stack<>(); // pila de elementos de tipo String.
        // para llenar la pila explicita, se debe hacer de la siguiente forma:
        nombres2.push("Juan");
        nombres2.push("Pedro");
        nombres2.push("Maria");
        nombres2.push("Jose");
        nombres2.push("Luis");

        // Inicializacion explicita.
        Stack<String> nombres = new Stack<>(){
            {
                push("Juan");
                push("Pedro");
                push("Maria");
                push("Jose");
                push("Luis");
            }
        }; // pila de elementos de tipo String.

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

        // Eliminar el ultimo elemento de la pila.
        nombres.pop();

        // Buscar un elemento en la pila.
        nombres.search("Pedro");

        // Obtener el ultimo elemento de la pila.
        nombres.peek();

        // Eliminar todos los elementos de la pila.
        nombres.clear();
    }
}
