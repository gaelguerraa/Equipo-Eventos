/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministradorContactosPackage;

import DAO.PersistenciaDAO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Usuario;
import java.util.ArrayList;
import java.util.List;
import organizadorEventos.EventosException;

/**
 *
 * @author santi
 */
public class AdministadorContactos implements IAdministradorContactos {

    private PersistenciaDAO persistenciaDAO;

    public AdministadorContactos(PersistenciaDAO persistenciaDAO) {
        this.persistenciaDAO = persistenciaDAO;
    }
    
    
    
    @Override
    public List<Invitacion> enviarInvitaciones(List<Usuario> contactosSeleccionados, Evento evento) {
        List<Invitacion> invitacioness = new ArrayList<Invitacion>();
        for (Usuario contactosSeleccionado : contactosSeleccionados) {
            Invitacion invitacion = new Invitacion(contactosSeleccionado, evento, false);
            invitacioness.add(invitacion);
        }
        return invitacioness;
    }

    @Override
    public List<Usuario> contactos(Usuario usu) {
        return persistenciaDAO.obtenerContactos(usu);
    }

    @Override
    public Usuario obtenerUsuario(String s) throws EventosException {
        return persistenciaDAO.obtenerUsuario(s);
    }
    
}
