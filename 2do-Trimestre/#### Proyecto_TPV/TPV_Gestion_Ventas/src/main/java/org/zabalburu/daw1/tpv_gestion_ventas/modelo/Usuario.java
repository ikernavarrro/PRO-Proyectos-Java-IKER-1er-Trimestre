/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.modelo;

import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Usuario {

    private Integer id;
    private String correoElectronico;
    private String hash;

    //CONSTRUCTOR
    public Usuario(Integer id, String correoElectronico, String hash) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.hash = hash;
    }

    public Usuario() {
    }

    // GETTERS y SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    //EQUALS y HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }
    
    //TO-STRING
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", hash=" + hash + '}';
    }
    
}
