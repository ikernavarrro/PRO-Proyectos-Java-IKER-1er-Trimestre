/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad02.modelo;

/**
 *
 * @author DAW1
 */
public class Videojuego {
    public String nombre;
    public String plataforma;
    public String genero;
    public int puntuacion;
    
    public boolean esRecomendable(){
        return this.puntuacion >= 8 ? true:false;
    
    }
}
