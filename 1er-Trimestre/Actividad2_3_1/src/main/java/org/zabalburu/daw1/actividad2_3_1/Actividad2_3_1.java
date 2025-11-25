/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad2_3_1;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad2_3_1.modelo.Persona;

/**
 *
 * @author Focus Mode
 */
public class Actividad2_3_1 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = JOptionPane.showInputDialog("Nombre:");
        String resp = JOptionPane.showInputDialog(null, "Peso:", "Kg");
        p1.peso = Double.parseDouble(resp);
        resp = JOptionPane.showInputDialog(null, "Altura:", "Cm");
        p1.altura = Integer.parseInt(resp);
        
        p1.resultado();
        
    }
}
