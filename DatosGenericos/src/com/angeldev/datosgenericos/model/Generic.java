package com.angeldev.datosgenericos.model;

/*
* Los tipos de datos genéricos en Java son una característica que permite escribir código que es
* independiente del tipo de datos específico con el que operará. Con ello es posible crear clases, metodos e interfaces
* que puedan recibir cualquier tipo de dato como parametro, retornar cualquier tipo de dato o que puedan operar con
* cualquier tipo de dato.
*
* El tipo de dato genérico se define entre los simbolos < y >, y se coloca antes del nombre de la clase, metodo o interfaz.
* así se define con que tipo de dato se va a trabajar.
* */

public class Generic <T> {
    private final T typeData;

    public Generic(T typeData){
        this.typeData = typeData;
    }

    public void viewType(){
        System.out.println("T is an instance of: " + typeData.getClass().getName());
    }

    /*
    * En los metodos tambien es posible utilizar tipos de datos genericos, ya sea como parametro, como tipo de retorno
    * o como tipo de dato de una variable local.
    *
    * los tipos de datos que puede recibir como parametro se definen entre los simbolos < y >, y se colocan antes del tipo
    * de dato de retorno.
    *
    * El tipo de dato de retorno se define despues de los simbolos < y >, y antes del nombre del metodo.
    * */

    public <G, H> G genericMethod(G genericParameter1, H genericParameter2){
        return genericParameter1;
    }
}
