/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import DAO.PersistenciaDAO;
import ObjetosNegocio.Calendario;
import ObjetosNegocio.Usuario;
import linkup.control.ControlCrearEvento;
import linkup.crearevento.VentanaPrincipalCrearEvento;
import organizadorEventos.EventosException;
import sistemaEventosNegocio.FEventos;
import sistemaEventosNegocio.IFachadaEventos;

/**
 *
 * @author leoca
 */
public class Main {

    public static void main(String[] args) throws EventosException {
        
        PersistenciaDAO persistenciaDAO = new PersistenciaDAO();
        Usuario usuario = persistenciaDAO.obtenerUsuario("santileonlo03@gmail.com");
        persistenciaDAO.AgregarCalendario(new Calendario(usuario));
        IFachadaEventos fachadaEventos = new FEventos(persistenciaDAO, usuario);
        ControlCrearEvento controlador = new ControlCrearEvento(fachadaEventos);
        VentanaPrincipalCrearEvento ventanaPrincipalCrearEvento = new VentanaPrincipalCrearEvento(controlador, fachadaEventos);
        ventanaPrincipalCrearEvento.mostrar();
    }
    
}
