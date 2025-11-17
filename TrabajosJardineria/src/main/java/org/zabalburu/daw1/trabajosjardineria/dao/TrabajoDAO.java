/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.dao;

import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.modelo.Trabajo;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface TrabajoDAO {
    public Trabajo addTrabajo(Trabajo nuevo);
    public void modifyTrabajo(Trabajo modificar);
    public Trabajo getTrabajo(Integer id);
    public List<Trabajo> getTrabajos();
    public void deleteTrabajo(Trabajo eliminar);
    public void deleteTrabajo(Integer id);
}
