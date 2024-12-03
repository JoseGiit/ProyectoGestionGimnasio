/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pago;

import Model.Cliente.Cliente;
import java.util.Date;

/**
 *
 * @author jdarg
 */
public class Pago {

    private int id;
    private Cliente cliente;
    private Date fecha;
    private double subtotal;
    private double impuesto;
    private double total;

    public Pago() {
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
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

    public Pago(int id, Cliente cliente, Date fecha, double subtotal, double impuesto, double total) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    public Pago(Cliente cliente, Date fecha, double subtotal, double impuesto, double total) {

        this.cliente = cliente;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }

    public Pago(int id, Cliente cliente, Date fecha) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;

    }
    
     public Pago(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;

    }
}
