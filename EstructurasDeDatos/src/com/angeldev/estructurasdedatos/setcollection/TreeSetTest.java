package com.angeldev.estructurasdedatos.setcollection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
* Los tree set son estructuras de datos que no permiten elementos duplicados
* pero a diferencia de los hash set si tienen un orden definido. Que es el
* orden natural de los elementos o el orden definido por un comparador, es decir
* solo acepta tipos de datos comparables entre sí. Basado
* en su valor unicode.
*
* Esto implica un costo en tiempo de ejecución mayor al de los hash set.
* */

public class TreeSetTest {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println(ts); // [cinco, cuatro, dos, tres, uno]

        // Mediante un comparador personalizado en una expresión lambda, modificamos el orden
        // de los elementos del tree set.
        Set<Integer> numeros = new TreeSet<>((a, b) -> {
            return b.compareTo(a);
        });
        numeros.add(5);
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        System.out.println(numeros); // [1, 2, 3, 4, 5]
    }
}
