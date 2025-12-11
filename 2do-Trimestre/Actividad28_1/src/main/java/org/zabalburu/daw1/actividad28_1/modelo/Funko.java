/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad28_1.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Funko {
    private int id;
    private String nombre;
    private String dimensiones;
    private String color;
    private double precio;
    private String foto;

    public Funko(int id, String nombre, String dimensiones, String color, double precio, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.dimensiones = dimensiones;
        this.color = color;
        this.precio = precio;
        this.foto = foto;
    }

    public Funko() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
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
        final Funko other = (Funko) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Funko{" + "id=" + id + ", nombre=" + nombre + ", dimensiones=" + dimensiones + ", color=" + color + ", precio=" + precio + ", foto=" + foto + '}';
    }
    
    
}
