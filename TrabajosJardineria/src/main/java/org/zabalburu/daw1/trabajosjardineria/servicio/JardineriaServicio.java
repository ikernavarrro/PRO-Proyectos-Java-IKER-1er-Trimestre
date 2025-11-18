/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.servicio;

import java.util.Date;
import java.util.List;
import org.zabalburu.daw1.trabajosjardineria.dao.JardineroDAO;
import org.zabalburu.daw1.trabajosjardineria.dao.JardineroList;
import org.zabalburu.daw1.trabajosjardineria.dao.TipoTrabajoDAO;
import org.zabalburu.daw1.trabajosjardineria.dao.TipoTrabajoMatriz;
import org.zabalburu.daw1.trabajosjardineria.dao.TrabajoDAO;
import org.zabalburu.daw1.trabajosjardineria.dao.TrabajoList;
import org.zabalburu.daw1.trabajosjardineria.modelo.Jardinero;
import org.zabalburu.daw1.trabajosjardineria.modelo.TipoTrabajo;
import org.zabalburu.daw1.trabajosjardineria.modelo.Trabajo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class JardineriaServicio {
    private TrabajoDAO trabajoDAO = new TrabajoList();
    private TipoTrabajoDAO tipoTrabajoDAO = new TipoTrabajoMatriz();
    private JardineroDAO jardineroDAO = new JardineroList();
    
    //-----Trabajo DAO----
    public Trabajo addTrabajo(Trabajo nuevo){
        return trabajoDAO.addTrabajo(nuevo);
    }
    
    public void modifyTrabajo(Trabajo modificar){
        trabajoDAO.modifyTrabajo(modificar);
    }
    
    public Trabajo getTrabajo(Integer id) {
        return trabajoDAO.getTrabajo(id);
    }
    
    public List<Trabajo> getTrabajos() {
        return trabajoDAO.getTrabajos();
    }
    
    public void deleteTrabajo(Trabajo eliminar) {
        trabajoDAO.deleteTrabajo(eliminar);
    }
    
    public void deleteTrabajo(Integer id) {
        trabajoDAO.deleteTrabajo(id);
    }
    
    //-----Jardinero DAO----
    public Jardinero addJardinero(Jardinero nuevo) {
        return jardineroDAO.addJardinero(nuevo);
    }
    
    public void deleteJardinero(Jardinero eliminar) {
        jardineroDAO.deleteJardinero(eliminar);
    }
    
    public void deleteJardinero(Integer id) {
        jardineroDAO.deleteJardinero(id);
    }
    
    public void modifyJardinero(Jardinero modificar) {
        jardineroDAO.modifyJardinero(modificar);
    }
    
    public Jardinero getJardinero (Integer id) {
        return jardineroDAO.getJardinero(id);
    }
    
    public List<Jardinero> getJardineros() {
        return jardineroDAO.getJardineros();
    }
    
    public Jardinero getJardinero(String dni) {
        return jardineroDAO.getJardinero(dni);
    }
    
    //-----TipoTrabajo DAO----
    
    public TipoTrabajo getTipoTrabajo(Integer id) {
        return tipoTrabajoDAO.getTipoTrabajo(id);
    }
    public List<TipoTrabajo> getTiposTrabajo() {
        return tipoTrabajoDAO.getTiposTrabajo();
    }
    
    // --------------------------
    
    public void asignarTrabajo(Trabajo t, Jardinero j) {
        t.setJardinero(j);
        trabajoDAO.modifyTrabajo(t);
        j.getTrabajos().add(t);
        jardineroDAO.modifyJardinero(j);
    }
    
    public void desAsignarTrabajo(Trabajo t, Jardinero j) {
        t.setJardinero(null);
        trabajoDAO.modifyTrabajo(t);
        j.getTrabajos().remove(t);
        jardineroDAO.modifyJardinero(j);
    }
    
    public void finalizarTrabajo(Trabajo t) {
        t.setFechaFin(new Date());
        trabajoDAO.modifyTrabajo(t);
    }
     
}
