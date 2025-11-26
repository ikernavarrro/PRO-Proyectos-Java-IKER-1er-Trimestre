/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.modelo;

import java.util.Objects;

/**
 *
 * @author Iker
 */
public class TipoGasto {
    private Integer id;
    private String descripcion;
    //Constructores
    public TipoGasto() {
    }

    public TipoGasto(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }
    //Setters-Gettes
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    //Equals, hashcode y toString
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final TipoGasto other = (TipoGasto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "TipoGasto{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
    
}
