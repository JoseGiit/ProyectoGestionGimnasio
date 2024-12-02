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
public class ClienteDTO {

    private final int id;
    private final String nombre;
    private final Date fechaNacimiento;
    private final String correo;
    private final String telefono;
    private final String tipoMembresia;
    private final Date membresiaVencimiento;

    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public Date getMembresiaVencimiento() {
        return membresiaVencimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    
    
    public ClienteDTO(int id, String nombre, Date fechaNacimiento, String correo, String telefono, String tipoMembresia, Date membresiaVencimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoMembresia = tipoMembresia;
        this.membresiaVencimiento = membresiaVencimiento;
    }

}
