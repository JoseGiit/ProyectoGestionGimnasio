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
public class Clase {

    private int id;
    private String tipoClase;
    private Date horario;
    private int idEntrenador;
    private int capacidadMaxima;

    public Clase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Clase(int id, String tipoClase, Date horario, int idEntrenador, int capacidadMaxima) {
        this.id = id;
        this.tipoClase = tipoClase;
        this.horario = horario;
        this.idEntrenador = idEntrenador;
        this.capacidadMaxima = capacidadMaxima;
    }
       public Clase( String tipoClase, Date horario, int idEntrenador, int capacidadMaxima) {
        this.tipoClase = tipoClase;
        this.horario = horario;
        this.idEntrenador = idEntrenador;
        this.capacidadMaxima = capacidadMaxima;
    }
}
