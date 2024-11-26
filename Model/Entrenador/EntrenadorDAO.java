/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entrenador;

import DataBase.DataBaseConnection.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */

public class EntrenadorDAO {

    public List<Entrenador> obtenerTodos() throws SQLException {
        List<Entrenador> entrenadores = new ArrayList<>();
        String query = "SELECT * FROM entrenadores";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Entrenador entrenador = new Entrenador(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("contacto"),
                        rs.getString("especialidades")
                );
                entrenadores.add(entrenador);
            }
        }
        return entrenadores;
    }

    public void insertarEntrenador(Entrenador entrenador) throws SQLException {
        String query = "INSERT INTO entrenadores (nombre, contacto, especialidades) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getContacto());
            stmt.setString(3, entrenador.getEspecialidades());
            stmt.executeUpdate();
        }
    }

    public void actualizarEntrenador(Entrenador entrenador) throws SQLException {
        String query = "UPDATE entrenadores SET nombre = ?, contacto = ?, especialidades = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getContacto());
            stmt.setString(3, entrenador.getEspecialidades());
            stmt.setInt(4, entrenador.getId());
            stmt.executeUpdate();
        }
    }

    public void eliminarEntrenador(int id) throws SQLException {
        String query = "DELETE FROM entrenadores WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
