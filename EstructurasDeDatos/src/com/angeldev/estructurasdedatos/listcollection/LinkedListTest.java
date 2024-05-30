package com.angeldev.estructurasdedatos.listcollection;

/*
* Las Linked List es una estructura de datos que almacena datos de manera secuencial
* y dinamica,  mediante nodos (listas doblemente enlazadas) o referencias. Utiliza el principio FIFO (First In First Out),
* es decir, que el primer elemento en entrar es el primero en salir. PErmiten elementos duplicados.
*
* Su manipulacion es mas sencilla que la de los ArrayList, ya que no es necesario desplazar
* los elementos para insertar o eliminar un elemento, pero su rendimiento es menor.
* si no, que solo se debe cambiar las referencias de los nodos.
*
* puede ser tratada como una pila o una cola, dependiendo de la referencia que se utilice
* para acceder a los elementos. Ya que permite agregar y eliminar elementos por ambos extremos.
*
* */

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");

        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // agregar elementos al inicio de la lista
        lista.addFirst("cero");
        // otra forma de agregar al inicio de la lista
        lista.add(0, "-uno");

        System.out.println("Lista con elementos agregados al inicio");

        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // eliminar elementos al inicio de la lista
        lista.removeFirst();
        // otra forma de eliminar al inicio de la lista
        lista.remove(0);

        // eliminar elementos al final de la lista
        lista.removeLast();

        // eliminar cualquier elemento de la lista
        lista.remove("dos");
        // otra forma de eliminar cualquier elemento de la lista
        lista.remove(1);

        // limpiar la lista
        lista.clear();

        // metodos utiles
        lista.isEmpty(); // devuelve true si la lista esta vacia
        lista.contains("Hola"); // devuelve true si la lista contiene el elemento
        lista.indexOf("Hola"); // devuelve el indice del elemento
        lista.size(); // devuelve el tamaño de la lista
        lista.get(0); // devuelve el elemento en la posicion indicada
        lista.set(0, "Hola"); // reemplaza el elemento en la posicion indicada
        lista.toArray(); // devuelve un array con los elementos de la lista

    }
}
