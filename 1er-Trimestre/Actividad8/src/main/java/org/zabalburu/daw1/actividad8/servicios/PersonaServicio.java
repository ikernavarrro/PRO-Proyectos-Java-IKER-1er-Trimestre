/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad8.servicios;

import java.util.List;
import org.zabalburu.daw1.actividad8.dao.PersonaDAO;
import org.zabalburu.daw1.actividad8.dao.PersonaList;
import org.zabalburu.daw1.actividad8.modelo.Persona;

/**
 *
 * @author Iker Navarro Pérez
 */
public class PersonaServicio {
    private PersonaDAO personaDAO = new PersonaList();
    
    public Persona addPersona(Persona nueva) {
        return personaDAO.addPersona(nueva);
    }
    
    public void modifyPersona(Persona modificar) {
        personaDAO.modifyPersona(modificar);
    }
    
    public Persona getPersona(String dni) {
        return personaDAO.getPersona(dni);
    }
    
    public void removePersona(Persona eliminar) {
        personaDAO.removePersona(eliminar);
    }
    
    public List<Persona> getPersonas() {
        return personaDAO.getPersonas();
    }
}
