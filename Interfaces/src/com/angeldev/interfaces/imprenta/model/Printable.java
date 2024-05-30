package com.angeldev.interfaces.imprenta.model;

/*
* Una interfaz es una coleccion de metodos abstractos y constantes que
* sirven para definir un comportamiento que puede tener una clase.
*
* Una interfaz no puede ser instanciada.
*
* Es importante remarcar que la diferencia entre una interfaz y una clase
* abstracta es que la interfaz no puede tener metodos concretos, solo
* metodos abstractos y constantes. Además de Establecer unicamente
* comportamientos. Mientras que una clase abstracta puede tener metodos
* concretos y establecer comportamientos y atributos. creando una jerarquia
* de clases.
* */

public interface Printable {
    // Constante
    final static String TEXT = "I am a printable object";

    // Metodo con una implementacion por defecto desde Java 8
    // Pero que aun asi puede ser sobreescrito
    default String print(){
        return TEXT;
    }

    // Metodo statico
    static void printSheet(Printable printable) {
        System.out.println(printable.print());
    }
}
