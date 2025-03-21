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
    private List<String> etiquetas;
    private String descripcionEvento;
    private LocalDateTime fechaHora;

    public EventoDTO() {
    }
    
    

    public EventoDTO(String nombreEvento, List<String> etiquetas, String descripcionEvento, LocalDateTime fechaHora) {
        this.nombreEvento = nombreEvento;
        this.etiquetas = etiquetas;
        this.descripcionEvento = descripcionEvento;
        this.fechaHora = fechaHora;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<String> etiquetas) {
        this.etiquetas = etiquetas;
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
