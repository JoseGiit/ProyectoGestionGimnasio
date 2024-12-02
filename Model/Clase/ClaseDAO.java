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
        String query = "call sp_crear_clase(?, ?, ?, ?)"; 
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setString(1, clase.getTipoClase());
            stmt.setTimestamp(2, new Timestamp(clase.getHorario().getTime()));
            stmt.setInt(3, clase.getIdEntrenador());
            stmt.setInt(4, clase.getCapacidadMaxima());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ClaseDTO read(Object id) throws SQLException {
        String query = "call sp_leer_clases()";
        try (CallableStatement stmt = connection.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                if (rs.getInt("id") == (int) id) {
                    return new ClaseDTO(
                        rs.getInt("id"),
                        rs.getString("tipo_clase"),
                        rs.getTimestamp("horario"),
                        rs.getInt("id_entrenador"),
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
        String query = "call sp_leer_clases()";
        try (CallableStatement stmt = connection.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clases.add(new ClaseDTO(
                    rs.getInt("id"),
                    rs.getString("tipo_clase"),
                    rs.getTimestamp("horario"),
                    rs.getInt("id_entrenador"),
                    rs.getInt("capacidad_maxima")
                ));
            }
        }
        return clases;
    }

    @Override
    public boolean update(ClaseDTO clase) throws SQLException {
        String query = "call sp_actualizar_clase(?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, clase.getId());
            stmt.setString(2, clase.getTipoClase());
            stmt.setTimestamp(3, new Timestamp(clase.getHorario().getTime()));
            stmt.setInt(4, clase.getIdEntrenador());
            stmt.setInt(5, clase.getCapacidadMaxima());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "call sp_eliminar_clase(?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }
}
