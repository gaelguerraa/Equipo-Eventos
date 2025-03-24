/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AdministradorContactos;

import ObjetosNegocio.Usuario;
import java.util.List;

/**
 *
 * @author gael_
 */
public interface IAdministradorContactos {
    
    public abstract List<Usuario> contactos(Usuario usu);
    
    public abstract List<Usuario> enviarInvitaciones(List<Usuario> contactosSeleccionados);
    
}
