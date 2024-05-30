package com.angeldev.hilos.model;

public class FirstThread extends Thread{
    // opcional un constructor que asigne un nombre personalizado
    public FirstThread(String name) {
        super(name);
    }

    // se sobreescribe el metodo run
    @Override
    public void run() {
        // comienzo del de vida del hilo
        System.out.println("Se inicia el hilo " + getName());

        // en medio se realiza alguna tarea
        try {
            Thread.sleep(4000);
        } catch (Exception e){
            e.printStackTrace();
        }

        // fin del ciclo de vida del hilo
        System.out.println("Finalizo el hilo de " + getName());
    }
}
