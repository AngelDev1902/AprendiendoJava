package com.angeldev.programacionfuncional.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaFunction {
    public static void main(String[] args) {
        // Una combinacion de la lambda consumer y supplier es la funcion, la cual recibe un parametro y devuelve un valor
        // esta se ejecuta con el metodo apply
        Function<String, String> function = x -> ("Hola mi nombre es: " + x).toUpperCase();
        System.out.println(function.apply("Luis"));

        BiFunction<Integer, Integer, String> operar = (x, y) -> "La suma es: " + (x + y);
        System.out.println(operar.apply(5, 10));
    }
}
