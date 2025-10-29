/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.numero_par_impar;

import javax.swing.JOptionPane;

/**
 * 1. Pedir un número y mostrar si es par o impar. 29/10/2025
 * @author Iker Navarro Pérez
 */
public class App {
    
    public static void main(String[] args) {
      /**
       * Esta aplicación pide un número y devuelve si es par o impar.
       * 
       * 
       */
         int num; // Declaramos un entero donde almacenaremos el número pedido.
         num = App.pedirNumero(); //Hemos creado un método para dejar más limpio el main.
         
         JOptionPane.showMessageDialog(null, // MOSTRAMOS EL RESULTADO
                 """
                 <html>                            
                    <h1>El número %d es %s.</h1>
                    <hr />
                    <h6>Iker Navarro Pérez</h6>
                 </html>
                 """.formatted(num, App.parImpar(num)));
         
        
         // Iker Navarro Pérez
    }
    //============| Métodos |===============
    
    /**
     * // Iker Navarro Pérez
     * Registra un número entero y lo devuelve.
     * @return El número introducido.
     */
    private static int pedirNumero() {
        int numero;
        String resp = JOptionPane.showInputDialog(null, 
                 """
                 <html>
                    <h1>Introduzca un número:</h1>
                 </html>
                 """);
         numero = Integer.parseInt(resp); // Dado que el JOptionPane nos devuelve una cadena tenemos que pasarla a un entero con el Integer
         return numero;
    }
    
    /**
     * // Iker Navarro Pérez
     * Calcula si un número es par o impar.
     * @param numero
     * @return Par en caso de que sea par y viceversa.
     */
    private static String parImpar(int numero) {
        String resultado = "";
        if (numero % 2 != 0) { // Si el resto de dividir el número entre 2 es distinto a 0...
            resultado = "IMPAR";
        } else {
            resultado = "PAR";
        }
        return resultado;
    }
}
