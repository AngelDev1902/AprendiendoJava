package com.angeldev.excepciones.model;

public class Calculadora {
    public double dividir(int numerador, int divisor) throws DivisionPorCeroExcepcion {
        if(divisor == 0){
            // creamos excepciones personalizadas y las enviamos con throw
            throw new DivisionPorCeroExcepcion("no se puede dividir por cero!");
        }
        return numerador/(double)divisor;
    }

    // throws permite propagar la excepción a la clase que llama a este método
    public double dividir(String numerador, String divisor) throws DivisionPorCeroExcepcion, FormatoNumeroExcepcion {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);
            return this.dividir(num, div);
        } catch (NumberFormatException e){
            throw new FormatoNumeroExcepcion("debe ingresar un número en el numerador y divisor");
        }
    }
}
