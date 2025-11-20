/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.dao.MazmorraDAO;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Mazmorra;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MazmorraDAOImpl implements MazmorraDAO {

    private List<Mazmorra> mazmorras;

    public MazmorraDAOImpl() {
        mazmorras = new ArrayList<>();
    }

    @Override
    public Mazmorra addMazmorra(Mazmorra mazmorra) {
        mazmorras.add(mazmorra);
        return mazmorra;
    }

    @Override
    public Mazmorra getNombre(String nombre) {
        int i;
        for (i = 0; i < mazmorras.size() && !mazmorras.get(i).getNombre().equalsIgnoreCase(nombre); i++); 
            if (i < mazmorras.size()) {
                return mazmorras.get(i);
            } else {
                return null;
            }
        }
    
    @Override
    public List<Mazmorra> getMazmorras() {
        return mazmorras;
    }

    @Override
    public void modifyMazmorra(Mazmorra mazmorra) {
        int pos = mazmorras.indexOf(mazmorra);
        if (pos != -1) {
            mazmorras.set(pos, mazmorra);
        }
    }

    @Override
    public void removeMazmorra(Mazmorra mazmorra) {
        mazmorras.remove(mazmorra);
    }

}
