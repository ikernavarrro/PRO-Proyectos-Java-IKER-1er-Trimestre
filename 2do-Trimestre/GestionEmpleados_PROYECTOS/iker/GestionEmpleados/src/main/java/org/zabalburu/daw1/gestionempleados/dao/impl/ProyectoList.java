/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoDAO;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.EmpleadoProyecto;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;

/**
 *
 * @author DAW1
 */
public class ProyectoList implements ProyectoDAO {

    private static List<Proyecto> proyectos = new ArrayList<>();

    @Override
    public Proyecto getProyecto(Integer id) {
        Proyecto nuevo = new Proyecto();
        nuevo.setId(id);
        int pos = proyectos.indexOf(nuevo);
        if (pos != -1) {
            return proyectos.get(pos);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarProyecto(Integer id) {
        /*// Algoritmos en MATRICES
        // Buscar la Posición.
        Proyecto eliminar = new Proyecto();
        eliminar.setId(id);
        int pos = proyectos.indexOf(eliminar);
        if (pos != -1) {
            for(; pos < proyectos.size(); pos++){
                proyectos.set(pos,proyectos.get(pos+1));
            }
        }
        proyectos.remove(proyectos.size()-1);
        }
         */
        Proyecto eliminar = new Proyecto();
        eliminar.setId(id);
        proyectos.remove(eliminar);
    }

    @Override
    public void modificarProyecto(Proyecto modificar) {
        int pos = proyectos.indexOf(modificar);
        if (pos != -1) {
            proyectos.set(pos, modificar);
        }
    }

    @Override
    public Proyecto nuevoProyecto(Proyecto nuevo) {
        Integer maxId = 1;
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().compareTo(maxId) > 0) { // p.getId() > maxId
                maxId = proyecto.getId();
            }
        }
        nuevo.setId(maxId + 1);
        nuevo.getResponsable().getProyectosResponsable().add(nuevo);
        return nuevo;
    }

    @Override
    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    @Override
    public void asignarEmpleado(Proyecto p, Empleado e) {
        EmpleadoProyecto ep = new EmpleadoProyecto(e, p);
        e.getProyectosTrabaja().add(ep);
        p.getEmpleadosProyecto().add(ep);
    }

    @Override
    public void desAsignarEmpleado(Proyecto p, Empleado e) {
        EmpleadoProyecto ep = new EmpleadoProyecto(e, p);
        e.getProyectosTrabaja().remove(ep);
        p.getEmpleadosProyecto().remove(ep);
    }

}
