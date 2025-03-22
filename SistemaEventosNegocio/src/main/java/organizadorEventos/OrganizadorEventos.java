/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadorEventos;

import DTO_Negocio.EventoDTO;
import java.time.LocalDateTime;

/**
 *
 * @author gael_
 */
public class OrganizadorEventos implements IOrganizadorEventos{

    @Override
    public EventoDTO crearEvento(String nombre, String etiqueta, String descripcion) {
        if(nombre.isEmpty() || !nombre.matches("^[a-zA-Z0-9 ]+$")){
            throw new IllegalArgumentException("Eliga un nombre correcto para el evento");
        }
        
        
        EventoDTO nuevoEvento = new EventoDTO(nombre, etiqueta, descripcion );
        //poner en GUI "evento creado con exito"
        return nuevoEvento;
    }
        

    
    
}
