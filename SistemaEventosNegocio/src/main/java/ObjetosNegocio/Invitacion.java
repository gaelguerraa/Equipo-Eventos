/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosNegocio;

/**
 *
 * @author santi
 */
public class Invitacion {
    private  Usuario usuario;
    private  Evento evento;
    private  boolean  estado;

    public Invitacion() {
    }
    
    public Invitacion(Usuario usuario, Evento evento) {
        this.usuario = usuario;
        this.evento = evento;
        this.estado = false;
    }
    
    public Invitacion(Usuario usuario, Evento evento, boolean estado) {
        this.usuario = usuario;
        this.evento = evento;
        this.estado = estado;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
