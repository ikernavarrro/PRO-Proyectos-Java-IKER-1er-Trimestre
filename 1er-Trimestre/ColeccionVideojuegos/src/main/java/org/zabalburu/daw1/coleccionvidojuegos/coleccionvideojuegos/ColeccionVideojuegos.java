/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.coleccionvidojuegos.coleccionvideojuegos;

import org.zabalburu.daw1.coleccionvidojuegos.coleccionvideojuegos.modelo.Videojuego;

/**
 *
 * @author Focus Mode
 */
public class ColeccionVideojuegos {

    public static void main(String[] args) {
        // CREAMOS LOS OBJETOS
        Videojuego juego1 = new Videojuego();
        juego1.nombre = "Elden Ring";
        juego1.plataforma = "PS5";
        juego1.genero = "RPG";
        juego1.puntuación = 9;

        Videojuego juego2 = new Videojuego();
        juego2.nombre = "Horizon Forbidden West";
        juego2.plataforma = "PS5";
        juego2.genero = "Acción";
        juego2.puntuación = 7;

        // COMPARANDO PUNTUACIONES
        String puntAltaBaja = (juego2.puntuación > juego1.puntuación) ? "baja" : "alta";
        System.out.println(juego2.nombre + " tiene una puntuación más " + puntAltaBaja + " que " + juego1.nombre + ".");   // Alta

        puntAltaBaja = (juego1.puntuación > juego2.puntuación) ? "baja" : "alta";
        System.out.println(juego1.nombre + " tiene una puntuación más " + puntAltaBaja + " que " + juego2.nombre + ".");  // Baja

        System.out.println(""); // PARA SEPARAR

        //COMPARANDO LOS GÉNEROS
        String genPertSiNo = (juego1.equals(juego2)) ? " si" : " no";
        System.out.println("Los juegos " + juego1.nombre + " y " + juego2.nombre + genPertSiNo + " pertenecen al mismo género."); // No

        genPertSiNo = (juego2.equals(juego1)) ? " si" : " no";
        System.out.println("Los juegos " + juego2.nombre + " y " + juego1.nombre + genPertSiNo + " pertenecen al mismo género."); // No

        System.out.println(""); // PARA SEPARAR

        //COMPROBANDO SI SON RECOMENDABLES 
        String resultEsRecomendable = (juego1.esRecomendable()) ? "es recomendable" : "no es recomendable";
        System.out.println(juego1.nombre + " " + resultEsRecomendable + ", su puntuación es de " + juego1.puntuación + ".");

        resultEsRecomendable = (juego2.esRecomendable()) ? "es recomendable" : "no es recomendable";
        System.out.println(juego2.nombre + " " + resultEsRecomendable + ", su puntuación es de " + juego2.puntuación + ".");

        // NUEVO VIDEOJUEGO
        Videojuego juego3 = new Videojuego();
        juego3.nombre = "God of War Ragnarok";
        juego3.plataforma = "PS4";
        juego3.genero = juego1.genero;
        juego3.puntuación = 9;

        System.out.println(""); // PARA SEPARAR

        //ADICIONAL 1.0
        double puntMedia = (juego1.puntuación + juego2.puntuación + juego3.puntuación) / 3;
        System.out.println("La puntuación media de los Juegos es de " + puntMedia);

        System.out.println(""); // PARA SEPARAR

        //ADICIONAL 2.0        
        System.out.println("Juegos disponibles para PS5: " + juego1.calculoGéneros(juego2.plataforma, juego3.plataforma));
        
        System.out.println(""); // PARA SEPARAR
        
        //ADICIONAL 3.0
        
     } 
        
        
        
    }




