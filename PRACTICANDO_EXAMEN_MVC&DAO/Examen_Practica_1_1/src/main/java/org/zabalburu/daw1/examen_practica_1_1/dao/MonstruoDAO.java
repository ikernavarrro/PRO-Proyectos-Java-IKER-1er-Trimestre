/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Monstruo;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface MonstruoDAO {

    public Monstruo addMonstruo(Monstruo monstruo);

    public Monstruo getNombre(String nombre);

    public List<Monstruo> getMonstruos();

    public void modifyMonstruo(Monstruo monstruo);

    public void removeMonstruo(Monstruo monstruo);
}
