/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.pruebaswing;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Iker
 */
public class PruebaSwing {

    public static void main(String[] args) {
        JFrame frmPrincipal = new JFrame();
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        frmPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmPrincipal.setSize(new Dimension(800,400));
        frmPrincipal.setLocation(new Point(300,200));
        
        frmPrincipal.setVisible(true);
    }
}
