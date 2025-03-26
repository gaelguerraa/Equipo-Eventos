/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ObjetosNegocio.Calendario;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Usuario;
import java.util.List;
import organizadorEventos.EventosException;

/**
 *
 * @author santi
 */
public class PersistenciaDAO {
    private CalendarioDAO calendarioDAO;
    private InvitacionesDAO  invitacionesDAO;
    private EventosDAO eventosDAO;
    private UsuariosDAO usuariosDAO;

    public PersistenciaDAO() {
        this.calendarioDAO = new CalendarioDAO();
        this.invitacionesDAO = new InvitacionesDAO();
        this.eventosDAO = new EventosDAO();
        this.usuariosDAO = new UsuariosDAO();
    }
    
    
    public void AgregarCalendario(Calendario calendario){
    
       calendarioDAO.AgregarCalendario(calendario);
    }
    
    public void AgregarEvento(Usuario usuario, Evento evento){
        calendarioDAO.AgregarEvento(usuario, evento);
    }
    
    public List<Evento> obtenerEventos(Usuario usuario) throws EventosException{
        return calendarioDAO.obtenerEventos(usuario);
    }
    
    public void agregarInvitacion(Invitacion inv){
       invitacionesDAO.agregarInvitacion(inv);
    }
    
     public void agregarInvitacion(Usuario usuario, Evento evento){
         invitacionesDAO.agregarInvitacion(usuario, evento);
     }
     
     public List<Invitacion> obtenerInvitaciones(Usuario usuario){
         return invitacionesDAO.obtenerInvitaciones(usuario);
     }
     
     public void agregarEventos(Evento inv){
         eventosDAO.agregarEventos(inv);
     }
     
      public List<Usuario> obtenerContactos(Usuario usu){
          return usuariosDAO.obtenerContactos(usu);
      }
      
      public Usuario obtenerUsuario(String s) throws EventosException{
          return  usuariosDAO.obtenerUsuario(s);
      }
}
