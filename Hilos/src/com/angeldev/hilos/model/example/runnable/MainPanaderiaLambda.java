package com.angeldev.hilos.model.example.runnable;

import com.angeldev.hilos.model.example.Panaderia;

public class MainPanaderiaLambda {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        // se crean los hilos y se ejecutan
        new Thread(() -> {
            // el productor produce 10 panes
            for (int i = 0; i < 10; i++) {
                // el productor produce pan
                panaderia.hornear("Pan N° " + i);
                try {
                    // espera un tiempo aleatorio para volver a producir
                    Thread.sleep((int) Math.random() * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            // el cliente consume 10 panes
            for (int i = 0; i < 10; i++) {
                // el cliente consume pan
                panaderia.consumir();
                try {
                    // espera un tiempo aleatorio para volver a consumir
                    Thread.sleep((int) Math.random() * 100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}
