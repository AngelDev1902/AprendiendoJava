package com.angeldev.programacionfuncional.stream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        /*
        * Map es una funcion que recibe como parametro un Stream de objetos del tipo que especifiquemos
        * en el generico y una funcion que se aplicara a cada uno de los elementos del flujo
        * devolviendo un nuevo stream con los elementos modificados. Es decir, el Stream original
        * no se modifica, se crea uno nuevo con los elementos modificados.
        * */

        Stream<String> nombres = Stream.of("Paco", "Pepe", "Pedro", "Maria");
        Stream<String> nombresMayuscula = nombres.map(String::toUpperCase);
        nombresMayuscula.forEach(System.out::println);

        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> numerosMultiplicados = numeros.map(numero -> numero * 2);
        numerosMultiplicados.forEach(System.out::println);

        List<String> palabras = Arrays.asList("manzana", "banana", "cereza");

        // Transformar cada palabra a su longitud utilizando map() y una expresión lambda
        List<Integer> longitudes = palabras.stream()
                .map(palabra -> palabra.length())
                .collect(Collectors.toList());

        // Imprimir la lista resultante
        System.out.println(longitudes);  // Imprime: [7, 6, 6]
    }
}
