package com.angeldev.hilos.model.example.runnable;

import com.angeldev.hilos.model.example.Panaderia;

public class Productor implements Runnable {
    private Panaderia panaderia;

    public Productor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
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
    }
}
