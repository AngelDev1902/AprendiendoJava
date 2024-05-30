package com.angeldev.archivos.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ArchivoServicio {
    File archivo;
    String nombreArchivo;

    public ArchivoServicio(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        archivo = new File(nombreArchivo);

        crearArchivo();
    }

    private void crearArchivo() {
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }
    }

    public void escribirArchivo(String contenido) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write(contenido);

            escritor.close();
            System.out.println("Se ha escrito correctamente en el archivo");
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo");
        }
    }

    public void addArchivo(String contenido) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo, true);
            escritor.write(contenido);

            escritor.close();
            System.out.println("Se ha añadido correctamente en el archivo");
        } catch (Exception e) {
            System.out.println("Error al añadir en el archivo");
        }
    }

    public String leerArchivo() {
        StringBuilder contenido = new StringBuilder();

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            lector.close();
            System.out.println("Se ha leido correctamente el archivo");
        } catch (Exception e) {
            System.out.println("Error al leer el archivo");
        }

        return contenido.toString();
    }
}
