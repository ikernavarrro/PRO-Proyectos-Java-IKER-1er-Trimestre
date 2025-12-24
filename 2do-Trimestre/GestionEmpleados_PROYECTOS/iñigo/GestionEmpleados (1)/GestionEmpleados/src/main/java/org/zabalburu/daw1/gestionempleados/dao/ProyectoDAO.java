/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao;

import java.util.List;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;

/**
 *
 * @author ichueca
 */
public interface ProyectoDAO {
    Proyecto getProyecto(Integer id);
    void eliminarProyecto(Integer id);
    void modificarProyecto(Proyecto modificar);
    Proyecto nuevoProyecto(Proyecto nuevo);
    List<Proyecto> getProyectos();
    void asignarEmpleado(Proyecto p, Empleado e);
    void desAsignarEmpleado(Proyecto p, Empleado e);
}
