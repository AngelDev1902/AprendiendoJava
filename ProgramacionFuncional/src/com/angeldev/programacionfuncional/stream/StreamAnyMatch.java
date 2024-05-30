package com.angeldev.programacionfuncional.stream;

import java.util.stream.Stream;

public class StreamAnyMatch {
    public static void main(String[] args) {
        /*
         * anyMatch() es una funcion que recibe como parametro un Stream de objetos del tipo que especifiquemos
         * en el generico y una funcion que se aplicara a cada uno de los elementos del flujo
         * devolviendo un booleano si alguno de los elementos cumple la condicion.
         * */
        Stream<String> nombres = Stream.of("Paco", "Pepe", "Pedro", "Maria");
        boolean algunoEmpiezaPorP = nombres.anyMatch(nombre -> nombre.startsWith("P"));
        System.out.println(algunoEmpiezaPorP);

        Stream<Integer> numeros = Stream.of(1, 2, 3, 4, 5);
        boolean algunoEsPar = numeros.anyMatch(numero -> numero % 2 == 0);
        System.out.println(algunoEsPar);
    }
}
