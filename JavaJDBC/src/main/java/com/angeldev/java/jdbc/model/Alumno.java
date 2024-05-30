package com.angeldev.java.jdbc.model;

import java.util.Date;

public class Alumno {
    private int id;
    private String nombre;
    private String correo;
    private Date fechaNacimiento;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String correo, Date fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", correo='").append(correo).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);

        return sb.toString();
    }
}
