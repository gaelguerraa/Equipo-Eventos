/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaEventosNegocio;

import AdministradorContactosPackage.AdministadorContactos;
import AdministradorContactosPackage.IAdministradorContactos;
import DAO.PersistenciaDAO;
import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Mapa;
import ObjetosNegocio.Usuario;
import java.util.Calendar;
import java.util.List;
import organizadorEventos.EventosException;
import organizadorEventos.IOrganizadorEventos;
import organizadorEventos.OrganizadorEventos;

/**
 *
 * @author gael_
 */
public class FEventos implements IFachadaEventos {

    private IOrganizadorEventos organizadorEventos;
    private IAdministradorContactos administradorContactos;
    private Usuario usuario;
    
    
    public FEventos(PersistenciaDAO persistenciaDAO, Usuario usuario) {
        this.organizadorEventos = new OrganizadorEventos(persistenciaDAO);
        this.administradorContactos = new AdministadorContactos(persistenciaDAO);
        this.usuario = usuario;
        
    }

    @Override
    public List<Usuario> encontrarContactos() {
        return administradorContactos.contactos(usuario);
    }

    @Override
    public String SeleccionarUbicaion(Mapa map) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Invitacion> enviarInvitaciones(List<Usuario> contactosSeleccionados, Evento evento) {
        return administradorContactos.enviarInvitaciones(contactosSeleccionados, evento);
    }

    

    @Override
    public Evento CrearEvento(EventoDTO eventoDTO) {
        Evento evento = new Evento();
        evento = organizadorEventos.crearEvento(eventoDTO);
        organizadorEventos.AgregarEvento(evento.getAdmin(), evento);
        return evento;
        
    }

    @Override
    public Calendar ValidarFecha(Calendar fecha)  throws EventosException {
      return  organizadorEventos.comprobarFecha(fecha, usuario);
    }

    @Override
    public List<Evento> obtenerEventos() throws EventosException {
        return organizadorEventos.obtenerEventos(usuario);
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public Usuario obtenerUsuario() {
        return usuario;
    }
    
    
   
    
}
