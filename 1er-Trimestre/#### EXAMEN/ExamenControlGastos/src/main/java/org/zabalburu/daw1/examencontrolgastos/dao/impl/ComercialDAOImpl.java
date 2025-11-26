/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.dao.ComercialDAO;
import org.zabalburu.daw1.examencontrolgastos.dao.GastoDAO;
import org.zabalburu.daw1.examencontrolgastos.modelo.Comercial;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;

/**
 *
 * @author Iker
 */
public class ComercialDAOImpl implements ComercialDAO {
    private List<Comercial> comerciales;
    private List<GastoDAO> gastosDAO;

    public ComercialDAOImpl() {
        this.comerciales = new ArrayList<>();
        this.gastosDAO = new ArrayList<>();
    }

    @Override
    public Comercial addComercial(Comercial añadir) {
        Integer id = 1;
        // Si la lista NO está vacía, cogemos el id del último comercial, le sumamos 1 y se lo asignamos después.
        if (!comerciales.isEmpty()) {
            id = comerciales.get(comerciales.size()-1).getId() + 1;
        }
        añadir.setId(id);
        comerciales.add(añadir);
        return añadir;
    }

    @Override
    public Comercial getComercial(Integer id) {
        int i;
        // Búsqueda secuencial sin saltos incondicionales.
        for (i = 0; i < comerciales.size() && comerciales.get(i).getId() != id; i++);
        if (i < comerciales.size()) {
            return comerciales.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Comercial> getComerciales() {
        return comerciales;
    }

    @Override
    public void modifyComercial(Comercial modificar) {
        //Buscamos posición.
        int pos = comerciales.indexOf(modificar);
        if (pos != -1) {
            //Sustituimos
            comerciales.set(pos, modificar);
        } 
    }

    @Override
    public int removeComercial(Integer id) {
        Comercial c = new Comercial();
        c.setId(id);
        int pos = comerciales.indexOf(c);
        if (pos != -1){
            comerciales.remove(pos);
        }
        return pos;
    }

    @Override
    public void assignGasto(Integer iDGastoAsignar, Integer iDComercialAsignar) {
        Comercial c = getComercial(iDComercialAsignar);
        Gasto g = new Gasto(iDGastoAsignar, null, null, 0.0, null);
        if (c != null && g != null) {
            c.getGastosComercial().add(g);
        } 
    }

    @Override
    public void unAssignGasto(Integer iDGastoDesAsignar, Integer iDComercialDesAsignar) {
        Comercial c = getComercial(iDComercialDesAsignar);
        Gasto g = new Gasto(iDGastoDesAsignar, null, null, 0.0, null);
        if (c != null && g != null) {
            c.getGastosComercial().remove(g);
        } 
    }

    
}
