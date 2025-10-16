/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.ejemploscanner;

import java.util.Scanner;

/**
 *
 * @author DAW1
 */
public class EjemploScanner {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre1 = sc1.nextLine();
        //System.out.println("El nombre es %s".formatted(nombre1));
        System.out.print("Apellido : ");
        String apellido1 = sc1.nextLine();
        //System.out.println("El apellido es %s".formatted(apellido1));
        System.out.println("Edad: ");
        int edad1 = sc1.nextInt();
        sc1.nextLine();
        System.out.println("Curso: ");
        String curso1 = sc1.nextLine();
        System.out.println("El nombre es %s, su apellido es %s, su edad es de %d años y está cursando %s.".formatted(nombre1, apellido1, edad1, curso1));
       
        
        
    }
}
