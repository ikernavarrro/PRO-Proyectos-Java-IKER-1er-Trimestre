/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.coleccionvidojuegos.aplicacionlibros;

import org.zabalburu.daw1.coleccionvidojuegos.aplicacionlibros.modelo.Libro;

/**
 *
 * @author Iker Navarro
 */
public class AplicacionLibros {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.genero = "Novela";
        libro1.paginas = 496;
        
        Libro libro2 = new Libro();
        libro2.titulo = "El principito";
        libro2.autor = "Antoine de Saint-Exupéry";
        libro2.genero = "Novela";
        libro2.paginas = 96;
        
         System.out.println(""); // SALTO DE LINEA
        
        //Comparamos los 2 libros para saber cual tiene más páginas.
        String masPaginas = (libro1.paginas > libro2.paginas)? libro1.titulo : libro2.titulo;
        System.out.println(masPaginas + " es el libro que más páginas tiene.");
        
        System.out.println(""); // SALTO DE LINEA
        
        // Vamos a ver si estos libros son largos con el método esLargo.
        System.out.println(libro1.titulo + " tiene " + libro1.paginas + " páginas. ¿Es largo?: " + libro1.esLargo());
        System.out.println(libro2.titulo + " tiene " + libro2.paginas + " páginas. ¿Es largo?: " + libro2.esLargo());
        
        Libro libro3 = new Libro();
        libro3.titulo = "Rayuela";
        libro3.autor = " Julio Cortázar";
        libro3.paginas = 400;
        libro3.genero = libro1.genero;
        
        System.out.println(""); // SALTO DE LINEA
        
        double mediaTotalPaginas = (libro1.paginas + libro2.paginas + libro3.paginas) / 3.0;
        System.out.println("La media de páginas de todos los libros es de " + mediaTotalPaginas + " páginas.");
        
        System.out.println(""); // SALTO DE LINEA
        
        String genero = "Novela";
        boolean contadorGenero = 
                (libro1.genero.equalsIgnoreCase(genero))? 
        
         
          

       
    
    
            
    
        
    }   
}
