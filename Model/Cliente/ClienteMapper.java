/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

import Model.Mapper.Mapper;

/**
 *
 * @author jdarg
 */
public class ClienteMapper implements Mapper<Cliente, ClienteDTO> {

    @Override
    public ClienteDTO toDTO(Cliente ent) {
        return new ClienteDTO(
                ent.getId(),
                ent.getNombre(),
                ent.getFechaNacimiento(),
                ent.getCorreo(),
                ent.getTelefono(),
                ent.getTipoMembresia(),
                ent.getMembresiaVencimiento()
        );
    }

    @Override
    public Cliente toEnt(ClienteDTO dto) {
        return new Cliente(
                dto.getId(),
                dto.getNombre(),
                dto.getFechaNacimiento(),
                dto.getCorreo(),
                dto.getTelefono(),
                dto.getTipoMembresia(),
                dto.getMembresiaVencimiento()
        );
    }
}
