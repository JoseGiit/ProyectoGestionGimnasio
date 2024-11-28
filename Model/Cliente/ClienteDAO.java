/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

import Model.Dao.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class ClienteDAO extends Dao<ClienteDTO> {

    public ClienteDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(ClienteDTO cliente) throws SQLException {
        String query = "INSERT INTO clientes (cedula, nombre, tipo_membresia, contacto) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cliente.getCedula());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getTipoMembresia());
            stmt.setString(4, cliente.getContacto());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ClienteDTO read(Object id) throws SQLException {
        String query = "SELECT * FROM clientes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new ClienteDTO(
                            rs.getString("cedula"),
                            rs.getString("nombre"),
                            rs.getString("tipo_membresia"),
                            rs.getString("contacto")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ClienteDTO> readAll() throws SQLException {
        List<ClienteDTO> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes.add(new ClienteDTO(
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getString("tipo_membresia"),
                        rs.getString("contacto")
                ));
            }
        }
        return clientes;
    }

    @Override
    public boolean update(ClienteDTO cliente) throws SQLException {
        String query = "UPDATE clientes SET nombre = ?, tipo_membresia = ?, contacto = ? WHERE cedula = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getTipoMembresia());
            stmt.setString(3, cliente.getContacto());
            stmt.setString(4, cliente.getCedula());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }
    // Búsqueda para cliente por nombre, tipo de membresía, y cédula

    public List<ClienteDTO> buscarClientes(String nombre, String tipoMembresia, String cedula) throws SQLException {
        List<ClienteDTO> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes WHERE nombre LIKE ? AND tipo_membresia LIKE ? AND cedula LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, "%" + (nombre != null ? nombre : "") + "%");
            stmt.setString(2, "%" + (tipoMembresia != null ? tipoMembresia : "") + "%");
            stmt.setString(3, "%" + (cedula != null ? cedula : "") + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    clientes.add(new ClienteDTO(
                            rs.getString("cedula"),
                            rs.getString("nombre"),
                            rs.getString("tipo_membresia"),
                            rs.getString("contacto")
                    ));
                }
            }
        }
        return clientes;
    }
}
