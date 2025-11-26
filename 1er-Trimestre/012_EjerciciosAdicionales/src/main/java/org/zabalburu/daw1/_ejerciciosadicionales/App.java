/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1._ejerciciosadicionales;

import org.zabalburu.daw1._ejerciciosadicionales.modelo.Rectangulo;

/**
 *
 * @author DAW1
 */
public class App {

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.base = 500;
        r1.altura = 300;
        
        Rectangulo r2 = new Rectangulo();
        r2.base = 1000;
        r2.altura = 600;
        
        System.out.printf("El area del rectángulo 1 es de %d y el perímetro de %d",r1.area(), r1.perimetro());
        
    }
}
