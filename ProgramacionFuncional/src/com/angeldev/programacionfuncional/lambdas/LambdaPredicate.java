package com.angeldev.programacionfuncional.lambdas;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {
        /*
        * La lambda Predicate siempre devuelve un valor booleano, por lo que se puede utilizar para realizar
        * validaciones. y no es necesario indicar el tipo de dato que devuelve.
        * Unicamente recibe un parametro. y se ejecuta con el metodo test.
        * */

        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10));

        Predicate<String> predicate2 = x -> x.length() > 5;
        System.out.println(predicate2.test("Hola mundo"));

        BiPredicate<String, String> biPredicate = String::equals;
        System.out.println(biPredicate.test("Hola", "Hola"));
    }
}
