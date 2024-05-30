package com.angeldev.programacionfuncional.stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        /*
        * La clase Stream recibe por parametro un array de objetos del tipo que especifiquemos
        * en el generico para crear con este un flujo con cada uno de los elementos del array
        * */
        Stream<String> nombres = Stream.of("Paco", "Pepe", "Pedro", "Maria");
        nombres.forEach(System.out::println);

        // a partir de un arreglo
        String[] nombres2 = {"Paco", "Pepe", "Pedro", "Maria"};
        nombres = Arrays.stream(nombres2);
        nombres.forEach(System.out::println);

        // a partir de una collection
        List<String> nombres3 = new ArrayList<>();
        nombres3.add("Paco");
        nombres3.add("Pepe");
        nombres3.add("Pedro");
        nombres3.add("Maria");

        nombres = nombres3.stream();
        nombres.forEach(System.out::println);

        nombres3.forEach(System.out::println);
    }
}
