/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.dao.TesoroDAO;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Tesoro;

/**
 *
 * @author Iker Navarro Pérez
 */
public class TesoroDAOImpl implements TesoroDAO {

    private List<Tesoro> tesoros;

    public TesoroDAOImpl() {
        tesoros = new ArrayList<>();
    }

    @Override
    public Tesoro addTesoro(Tesoro tesoro) {
        tesoros.add(tesoro);
        return tesoro;
    }

    @Override
    public Tesoro getNombre(String nombre) {
        int i;
        for (i = 0; i < tesoros.size() && !tesoros.get(i).getNombre().equalsIgnoreCase(nombre); i++);
        if (i < tesoros.size()) {
            return tesoros.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Tesoro> getTesoros() {
        return tesoros;
    }

    @Override
    public void modifyTesoro(Tesoro tesoro) {
        int pos = tesoros.indexOf(tesoro);
        if (pos != -1) {
            tesoros.set(pos, tesoro);
        }
    }

    @Override
    public void removeTesoro(Tesoro tesoro) {
        tesoros.remove(tesoro);
    }

}
