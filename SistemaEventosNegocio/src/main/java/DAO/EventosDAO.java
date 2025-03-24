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
public class EventosDAO {
    private List<Evento> Eventos;

    public EventosDAO() {
        this.Eventos = new ArrayList<Evento>();
    }
    
    public void agregarEventos(Evento inv){
    
        Eventos.add(inv);
    }
    
   
    
   
}
