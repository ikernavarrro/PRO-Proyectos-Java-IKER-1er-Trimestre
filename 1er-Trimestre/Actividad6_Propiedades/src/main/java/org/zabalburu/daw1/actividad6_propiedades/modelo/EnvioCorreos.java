/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad6_propiedades.modelo;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad6_propiedades.modelo.Email;

/**
 *
 * @author Iker Navarro Pérez
 */
public class EnvioCorreos {
    public static void main(String[] args) {
        Email email;
        do {
            email = new Email();
            String resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el destinatario:</h1>
                    </html>
                    """);
            email.para = resp;
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el asunto:</h1>
                    </html>
                    """);
            email.asunto = resp;
            resp = JOptionPane.showInputDialog(null, 
                    """
                    <html>
                        <h1>Introduzca el mensaje:</h1>
                    </html>
                    """);
            email.texto = resp;
            Email.numCorreos++;
            JOptionPane.showMessageDialog(null, 
                    """
                                                Mensaje : %d
                                                De : %s
                                                Para : %s
                                                Asunto : %s
                                                %s
                                                
                                                -----------------------------------                            
                    """.formatted(Email.numCorreos, Email.REMITENTE_EMAIL, email.para, email.asunto, email.texto));
        } while (JOptionPane.showConfirmDialog(null, 
                """
                <html>
                    <h1>¿Quieres enviar otro EMAIL?</h1>
                </html>
                """, "EMAIL", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        
    }
}
