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
        String query = "call sp_crear_cliente(?, ?, ?, ?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNombre());
            stmt.setDate(3, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            stmt.setString(4, cliente.getCorreo());
            stmt.setString(5, cliente.getTelefono());
            stmt.setString(6, cliente.getTipoMembresia());
            stmt.setDate(7, new java.sql.Date(cliente.getMembresiaVencimiento().getTime()));
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ClienteDTO read(Object id) throws SQLException {
        String query = "call sp_leer_clientes()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                if (rs.getInt("id") == (int) id) {
                    return new ClienteDTO(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getDate("fecha_nacimiento"),
                            rs.getString("correo"),
                            rs.getString("telefono"),
                            rs.getString("tipo_membresia"),
                            rs.getDate("membresia_vencimiento")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<ClienteDTO> readAll() throws SQLException {
        List<ClienteDTO> clientes = new ArrayList<>();
        String query = "call sp_leer_clientes()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                clientes.add(new ClienteDTO(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDate("fecha_nacimiento"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getString("tipo_membresia"),
                        rs.getDate("membresia_vencimiento")
                ));
            }
        }
        return clientes;
    }

    @Override
    public boolean update(ClienteDTO cliente) throws SQLException {
        String query = "call sp_actualizar_cliente(?, ?, ?, ? )";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getCorreo());
            stmt.setString(3, cliente.getTelefono());
            stmt.setString(4, cliente.getTipoMembresia());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "call sp_eliminar_cliente(?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }
    
    public boolean validatePk(int id) throws SQLException{
        return read(id) != null;
    }
    
    
    public int contarClientes() throws SQLException {
    String query = "CALL sp_contar_clientes()";
    try (CallableStatement stmt = connection.prepareCall(query);
         ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
            return rs.getInt("total");
        }
    }
    return 0;
}
}
