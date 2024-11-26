/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

import DataBase.DataBaseConnection.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class ClienteDAO {

    public List<Cliente> obtenerTodos() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("id"),
                        rs.getString("cedula"),
                        rs.getString("nombre"),
                        rs.getDate("fecha_nacimiento"),
                        rs.getString("contacto"),
                        rs.getString("tipo_membresia"),
                        rs.getDate("membresia_vencimiento")
                );
                clientes.add(cliente);
            }
        }
        return clientes;
    }

    public void insertarCliente(Cliente cliente) throws SQLException {
        String query = "INSERT INTO clientes (cedula, nombre, fecha_nacimiento, contacto, tipo_membresia, membresia_vencimiento) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getCedula());
            stmt.setString(2, cliente.getNombre());
            stmt.setDate(3, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            stmt.setString(4, cliente.getContacto());
            stmt.setString(5, cliente.getTipoMembresia());
            stmt.setDate(6, new java.sql.Date(cliente.getMembresiaVencimiento().getTime()));
            stmt.executeUpdate();
        }
    }

    public void actualizarCliente(Cliente cliente) throws SQLException {
        String query = "UPDATE clientes SET nombre = ?, fecha_nacimiento = ?, contacto = ?, tipo_membresia = ?, membresia_vencimiento = ? WHERE cedula = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setDate(2, new java.sql.Date(cliente.getFechaNacimiento().getTime()));
            stmt.setString(3, cliente.getContacto());
            stmt.setString(4, cliente.getTipoMembresia());
            stmt.setDate(5, new java.sql.Date(cliente.getMembresiaVencimiento().getTime()));
            stmt.setString(6, cliente.getCedula());
            stmt.executeUpdate();
        }
    }

    public void eliminarCliente(String cedula) throws SQLException {
        String query = "DELETE FROM clientes WHERE cedula = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, cedula);
            stmt.executeUpdate();
        }
    }
}
