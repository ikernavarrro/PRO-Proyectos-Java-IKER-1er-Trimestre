/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Mazmorra;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface MazmorraDAO {

    public Mazmorra addMazmorra(Mazmorra mazmorra);

    public Mazmorra getNombre(String nombre);

    public List<Mazmorra> getMazmorras();

    public void modifyMazmorra(Mazmorra mazmorra);

    public void removeMazmorra(Mazmorra mazmorra);
}
