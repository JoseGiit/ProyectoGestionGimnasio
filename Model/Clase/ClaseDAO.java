/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clase;

import DataBase.DataBaseConnection.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */

public class ClaseDAO {
    public List<Clase> obtenerTodas() throws SQLException {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Clase clase = new Clase(
                    rs.getInt("id"),
                    rs.getString("tipo_clase"),
                    rs.getTimestamp("horario"),
                    rs.getInt("id_entrenador"),
                    rs.getInt("capacidad_maxima")
                );
                clases.add(clase);
            }
        }
        return clases;
    }

    public void insertarClase(Clase clase) throws SQLException {
        String query = "INSERT INTO clases (tipo_clase, horario, id_entrenador, capacidad_maxima) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clase.getTipoClase());
            stmt.setTimestamp(2, new Timestamp(clase.getHorario().getTime()));
            stmt.setInt(3, clase.getIdEntrenador());
            stmt.setInt(4, clase.getCapacidadMaxima());
            stmt.executeUpdate();
        }
    }

    public void actualizarClase(Clase clase) throws SQLException {
        String query = "UPDATE clases SET tipo_clase = ?, horario = ?, id_entrenador = ?, capacidad_maxima = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, clase.getTipoClase());
            stmt.setTimestamp(2, new Timestamp(clase.getHorario().getTime()));
            stmt.setInt(3, clase.getIdEntrenador());
            stmt.setInt(4, clase.getCapacidadMaxima());
            stmt.setInt(5, clase.getId());
            stmt.executeUpdate();
        }
    }

    public void eliminarClase(int id) throws SQLException {
        String query = "DELETE FROM clases WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
