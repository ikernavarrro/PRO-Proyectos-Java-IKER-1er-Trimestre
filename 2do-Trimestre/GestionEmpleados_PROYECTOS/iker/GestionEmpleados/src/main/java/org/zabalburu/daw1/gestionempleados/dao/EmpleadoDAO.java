/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao;

import java.util.List;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;

/**
 *
 * @author Iker
 */
public interface EmpleadoDAO {
    public List<Empleado> getEmpleados();
    public Empleado newEmpleado(Empleado e);
    void removeEmpleado(Integer id);
    void modifyEmpleado(Empleado e);
    Empleado getEmpleado(Integer id);
}
