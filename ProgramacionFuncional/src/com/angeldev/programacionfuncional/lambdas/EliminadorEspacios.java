package com.angeldev.programacionfuncional.lambdas;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

public class EliminadorEspacios {
    public static void main(String[] args) {
        // crear Function que recibe y devuelve un string
        Function<String, String> eliminador = s -> {
            // Convertir la cadena de entrada en un arreglo de caracteres
            char[] chars = s.toCharArray();
            // Crear un StringBuilder para construir la cadena resultante
            StringBuilder builder = new StringBuilder();

            // Iterar sobre cada carácter del arreglo
            for (char c : chars) {
                // Si el carácter no es un espacio, agregarlo al StringBuilder
                if (c != ' ') {
                    builder.append(c);
                }
            }

            return builder.toString();
        };

        System.out.println(eliminador.apply("Esta es una cadena con espacios"));
    }
}
