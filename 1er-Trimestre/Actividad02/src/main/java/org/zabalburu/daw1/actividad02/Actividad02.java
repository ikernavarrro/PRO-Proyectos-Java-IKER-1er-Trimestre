/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad02;

import org.zabalburu.daw1.actividad02.modelo.Videojuego;

/**
 *
 * @author DAW1
 */
public class Actividad02 {

    public static void main(String[] args) {
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "Elde Rings";
        juego1.plataforma = "PS5";
        juego1.genero = "RPG";
        juego1.puntuacion = 9;

        Videojuego juego2 = new Videojuego();
        juego2.nombre = "Horizon Forbidden West";
        juego2.plataforma = "PS5";
        juego2.genero = "Acción";
        juego2.puntuacion = 7;

        Videojuego masAltaPuntuacion = juego1.puntuacion > juego2.puntuacion ? juego1 : juego2;
        System.out.println("El videojuego " + masAltaPuntuacion.nombre + " es el que tiene mayor puntuación (" + masAltaPuntuacion.puntuacion + " puntos).");

        System.out.println("Los videojuegos" + (juego1.plataforma.equalsIgnoreCase(juego2.plataforma) ? " " : " no ") + "son de la misma plataforma.");

        System.out.println("El juego " + juego1.nombre + (juego1.esRecomendable() ? " es " : " no es ") + "recomendable.");
        System.out.println("El juego " + juego2.nombre + (juego2.esRecomendable() ? " es " : " no es ") + "recomendable.");
        
        Videojuego juego3 = new Videojuego();
        juego3.nombre = "God of War Ragnarok";
        juego3.plataforma = "PS4";
        juego3.genero = juego1.genero;
        juego3.puntuacion = 9;
        
        double puntMedia = (juego1.puntuacion + juego2.puntuacion + juego3.puntuacion) / 3.0;
        System.out.println("La puntuación media de los juegos es: " + puntMedia);
        
        String plataforma = "PS5";
        int cuenta = 0;        
        cuenta = cuenta + (juego1.plataforma.equalsIgnoreCase(plataforma)?1:0);
        cuenta = cuenta + (juego2.plataforma.equalsIgnoreCase(plataforma)?1:0); 
        cuenta = cuenta + (juego3.plataforma.equalsIgnoreCase(plataforma)?1:0);
        System.out.println("Hay " + cuenta + (cuenta == 1? " juego " : " juegos ") + "de " + plataforma + ".");
        
        boolean condicion1 = (juego1.plataforma.equalsIgnoreCase("PS5") || juego1.plataforma.equalsIgnoreCase("PS4")) && juego1.puntuacion >= 7;
        System.out.println("El juego " + juego1.nombre + (condicion1? " CUMPLE" : " NO CUMPLE") + " la condición de que la plataforma sea PS5 o PS4 y la puntuación sea MAYOR o IGUAL que 7.");
    
        boolean condicion2 = (juego1.plataforma.equalsIgnoreCase("PS5") || juego1.plataforma.equalsIgnoreCase("PS4")) && juego1.puntuacion >= 10;
        System.out.println("El juego " + juego1.nombre + (condicion2? " CUMPLE" : " NO CUMPLE") + " la condición de que la plataforma sea PS5 o PS4 y la puntuación sea MAYOR o IGUAL que 10.");
        
        boolean condicion3 = (juego3.puntuacion >= 7 && juego3.puntuacion <= 9) && juego3.esRecomendable();
        System.out.println("La puntuación de " + juego3.nombre + " está entre 7 y 9 (ambos incluidos) y es recomendable: " + condicion3);
        
        // La puntuación más alta de los tres juegos (emplead ?: anidados) JUEGO1=9 JUEGO2=7 JUEGO3=9
        String puntuacionMasAlta = (juego1.puntuacion > juego2.puntuacion)? ((juego1.puntuacion > juego3.puntuacion)? juego1.nombre : juego3.nombre) : ((juego2.puntuacion > juego3.puntuacion)? juego2.nombre : juego3.nombre);
        System.out.println("La puntuación mas alta la tiene " + puntuacionMasAlta + ".");
        
    
    }
    
}
