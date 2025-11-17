/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.modelo.Jardinero;

/**
 *
 * @author Iker Navarro Pérez
 */
public class JardineroList implements JardineroDAO {
    
    private static List<Jardinero> jardineros = new ArrayList<>();
    
    @Override
    public Jardinero addJardinero(Jardinero nuevo) {
        Integer id = 1;
        //if (jardineros.size() > 0) {
        if (!jardineros.isEmpty()) {
            id = jardineros.get(jardineros.size() - 1).getId() + 1;
        }
        nuevo.setId(id);
        jardineros.add(nuevo);
        return nuevo;
    }

    @Override
    public void deleteJardinero(Jardinero eliminar) {
        jardineros.remove(eliminar);
    }

    @Override
    public void deleteJardinero(Integer id) {
        Jardinero eliminar = new Jardinero();
        eliminar.setId(id);
        deleteJardinero(eliminar);
    }

    @Override
    public void modifyJardinero(Jardinero modificar) {
        // Buscamos la posición en la que está el jardinero con ese ID
        int pos = jardineros.indexOf(modificar);
        if (pos != -1) {
            // Sustituimos el jardinero.
            jardineros.set(pos, modificar);
        }
        
    }

    @Override
    public Jardinero getJardinero(Integer id) {
        Jardinero j = new Jardinero();
        j.setId(id);
        int pos = jardineros.indexOf(j);
        //return (pos == 1)?null:jardineros.get(pos);
        if (pos == -1) {
            return null;
        } else {
            // El jardinero con ese id está en la posición pos.
            return jardineros.get(pos);
        }   
    }
    
    @Override
    public Jardinero getJardinero(String dni) {
        int i;
        for (i=0; i < jardineros.size() && !dni.equalsIgnoreCase(jardineros.get(i).getDni()); i++);
        if (i < jardineros.size()) {
            return jardineros.get(i);
        } else {
            return null;
        }
    }

    @Override
    public List<Jardinero> getJardineros() {
        return jardineros;
    }
    
    public static void main(String[] args) {
        JardineroDAO dao = new JardineroList();
        dao.addJardinero(new Jardinero(null, "72319900B", "Iker", "Navarro"));
        dao.addJardinero(new Jardinero(null, "83744623B", "Unax", "Carazo"));
        System.out.println(dao.getJardineros());
        
    }

    
}
