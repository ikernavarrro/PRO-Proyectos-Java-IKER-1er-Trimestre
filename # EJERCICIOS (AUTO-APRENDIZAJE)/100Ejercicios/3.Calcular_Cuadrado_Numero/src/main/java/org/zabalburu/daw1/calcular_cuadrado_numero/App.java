/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.calcular_cuadrado_numero;

import javax.swing.JOptionPane;

/**
 * 3. Calcular el cuadrado de un número. 30/10/2025
 * @author Iker Navarro Pérez
 */
public class App {

    private static int num; //Variable estática de la clase.
    
    public static void main(String[] args) {
        
        App.setNum(); // Llamamos al método de la clase y asignamos un número.
        App.getCuadrado(); // Nos devuelve el cuadrado del número.
    }
    
    //============| Métodos |===============
    
    /**
     * Registra un número.
     */
    private static void setNum() {
        String resp = JOptionPane.showInputDialog(null, 
                """
                <html>                                        
                    <h1>Introduzca un número:</h1>
                </html>
                """);
        App.num = Integer.parseInt(resp);
    }
    
    /**
     * Calcula el cuadrado del número.
     */
    private static void getCuadrado() {
        int calculoCuadrado = 0;
        calculoCuadrado += (App.num * App.num); // Multiplicamos el número por su propio número.
        JOptionPane.showMessageDialog(null, 
                """
                <html>                            
                    <h1>El cuadrado de %d es %d.</h1>
                </html>
                """.formatted(App.num, calculoCuadrado));
    }
}
