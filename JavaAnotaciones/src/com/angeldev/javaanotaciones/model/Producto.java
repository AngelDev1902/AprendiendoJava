package com.angeldev.javaanotaciones.model;

import java.time.LocalDate;

public class Producto {
    // Se indica que el atributo nombre es el que se importará al archivo JSON
    @JsonAtributo
    private String nombre;

    @JsonAtributo
    private String precio;

    private LocalDate fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
