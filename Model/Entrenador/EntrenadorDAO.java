/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entrenador;

import Model.Dao.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class EntrenadorDAO extends Dao<EntrenadorDTO> {

    public EntrenadorDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(EntrenadorDTO entrenador) throws SQLException {
        String query = "call sp_crear_entrenador( ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getContacto());
            stmt.setString(3, entrenador.getEspecialidades());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public EntrenadorDTO read(Object id) throws SQLException {
        String query = "call sp_leer_entrenadores()";
        try (CallableStatement stmt = connection.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                if (rs.getInt("id") == (int) id) {
                    return new EntrenadorDTO(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("contacto"),
                        rs.getString("especialidades")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<EntrenadorDTO> readAll() throws SQLException {
        List<EntrenadorDTO> entrenadores = new ArrayList<>();
        String query = "call sp_leer_entrenadores()";
        try (CallableStatement stmt = connection.prepareCall(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                entrenadores.add(new EntrenadorDTO(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("contacto"),
                    rs.getString("especialidades")
                ));
            }
        }
        return entrenadores;
    }

    @Override
    public boolean update(EntrenadorDTO entrenador) throws SQLException {
        String query = "call sp_actualizar_entrenador(?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, entrenador.getId());
            stmt.setString(3, entrenador.getContacto());
            stmt.setString(4, entrenador.getEspecialidades());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "call sp_eliminar_entrenador(?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }
}
