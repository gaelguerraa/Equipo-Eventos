/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ObjetosNegocio.Evento;
import ObjetosNegocio.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class UsuariosDAO {
    private List<Usuario> usuarios;

    public UsuariosDAO() {
        Usuario usuario1 = new Usuario("Santiago","santileonlo03@gmail.com");
        Usuario usuario2 = new Usuario("Dana","danachavez@gmail.com");
        Usuario usuario3 = new Usuario("Leonel","kekocarballo@gmail.com");
        usuario1.agregarContacto(usuario2);
        usuario1.agregarContacto(usuario3);
        this.usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        
    }
    
    public List<Usuario> obtenerContactos(Usuario usu){
        return usu.getContactos();
    }
    
    

}
