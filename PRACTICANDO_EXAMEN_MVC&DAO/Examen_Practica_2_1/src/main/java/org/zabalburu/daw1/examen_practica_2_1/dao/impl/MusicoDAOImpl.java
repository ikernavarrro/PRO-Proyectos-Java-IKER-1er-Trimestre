/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.zabalburu.daw1.examen_practica_2_1.dao.InstrumentoDAO;
import org.zabalburu.daw1.examen_practica_2_1.dao.MusicoDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MusicoDAOImpl implements MusicoDAO {

    private List<Musico> musicos;
    private InstrumentoDAO instrumentoDAO; // Instrumento Asignado

    public MusicoDAOImpl(InstrumentoDAO instrumentoDAO) {
        this.musicos = new ArrayList<>();
        this.instrumentoDAO = instrumentoDAO;
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
        } else {
            throw new NoSuchElementException("NO se ha encontrado el MÚSICO");
        }
    }

    @Override
    public void removeMusico(int id) {
        Musico m = getMusico(id);
        if (m != null) {
            musicos.remove(m);
        } else {
            throw new IllegalArgumentException("ID_MÚSICO NO Encontrado " + "(" + id + ")");
        }
    }

    @Override
    public void assignInstrumento(int idMusico, int idInstrumento) {
        Musico m = getMusico(idMusico);
        Instrumento i = instrumentoDAO.getInstrumento(idInstrumento);
        if (m != null && i != null) {
            m.setInstrumento(i);
        } else {
            throw new IllegalArgumentException("MÚSICO o INSTRUMENTO NO Encontrado");
        }
    }

    @Override
    public void unAssignInstrumento(int idMusico) {
        Musico m = getMusico(idMusico);
        if (m != null) {
            m.setInstrumento(null);
        } else {
            throw new IllegalArgumentException("ID_MÚSICO NO Encontrado " + "(" + idMusico + ")");
        }
    }
    
}
