/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.ejemplo02;

import java.util.Date;
import org.zabalburu.ejemplo02.modelo.Alumno;

/**
 *
 * @IKER DAW1
 */
public class GestionAlumnos {

    public static void main(String[] args) {

        Alumno al1 = new Alumno(); // Variable local porque está dentro de un método, en este caso el Main
        al1.nombre = "Iker";
        al1.edad = 21;
        al1.notaPRO = 9.85;
        al1.notaBD = 9.25;
        al1.fechaAlta = new Date();
        System.out.println("----------------------------------");
        System.out.println("Nombre: " + al1.nombre);
        System.out.println("Edad: " + al1.edad);
        System.out.println("Nota de Programación: " + al1.notaPRO);
        System.out.println("Nota de Bases de Datos: " + al1.notaBD);
        System.out.println("Fecha de Alta: " + al1.fechaAlta);
        System.out.println("----------------------------------");

        Alumno al2 = new Alumno(); // Variable local porque está dentro de un método, en este caso el Main
        al2.nombre = "Lucia";
        al2.edad = 21;
        al2.notaPRO = 8.95;
        al2.notaBD = 6.86;
        al2.fechaAlta = new Date();
        System.out.println("----------------------------------");
        System.out.println("Nombre: " + al2.nombre);
        System.out.println("Edad: " + al2.edad);
        System.out.println("Nota de Programación: " + al2.notaPRO);
        System.out.println("Nota de Bases de Datos: " + al2.notaBD);
        System.out.println("Fecha de Alta: " + al2.fechaAlta);
        System.out.println("----------------------------------");

   
        System.out.println("----------------------------------");
        System.out.println("Media de " + al1.nombre + " : " + al1.getNotaMedia());
        System.out.println("Media de " + al2.nombre + " : " + al2.getNotaMedia());
        System.out.println("Media General: " + al1.getMediaClase(al2));
        System.out.println("----------------------------------");
         
    }
}
