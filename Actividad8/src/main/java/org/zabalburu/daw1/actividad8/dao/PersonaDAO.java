/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.actividad8.dao;

import java.util.List;
import org.zabalburu.daw1.actividad8.modelo.Persona;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface PersonaDAO {
    public Persona addPersona(Persona nueva);
    public void modifyPersona(Persona modificar);
    public Persona getPersona(String dni);
    public void removePersona(Persona eliminar);
    public List<Persona> getPersonas();
}
