/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.coleccionvidojuegos.coleccionvideojuegos.modelo;

/**
 *
 * @author Iker Navarro
 */
// CREAMOS LA CLASE CON SUS ATRIBUTOS
public class Videojuego {

    public String nombre;
    public String plataforma;
    public String genero;
    public int puntuación;

    // CREAMOS LOS MÉTODOS
    public boolean esRecomendable() {
        return puntuación >= 8;
    }
    
    // ADICIONAL 2.0
    
    public int calculoGéneros(String otro1, String otro2) {
        String platContar = "PS5";
        int cuenta = 0;       
        cuenta = (this.plataforma.equals(platContar) ? ++cuenta : cuenta);
        cuenta = (otro1.equals(platContar) ? ++cuenta : cuenta);
        cuenta = (otro2.equals(platContar) ? ++cuenta : cuenta);
        return cuenta;
    }
}
