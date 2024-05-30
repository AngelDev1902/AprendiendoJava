package com.angeldev.programacionfuncional.lambdas;

/*
* Tambien conocidas como funciones anonimas o funciones de una sola linea,
* sun funciones que no tienen nombre y que se pueden pasar como parametros
* a otras funciones.
*
* Estas requieren de una interfaz funcional, la cual es una interfaz que
* tiene un solo metodo abstracto. el cual puede recibir parametros y devolver
* un valor.
* */


public class Lambda {
    public static void main(String[] args) {
        int x = 8, y = 10;

        // Definición de una interfaz funcional
        Sumar sumar = (a, b) -> {
            System.out.println("El primer valor es: " + a);
            System.out.println("El segundo valor es: " + b);

            return a + b;
        };

        int resultado = sumar.sumar(x, y);

        System.out.println("La suma es: " + resultado);

        Multiplicar multiplicar = (a, b) -> a * b;

        System.out.println("La multiplicacion es: " + multiplicar.multiplicar(x, y));

        System.out.println("La multiplicacion por dos es: " + multiplicar.multiplicarPorDos(x));

        System.out.println("La multiplicacion por tres es: " + Multiplicar.multiplicarPorTres(x));
    }
}

// Interfaz funcional para la operación de suma
interface Sumar {
    int sumar(int a, int b);
}
