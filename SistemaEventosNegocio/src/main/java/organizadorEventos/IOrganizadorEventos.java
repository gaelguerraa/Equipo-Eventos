/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package organizadorEventos;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import java.time.LocalDateTime;

/**
 *
 * @author gael_
 */
public interface IOrganizadorEventos {
    
    public abstract Evento crearEvento(EventoDTO eventoDTO);
    
}
