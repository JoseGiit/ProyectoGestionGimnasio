/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Dao.DaoIntangible;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jdarg
 */
public class PagoDAO extends DaoIntangible<PagoDTO> {

    public PagoDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(PagoDTO pago) throws SQLException {
        String query = "call sp_crear_pago(?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, pago.getIdCliente());
            stmt.setTimestamp(2, new Timestamp(pago.getFecha().getTime()));
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public PagoDTO read(Object id) throws SQLException {
        String query = "call sp_leer_pagos()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                if (rs.getInt("id") == (int) id) {
                    return new PagoDTO(
                            rs.getInt("id"),
                            rs.getInt("id_cliente"),
                            rs.getTimestamp("fecha")
                            );
                }
            }
        }
        return null;
    }

    @Override
    public List<PagoDTO> readAll() throws SQLException {
        List<PagoDTO> pagos = new ArrayList<>();
        String query = "call sp_leer_pagos()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pagos.add(new PagoDTO(
                        rs.getInt("id"),
                        rs.getInt("id_cliente"),
                        rs.getTimestamp("fecha")     
                ));
            }
        }
        return pagos;
    }
}
