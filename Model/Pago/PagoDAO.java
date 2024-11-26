/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import DataBase.DataBaseConnection.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */

public class PagoDAO {

    public List<Pago> obtenerTodos() throws SQLException {
        List<Pago> pagos = new ArrayList<>();
        String query = "SELECT * FROM pagos";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Pago pago = new Pago(
                        rs.getInt("id"),
                        rs.getInt("id_cliente"),
                        rs.getDate("fecha"),
                        rs.getDouble("subtotal"),
                        rs.getDouble("impuesto"),
                        rs.getDouble("total")
                );
                pagos.add(pago);
            }
        }
        return pagos;
    }

    public void insertarPago(Pago pago) throws SQLException {
        String query = "INSERT INTO pagos (id_cliente, fecha, subtotal, impuesto, total) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pago.getIdCliente());
            stmt.setDate(2, new java.sql.Date(pago.getFecha().getTime()));
            stmt.setDouble(3, pago.getSubtotal());
            stmt.setDouble(4, pago.getImpuesto());
            stmt.setDouble(5, pago.getTotal());
            stmt.executeUpdate();
        }
    }

    public void actualizarPago(Pago pago) throws SQLException {
        String query = "UPDATE pagos SET id_cliente = ?, fecha = ?, subtotal = ?, impuesto = ?, total = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, pago.getIdCliente());
            stmt.setDate(2, new java.sql.Date(pago.getFecha().getTime()));
            stmt.setDouble(3, pago.getSubtotal());
            stmt.setDouble(4, pago.getImpuesto());
            stmt.setDouble(5, pago.getTotal());
            stmt.setInt(6, pago.getId());
            stmt.executeUpdate();
        }
    }

    public void eliminarPago(int id) throws SQLException {
        String query = "DELETE FROM pagos WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
