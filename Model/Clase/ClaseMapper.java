/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clase;

import Model.Mapper.Mapper;

/**
 *
 * @author jdarg
 */
public class ClaseMapper implements Mapper<Clase, ClaseDTO> {

    @Override
    public ClaseDTO toDTO(Clase ent) {
        if(ent.getId()>0){
        return new ClaseDTO(
                ent.getId(),
                ent.getTipoClase(),
                ent.getHorario(),
                ent.getIdEntrenador(), 
                ent.getCapacidadMaxima()
        );
        }
             return new ClaseDTO(
                ent.getTipoClase(),
                ent.getHorario(),
                ent.getIdEntrenador(), 
                ent.getCapacidadMaxima()
        );
    }

    @Override
    public Clase toEnt(ClaseDTO dto) {

        if (dto.getId() > 0) { 
            return new Clase(
                    dto.getId(),
                    dto.getTipoClase(),
                    dto.getHorario(),
                    dto.getIdEntrenador(),
                    dto.getCapacidadMaxima()
            );
        }
        return new Clase(
                dto.getTipoClase(),
                dto.getHorario(),
                dto.getIdEntrenador(),
                dto.getCapacidadMaxima()
        );
    }
}
