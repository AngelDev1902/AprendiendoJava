package com.angeldev.hilos.model.example;

public class Panaderia {
    private String pan; // recurso que se va a consumir
    private boolean disponible = false; // indica si hay pan o no

    public synchronized void hornear(String masa) {
        // mientras haya pan disponible, el panadero espera
        while (disponible) {
            try {
                // espera
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // si no hay pan, el panadero hornea
        this.pan = masa;
        System.out.println("Panadero horneó: " + this.pan);

        // indica que ya hay pan disponible
        this.disponible = true;

        // notifica que ya hay pan disponible
        notifyAll();
    }

    public synchronized String consumir() {
        // mientras no haya pan disponible, el cliente espera
        while (!disponible) {
            try {
                // espera
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Cliente consumió: " + this.pan);

        // indica que ya no hay pan disponible
        this.disponible = false;
        // notifica que ya no hay pan disponible
        notifyAll();
        // retorna el pan que se consumió
        return pan;
    }
}
