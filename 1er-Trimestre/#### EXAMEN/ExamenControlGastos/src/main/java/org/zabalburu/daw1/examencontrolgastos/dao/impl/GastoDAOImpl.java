/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.dao.GastoDAO;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;

/**
 *
 * @author Iker
 */
public class GastoDAOImpl implements GastoDAO {
    private List<Gasto> gastos;

    public GastoDAOImpl() {
        this.gastos = new ArrayList<>();
    }

    @Override
    public Gasto addGasto(Gasto añadir) {
        Integer id = 1;
        // Si la lista NO está vacía, cogemos el id del último gasto, le sumamos 1 y se lo asignamos después.
        if (!gastos.isEmpty()) {
            id = gastos.get(gastos.size()-1).getId() + 1;
        }
        añadir.setId(id);
        gastos.add(añadir);
        return añadir;
    }

    @Override
    public Gasto getGasto(Integer id) {
        int i;
        // Búsqueda secuencial sin saltos incondicionales.
        for (i = 0; i < gastos.size() && gastos.get(i).getId() != id; i++);
        if (i < gastos.size()) {
            return gastos.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Gasto> getGastos() {
        return gastos;
    }
}
