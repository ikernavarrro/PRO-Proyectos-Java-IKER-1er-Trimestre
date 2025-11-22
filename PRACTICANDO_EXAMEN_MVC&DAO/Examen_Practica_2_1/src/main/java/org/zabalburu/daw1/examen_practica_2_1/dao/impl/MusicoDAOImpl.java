/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.dao.MusicoDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MusicoDAOImpl implements MusicoDAO {

    private List<Musico> musicos;

    public MusicoDAOImpl() {
        this.musicos = new ArrayList<>();
    }

    @Override
    public void addMusico(Musico añadir) {
        musicos.add(añadir);
    }

    @Override
    public Musico getMusico(int id) {
        int i;
        for (i = 0; i < musicos.size() && musicos.get(i).getId() != id; i++);
        if (i < musicos.size()) {
            return musicos.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Musico> getMusicos() {
        return musicos;
    }

    @Override
    public void modifyMusico(Musico modificar) {
        int pos = musicos.indexOf(modificar);
        if (pos != -1) {
            musicos.set(pos, modificar);
        }
    }

    @Override
    public void removeMusico(int id) {
        Musico m = getMusico(id);
        if (m != null) {
            musicos.remove(m);
        }
    }

    @Override
    public void assignInstrumento(int idMusico, Instrumento instrumentoAsignar) {
        Musico m = getMusico(idMusico);
        if (m != null) {
            m.setInstrumento(instrumentoAsignar);
        }
    }

    @Override
    public void unAssignInstrumento(int idMusico) {
        Musico m = getMusico(idMusico);
        if (m != null) {
            m.setInstrumento(null);
        }
    }

}
