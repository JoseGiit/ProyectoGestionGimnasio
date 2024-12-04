/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Usuario;

/**
 *
 * @author Saliim
 */
import Model.Dao.Dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO extends Dao<UsuarioDTO> {

    public UsuarioDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean create(UsuarioDTO usuario) throws SQLException {
        String query = "call sp_crear_usuario(?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPasswordHash());
            stmt.setString(3, usuario.getRol());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public UsuarioDTO read(Object id) throws SQLException {
        String query = "call sp_leer_usuarios()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                if (rs.getInt("id") == (int) id) {
                    return new UsuarioDTO(
                            rs.getInt("id"),
                            rs.getString("username"),
                            rs.getString("password_hash"),
                            rs.getString("rol")
                    );
                }
            }
        }
        return null;
    }

    @Override
    public List<UsuarioDTO> readAll() throws SQLException {
        List<UsuarioDTO> usuarios = new ArrayList<>();
        String query = "call sp_leer_usuarios()";
        try (CallableStatement stmt = connection.prepareCall(query); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                usuarios.add(new UsuarioDTO(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("password_hash"),
                        rs.getString("rol")
                ));
            }
        }
        return usuarios;
    }

    @Override
    public boolean update(UsuarioDTO usuario) throws SQLException {
        String query = "call sp_actualizar_usuario(?, ?, ?, ?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, usuario.getId());
            stmt.setString(2, usuario.getUsername());
            stmt.setString(3, usuario.getPasswordHash());
            stmt.setString(4, usuario.getRol());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        String query = "call sp_eliminar_usuario(?)";
        try (CallableStatement stmt = connection.prepareCall(query)) {
            stmt.setInt(1, (int) id);
            return stmt.executeUpdate() > 0;
        }
    }

    public boolean validatePk(int id) throws SQLException {
        return read(id) != null;
    }
}
