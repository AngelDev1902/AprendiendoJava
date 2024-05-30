package com.angeldev.estructurasdedatos.setcollection;

/*
* Los set son estructuras de datos que no permiten elementos duplicados
* y no tienen un orden definido.Implementan la interfaz Set.
* */

// HashSet es una implementación de Set que no permite elementos duplicados
// y no tiene un orden definido.

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs); // [cinco, uno, dos, tres, cuatro]

        Boolean b = hs.add("uno");

        System.out.println("Permite elementos duplicados: " + b); // Permite elementos duplicados: false
        System.out.println(hs); // [cinco, uno, dos, tres, cuatro]

        String[] peces = {"carpa", "sardina", "atún", "pez payaso", "pez globo", "pez payaso"};

        Set<String> unicos = new HashSet<>();

        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
            }
        }

        System.out.println("Elementos no duplicados: " + unicos);
    }
}
