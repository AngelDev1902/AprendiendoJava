package com.angeldev.programacionfuncional.stream;

import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
/*
        * Filter es una funcion que recibe como parametro un Stream de objetos del tipo que especifiquemos
        * en el generico y una funcion que se aplicara a cada uno de los elementos del flujo
        * devolviendo un nuevo stream con los elementos que cumplan la condicion. Es decir, el Stream original
        * no se modifica, se crea uno nuevo con los elementos que cumplan la condicion.
        * */

        Stream<String> nombres = Stream.of("Paco", "Pepe", "Pedro", "Maria");
        Stream<String> nombresConP = nombres.filter(nombre -> nombre.startsWith("P"));
        nombresConP.forEach(System.out::println);

        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> numerosPares = numeros.filter(numero -> numero % 2 == 0);
        numerosPares.forEach(System.out::println);
    }
}
