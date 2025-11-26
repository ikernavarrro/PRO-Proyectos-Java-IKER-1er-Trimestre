/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao;

import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;

/**
 *
 * @author Iker
 */
public interface GastoDAO {
    public Gasto addGasto(Gasto añadir);
    public Gasto getGasto (Integer id);
    public List<Gasto> getGastos();
}
