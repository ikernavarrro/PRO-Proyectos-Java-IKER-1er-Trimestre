/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.dao.BandaDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class BandaDAOImpl implements BandaDAO {

    private List<Banda> bandas;

    public BandaDAOImpl() {
        this.bandas = new ArrayList<>();
    }

    @Override
    public void addBanda(Banda añadir) {
        bandas.add(añadir);
    }

    @Override
    public Banda getBanda(int id) {
        int i;
        for (i = 0; i < bandas.size() && bandas.get(i).getId() != id; i++);
        if (i < bandas.size()) {
            return bandas.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Banda> getBandas() {
        return bandas;
    }

    @Override
    public void modifyBanda(Banda modificar) {
        int pos = bandas.indexOf(modificar);
        if (pos != -1) {
            bandas.set(pos, modificar);
        }
    }

    @Override
    public void removeBanda(int id) {
        Banda eliminar = getBanda(id);
        if (eliminar != null) {
            bandas.remove(eliminar);
        }
    }

    @Override
    public void assignMusico(int idBanda, Musico musicoAsignar) {
        Banda b = getBanda(idBanda);
        if (b != null) {
            b.assignMusico(musicoAsignar);
        }
    }

    @Override
    public void unAssignMusico(int idBanda, Musico musicoDesAsignar) {
        Banda b = getBanda(idBanda);
        if (b != null) {
            b.unAssignMusico(musicoDesAsignar);
        }
    }
}
