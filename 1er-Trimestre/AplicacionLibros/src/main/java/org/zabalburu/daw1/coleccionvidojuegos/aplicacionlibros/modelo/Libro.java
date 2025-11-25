/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.coleccionvidojuegos.aplicacionlibros.modelo;

/**
 *
 * @author Iker Navarro
 */
public class Libro {
    public String titulo;
    public String autor;
    public String genero;
    public int paginas;
    
    public boolean esLargo(){
        return (this.paginas > 300);      
    }
}
