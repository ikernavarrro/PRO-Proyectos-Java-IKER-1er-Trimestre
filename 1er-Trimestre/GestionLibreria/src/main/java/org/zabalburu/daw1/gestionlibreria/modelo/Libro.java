/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionlibreria.modelo;

/**
 *
 * @author Iker Navarro
 */
public class Libro {

    public String titulo;
    public int páginas;

    public void mostrarInfo() {
        System.out.println("Libro: " + this.titulo + " - Páginas: " + this.páginas);
    }

    public int calcularTiempoLectura(int paginasPorHora) {
        int tiempoLectura = páginas / paginasPorHora;
        return tiempoLectura;
    }

}
