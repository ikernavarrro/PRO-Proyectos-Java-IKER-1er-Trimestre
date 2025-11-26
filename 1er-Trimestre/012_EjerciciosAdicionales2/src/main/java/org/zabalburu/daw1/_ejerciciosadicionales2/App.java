/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1._ejerciciosadicionales2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1._ejerciciosadicionales2.modelo.Calculadora;

/**
 *
 * @author Iker
 */
public class App {

    public static void main(String[] args) {
        
        String resp = JOptionPane.showInputDialog("Número 1:");
        double n1 = Double.parseDouble(resp);
        
        resp = JOptionPane.showInputDialog("Número 2:");
        double n2 = Double.parseDouble(resp);
        
        System.out.println("""
                           %.2f + %.2f = %.2f
                           %.2f - %.2f = %.2f
                           %.2f x %.2f = %.2f
                           %.2f / %.2f = %.2f
                           ¿Es divisible? %b
                           El número más alto de los dos es %.2f
                           """.formatted(n1, n2, Calculadora.suma(n1, n2), n1, n2, Calculadora.resta(n1, n2), n1, n2, Calculadora.multiplication(n1, n2), n1, n2, Calculadora.division(n1, n2), Calculadora.divisible((int)n1, (int)n2), Calculadora.mayor(n1, n2)));
    }
}
