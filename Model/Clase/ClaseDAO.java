/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clase;

import Model.Dao.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class ClaseDAO extends Dao<ClaseDTO> {

    public ClaseDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(ClaseDTO clase) throws SQLException {
        String query = "INSERT INTO clases (tipo_clase, horario, id_entrenador, capacidad_maxima) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, clase.getTipoClase());
            stmt.setTimestamp(2, new Timestamp(clase.getHorario().getTime()));
            stmt.setString(3, clase.getEntrenador());
            stmt.setInt(4, clase.getCapacidadMaxima());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ClaseDTO read(Object id) throws SQLException {
        String query = "SELECT * FROM clases WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ClaseDTO(
                            rs.getString("tipo_clase"),
                            rs.getTimestamp("horario"),
                            rs.getString("id_entrenador"),
                            rs.getInt("capacidad_maxima")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ClaseDTO> readAll() throws SQLException {
        List<ClaseDTO> clases = new ArrayList<>();
        String query = "SELECT * FROM clases";
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clases.add(new ClaseDTO(
                        rs.getString("tipo_clase"),
                        rs.getTimestamp("horario"),
                        rs.getString("id_entrenador"),
                        rs.getInt("capacidad_maxima")
                ));
            }
        }
        return clases;
    }

    @Override
    public boolean update(ClaseDTO clase) throws SQLException {
        String query = "UPDATE clases SET tipo_clase = ?, horario = ?, id_entrenador = ?, capacidad_maxima = ? WHERE tipo_clase = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, clase.getTipoClase());
            stmt.setTimestamp(2, new Timestamp(clase.getHorario().getTime()));
            stmt.setString(3, clase.getEntrenador());
            stmt.setInt(4, clase.getCapacidadMaxima());
            stmt.setString(5, clase.getTipoClase());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "DELETE FROM clases WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }

    //filtra las clases por tipo de clase, entrenador y fecha de clase
    public List<ClaseDTO> buscarClases(String tipoClase, Integer idEntrenador, Date fecha) throws SQLException {
        List<ClaseDTO> clases = new ArrayList<>();
        String query = "SELECT * FROM clases WHERE tipo_clase LIKE ? AND (id_entrenador = ? OR ? IS NULL) AND horario LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, "%" + (tipoClase != null ? tipoClase : "") + "%");
            stmt.setObject(2, idEntrenador);
            stmt.setObject(3, idEntrenador);
            stmt.setString(4, "%" + (fecha != null ? fecha.toString() : "") + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    clases.add(new ClaseDTO(
                            rs.getString("tipo_clase"),
                            rs.getTimestamp("horario"),
                            rs.getString("id_entrenador"),
                            rs.getInt("capacidad_maxima")
                    ));
                }
            }
        }
        return clases;
    }

}
