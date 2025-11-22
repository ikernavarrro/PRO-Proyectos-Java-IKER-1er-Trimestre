/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.dao.InstrumentoDAO;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public class InstrumentoDAOImpl implements InstrumentoDAO {

    private List<Instrumento> instrumentos;

    public InstrumentoDAOImpl() {
        this.instrumentos = new ArrayList<>();
    }
    
    @Override
    public void addInstrumento(Instrumento añadir) {
        instrumentos.add(añadir);
    }

    @Override
    public Instrumento getInstrumento(int id) {
        int i;
        for (i = 0; i < instrumentos.size() && instrumentos.get(i).getId() != id; i++);
        if (i < instrumentos.size()) {
            return instrumentos.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    @Override
    public void modifyInstrumento(Instrumento modificar) {
        int pos = instrumentos.indexOf(modificar);
        if (pos != -1) {
            instrumentos.set(pos, modificar);
        }
    }

    @Override
    public void removeInstrumento(int id) {
        Instrumento ins = getInstrumento(id);
        if (ins != null) {
            instrumentos.remove(ins);
        }
    }
}
