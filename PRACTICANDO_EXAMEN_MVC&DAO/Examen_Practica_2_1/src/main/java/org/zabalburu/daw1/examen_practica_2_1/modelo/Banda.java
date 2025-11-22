/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Banda {

    private static int contadorBandas;
    private int id;
    private String nombre;
    private String genero;
    private Date fechaFormacion;
    private List<Musico> musicos;

    public Banda(String nombre, String genero, Date fechaFormacion) {
        this.id = ++contadorBandas;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaFormacion = fechaFormacion;
        this.musicos = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
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
        final Banda other = (Banda) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", fechaFormacion=" + fechaFormacion + ", musicos=" + musicos + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaFormacion() {
        return fechaFormacion;
    }

    public void setFechaFormacion(Date fechaFormacion) {
        this.fechaFormacion = fechaFormacion;
    }

    public List<Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public int getId() {
        return id;
    }

    public void assignMusico(Musico musico) {
        musicos.add(musico);
    }
    
    public void unAssignMusico(Musico musico) {
        musicos.remove(musico);
    }
}
