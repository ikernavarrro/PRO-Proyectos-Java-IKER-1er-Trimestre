/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.dao;

import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.modelo.TipoTrabajo;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface TipoTrabajoDAO {
    public TipoTrabajo getTipoTrabajo(Integer id);
    public List<TipoTrabajo> getTiposTrabajo();
}
