/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface MusicoDAO {
    public void addMusico(Musico añadir);
    public Musico getMusico (int id);
    public List<Musico> getMusicos();
    public void modifyMusico(Musico modificar);
    public void removeMusico(int id);
    public void assignInstrumento(int idMusico, Instrumento instrumentoAsignar);
    // Como un Músico solo tiene un instrumento no hace falta pasarle el instrumento.
    public void unAssignInstrumento(int idMusico);
}
