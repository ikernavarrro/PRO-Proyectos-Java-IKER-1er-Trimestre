/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad3_4;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW1
 */
public class Actividad3_4 {

    public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                              <html>
                                                                              <b>Número <big>1</big>:</b>
                                                                              </html>
                                                                              """, "0"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                         <html>
                                                                         <b>Número <big>2</big>:</b>
                                                                         </html>
                                                                         """, "0"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                         <html>
                                                                         <b>Número <big>3</big>:</b>
                                                                         </html>
                                                                         """, "0"));
        if (numero1 < numero2){
            if(numero1 < numero3){
                JOptionPane.showMessageDialog(null, """
                                                    <html>
                                                    <b>El Número <big>1</big> es el menor de los tres.</b> <br />
                                                    Número:%f
                                                    </html>
                                                    """.formatted(numero1));
            }else{
                JOptionPane.showMessageDialog(null, """
                                                    <html>
                                                    <b>El Número <big>3</big> es el menor de los tres.</b> <br />
                                                    Número:%f
                                                    </html>
                                                    """.formatted(numero3));
                
            }
        }else if (numero2 < numero3){
              JOptionPane.showMessageDialog(null, """
                                                    <html>
                                                    <b>El Número <big>2</big> es el menor de los tres.</b> <br />
                                                    Número:%f
                                                    </html>
                                                    """.formatted(numero2));
        }else{
                JOptionPane.showMessageDialog(null, """
                                                    <html>
                                                    <b>El Número <big>3</big> es el menor de los tres.</b> <br />
                                                    Número:%f
                                                    </html>
                                                    """.formatted(numero3));
        }
    }
}
