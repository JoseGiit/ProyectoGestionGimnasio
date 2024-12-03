/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Mapper.Mapper;

/**
 *
 * @author jdarg
 */
public class PagoMapper implements Mapper<Pago, PagoDTO> {

    @Override
    public PagoDTO toDTO(Pago ent) {

        return new PagoDTO(
                ent.getId(), //  id de Pago está presente
                ent.getIdCliente(),
                ent.getFecha(),
                ent.getSubtotal(),
                ent.getImpuesto(),
                ent.getTotal()
        );
    }

    @Override
    public Pago toEnt(PagoDTO dto) {

        return new Pago(
                dto.getId(),
                dto.getIdCliente(),
                dto.getFecha(),
                dto.getSubtotal(),
                dto.getImpuesto(),
                dto.getTotal()
        );
    }
}
