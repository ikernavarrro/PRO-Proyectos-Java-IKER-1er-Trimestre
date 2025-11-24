/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao;

import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.modelo.TipoGasto;

/**
 *
 * @author Iker
 */
public interface TipoGastoDAO {
    public TipoGasto getTipoGasto (Integer id);
    public List<TipoGasto> getTiposDeGastos();
}
