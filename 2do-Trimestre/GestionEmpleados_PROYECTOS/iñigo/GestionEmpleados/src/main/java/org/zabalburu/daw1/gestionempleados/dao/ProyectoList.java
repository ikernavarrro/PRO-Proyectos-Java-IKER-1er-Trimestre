/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.EmpleadoProyecto;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;

/**
 *
 * @author ichueca
 */
public class ProyectoList implements ProyectoDAO{
    
    private static List<Proyecto> proyectos = new ArrayList<>();
    
    @Override
    public Proyecto getProyecto(Integer id) {
        // Búsqueda DESORDENADA
        /*int pos;
        for (pos = 0; pos < proyectos.size() && 
            !id.equals(proyectos.get(pos));pos++);
        if (pos == proyectos.size()){
            // No está
            return null;
        } else {
            return proyectos.get(pos);
        }*/
        
        // Búsqueda NO estructurada
        /*for (int i = 0; i < proyectos.size(); i++) {
            if (id.equals(proyectos.get(i))){
                return proyectos.get(i);
            }
        }
        return null;*/
        
        Proyecto buscar = new Proyecto();
        buscar.setId(id);
        int pos = proyectos.indexOf(buscar); // emplea equals
        if (pos != -1){
            return proyectos.get(pos);
        } else {
            return null;
        }
    }

    @Override
    public void eliminarProyecto(Integer id) {
        /*
        // Algoritmos (EN MATRICES)
        // Buscar la posición
        Proyecto eliminar = new Proyecto();
        eliminar.setId(id);
        int pos = proyectos.indexOf(eliminar);
        if (pos != -1){
            // Mover los elementos desde pos una posición a la izquierda
            for(; pos < proyectos.size(); pos++){
                proyectos.set(pos,proyectos.get(pos+1));
            }
            // Eliminar el último proyecto
            proyectos.remove(proyectos.size()-1);
        }*/
        Proyecto eliminar = new Proyecto();
        eliminar.setId(id);
        proyectos.remove(eliminar);
    }

    @Override
    public void modificarProyecto(Proyecto modificar) {
        int pos = proyectos.indexOf(modificar);
        if ( pos != -1){
            proyectos.set(pos, modificar);
        }
    }

    @Override
    public Proyecto nuevoProyecto(Proyecto nuevo) {
        Integer maxId = 0;
        for(Proyecto p : proyectos){
            if (p.getId().compareTo(maxId)>0){ // p.getId() > maxId
                maxId = p.getId();
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
        EmpleadoProyecto ep = new EmpleadoProyecto(e,p);
        e.getProyectosTrabaja().add(ep);
        p.getEmpleadosProyecto().add(ep);
    }

    @Override
    public void desAsignarEmpleado(Proyecto p, Empleado e) {
        EmpleadoProyecto ep = new EmpleadoProyecto(e, p);
        p.getEmpleadosProyecto().remove(ep); // equals
        e.getProyectosTrabaja().remove(ep);
    }
    
}
