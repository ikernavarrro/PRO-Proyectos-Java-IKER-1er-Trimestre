/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.dao;

import java.util.List;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Concierto;

/**
 *
 * @author Iker Navarro Pérez
 */
public interface ConciertoDAO {
    public void addConcierto(Concierto añadir);
    public Concierto getConcierto (int id);
    public List<Concierto> getConciertos();
    public void modifyConcierto(Concierto modificar);
    public void removeConcierto(int id);
    public void assignBanda(int idConcierto, int idBanda);
    // Como un Concierto solo puede realizarlo una banda solo le pasamos el id Concierto.
    public void unAssignBanda(int idConcierto);
}
