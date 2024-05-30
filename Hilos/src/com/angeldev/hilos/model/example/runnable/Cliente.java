package com.angeldev.hilos.model.example.runnable;

import com.angeldev.hilos.model.example.Panaderia;

public class Cliente implements Runnable {
    private Panaderia panaderia;

    public Cliente(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
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
    }
}
