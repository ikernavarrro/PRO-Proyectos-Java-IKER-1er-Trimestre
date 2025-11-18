/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad8.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.actividad8.modelo.Persona;

/**
 *
 * @author Iker Navarro Pérez
 */
public class PersonaList implements PersonaDAO {

    private static List<Persona> personas = new ArrayList<>();
    
    @Override
    public Persona addPersona(Persona nueva) {
        personas.add(nueva);
        return nueva;
    }

    @Override
    public void modifyPersona(Persona modificar) {
        int pos = personas.indexOf(modificar);
        personas.set(pos, modificar);
    }

    @Override
    public void removePersona(Persona eliminar) {
        personas.remove(eliminar);
    }

    @Override
    public List<Persona> getPersonas() {
        return personas;
    }

    @Override
    public Persona getPersona(String dni) {
        Persona p = new Persona();
        p.setDni(dni);
        int pos = personas.indexOf(p);
        if (pos == -1) {
            return null;
        } else {
        return personas.get(pos);
        }
    }      
}
