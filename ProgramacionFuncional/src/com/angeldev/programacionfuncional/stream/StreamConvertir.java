package com.angeldev.programacionfuncional.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamConvertir {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Paco", "Perez"));
        usuarios.add(new Usuario("Pepe", "Garcia"));
        usuarios.add(new Usuario("Maria", "Lopez"));
        usuarios.add(new Usuario("Pedro", "Gomez"));

        // convertir a stream
        usuarios.stream();

        // convertir a list
        Stream<String> nombres = usuarios.stream()
                // concatenamos cada nombre y apellido en un solo string y convertimos a mayusculas
                .map(u ->
                        u.getNombre().toUpperCase()
                        .concat(" ")
                        .concat(u.getApellido().toUpperCase()))
                // filtramos por pepe
                .flatMap(n -> {
                    if (n.contains("PEPE")) {
                        return Stream.of(n);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        // convertir a array
        String[] nombresArray = nombres.toArray(String[]::new);
    }
}
