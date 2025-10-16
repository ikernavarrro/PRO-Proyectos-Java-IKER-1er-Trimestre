/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW1
 */
public class Actividad4_3 {

    public static void main(String[] args) {
        
        int numeroFactorial;
        numeroFactorial = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                             <html>
                                                                             <h1><b>Calcular Factorial</b></h1>
                                                                             </html>
                                                                             """, "Introduzca un número sin Decimales."));
        
        int factorialDe = numeroFactorial;
        
        for (int i = 1; i < factorialDe; i++){
                 numeroFactorial *= i;
        } 
        
        JOptionPane.showMessageDialog(null, """
                                            <html>
                                            El factorial de %d es %d
                                            </html>
                                            """.formatted(factorialDe,numeroFactorial));
    }
}
