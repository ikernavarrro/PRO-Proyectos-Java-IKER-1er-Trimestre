/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao.servicio;

import java.util.List;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoDAO;
import org.zabalburu.daw1.gestionempleados.dao.impl.EmpleadoList;
import org.zabalburu.daw1.gestionempleados.dao.impl.ProyectoList;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;

/**
 *
 * @author DAW1
 */
public class EmpleadoServicio {

    private EmpleadoDAO empleadoDAO = new EmpleadoList();
    private ProyectoDAO proyectoDAO = new ProyectoList();

    public List<Empleado> getEmpleados() {
        return empleadoDAO.getEmpleados();
    }

    public Empleado newEmpleado(Empleado e) {
        return empleadoDAO.newEmpleado(e);
    }

    public void removeEmpleado(Integer id) {
        empleadoDAO.removeEmpleado(id);
    }

    public void modifyEmpleado(Empleado e) {
        empleadoDAO
    }

    public Empleado getEmpleado(Integer id) {
    }

    public Proyecto getProyecto(Integer id) {
    }

    public void eliminarProyecto(Integer id) {
    }

    public void modificarProyecto(Proyecto modificar) {
    }

    public Proyecto nuevoProyecto(Proyecto nuevo) {
    }

    public List<Proyecto> getProyectos() {
    }

    public void asignarEmpleado(Proyecto p, Empleado e) {
    }

    public void desAsignarEmpleado(Proyecto p, Empleado e) {
    }
}
