/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.modelo.Trabajo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class TrabajoList implements TrabajoDAO {

    private static List<Trabajo> trabajos = new ArrayList<>();
    
    @Override
    public Trabajo addTrabajo(Trabajo nuevo) {
        Integer id = 1;
        if (!trabajos.isEmpty()) {
            id = trabajos.get(trabajos.size()-1).getId()+1;
        }
        nuevo.setId(id);
        trabajos.add(nuevo);
        return nuevo;
    }

    @Override
    public void modifyTrabajo(Trabajo modificar) {
        int pos = trabajos.indexOf(modificar);
        if (pos != -1) {
            trabajos.set(pos, modificar);
        }
    }

    @Override
    public Trabajo getTrabajo(Integer id) {
        Trabajo buscar = new Trabajo();
        buscar.setId(id);
        int pos = trabajos.indexOf(buscar);
        /*if (pos != -1) {
            return trabajos.get(pos);
        } else {
            return null;
        }*/
        return (pos == -1)?null:trabajos.get(pos);
    }

    @Override
    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    @Override
    public void deleteTrabajo(Integer id) {
        Trabajo t = new Trabajo();
        t.setId(id);
        trabajos.remove(t);
    }

    @Override
    public void deleteTrabajo(Trabajo eliminar) {
        trabajos.remove(eliminar);
    }
    
}
