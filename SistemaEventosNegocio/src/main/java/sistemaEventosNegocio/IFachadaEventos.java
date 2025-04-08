/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaEventosNegocio;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Mapa;
import ObjetosNegocio.Usuario;
import java.util.Calendar;
import java.util.List;
import organizadorEventos.EventosException;

/**
 *
 * @author gael_
 */
public interface IFachadaEventos {
    public abstract List<Usuario> encontrarContactos();
    
    public abstract String SeleccionarUbicaion(Mapa map);
    
    public abstract List<Invitacion> enviarInvitaciones(List<Usuario> contactosSeleccionados, Evento evento);
    
    public abstract Calendar ValidarFecha(Calendar fecha)  throws EventosException;
    
    public abstract Evento CrearEvento(EventoDTO eventoDTO);
    
    public abstract List<Evento> obtenerEventos()  throws EventosException;
    
    public  abstract Usuario obtenerUsuario();
    
    
    
    
}
