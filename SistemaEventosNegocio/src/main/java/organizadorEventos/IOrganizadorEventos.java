/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package organizadorEventos;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Usuario;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author gael_
 */
public interface IOrganizadorEventos {
    
    public abstract Evento crearEvento(EventoDTO eventoDTO);
    
    public abstract Calendar comprobarFecha(Calendar fecha, Usuario usuario) throws EventosException;
    
    public abstract void AgregarEvento(Usuario usuario, Evento evento);
    
    public abstract List<Evento> obtenerEventos(Usuario usuario)  throws EventosException;
    
}
