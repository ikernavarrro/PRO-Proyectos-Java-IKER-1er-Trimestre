/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.gestionempleados;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.JMarsDarkTheme;
import org.zabalburu.daw1.gestionempleados.vista.EmpleadosVista;

/**
 *
 * @author Iker
 */
public class GestionEmpleados {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel(new JMarsDarkTheme()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        EmpleadosVista pruebas = new EmpleadosVista();
    }
}
