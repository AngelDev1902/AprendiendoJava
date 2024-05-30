package com.angeldev.hilos.model;

public class SecondThread implements Runnable {
    /*
    * El código que se ejecutará en el hilo se coloca en el método run().
    * Cuando el hilo se inicia utilizando el método start(), el código en run() se ejecuta en un hilo separado.
    * */

    private String name;

    public SecondThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // comienza ciclo de vida del thread
        System.out.println("Se inicio el hilo de " + name);

        // tareas a realizar
        try {
            // pausar la ejecución de un hilo por un período de tiempo específico.
            Thread.sleep(3000);
        } catch (Exception e){
            e.printStackTrace();
        }

        // finaliza ciclo de vida del thread
        System.out.println("Finalizo el hilo de " + name);
    }
}
