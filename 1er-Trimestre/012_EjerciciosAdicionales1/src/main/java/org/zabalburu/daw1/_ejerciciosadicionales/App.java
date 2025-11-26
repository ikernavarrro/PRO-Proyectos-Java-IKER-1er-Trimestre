/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1._ejerciciosadicionales;

import javax.swing.JOptionPane;
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
        
        Rectangulo r3 = new Rectangulo();
        String resp = JOptionPane.showInputDialog("Base del Rectangulo 3:");
        r3.base = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("Altura del Rectangulo 3:");
        r3.altura = Integer.parseInt(resp);
        
        System.out.printf("El perímetro del rectángulo 1 es de %d y el area de %d\n",r1.perimetro(), r1.area());
        System.out.printf("El perímetro del rectángulo 2 es de %d y el area de %d\n",r2.perimetro(), r2.area());
        System.out.printf("El perímetro del rectángulo 3 es de %d y el area de %d\n",r3.perimetro(), r3.area());

    }
}
