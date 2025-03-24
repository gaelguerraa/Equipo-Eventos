/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjetosNegocio;

/**
 *
 * @author santi
 */
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private List<Usuario> contactos;

    // Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.contactos = new ArrayList<>(); // Inicializamos la lista de contactos
    }

    // Métodos para agregar contactos
    public void agregarContacto(Usuario contacto) {
        this.contactos.add(contacto);
    }

    // Métodos de acceso a los atributos
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public List<Usuario> getContactos() {
        return contactos;
    }

    // Método para mostrar la información del usuario y sus contactos
    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre + " - Email: " + email);
        System.out.println("Contactos:");
        for (Usuario contacto : contactos) {
            System.out.println(" - " + contacto.getNombre() + " - Email: " + contacto.getEmail());
        }
    }

    public Usuario() {
    }

    public Usuario(String nombre, String email, List<Usuario> contactos) {
        this.nombre = nombre;
        this.email = email;
        this.contactos = contactos;
    }
}
