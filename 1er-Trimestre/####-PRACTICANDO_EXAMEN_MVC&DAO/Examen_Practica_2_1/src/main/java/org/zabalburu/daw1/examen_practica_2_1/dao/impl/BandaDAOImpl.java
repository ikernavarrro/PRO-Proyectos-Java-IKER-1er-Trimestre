/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import org.zabalburu.daw1.examen_practica_2_1.dao.BandaDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.MusicoDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class BandaDAOImpl implements BandaDAO {

    private List<Banda> bandas;
    private MusicoDAO musicoDAO; // COORDINADOR

    public BandaDAOImpl(MusicoDAO musicoDAO) {
        this.bandas = new ArrayList<>();
        this.musicoDAO = musicoDAO;
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
        } else {
            throw new NoSuchElementException("NO se ha encontrado la BANDA");
        }
    }

    @Override
    public void removeBanda(int id) {
        Banda eliminar = getBanda(id);
        if (eliminar != null) {
            bandas.remove(eliminar);
        } else {
            throw new IllegalArgumentException("ID_BANDA NO Encontrado " + "(" + id + ")");
        }
    }

    @Override
    public void assignCoordinador(int idBanda, int idMusico) {
        Banda bn = getBanda(idBanda);
        Musico ms = musicoDAO.getMusico(idMusico);
        if (bn != null && ms != null) {
            bn.assignCoordinador(ms);
        } else {
            throw new IllegalArgumentException("BANDA o MÚSICO NO Encontrado");
        }
    }

    @Override
    public void unAssignCoordinador(int idBanda) {
        Banda bn = getBanda(idBanda);
        if (bn != null) {
            bn.assignCoordinador(null);
        } else {
            throw new IllegalArgumentException("ID_BANDA NO Encontrado " + "(" + idBanda + ")");
        }
    }

    @Override
    public void assignMusico(int idBanda, int idMusico) {
        Banda bn = getBanda(idBanda);
        Musico ms = musicoDAO.getMusico(idMusico);
        if (bn != null && ms != null) {
            bn.assignMusico(ms);
        } else {
            throw new IllegalArgumentException("BANDA o MÚSICO NO Encontrado");
        }
    }

    @Override
    public void unAssignMusico(int idBanda, int idMusico) {
        Banda bn = getBanda(idBanda);
        Musico ms = musicoDAO.getMusico(idMusico);
        if (bn != null && ms != null) {
            bn.unAssignMusico(ms);
        } else {
            throw new IllegalArgumentException("BANDA o MÚSICO NO Encontrado");
        }
    }

    @Override
    public List<Musico> getMusicosEnBanda(int idBanda) {
        Banda bn = getBanda(idBanda);
        if (bn != null) {
            return bn.getMusicos();
        } else {
            throw new IllegalArgumentException("ID_BANDA NO Encontrado " + "(" + idBanda + ")");
        }
    }
    
}
