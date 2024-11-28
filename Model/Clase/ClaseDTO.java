/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Clase;

import java.util.Date;

/**
 *
 * @author jdarg
 */
public class ClaseDTO {

    private String tipoClase;
    private Date horario;
    private String entrenador;
    private int capacidadMaxima;

    public String getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(String tipoClase) {
        this.tipoClase = tipoClase;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ClaseDTO(String tipoClase, Date horario, String entrenador, int capacidadMaxima) {
        this.tipoClase = tipoClase;
        this.horario = horario;
        this.entrenador = entrenador;
        this.capacidadMaxima = capacidadMaxima;
    }

    public ClaseDTO() {
    }

    @Override
    public String toString() {
        return "ClaseDTO{"
                + "tipoClase='" + tipoClase + '\''
                + ", horario=" + horario
                + ", entrenador='" + entrenador + '\''
                + ", capacidadMaxima=" + capacidadMaxima
                + '}';
    }
}
