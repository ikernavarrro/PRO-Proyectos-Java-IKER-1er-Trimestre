/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.gestionpersonas;

import org.zabalburu.gestionpersonas.modelo.Persona;

/**
 *
 * @author Focus Mode
 */
public class GestionPersonas {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Iker";
        p1.apellidos = "Navarro Pérez";
        p1.edad = 21;
        p1.sueldo = 15000;
        p1.saludo();
      
        
        Persona p2 = new Persona();
        p2.nombre = "Lucia";
        p2.apellidos = "Pleguezuelos Pérez";
        p2.edad = 21;
        p2.sueldo = 20000;
        System.out.println("");
        p2.saludo();
    
        
        Persona p3 = new Persona();
        p3.nombre = "Izaro";
        p3.apellidos = "Navarro Pérez";
        p3.edad = 18;
        p3.sueldo = 15000;
        System.out.println("");
        p3.saludo();
      
        
        int edadMedia = (p1.edad + p2.edad + p3.edad) / 3;
        System.out.println("");
        System.out.println("La edad media es de " + edadMedia + " años.");
        
        System.out.println("");
        System.out.println("El sueldo de " + p1.nombre + " es de " + p1.sueldo + "€ Brutos y " + p1.getSueldoNeto(21) + "€ Netos.");
        System.out.println("El sueldo de " + p2.nombre + " es de " + p2.sueldo + "€ Brutos y " + p2.getSueldoNeto(21) + "€ Netos.");
        System.out.println("El sueldo de " + p3.nombre + " es de " + p3.sueldo + "€ Brutos y " + p3.getSueldoNeto(21) + "€ Netos.");
    }
}
