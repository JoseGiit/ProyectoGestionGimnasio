/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import java.util.Date;

/**
 *
 * @author jdarg
 */
public class PagoDTO {

    private int id;
    private final int idCliente;
    private final Date fecha;
 

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFecha() {
        return fecha;
    }


    public PagoDTO(int idCliente, Date fecha) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        
    }

    public PagoDTO(int id, int idCliente, Date fecha) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;

    }
}
