package com.angeldev.estructurasdedatos.listcollection;

/*
* Las Stacks es una estructura de datos que almacena datos de manera secuencial
*
* Funciona con el principio LIFO (Last In First Out), es decir, que el ultimo elemento
* en entrar es el primero en salir.
*
*
* */

import java.util.Stack;

public class StaksTest {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        pila.push("uno");
        pila.push("dos");
        pila.push("tres");
        pila.push("cuatro");

        // obtener el elemento que esta en la cima de la pila
        System.out.println(pila.peek());

        // eliminar el elemento que esta en la cima de la pila
        System.out.println(pila.pop());

        // obtener el tamaño de la pila
        System.out.println(pila.size());

        // saber si la pila esta vacia
        System.out.println(pila.isEmpty());

        // buscar cualquier elemento en la pila
        System.out.println(pila.search("uno")); // devuelve la posicion del elemento en la pila

        // recorrer la pila
        for (String elemento : pila) {
            System.out.println(elemento);
        }

        // limpiar la pila
        pila.clear();

        // metodos utiles
        pila.isEmpty(); // devuelve true si la pila esta vacia
        pila.contains("Hola"); // devuelve true si la pila contiene el elemento
        pila.size(); // devuelve el tamaño de la pila
        pila.peek(); // devuelve el elemento que esta en la cima de la pila
        pila.pop(); // elimina el elemento que esta en la cima de la pila
        pila.push("Hola"); // agrega un elemento a la cima de la pila
    }
}
