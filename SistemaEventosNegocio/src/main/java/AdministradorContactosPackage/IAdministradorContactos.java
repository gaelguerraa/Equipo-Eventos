/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AdministradorContactosPackage;

import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Usuario;
import java.util.List;
import organizadorEventos.EventosException;

/**
 *
 * @author gael_
 */
public interface IAdministradorContactos {
    
    public abstract List<Usuario> contactos(Usuario usu);
    
    public abstract List<Invitacion> enviarInvitaciones(List<Usuario> contactosSeleccionados ,Evento evento);
    
    public abstract Usuario obtenerUsuario(String s)throws EventosException;
}
