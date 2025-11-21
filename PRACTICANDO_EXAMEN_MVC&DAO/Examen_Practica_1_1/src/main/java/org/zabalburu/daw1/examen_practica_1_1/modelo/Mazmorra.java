/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Mazmorra {

    public String nombre;
    public Integer nivelDificultad;
    public List<Monstruo> monstruos;

    public Mazmorra(String nombre, Integer nivelDificultad) {
        this.nombre = nombre;
        this.nivelDificultad = nivelDificultad;
        this.monstruos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(Integer nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public List<Monstruo> getMonstruos() {
        return monstruos;
    }

    public void addMonstruo(Monstruo agregar) {
        monstruos.add(agregar);
    }

    public void removeMonstruo(Monstruo eliminar) {
        monstruos.remove(eliminar);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.nombre);
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
        final Mazmorra other = (Mazmorra) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Mazmorra{" + "nombre=" + nombre + ", nivelDificultad=" + nivelDificultad + ", monstruos=" + monstruos + '}';
    }

}
