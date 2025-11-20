/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.dao.MonstruoDAO;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Monstruo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MonstruoDAOImpl implements MonstruoDAO {
    
    private List<Monstruo> monstruos;

    public MonstruoDAOImpl() {
        monstruos = new ArrayList<>();
    }
    
    @Override
    public Monstruo addMonstruo(Monstruo monstruo) {
        monstruos.add(monstruo);
        return monstruo;
    }

    @Override
    public Monstruo getNombre(String nombre) {
        int i;
        for (i = 0; i < monstruos.size() && !monstruos.get(i).getNombre().equalsIgnoreCase(nombre); i++);
        if (i < monstruos.size()) {
            return monstruos.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Monstruo> getMonstruos() {
        return monstruos;
    }

    @Override
    public void modifyMonstruo(Monstruo monstruo) {
        int pos = monstruos.indexOf(monstruo);
        if (pos != -1) {
            monstruos.set(pos, monstruo);
        }
    }

    @Override
    public void removeMonstruo(Monstruo monstruo) {
        monstruos.remove(monstruo);
    }
    
}
