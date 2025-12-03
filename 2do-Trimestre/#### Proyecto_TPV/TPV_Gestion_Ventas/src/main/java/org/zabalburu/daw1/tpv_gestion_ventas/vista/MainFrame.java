/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.vista;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MainFrame extends JFrame {
    
    private LoginPanel pnlLogin = new LoginPanel();
    private MenuPanel pnlMenu = new MenuPanel();
    private TPVPanel pnlTPV = new TPVPanel();
    private GestorProductosPanel pnlGestorProductos = new GestorProductosPanel();
    
    public MainFrame() {
        
    }
        
    
    
    
    
    
    
    
    
    /* 
   //========MOSTRAR-MENSAJES===============
    public void mostrarMensajeInformativo(String mensaje, Component ventanaPadre) {
        JOptionPane.showMessageDialog(ventanaPadre, mensaje, "Información - TPV", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostrarMensajeError(String mensaje, Component ventanaPadre) {
        JOptionPane.showMessageDialog(ventanaPadre, mensaje, "Algo no va bien...", JOptionPane.ERROR_MESSAGE);
    }
     */
    //========PANEL-PRINCIPAL================    
    //========PANEL-LOGIN====================
    //========PANEL-MENÚ=====================
    //========PANEL-TPV======================
    //========PANEL-GESTIÓN-PRODUCTOS========
}
