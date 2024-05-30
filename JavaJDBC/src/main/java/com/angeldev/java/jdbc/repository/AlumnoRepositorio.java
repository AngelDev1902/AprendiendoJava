package com.angeldev.java.jdbc.repository;

import com.angeldev.java.jdbc.model.Alumno;
import com.angeldev.java.jdbc.util.Conexiondb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// implementa interfaz repositorio
public class AlumnoRepositorio implements Repositorio <Alumno> {
    private String query;

    // metodo para crear una conexion mediante la instancia de la clase conexion
    private Connection getConnection() {
        return Conexiondb.getInstancia();
    }

    @Override
    public List<Alumno> listar() {
        List<Alumno> alumnos = new ArrayList<>();
        query = "SELECT * FROM Alumno";

        try (
                // autoclose para que los recursos se liberen automaticamente

                // creamos el Statement
                Statement stmt = getConnection().createStatement();
                // obtenemos los resultados de la consulta que ejecuta el statement
                ResultSet rs = stmt.executeQuery(query);
                ) {

            // recoreemos el iterable obteniendo los resultados
            while (rs.next()) {
                alumnos.add(crearAlumno(rs));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return alumnos;
    }

    @Override
    public Alumno porId(int id) {
        Alumno alumno = null;
        query = "SELECT * FROM Alumno WHERE id_alumno = ?";

        try (
                // PrepareStatement precompila la senencia y permite establecer pasametros dinamicos
                PreparedStatement stmt = getConnection().prepareStatement(query)
                ) {

                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();

                // si el iterable no esta vacio
                if(rs.next()){
                    alumno = crearAlumno(rs);
                }

                rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return alumno;
    }

    @Override
    public void guardar(Alumno alumno) {
        query = "INSERT INTO Alumno (nombre, ap_pat, ap_mat, correo, telefono, direccion, fecha_nacimiento, semestre) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(query) ) {
            // establecemos los campos del statement
            stmt.setString(1, alumno.getNombre());
            stmt.setString(4, alumno.getCorreo());
            stmt.setDate(7, new Date(alumno.getFechaNacimiento().getTime()));

            // executamos la insercion
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        query = "DELETE FROM Alumno WHERE id_alumno = ?";
        try (PreparedStatement stmt = getConnection().prepareStatement(query) ) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizar(Alumno alumno) {
        query = "UPDATE Alumno SET nombre = ?, ap_pat = ?, ap_mat = ?, correo = ?, telefono = ?, direccion = ?, fecha_nacimiento = ?, semestre = ? WHERE id_alumno = ?";

        try (PreparedStatement stmt = getConnection().prepareStatement(query) ) {
            stmt.setString(1, alumno.getNombre());
            stmt.setString(4, alumno.getCorreo());
            stmt.setDate(7, new Date(alumno.getFechaNacimiento().getTime()));
            stmt.setInt(9, alumno.getId());

            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Alumno porCampos(String... campos) {
        Alumno alumno = null;
        query = "SELECT * FROM Alumno WHERE nombre = ? AND correo = ? AND  fecha_naciento = ?";

        try (
                // PrepareStatement precompila la senencia y permite establecer pasametros dinamicos
                PreparedStatement stmt = getConnection().prepareStatement(query)
        ) {

            stmt.setString(1, campos[0]);
            stmt.setString(2, campos[1]);
            stmt.setString(3, campos[2]);

            ResultSet rs = stmt.executeQuery();

            // si el iterable no esta vacio
            if(rs.next()){
                alumno = crearAlumno(rs);
            }

            rs.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return alumno;
    }

    // crear un objeto de alumno mediante los campos obtenidos de un ResultSet
    private Alumno crearAlumno(ResultSet rs) throws SQLException {
        Alumno alumno = new Alumno();
        alumno.setId(rs.getInt("id_alumno"));
        alumno.setNombre(rs.getString("nombre"));
        alumno.setCorreo(rs.getString("correo"));
        alumno.setFechaNacimiento(rs.getDate("fecha_nacimiento"));

        return alumno;
    }

}
