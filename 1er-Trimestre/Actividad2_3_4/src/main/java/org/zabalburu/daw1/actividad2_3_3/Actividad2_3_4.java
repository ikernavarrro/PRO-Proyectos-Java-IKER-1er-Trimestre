/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad2_3_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Focus Mode
 */
public class Actividad2_3_4 {

    public static void main(String[] args) {
        String respA = JOptionPane.showInputDialog(null, "Valor a", "Número entero sin decimales."); // Pedimos mediante una ventanida el valor.
        int a = Integer.parseInt(respA);         // Declaramos la variable a y la inicializamos.                                                    // El valor que vamos a pedir en este caso un Entero.
        String respB = JOptionPane.showInputDialog(null, "Valor b", "Número entero sin decimales.");
        int b = Integer.parseInt(respB);
        System.out.println("""
                           Antes del intercambio:
                               a = %d
                               b = %d
                           """.formatted(a, b));
        
        int almacén = a; // He declarado una variable y la e inicializado con la variable a.
        a = b;          // Intercambio los datos, en la variable a guardo la variable b.
        b = almacén;     // y en la variable b guardo los datos de la variable a previamente guardados en almacén.   
        
        System.out.println("""
                           Después del intercambio:
                               a = %d
                               b = %d
                           """.formatted(a, b));
    }
}
