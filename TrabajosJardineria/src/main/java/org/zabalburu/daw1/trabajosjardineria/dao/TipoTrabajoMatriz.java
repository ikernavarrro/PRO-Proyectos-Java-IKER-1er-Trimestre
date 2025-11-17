/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.modelo.TipoTrabajo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class TipoTrabajoMatriz implements TipoTrabajoDAO {

    private static TipoTrabajo[] tiposTrabajo = {
        new TipoTrabajo(1, "Poda"),
        new TipoTrabajo(2, "Desbrozar"),
        new TipoTrabajo(3, "Arreglar Jardín"),
        new TipoTrabajo(4, "Ornamentación Florar")
    };

    @Override
    public TipoTrabajo getTipoTrabajo(Integer id) {
        int i;
        for (i = 0; i < tiposTrabajo.length && !id.equals(tiposTrabajo[i].getId()); i++);
        if (i < tiposTrabajo.length) {
            return tiposTrabajo[i];
        } else {
            return null;
        }
    }

    @Override
    public List<TipoTrabajo> getTiposTrabajo() {
        List<TipoTrabajo> tipos = new ArrayList<>();
        for (TipoTrabajo t : tiposTrabajo) {
            tipos.add(t);
        }
        return tipos;
    }

}
