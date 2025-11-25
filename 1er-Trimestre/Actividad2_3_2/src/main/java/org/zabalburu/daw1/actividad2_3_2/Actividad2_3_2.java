/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad2_3_2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad2_3_2.modelo.Calculadora;

/**
 *
 * @author Focus Mode
 */
public class Actividad2_3_2 {

    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        String resp = JOptionPane.showInputDialog(null, "Número 1", "Inserta un número entero sin decimales.");
        calculo.x1 = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog(null, "Número 2", "Inserta un número entero sin decimales.");
        calculo.x2 = Integer.parseInt(resp);
        
        calculo.resultado();
    }
}
