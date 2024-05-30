package com.angeldev.programacionfuncional.stream;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class StreamGenerate {
    public static void main(String[] args) {
        /*
        * Generate funciona para crear un flujo infinito de elementos
        * o limitado con el operador limit()
        * */

        Stream.generate(() -> {
            try {
                // Simulamos una tarea que tarda 1 segundo
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // despues de 1 segundo devolvemos un String
            return "Hola mundo";
                })
                // limitamos el flujo a 5 elementos
                .limit(5)
                .forEach(System.out::println);
    }
}
