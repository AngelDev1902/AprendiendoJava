package com.angeldev.hilos.model;

public class PrintMsg implements Runnable {
    private String msg1;
    private String msg2;

    public PrintMsg(String msg1, String msg2) {
        this.msg1 = msg1;
        this.msg2 = msg2;
    }

    @Override
    public void run() {
        Sincronizacion.print(msg1, msg2);
    }
}
