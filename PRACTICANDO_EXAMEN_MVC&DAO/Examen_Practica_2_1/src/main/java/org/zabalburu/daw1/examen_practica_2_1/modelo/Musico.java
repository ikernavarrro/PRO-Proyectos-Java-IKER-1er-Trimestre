/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Musico {
    private static int contadorMusicos;
    private Integer id;
    private String nombre;
    private int edad;
    private int añosExperiencia;
    private Instrumento instrumento;

    public Musico(String nombre, int edad, int añosExperiencia, Instrumento instrumento) {
        this.id = ++contadorMusicos;
        this.nombre = nombre;
        this.edad = edad;
        this.añosExperiencia = añosExperiencia;
        this.instrumento = instrumento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Musico{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", a\u00f1osExperiencia=" + añosExperiencia + ", instrumento=" + instrumento + '}';
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

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
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

    public Integer getId() {
        return id;
    } 
}
