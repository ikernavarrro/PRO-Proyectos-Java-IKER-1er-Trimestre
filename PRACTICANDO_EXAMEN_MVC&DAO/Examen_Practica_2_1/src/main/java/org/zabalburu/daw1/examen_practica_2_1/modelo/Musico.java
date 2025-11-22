/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.Date;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Musico {
    private static int contadorMusicos;
    private int id;
    private String nombre;
    private int edad;
    private Date fechaIncorporacion;
    private Instrumento instrumento;

    public Musico(String nombre, int edad, Date fechaIncorporacion, Instrumento instrumento) {
        this.id = ++contadorMusicos;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIncorporacion = fechaIncorporacion;
        this.instrumento = instrumento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Musico other = (Musico) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Musico{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", fechaIncorporacion=" + fechaIncorporacion + ", instrumento=" + instrumento + '}';
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }

    public static int getContadorMusicos() {
        return contadorMusicos;
    }

    public int getId() {
        return id;
    } 
}
