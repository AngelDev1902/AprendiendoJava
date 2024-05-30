package com.angeldev.datosgenericos.model;

/*
* Es posible restringir el tipo de dato con el que se va a trabajar, para ello se utiliza la palabra reservada extends
* seguida del tipo de dato con el que se va a trabajar.
*
* En este caso se restringe el tipo de dato a los tipos de datos numericos, es decir, a los tipos de datos que heredan
* de la clase Number. por ejemplo Integer, Double, Float, etc.
* */

public class RestricterGeneric <T extends Number> {
    private final T typeData;

    public RestricterGeneric(T typeData){
        this.typeData = typeData;
    }

    public void viewType(){
        System.out.println("T is an instance of: " + typeData.getClass().getName());
    }
}
