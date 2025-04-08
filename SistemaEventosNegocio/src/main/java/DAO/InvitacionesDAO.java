/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ObjetosNegocio.Evento;
import ObjetosNegocio.Invitacion;
import ObjetosNegocio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class InvitacionesDAO {
    
    private List<Invitacion> invitacioness;

    public InvitacionesDAO() {
        this.invitacioness = new ArrayList<Invitacion>();
    }
    
    public void agregarInvitacion(Invitacion inv){
    
        invitacioness.add(inv);
    }
    
    public void agregarInvitacion(Usuario usuario, Evento evento){
        Invitacion  invitacion = new Invitacion(usuario, evento);
        invitacioness.add(invitacion);
    }
    
    public List<Invitacion> obtenerInvitaciones(Usuario usuario){
        List<Invitacion> invitacioneUsuario = new ArrayList<Invitacion>();
        for (Invitacion invitaciones : invitacioness) {
            if (invitaciones.getUsuario() == usuario) {
                invitacioneUsuario.add(invitaciones);
            }
        }
        return invitacioneUsuario;
    }
}
