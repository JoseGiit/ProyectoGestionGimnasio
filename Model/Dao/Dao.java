/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jdarg
 */
public abstract class Dao<Dto> {

    protected Connection connection;

    public Dao(Connection connection) {
        this.connection = connection;
    }

    // crear un registro
    public abstract boolean create(Dto dto) throws SQLException;

    // leer un registro por su ID
    public abstract Dto read(Object id) throws SQLException;

    // leer todos los registros
    public abstract List<Dto> readAll() throws SQLException;

    // actualizar un registro
    public abstract boolean update(Dto dto) throws SQLException;

    // eliminar un registro por su ID
    public abstract boolean delete(Object id) throws SQLException;
}
