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
        String query = "INSERT INTO entrenadores (nombre, contacto, especialidades) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getContacto());
            stmt.setString(3, entrenador.getEspecialidades());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public EntrenadorDTO read(Object id) throws SQLException {
        String query = "SELECT * FROM entrenadores WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new EntrenadorDTO(
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
        String query = "SELECT * FROM entrenadores";
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                entrenadores.add(new EntrenadorDTO(
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
        String query = "UPDATE entrenadores SET contacto = ?, especialidades = ? WHERE nombre = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, entrenador.getContacto());
            stmt.setString(2, entrenador.getEspecialidades());
            stmt.setString(3, entrenador.getNombre());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "DELETE FROM entrenadores WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }

    //filtra a los entrenadores por nombre, especialidad y contacto.
    public List<EntrenadorDTO> buscarEntrenadores(String nombre, String especialidad, String contacto) throws SQLException {
        List<EntrenadorDTO> entrenadores = new ArrayList<>();
        String query = "SELECT * FROM entrenadores WHERE nombre LIKE ? AND especialidades LIKE ? AND contacto LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, "%" + (nombre != null ? nombre : "") + "%");
            stmt.setString(2, "%" + (especialidad != null ? especialidad : "") + "%");
            stmt.setString(3, "%" + (contacto != null ? contacto : "") + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    entrenadores.add(new EntrenadorDTO(
                            rs.getString("nombre"),
                            rs.getString("contacto"),
                            rs.getString("especialidades")
                    ));
                }
            }
        }
        return entrenadores;
    }

}
