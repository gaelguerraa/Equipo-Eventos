/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkup.control;

import linkup.crearevento.IngresarDetallesEvento;
import linkup.crearevento.SeleccionarFechaHora;

/**
 *
 * @author leoca
 */
public class ControlCrearEvento {
    
    public void iniciarFlujoCreacionEvento(){
        mostrarFormularioDetalles();
    }
    
    public void mostrarFormularioDetalles(){
        IngresarDetallesEvento ingresarDetalles = new IngresarDetallesEvento(this);
        ingresarDetalles.mostrar();
    }
    
    public void mostrarSeleccionFechaHora(){
        SeleccionarFechaHora seleccionFechaHora = new SeleccionarFechaHora(this);
        seleccionFechaHora.mostrar();
    }
    
}
