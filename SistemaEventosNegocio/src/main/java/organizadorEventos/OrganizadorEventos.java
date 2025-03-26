/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizadorEventos;

import DAO.PersistenciaDAO;
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

    @Override
    public Calendar comprobarFecha(Calendar fecha, Usuario usuario) throws EventosException {
        List<Evento> EventosUsuario = persistenciaDAO.obtenerEventos(usuario);
        for (Evento evento : EventosUsuario) {
            if(fecha == evento.getFechaHora()){
                throw  new EventosException("Ya hay un evento en esta fecha");
            }
        }
        return fecha;
    }

    @Override
    public void AgregarEvento(Usuario usuario, Evento evento) {
        persistenciaDAO.AgregarEvento(usuario, evento);
    }

    @Override
    public List<Evento> obtenerEventos(Usuario usuario)  throws EventosException{
        return persistenciaDAO.obtenerEventos(usuario);
    }

   
        

    
    
}
