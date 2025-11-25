/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad3_3;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad3_3.modelo.Pintxo;

/**
 *
 * @author DAW1
 */
public class Actividad3_3 {

    public static void main(String[] args) {
        Pintxo p1 = new Pintxo();
        p1.precio = 2.5;
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de Pintxos:"));
        
        if (p1.porcDto(cantidad) <0){
            JOptionPane.showMessageDialog(null, "<html><h1>Cantidad <b>NO</b> Válida</html>", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(p1.porcDto(cantidad)== 0){
            JOptionPane.showMessageDialog(null, """
                                                <html>
                                                <h1>Pendiente cobrar</h1><br />
                                                <p><b>Pintxo/s</b> %,.2f€ x %d<br />
                                                <b>Total:</b> <big><big>%,.2f€</big></big></p>
                                                </html>
                                                """.formatted(
                                                        p1.precio,
                                                        cantidad,
                                                        p1.importe(cantidad)
                                                ), "Recibo", JOptionPane.INFORMATION_MESSAGE);
        }else{ 
            JOptionPane.showMessageDialog(null, """
                                                <html>
                                                <h1>Pendiente cobrar</h1><br />
                                                <p><b>Pintxo/s</b> %,.2f€ x %d<br />
                                                <b>Descuento del %d%% aplicado<br />
                                                <b>Total:</b> <big><big>%,.2f€</big></big></p>
                                                </html>
                                                """.formatted(
                                                        p1.precio,
                                                        cantidad,
                                                        p1.porcDto(cantidad),
                                                        p1.importe(cantidad)
                                                ), "Recibo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
