package com.angeldev.javaanotaciones.model;

import java.lang.annotation.*;

// Se indica que esta anotación se puede heredar a las clases hijas
@Documented
// Esta anotación se aplicará a los atributos de la clase
@Target(ElementType.FIELD)
// En que contexto se puede aplicar esta anotación (Runtime, Source, Class)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    String nombre() default "";
}
