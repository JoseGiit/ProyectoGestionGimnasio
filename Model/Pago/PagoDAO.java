/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Dao.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class PagoDAO extends Dao<PagoDTO> {

    public PagoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(PagoDTO pago) throws SQLException {
        String query = "INSERT INTO pagos (id_cliente, fecha, subtotal, impuesto, total) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, pago.getIdCliente());
            stmt.setDate(2, new java.sql.Date(pago.getFecha().getTime()));
            stmt.setDouble(3, pago.getSubtotal());
            stmt.setDouble(4, pago.getImpuesto());
            stmt.setDouble(5, pago.getTotal());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public PagoDTO read(Object id) throws SQLException {
        String query = "SELECT * FROM pagos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new PagoDTO(
                            rs.getInt("id_cliente"),
                            rs.getDate("fecha"),
                            rs.getDouble("subtotal"),
                            rs.getDouble("impuesto"),
                            rs.getDouble("total")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<PagoDTO> readAll() throws SQLException {
        List<PagoDTO> pagos = new ArrayList<>();
        String query = "SELECT * FROM pagos";
        try (PreparedStatement stmt = connection.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pagos.add(new PagoDTO(
                        rs.getInt("id_cliente"),
                        rs.getDate("fecha"),
                        rs.getDouble("subtotal"),
                        rs.getDouble("impuesto"),
                        rs.getDouble("total")
                ));
            }
        }
        return pagos;
    }

    @Override
    public boolean update(PagoDTO pago) throws SQLException {
        String query = "UPDATE pagos SET id_cliente = ?, fecha = ?, subtotal = ?, impuesto = ?, total = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, pago.getIdCliente());
            stmt.setDate(2, new java.sql.Date(pago.getFecha().getTime()));
            stmt.setDouble(3, pago.getSubtotal());
            stmt.setDouble(4, pago.getImpuesto());
            stmt.setDouble(5, pago.getTotal());
            stmt.setInt(6, pago.getIdCliente());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "DELETE FROM pagos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }

    //filtrar los pagos por cliente, rango de fechas
    public List<PagoDTO> buscarPagos(Integer idCliente, Date fechaInicio, Date fechaFin) throws SQLException {
        List<PagoDTO> pagos = new ArrayList<>();
        String query = "SELECT * FROM pagos WHERE (id_cliente = ? OR ? IS NULL) AND fecha BETWEEN ? AND ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setObject(1, idCliente);
            stmt.setObject(2, idCliente);
            stmt.setDate(3, fechaInicio != null ? new java.sql.Date(fechaInicio.getTime()) : null);
            stmt.setDate(4, fechaFin != null ? new java.sql.Date(fechaFin.getTime()) : null);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    pagos.add(new PagoDTO(
                            rs.getInt("id_cliente"),
                            rs.getTimestamp("fecha"),
                            rs.getDouble("subtotal"),
                            rs.getDouble("impuesto"),
                            rs.getDouble("total")
                    ));
                }
            }
        }
        return pagos;
    }

}
