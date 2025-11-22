/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface BandaDAO {
    public void addBanda(Banda añadir);
    public Banda getBanda (int id);
    public List<Banda> getBandas();
    public void modifyBanda(Banda modificar);
    public void removeBanda(int id);
    public void assignMusico(int idBanda, Musico musicoAsignar);
    // Como una Banda tiene muchos Músicos le pasamos el músico.
    public void unAssignMusico(int idBanda, Musico musicoDesAsignar);
}
