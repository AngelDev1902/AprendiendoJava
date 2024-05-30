package com.angeldev.archivos;

import com.angeldev.archivos.service.ArchivoServicio;

public class Main {
    public static void main(String[] args) {
        String rutaArchivo = "src/com/angeldev/archivos/resources/files/";
        String nombreArchivo = "archivo.txt";

        StringBuilder contenido = new StringBuilder("Este es el contenido del archivo\n")
                .append("Esta es otra linea de texto\n")
                .append("Esta es la ultima linea de texto");

        StringBuilder contenido2 = new StringBuilder("\n\nContenido Añadido\n")
                .append("Nuevo contenido");

        ArchivoServicio service = new ArchivoServicio(rutaArchivo + nombreArchivo);

        service.escribirArchivo(contenido.toString());
        service.addArchivo(contenido2.toString());
        service.addArchivo(contenido2.toString());
        System.out.println(service.leerArchivo());
    }
}