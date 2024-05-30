package com.angeldev.programacionfuncional.lambdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaConsumer {
    public static void main(String[] args) {

        /*
        * La clase consumer es una interfaz funcional que recibe un solo parametro (del tipo que se especifique en lel generico)
        * y no devuelve ningun valor.
        * */

        Consumer<String> consumer = (x) -> {
            System.out.println("Parametro sin modificar: " + x);
            System.out.println("Parametro en mayusculas: " + x.toUpperCase());
            System.out.println("Parametro en minusculas: " + x.toLowerCase());
        };

        // Para utilizar la interfaz consumer, se utiliza el metodo accept, el cual recibe el parametro que se va a procesar
        consumer.accept("Hola");

        // Para crear un consumer con dos parametros se utiliza BiConsumer, el cual recibe dos parametros y no devuelve ningun valor.
        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x + " " + y);
        biConsumer.accept("Hola", "Mundo");

        /*
        * En el caso de los consumer podemos ver que en la implememtacion de la interfaz funcional, se esta utilizando el metodo
        * println de la clase System.out, por lo que podemos utilizar una referencia a un metodo para simplificar el codigo.
        * de manera que se indica implicitamente que el parametro que recibe el metodo accept, se va a pasar como parametro al
        * metodo println de la clase System.out
        * */
        Consumer<String> consumerReferenciado = System.out::println;
        consumerReferenciado.accept("Hola mundo");

        /*
        * Una expresion lambda que devuelve unparametro podria ser la interfaz Supplier, la cual no recibe ningun parametro y
        * devuelve un valor.
        * */

        Supplier<String> supplier = () -> "Hola mundo";
        System.out.println(supplier.get());
    }
}
