/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ejemplojoptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW1
 */
public class EjemploJoptionPane {
    public static void main(String[] args) {
       String nombre = JOptionPane.showInputDialog("Nombre:"); 
       String apellidos = JOptionPane.showInputDialog("Apellidos:"); 
       String resp = JOptionPane.showInputDialog("Edad:");
       
       
// Cadena --> número --> Clases Wrappers
       
       int edad = Integer.parseInt(resp);
       resp = JOptionPane.showInputDialog("Nota Programación");
       double notaPro = Double.parseDouble(resp);
        System.out.println("Nombre: %s | Apellidos: %s | Edad: %d | Nota Programación: %.2f".formatted(nombre, apellidos, edad, notaPro));
       
        if (JOptionPane.showConfirmDialog(null, "¿Estás seguro?") ==
        JOptionPane.YES_OPTION ){
            System.out.println("Has dicho que SÍ");
        } else {
            System.out.println("Has dicho que NO");
        }
         
        JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
            
       
    }  
}
