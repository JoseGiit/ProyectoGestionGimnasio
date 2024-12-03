/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Mapper;

/**
 *
 * @author jdarg
 */
public interface Mapper<Ent,DTO> {
    public DTO toDTO(Ent ent);
    public Ent toEnt(DTO dto);
}

