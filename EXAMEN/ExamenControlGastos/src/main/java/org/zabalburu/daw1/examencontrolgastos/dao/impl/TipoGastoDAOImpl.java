/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.dao.TipoGastoDAO;
import org.zabalburu.daw1.examencontrolgastos.modelo.TipoGasto;

/**
 *
 * @author Iker
 */
public class TipoGastoDAOImpl implements TipoGastoDAO {

    private static final TipoGasto[] TIPOS_DE_GASTOS = {
        new TipoGasto(1, "Desplazamiento"),
        new TipoGasto(2, "Alojamiento"),
        new TipoGasto(3, "Manutencion"),
        new TipoGasto(4, "Otros")};

    public TipoGastoDAOImpl() {
    }

    @Override
    public TipoGasto getTipoGasto(Integer id) {
       int i;
        for(i = 0; i < TIPOS_DE_GASTOS.length &&
            !id.equals(TIPOS_DE_GASTOS[i].getId()); i++);
        if ( i < TIPOS_DE_GASTOS.length ){
            return TIPOS_DE_GASTOS[i];
        } else {
            return null;
        }
    }

    @Override
    public List<TipoGasto> getTiposDeGastos() {
        List<TipoGasto> tiposDeGastos = new ArrayList<>();
        for (int i = 0; i < TIPOS_DE_GASTOS.length; i++) {
            tiposDeGastos.add(TIPOS_DE_GASTOS[i]);
        }
        return tiposDeGastos;
    }
}
