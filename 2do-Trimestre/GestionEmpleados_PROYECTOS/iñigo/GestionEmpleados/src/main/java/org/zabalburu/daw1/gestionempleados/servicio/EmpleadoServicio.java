/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.servicio;

import java.util.List;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoList;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoDAO;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoList;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;

/**
 *
 * @author ichueca
 */
public class EmpleadoServicio {
    private EmpleadoDAO empDao = new EmpleadoList();
    private ProyectoDAO pryDao = new ProyectoList();
    
    public List<Empleado> getEmpleados(){
        return empDao.getEmpleados();
    }
    
    public Empleado nuevoEmpleado(Empleado nuevo){
        return empDao.nuevoEmpleado(nuevo);
    }
    
    public void eliminarEmpleado(Integer io){
        empDao.eliminarEmpleado(io);
    }
    
    public void modificarEmpleado(Empleado modificar){
        empDao.modificarEmpleado(modificar);
    }
    
    public Empleado getEmpleado(Integer id){
        return empDao.getEmpleado(id);
    }
    
    public Proyecto getProyecto(Integer id){
        return pryDao.getProyecto(id);
    }
    
    public void eliminarProyecto(Integer id){
        pryDao.eliminarProyecto(id);
    }
    
    public void modificarProyecto(Proyecto modificar){
        pryDao.modificarProyecto(modificar);
    }
    
    public Proyecto nuevoProyecto(Proyecto nuevo){
        return pryDao.nuevoProyecto(nuevo);
    }
    
    public List<Proyecto> getProyectos(){
        return pryDao.getProyectos();
    }
    
    public void asignarEmpleado(Proyecto p, Empleado e){
        pryDao.asignarEmpleado(p, e);
    }
    
    public void desAsignarEmpleado(Proyecto p, Empleado e){
        pryDao.desAsignarEmpleado(p, e);
    }
}
