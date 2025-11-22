/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Instrumento {
    private static int contadorInstrumentos;
    private int id;
    private String nombre;
    private String familia;
    private int añoFabricacion;

    public Instrumento(String nombre, String familia, int añoFabricacion) {
        this.id = ++contadorInstrumentos;
        this.nombre = nombre;
        this.familia = familia;
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
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
        final Instrumento other = (Instrumento) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "id=" + id + ", nombre=" + nombre + ", familia=" + familia + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public static int getContadorInstrumentos() {
        return contadorInstrumentos;
    }

    public int getId() {
        return id;
    }
}
