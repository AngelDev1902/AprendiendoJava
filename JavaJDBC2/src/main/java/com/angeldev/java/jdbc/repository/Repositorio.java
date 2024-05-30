package com.angeldev.java.jdbc.repository;

import java.util.List;

// Interfaz que mediante el uso de tipos genericos establece las acciones
// de todos los objetos que se conectaran a la base de datos

public interface Repositorio <T> {
    // obtener todos los registros
    List<T> listar();

    // buscar por id
    T porId(int id);

    // insertar registro
    void guardar(T t);

    // eliminar registro
    void eliminar(int id);

    // actualizar registro
    void actualizar(T t);

    // buscar por ciertos campos
    T porCampos(String... campos);
}
