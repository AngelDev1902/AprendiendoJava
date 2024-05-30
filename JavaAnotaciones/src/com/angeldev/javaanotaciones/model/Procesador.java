package com.angeldev.javaanotaciones.model;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Procesador {
    public static String convertirAJson(Object object) {
        // retornamos los atributos de la clase Producto (nombre, precio, fecha)
        Field[] atributos = object.getClass().getDeclaredFields();

        return Arrays.stream(atributos)
                // filtramos los atributos que tengan la anotación @JsonAtributo
                .filter(field -> field.isAnnotationPresent(JsonAtributo.class))
                // convertimos a una estructura Json
                .map(field -> {
                    // hacemos accesible el atributo
                    field.setAccessible(true);
                    // obtenemos el nombre del atributo
                    String nombreAtributo = field.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? field.getName()
                            : field.getAnnotation(JsonAtributo.class).nombre();

                    // retornamos el atributo en formato Json
                    try {
                        return "\"" + nombreAtributo + "\":\"" + field.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error al serializar el atributo " + field.getName());
                    }
                })
                .reduce("{", (a, b) -> {
                    if (a.equals("{")) {
                        return a + b;
                    } else {
                        return a + "," + b;
                    }
                }).concat("}");
    }
}
