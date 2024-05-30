package com.angeldev.hilos.model;

public class Sincronizacion {
    public static void main(String[] args) {
        new Thread(new PrintMsg("Hola ", "Mundo")).start();
        new Thread(new PrintMsg("Hello ", "World")).start();
        new Thread(new PrintMsg("Bonjour ", "Monde")).start();
    }

    /*
    * La sincronización es la capacidad de controlar el acceso de múltiples hilos a cualquier recurso compartido.
    * en este caso se controla el acceso a un mismo metodo que recibe dos cadenas y las imprime
    * cuando este proceso se realiza sin sincronización se obtiene un resultado como el siguiente:
    * Hola Hello Bonjour Mundo World Monde
    * Donde como cada hilo accede al mismo tiempo mandando a imprimir su mensaje se mezclan las cadenas
    * de los otros hilos.
    *
    * Cuando se realiza una sincronizacion se bloquea el acceso de los demas hilos hasta que el hilo actual
    * termine de ejecutar el metodo, por lo que se obtiene un resultado como el siguiente:
    * Hola Mundo
    * Hello World
    * Bonjour Monde
    *
    * Para sincronizar un metodo se utiliza la palabra reservada synchronized
    * */

    public synchronized static void print(String msg1, String msg2) {
        System.out.print(msg1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(msg2);
    }
}
