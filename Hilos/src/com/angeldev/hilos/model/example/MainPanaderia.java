package com.angeldev.hilos.model.example;

import com.angeldev.hilos.model.example.runnable.Cliente;
import com.angeldev.hilos.model.example.runnable.Productor;

public class MainPanaderia {
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia();
        // se crean los hilos y se ejecutan
        new Thread(new Productor(panaderia)).start();
        new Thread(new Cliente(panaderia)).start();
    }


}
