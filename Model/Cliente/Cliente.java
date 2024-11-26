/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

import java.util.Date;

/**
 *
 * @author jdarg
 */
public class Cliente {

    private int id;
    private String cedula;
    private String nombre;
    private Date fechaNacimiento;
    private String contacto;
    private String tipoMembresia;
    private Date membresiaVencimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public Date getMembresiaVencimiento() {
        return membresiaVencimiento;
    }

    public void setMembresiaVencimiento(Date membresiaVencimiento) {
        this.membresiaVencimiento = membresiaVencimiento;
    }

    public Cliente(int id, String cedula, String nombre, Date fechaNacimiento, String contacto, String tipoMembresia, Date membresiaVencimiento) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.contacto = contacto;
        this.tipoMembresia = tipoMembresia;
        this.membresiaVencimiento = membresiaVencimiento;
    }
}
