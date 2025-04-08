/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ObjetosNegocio.Calendario;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Usuario;
import java.util.ArrayList;
import java.util.List;
import organizadorEventos.EventosException;

/**
 *
 * @author santi
 */
public class CalendarioDAO {
   private List<Calendario> Calendarios;

    public CalendarioDAO() {
        this.Calendarios = new ArrayList<Calendario>();
    }
    
    public void AgregarCalendario(Calendario calendario){
    
        Calendarios.add(calendario);
    }
    
    public void AgregarEvento(Usuario usuario, Evento evento){
    
        for (Calendario calendario : Calendarios) {
            if (calendario.getUsuario() == usuario){
                calendario.agregarEvento(evento);
            }
        }
    }
    
    public List<Evento> obtenerEventos(Usuario usuario) throws EventosException{
    
        for (Calendario calendario : Calendarios) {
            if (calendario.getUsuario() == usuario){
                return calendario.getEventos();
            }
        }
       throw  new EventosException("no existe el usuario");
    }
}
