/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.tpv_gestion_ventas;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.zabalburu.daw1.tpv_gestion_ventas.vista.LoginPanel;
import org.zabalburu.daw1.tpv_gestion_ventas.vista.MainFrame;

/**
 *
 * @author Iker Navarro Pérez
 */
public class TPV_Gestion_Ventas {

    public static void main(String[] args) {
        
        // --- Configuración Previa
        FlatIntelliJLaf.setup();
        
        // --- Pruebas
        MainFrame prueba = new MainFrame();
        prueba.mostrarLoginPanel();
    }
}
