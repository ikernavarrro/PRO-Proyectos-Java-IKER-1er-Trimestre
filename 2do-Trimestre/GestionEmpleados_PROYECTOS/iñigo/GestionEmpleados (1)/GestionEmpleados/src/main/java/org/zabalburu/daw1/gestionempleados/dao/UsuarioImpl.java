/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.dao;

import java.util.ArrayList;
import java.util.List;
import org.zabalburu.daw1.gestionempleados.modelo.Usuario;

/**
 *
 * @author ichueca
 */
public class UsuarioImpl {
    private static List<Usuario> usuarios = new ArrayList<>();
    
    public UsuarioImpl(){
        
    }
    
    public Usuario getUsuario(String usuario){
        // Búsqueda Desordenada
        int i;
        for(i=0; i<usuarios.size() &&
           !usuario.equals(usuarios.get(i).getUsuario());i++);
        if (i < usuarios.size()){
            // Está en i
            return usuarios.get(i);
        } else {
            // Nos hemos salido. No está
            return null;
        }
    }
    
    public Usuario nuevoUsuario(Usuario usuario){
        Integer maxId = 0;
        for(Usuario u : usuarios){
            if (u.getId().compareTo(maxId)>0){
               maxId = u.getId();
            }
        }
        usuario.setId(maxId + 1);
        usuarios.add(usuario);
        return usuario;
    }
    
    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    
}
