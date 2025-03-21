/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaEventosNegocio;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Mapa;
import ObjetosNegocio.Usuario;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author gael_
 */
public interface IFachadaEventos {
    public abstract List<Usuario> encontrarContactos(Usuario usu);
    
    public abstract List<Usuario> seleccionarInvitados(Usuario usu);
    
    public abstract String SeleccionarUbicaion(Mapa map);
    
    public abstract LocalDateTime SeleccionarFechaHora();
    
    public abstract Evento AgregarDetalles(EventoDTO eventoDTO);
    
    
}
