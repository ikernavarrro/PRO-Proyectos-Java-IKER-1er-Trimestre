/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.actividad28_1.dao;

import java.util.List;
import org.zabalburu.daw1.actividad28_1.modelo.Funko;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface FunkoDAO {
    Funko addFunko(Funko nuevo);
    List<Funko> getFunkos();
    Funko getFunko(int id);
    void modifyFunko(Funko modificar);
    void removeFunko(int id);
}
