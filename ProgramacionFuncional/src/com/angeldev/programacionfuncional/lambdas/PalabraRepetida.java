package com.angeldev.programacionfuncional.lambdas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class PalabraRepetida {
    public static void main(String[] args) {
        // crear Function que recibe y devuelve un string
        Function<String, String> encontrarPalabra = str -> {
            // separar la cadena por espacios
            String[] palabras = str.split(" ");

            // Mapa para almacenar la cantidad de veces ques e repite cada palabra
            Map<String, Integer> frecuencia = new HashMap<>();

            for (String palabra : palabras) {
                // getOrDefault(palabra a buscar, valor por default si no existe) + 1 para indicar que existe al menos una vez
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }

            // Encontrar la palabra más repetida
            String palabraMasRepetida = "";
            int frecuenciaMaxima = 0;

            for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
                if (entry.getValue() > frecuenciaMaxima) {
                    palabraMasRepetida = entry.getKey();
                    frecuenciaMaxima = entry.getValue();
                }
            }

            return palabraMasRepetida;
        };

        System.out.println(encontrarPalabra.apply("cadena repetida repetida repetida mundo cadena hola mundo repetida"));
    }
}
