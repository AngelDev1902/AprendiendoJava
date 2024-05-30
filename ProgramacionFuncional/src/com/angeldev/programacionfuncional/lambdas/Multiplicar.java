package com.angeldev.programacionfuncional.lambdas;

/*
* El modificador @FunctionalInterface es opcional, pero es una buena practica
* colocarlo para que el compilador nos avise si estamos violando la regla de
* que solo debe haber un metodo abstracto en la interfaz funcional.
* */

@FunctionalInterface
public interface Multiplicar {
    int multiplicar(int a, int b);

    /*
    * A pesar de que solo debe existir un metodo abstracto en la interfaz
    * funcional, si se pueden agregar metodos default y static.
    * */

    default int multiplicarPorDos(int a) {
        return a * 2;
    }

    static int multiplicarPorTres(int a) {
        return a * 3;
    }
}
