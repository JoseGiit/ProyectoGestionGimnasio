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

    private int id;
    private final String tipoClase;
    private final String horario;
    private final int idEntrenador;
    private final int capacidadMaxima;

    public int getId() {
        return id;
    }

    public String getTipoClase() {
        return tipoClase;
    }

    public String getHorario() {
        return horario;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public ClaseDTO(String tipoClase, String horario, int idEntrenador, int capacidadMaxima) {
        this.tipoClase = tipoClase;
        this.horario = horario;
        this.idEntrenador = idEntrenador;
        this.capacidadMaxima = capacidadMaxima;
    }

    public ClaseDTO(int id, String tipoClase, String horario, int idEntrenador, int capacidadMaxima) {
        this.id = id;
        this.tipoClase = tipoClase;
        this.horario = horario;
        this.idEntrenador = idEntrenador;
        this.capacidadMaxima = capacidadMaxima;
    }

}
