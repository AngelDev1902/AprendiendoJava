package com.angeldev.java.jdbc;

import com.angeldev.java.jdbc.model.Alumno;
import com.angeldev.java.jdbc.repository.AlumnoRepositorio;
import com.angeldev.java.jdbc.repository.Repositorio;
import com.angeldev.java.jdbc.util.Conexiondb;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
            Repositorio<Alumno> repo = new AlumnoRepositorio();

            repo.listar().forEach(a -> System.out.println(a.getNombre()));

            System.out.println(repo.porId(20241).toString());
    }
}