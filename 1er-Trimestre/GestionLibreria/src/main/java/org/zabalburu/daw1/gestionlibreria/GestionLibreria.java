/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.gestionlibreria;

import org.zabalburu.daw1.gestionlibreria.modelo.Libro;

/**
 *
 * @author Iker Navarro
 */
public class GestionLibreria {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Piense y Hágase Rico";
        libro1.páginas = 272;
        libro1.mostrarInfo();
        
        Libro libro2 = new Libro();
        libro2.titulo = "El Hombre Más Rico De Babilonia";
        libro2.páginas = 157;
        libro2.mostrarInfo();
        
        int paginasPorHora = 30;
        int tiempoLectura1 = libro1.calcularTiempoLectura(paginasPorHora);
        int tiempoLectura2 = libro2.calcularTiempoLectura(paginasPorHora);
        System.out.println("Tiempo de lectura para " + libro1.titulo + ": " + tiempoLectura1 + " horas.");
        System.out.println("Tiempo de lectura para " + libro2.titulo + ": " + tiempoLectura2 + " horas.");
        
        paginasPorHora = 40;
        tiempoLectura1 = libro1.calcularTiempoLectura(paginasPorHora);
        tiempoLectura2 = libro2.calcularTiempoLectura(paginasPorHora);
        
        System.out.println("Velocidad de lectura aumentada.");
        System.out.println("Tiempo de lectura para " + libro1.titulo + ": " + tiempoLectura1 + " horas.");
        System.out.println("Tiempo de lectura para " + libro2.titulo + ": " + tiempoLectura2 + " horas.");
    }
}
