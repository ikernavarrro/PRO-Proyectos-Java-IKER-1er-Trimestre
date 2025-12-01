/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;

/**
 *
 * @author Iker
 */
public class EmpleadoList implements EmpleadoDAO {

    private List<Empleado> empleados;

    public EmpleadoList() {
        this.empleados = new ArrayList<>();
    }
    
    @Override
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public Empleado newEmpleado(Empleado e) {
        int id = 1;
        if (!empleados.isEmpty()) {
            //id = empleados.getLast().getId()+1; //
            Integer max = empleados.get(0).getId();
            for (int i = 1; i < empleados.size(); i++) {
                if (empleados.get(i).getId() > max) {
                    max = empleados.get(i).getId();
                }
            }
            id = max + 1;
        }
        e.setId(id);
        empleados.add(e);
        return e;
    }

    @Override
    public void removeEmpleado(Integer id) {
        Empleado eliminar = new Empleado();
        eliminar.setId(id);
        empleados.remove(eliminar);
    }

    @Override
    public void modifyEmpleado(Empleado e) {
        // int pos = empleados.indexOf(e); Si no lo encuentra devuelve -1!
        int i;
        for (i = 0; i < empleados.size() && !e.equals(empleados.get(i)); i++);
            if (i < empleados.size()) {
                empleados.set(i, e);
            }
    }

    @Override
    public Empleado getEmpleado(Integer id) {
        Empleado buscar = new Empleado();
        buscar.setId(id);
        int pos = empleados.indexOf(buscar);
        if (pos != -1) {
            return empleados.get(pos);
        } else {
            return null;
        }
    }
}
