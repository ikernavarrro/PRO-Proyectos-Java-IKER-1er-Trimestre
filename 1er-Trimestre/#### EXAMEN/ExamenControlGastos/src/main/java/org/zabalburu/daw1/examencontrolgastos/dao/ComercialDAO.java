/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.dao;

import java.util.List;
import org.zabalburu.daw1.examencontrolgastos.modelo.Comercial;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;

/**
 *
 * @author Iker
 */
public interface ComercialDAO {
    public Comercial addComercial(Comercial añadir);
    public Comercial getComercial (Integer id);
    public List<Comercial> getComerciales();
    public void modifyComercial(Comercial modificar);
    public int removeComercial(Integer id);
    public void assignGasto(Integer iDGastoAsignar, Integer iDComercialAsignar);
    public void unAssignGasto(Integer iDGastoDesAsignar, Integer iDComercialDesAsignar);
}
