/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1._ejercicios_adicionales_adivina_el_numero;

import javax.swing.JOptionPane;

/**
 *
 * @author Focus Mode
 */
public class App {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, // Lanzamos un mensaje de bienvenida.
                """
                <html>
                    <h1>Adivina el <b>Número<b> del 0 al 100</h1>
                    <hr />
                    <h6>Desarrollado por Iker Navarro Pérez</h6>
                </html>
                """);
        
        int num = (int)(Math.random()*100)+1; // Calculamos un número aleatorio. Entre el 0 al 1 y lo multiplicamos x100.
        int intentos = 1; // Contador de intentos.
        
        String resp = JOptionPane.showInputDialog(null, "Introduce el número: ");
        int i = Integer.parseInt(resp); // Pedimos el número,
        
        while(num !=i){ //Si acierta el número se salta la repetitiva, si no lo acierta suma 1 a intentos y vuelve a preguntarle el número.
            JOptionPane.showMessageDialog(null, "Buen intento pero has fallado.", "¡CAAAAAASI!", JOptionPane.ERROR_MESSAGE);
            resp = JOptionPane.showInputDialog(null, "Introduce el número: ");
            i = Integer.parseInt(resp);
            intentos++;
        }
        
        JOptionPane.showMessageDialog(null, //Mostramos cuantos intentos y el número que era.
                """
                <html>                            
                    <h1>¡Felicidades! has acertado el número en %d intentos.</h1>
                    <hr />
                    <p>
                        El número era %d
                    </p>            
                </html>
                """.formatted(intentos, num));
    }
}
