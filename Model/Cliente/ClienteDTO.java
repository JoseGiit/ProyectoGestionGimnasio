/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Cliente;

/**
 *
 * @author jdarg
 */
public class ClienteDTO {

    private String cedula;
    private String nombre;
    private String tipoMembresia;
    private String contacto;

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

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public ClienteDTO(String cedula, String nombre, String tipoMembresia, String contacto) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipoMembresia = tipoMembresia;
        this.contacto = contacto;
    }

    public ClienteDTO() {
    }

    @Override
    public String toString() {
        return "ClienteDTO{"
                + "cedula='" + cedula + '\''
                + ", nombre='" + nombre + '\''
                + ", tipoMembresia='" + tipoMembresia + '\''
                + ", contacto='" + contacto + '\''
                + '}';
    }
}
