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

    private int idCliente;
    private Date fecha;
    private double subtotal;
    private double impuesto;
    private double total;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public PagoDTO(int idCliente, Date fecha, double subtotal, double impuesto, double total) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    public PagoDTO() {
    }

    @Override
    public String toString() {
        return "PagoDTO{"
                + "idCliente=" + idCliente
                + ", fecha=" + fecha
                + ", subtotal=" + subtotal
                + ", impuesto=" + impuesto
                + ", total=" + total
                + '}';
    }
}
