/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.servicio;

import java.util.GregorianCalendar;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoList;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoDAO;
import org.zabalburu.daw1.gestionempleados.dao.ProyectoList;
import org.zabalburu.daw1.gestionempleados.dao.UsuarioImpl;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;
import org.zabalburu.daw1.gestionempleados.modelo.Usuario;

/**
 *
 * @author ichueca
 */
public class EmpleadoServicio {
    private EmpleadoDAO empDao = new EmpleadoList();
    private ProyectoDAO pryDao = new ProyectoList();
    private UsuarioImpl usuarioDao = new UsuarioImpl();
    
    public EmpleadoServicio(){
        Proyecto p = new Proyecto(1, getEmpleado(1), 
            new GregorianCalendar(2025,10,7).getTime(), 
            new GregorianCalendar(2025,11,7).getTime(), 
            "Análisis de la aplicación Recyclon", 
            "Realizar el análisis de la aplicación y la definición de las clases",
            350.0);
        nuevoProyecto(p);
        p = new Proyecto(1, getEmpleado(1), 
            new GregorianCalendar(2025,11,7).getTime(), 
            null, 
            "Diseño del modelo", 
            "Realizar el diseño e imeplementación del modelo",
            140.0);
        nuevoProyecto(p);
        asignarEmpleado(p, getEmpleado(1));
        asignarEmpleado(p, getEmpleado(2));
        Usuario u =new Usuario(1,"Marta","Torre","mtorre","");
        nuevoUsuario(u,"mtorre");
        nuevoUsuario(new Usuario(2,"Iñigo","Chueca","ichueca",""),"ichueca");
        nuevoUsuario(new Usuario(3,"Argeme","Avila","avila",""),"avila");
        nuevoUsuario(new Usuario(4,"Lorena","Moya","lmoya",""),"lmoya");
        /*for(Usuario us : usuarioDao.getUsuarios()){
            System.out.println(us);
        }*/
    }
    
    
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
    
    public Usuario login(String usuario, String password){
        Usuario u = usuarioDao.getUsuario(usuario);
        if (u != null){
            if (!BCrypt.checkpw(password, u.getHash())){
                u = null;
            }
        }
        return u;
    }
    
    public Usuario nuevoUsuario(Usuario nuevo, String password){
        String hash = BCrypt.hashpw(password, BCrypt.gensalt());
        nuevo.setHash(hash);
        return usuarioDao.nuevoUsuario(nuevo);
    }
    
    /*public static void main(String[] args) {
        new EmpleadoServicio();
    }*/
    
}

