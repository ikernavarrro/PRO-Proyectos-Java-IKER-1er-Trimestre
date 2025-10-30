/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.mayor_de_dos_numeros;

import javax.swing.JOptionPane;

/**
 * 2.Pedir dos números y mostrar el mayor. 30/10/2025
 *
 * @author Iker Navarro Pérez
 */
public class App {

    private static int num1; //Variable estática de la clase.
    private static int num2; // Variable estática de la clase.

    public static void main(String[] args) {
      
        App.setNum1(); // En primer lugar asignamos los números
        App.setNum2(); // que queramos a las variables estáticas.    -->   num1 y num2
        
        App.getNumeroMayor(); // Y mostramos el número mas alto de los dos. 
        

    }

    //============| Métodos |===============
    
    /**
     * Registra el número 1. *
     * @return El número asignado.
     */
    private static void setNum1() {
        String resp = JOptionPane.showInputDialog(null,
                """
                <html>                                        
                    <h1>Número 1:</h1>
                </html>
                """);
        App.num1 = Integer.parseInt(resp); // Convertimos la respuesta en un entero(int).
    }

    /**
     * Registra el número 2.
     */
    private static void setNum2() {
        String resp = JOptionPane.showInputDialog(null,
                """
                <html>                                        
                    <h1>Número 2:</h1>
                </html>
                """);
        App.num2 = Integer.parseInt(resp); // Convertimos la respuesta en un entero(int).
    }
    
    /**
     * @return El número más alto.
     */
    private static void getNumeroMayor() {
        
        if (App.num1 == App.num2) { // ¿Num1 y Num2 son IGUALES? ---> SI: Muestra el mensaje | NO: Pasamos al siguiente if/else.
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <h1>Los dos números son iguales. (%d)</h1>
                    </html>
                    """.formatted(App.num1));
        } else if (App.num1 > App.num2) { // ¿Num1 es MAYOR que Num2? ---> SI: Muestra el mensaje. | NO: Pasamos al siguiente if/else.
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <h1>El número 1 es el mayor de los dos. (%d)</h1>
                    </html>
                    """.formatted(App.num1));
        } else { // Aquí suponemos que Num 2 es Mayor que Num1 ya que ha pasado los filtros.
            JOptionPane.showMessageDialog(null, 
                    """
                    <html>
                        <h1>El número 2 es el mayor de los dos. (%d)</h1>
                    </html>
                    """.formatted(App.num2));
        }
    }
    
}
