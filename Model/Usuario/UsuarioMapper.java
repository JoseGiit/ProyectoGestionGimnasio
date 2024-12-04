/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Usuario;

import Model.Mapper.Mapper;

/**
 *
 * @author Saliim
 */
public class UsuarioMapper implements Mapper<Usuario, UsuarioDTO> {

    @Override
    public UsuarioDTO toDTO(Usuario usuario) {
        if (usuario.getId() > 0) {
            return new UsuarioDTO(
                    usuario.getId(),
                    usuario.getUsername(),
                    usuario.getPasswordHash(),
                    usuario.getRol()
            );
        }
        return new UsuarioDTO(
                usuario.getUsername(),
                usuario.getPasswordHash(),
                usuario.getRol()
        );
    }

    @Override
    public Usuario toEnt(UsuarioDTO dto) {
        if (dto.getId() > 0) {
            return new Usuario(
                    dto.getId(),
                    dto.getUsername(),
                    dto.getPasswordHash(),
                    dto.getRol()
            );
        }
        return new Usuario(
                dto.getUsername(),
                dto.getPasswordHash(),
                dto.getRol()
        );
    }
}