/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadorEventos;

import DAO.PersistenciaDAO;
import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import java.time.LocalDateTime;

/**
 *
 * @author gael_
 */
public class OrganizadorEventos implements IOrganizadorEventos{

    private PersistenciaDAO persistenciaDAO;
    
    public OrganizadorEventos(PersistenciaDAO persistenciaDAO) {
        this.persistenciaDAO = persistenciaDAO;
    }

    @Override
    public Evento crearEvento(EventoDTO eventoDTO) {
        Evento  evento = new Evento();
        evento.setNombreEvento(eventoDTO.getNombreEvento());
        evento.setDescripcionEvento(eventoDTO.getDescripcionEvento());
        evento.setAdmin(eventoDTO.getAdmin());
        evento.setEtiqueta(eventoDTO.getEtiqueta());
        evento.setFechaHora(eventoDTO.getFechaHora());
        evento.setUbicacion(eventoDTO.getUbicacion());
        persistenciaDAO.agregarEventos(evento);
        return evento;
    }

   
        

    
    
}
