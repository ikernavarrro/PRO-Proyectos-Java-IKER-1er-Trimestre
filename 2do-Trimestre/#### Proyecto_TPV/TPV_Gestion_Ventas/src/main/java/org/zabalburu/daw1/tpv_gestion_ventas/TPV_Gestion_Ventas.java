/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.tpv_gestion_ventas;

import java.awt.Dimension;
import javax.swing.JFrame;
import org.zabalburu.daw1.tpv_gestion_ventas.vista.LoginPanel;

/**
 *
 * @author Iker Navarro Pérez
 */
public class TPV_Gestion_Ventas {

    public static void main(String[] args) {
        LoginPanel prueba = new LoginPanel();
        JFrame prueba1 = new JFrame();
        prueba1.add(prueba);
        prueba1.setSize(new Dimension(400, 250));
        prueba1.setVisible(true);
    }
}
