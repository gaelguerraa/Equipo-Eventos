/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.control;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Usuario;
import java.util.List;
import linkup.crearevento.ConfirmacionEvento;
import linkup.crearevento.EnviarInvitaciones;
import linkup.crearevento.IngresarDetallesEvento;
import linkup.crearevento.SeleccionarFechaHora;
import linkup.crearevento.SeleccionarUbicacion;
import linkup.crearevento.VentanaPrincipalCrearEvento;
import sistemaEventosNegocio.IFachadaEventos;

/**
 *
 * @author leoca
 */
public class ControlCrearEvento {
    
    private IFachadaEventos fachadaEventos;

    public ControlCrearEvento(IFachadaEventos fachadaEventos) {
        this.fachadaEventos = fachadaEventos;
    }

    public void iniciarFlujoCreacionEvento(){
        mostrarFormularioDetalles();
    }
    
    public void mostrarVentanaPrincipal(){
        VentanaPrincipalCrearEvento ventanaPrincipal = new VentanaPrincipalCrearEvento(this , fachadaEventos);
        ventanaPrincipal.mostrar();
    }
    
    public void mostrarFormularioDetalles(){
        IngresarDetallesEvento ingresarDetalles = new IngresarDetallesEvento(this, fachadaEventos);
        ingresarDetalles.mostrar();
    }
    
    public void mostrarSeleccionFechaHora(EventoDTO eventoDTO){
        SeleccionarFechaHora seleccionFechaHora = new SeleccionarFechaHora(this, fachadaEventos, eventoDTO);
        seleccionFechaHora.mostrar();
    }
    
    public void mostrarSeleccionarUbicacion(EventoDTO eventoDTO){
        SeleccionarUbicacion seleccionUbicacion = new SeleccionarUbicacion(this, fachadaEventos, eventoDTO);
        seleccionUbicacion.mostrar();
    }
    
    public void mostrarEnviarInvitaciones(EventoDTO eventoDTO){
        EnviarInvitaciones enviarInvitaciones = new EnviarInvitaciones(this, fachadaEventos, eventoDTO);
        enviarInvitaciones.mostrar();
    }
    
    public void mostrarConfirmacionEvento(EventoDTO eventoDTO, List<Usuario> contactosSeleccionados){
        ConfirmacionEvento confirmacionEvento = new ConfirmacionEvento(this, fachadaEventos, eventoDTO, contactosSeleccionados );
        confirmacionEvento.mostrar();
    }
    
}
