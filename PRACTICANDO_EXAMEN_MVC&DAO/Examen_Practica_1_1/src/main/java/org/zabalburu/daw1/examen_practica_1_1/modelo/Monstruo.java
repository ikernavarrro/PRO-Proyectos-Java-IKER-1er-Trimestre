/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.modelo;

import java.util.Objects;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Monstruo {
   public String nombre;
   public Integer vida;
   public Integer ataque;
   public Integer dificultad;
   public Tesoro tesoro;

    public Monstruo(String nombre, Integer vida, Integer ataque, Integer dificultad, Tesoro tesoro) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.dificultad = dificultad;
        this.tesoro = tesoro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public Tesoro getTesoro() {
        return tesoro;
    }

    public void setTesoro(Tesoro tesoro) {
        this.tesoro = tesoro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
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
        final Monstruo other = (Monstruo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Monstruo{" + "nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", dificultad=" + dificultad + ", tesoro=" + tesoro + '}';
    }
    
    
   
   
}
