package com.angeldev.recursividad.model;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nombre;
    private List<Componente> hijos;
    private int nivel;

    public Componente(String nombre) {
        this.nombre = nombre;
        hijos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getHijos() {
        return hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Componente addHijo(Componente hijo) {
        this.hijos.add(hijo);
        return this;
    }

    public boolean tieneHijos() {
        return !this.hijos.isEmpty();
    }
}
