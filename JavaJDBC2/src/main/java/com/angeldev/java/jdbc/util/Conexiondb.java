package com.angeldev.java.jdbc.util;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiondb {
    // Url de la conexion a la base de datos (jdbc:'driver'://localhost:'puerto'/'nombre de la base de datos?serverTimezone=zona horaria')
    private static final String URL = "jdbc:mysql://localhost:3306/Escuela?serverTimezone=UTC";
    // Usuario y contraseña de la base de datos private static
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getInstancia() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
