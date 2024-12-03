/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entrenador;

import Model.Mapper.Mapper;

/**
 *
 * @author jdarg
 */
public class EntrenadorMapper implements Mapper<Entrenador, EntrenadorDTO> {

    @Override
    public EntrenadorDTO toDTO(Entrenador ent) {
        return new EntrenadorDTO(
                ent.getId(),
                ent.getNombre(),
                ent.getContacto(),
                ent.getEspecialidades()
        );
    }

    @Override
    public Entrenador toEnt(EntrenadorDTO dto) {
        if (dto.getId() == 0) {
            return new Entrenador(
                    dto.getNombre(),
                    dto.getContacto(),
                    dto.getEspecialidades()
            );
        }
        return new Entrenador(
                dto.getNombre(),
                dto.getContacto(),
                dto.getEspecialidades()
        );
    }
}
