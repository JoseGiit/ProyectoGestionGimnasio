/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Cliente.ClienteDAO;
import Model.Cliente.ClienteMapper;
import Model.Mapper.Mapper;
import DataBase.DataBaseConnection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jdarg
 */
public class PagoMapper implements Mapper<Pago, PagoDTO> {

    @Override
    public PagoDTO toDTO(Pago ent) {
if (ent.getId()>0){
        return new PagoDTO(
                ent.getId(), 
                ent.getCliente().getId(),
                ent.getFecha()
              
        );
}
  return new PagoDTO(
                ent.getCliente().getId(),
                ent.getFecha()
              
        );
    }

    @Override
    public Pago toEnt(PagoDTO dto) {
   if(dto.getId()>0){
       try {
           return new Pago(
                   dto.getId(),
                   new ClienteMapper().toEnt(new ClienteDAO(DataBaseConnection.getConnection()).read(dto.getIdCliente())),
                   dto.getFecha()
                   
           );
       } catch (SQLException ex) {
           Logger.getLogger(PagoMapper.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
        try {
            return new Pago(
                    new ClienteMapper().toEnt(new ClienteDAO(DataBaseConnection.getConnection()).read(dto.getIdCliente())),
                    dto.getFecha()
            );
        } catch (SQLException ex) {
            Logger.getLogger(PagoMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
