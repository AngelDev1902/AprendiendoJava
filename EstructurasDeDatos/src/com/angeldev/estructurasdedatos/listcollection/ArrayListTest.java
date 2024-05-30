package com.angeldev.estructurasdedatos.listcollection;

/*
* Las Array List es una estructura de datos que almacena datos de manera secuencial
* y dinamica, es decir, que puede crecer o decrecer en tiempo de ejecucion.
*
* Los datos se almacenan en base a indices, es decir, que para acceder a un elemento
* de la lista debemos indicar su posicion o indice. Y permite elementos duplicados.
*
* utiliza el principio FIFO (First In First Out), es decir, que el primer elemento
* en entrar es el primero en salir.
*
* Su desventaja es que al insertar o eliminar un elemento, los elementos que estan
* a continuacion de este deben ser desplazados, lo que puede ser costoso en terminos
* de rendimiento.
* */

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Desde");
        lista.add("Java");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // eliminar elementos de la lista
        lista.remove("Hola");
        // otra forma de eliminar elementos de la lista
        lista.remove(0);

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
