/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Iker
 */
public class Comercial {
    private Integer id;
    private String nombre;
    private String Apellidos;
    private List<Gasto> gastosComercial;
    //Constructores
    public Comercial() {
    }

    public Comercial(Integer id, String nombre, String Apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.gastosComercial = new ArrayList<Gasto>();
    }
    //Setters-Gettes
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public List<Gasto> getGastosComercial() {
        return gastosComercial;
    }

    public void setGastosComercial(List<Gasto> gastosComercial) {
        this.gastosComercial = gastosComercial;
    }
    //Equals, hashcode y toString
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Comercial other = (Comercial) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Comercial{" + "id=" + id + ", nombre=" + nombre + ", Apellidos=" + Apellidos + '}';
    }
    
    //Métodos
    public double getTotalGastos() {
        Double totalGastos = 0.0;
        int i;
        //Recorremos la Lista completa en busca de los importes y los almacenamos en la variable totalGastos.
        for (i = 0; i < gastosComercial.size(); i++) {
            totalGastos += gastosComercial.get(i).getImporte();
        }     
        return totalGastos;
    }
    
    
}
