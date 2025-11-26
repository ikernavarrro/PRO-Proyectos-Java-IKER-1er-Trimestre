/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.calcular_factrial;

import javax.swing.JOptionPane;

/**
 * 8.Calcular el factorial de un número. 06/11/2025
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        // Vamos a suponer que siempre se introduce un ENTERO!
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un entero para obtener su Factorial:"));
        long factorial = 1; // Acumulador
        for (int i = num; i > 1; i--) {
           factorial *= i;
           // Formula n!= n*(n-1)*(n-2)*...*2*1
        }
        System.out.println(factorial);
    }
}
