/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class Calendario{
    private Usuario usuario;
    private List<Evento> Eventos;

    public Calendario(Usuario usuario) {
        this.usuario = usuario;
        this.Eventos = new ArrayList<Evento>();
    }

    public void agregarEvento(Evento evento) {
        this.Eventos.add(evento);
    }
    
    public Calendario(Usuario usuario, List<Evento> Eventos) {
        this.usuario = usuario;
        this.Eventos = Eventos;
    }
    
    public Calendario(){
    
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Evento> getEventos() {
        return Eventos;
    }

    public void setEventos(List<Evento> Eventos) {
        this.Eventos = Eventos;
    }

    
}
