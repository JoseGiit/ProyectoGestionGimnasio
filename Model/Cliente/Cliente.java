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
    private String nombre;
    private Date fechaNacimiento;
    private String correo;
    private String telefono;
    private String tipoMembresia;
    private Date membresiaVencimiento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Cliente(int id, String nombre, Date fechaNacimiento, String correo, String telefono, String tipoMembresia, Date membresiaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoMembresia = tipoMembresia;
        this.membresiaVencimiento = membresiaVencimiento;
    }

}
