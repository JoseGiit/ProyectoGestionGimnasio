/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Usuario;

/**
 *
 * @author Saliim
 */
public class UsuarioDTO {
    private  int id;
    private final String username;
    private final String passwordHash;
    private final String rol;

  

    public UsuarioDTO(String username, String passwordHash, String rol) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

    public UsuarioDTO(int id, String username, String passwordHash, String rol) {
        this.id = id;
        this.username = username;
        this.passwordHash = passwordHash;
        this.rol = rol;
    }

  
    public int getId() {
        return id;
    }
 
    public String getUsername() {
        return username;
    }
    
    public String getPasswordHash() {
        return passwordHash;
    }

    public String getRol() {
        return rol;
    }

}
