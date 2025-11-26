/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface InstrumentoDAO {
    public void addInstrumento(Instrumento añadir);
    public Instrumento getInstrumento (int id);
    public List<Instrumento> getInstrumentos();
    public void modifyInstrumento(Instrumento modificar);
    public void removeInstrumento(int id);
}
