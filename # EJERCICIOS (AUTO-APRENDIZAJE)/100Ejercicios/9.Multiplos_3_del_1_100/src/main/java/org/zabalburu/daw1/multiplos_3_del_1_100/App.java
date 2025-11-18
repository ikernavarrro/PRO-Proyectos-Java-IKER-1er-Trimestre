/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.multiplos_3_del_1_100;

import javax.swing.JOptionPane;

/**
 * 9.Mostrar cuántos números del 1 al 100 son múltiplos de 3. 18/11/2025
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        App.multiplo3();
    }
    public static void multiplo3(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
            System.out.println(i);
            }
        }
    }
}
