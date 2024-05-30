package com.angeldev.programacionfuncional.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUtiles {
    public static void main(String[] args) {
        // distinct() devuelve un flujo con los elementos sin mostrar duplicados
        Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco")
                .distinct()
                .forEach(System.out::println);

        System.out.println("");

        // limit() devuelve un flujo con los primeros n elementos
        Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco")
                .limit(3)
                .forEach(System.out::println);

        System.out.println("");

        // skip() devuelve un flujo saltando los n primeros elementos
        Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco")
                .skip(3)
                .forEach(System.out::println);

        System.out.println("");

        // reduce() devuelve un valor combinando los elementos del flujo
        // en este caso se concatenan los elementos
        // .reduce(valorInicial, (anterior, actual) -> {})
        String resultado = Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco")
                .reduce("", (acumulador, elemento) -> acumulador + " #" + elemento);
        System.out.println(resultado);

        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        int suma = numeros.reduce(0, Integer::sum);
        System.out.println(suma);

        // el 1 lo incluye y el 10 no
        IntStream numeros2 = IntStream.range(1, 10).peek(System.out::println);
        System.out.println(numeros2.sum());

        System.out.println();

        // mapToInt() devuelve un flujo de enteros a partir de un flujo de objetos
        Stream<String> nombres = Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco");
        nombres.mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println();

        // mapToObj() devuelve un flujo de objetos a partir de un flujo de enteros
        IntStream numeros3 = IntStream.range(1, 10);
        numeros3.mapToObj(numero -> "Numero: " + numero)
                .forEach(System.out::println);

        System.out.println();

        // flatMap() devuelve un flujo aplanado a partir de un flujo de flujos
        Stream.of("Paco", "Pepe", "Pedro", "Maria", "Paco")
                // separamos cada nombre en un flujo de caracteres
                .map(nombre -> nombre.split(""))
                // filtramos los caracteres que empiecen por P
                .flatMap(n -> Arrays.stream(n).filter(letra -> letra.startsWith("P")))
                .forEach(System.out::println);

    }
}
