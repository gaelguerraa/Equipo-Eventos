/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO_Negocio;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author gael_
 */
public class EventoDTO {
    private String nombreEvento;
    private String etiqueta;
    private String descripcionEvento;
    private LocalDateTime fechaHora;
    //private ubicacion con API

    public EventoDTO() {
    }
    
    

    public EventoDTO(String nombreEvento, String etiqueta, String descripcionEvento, LocalDateTime fechaHora ) {
        this.nombreEvento = nombreEvento;
        this.etiqueta = etiqueta;
        this.descripcionEvento = descripcionEvento;
        this.fechaHora = fechaHora;
        //ubicacion
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    
    
}
