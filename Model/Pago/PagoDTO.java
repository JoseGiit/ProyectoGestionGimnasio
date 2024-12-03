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
    private final double subtotal;
    private final double impuesto;
    private final double total;

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public double getTotal() {
        return total;
    }

    public PagoDTO(int idCliente, Date fecha, double subtotal, double impuesto, double total) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    public PagoDTO(int id, int idCliente, Date fecha, double subtotal, double impuesto, double total) {
        this.id = id;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }
}
