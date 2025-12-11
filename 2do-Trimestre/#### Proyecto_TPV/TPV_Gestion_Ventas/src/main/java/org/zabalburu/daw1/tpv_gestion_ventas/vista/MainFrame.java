/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.vista;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class MainFrame extends JFrame {

    private LoginPanel pnlLogin;
    private MenuPanel pnlMenu;
    private TPVPanel pnlTPV;
    private GestorProductosPanel pnlGestorProductos;

    //Dimensiones - MainFrame
    Dimension dmVentana = new Dimension(800, 600);

    //Constructor
    public MainFrame() {
        //Inicializamos los paneles
        pnlLogin = new LoginPanel();
        pnlMenu = new MenuPanel();
        pnlTPV = new TPVPanel();
        pnlGestorProductos = new GestorProductosPanel();

        //Configuración MainFrame
        this.setTitle("TPV - NAVIKER");
        this.setSize(dmVentana);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(pnlLogin);
        this.setVisible(true);
    }

    //Métodos 
    public void mostrarMenuPanel() {
        this.getContentPane().removeAll(); //Quitamos TODOS los paneles que hayan.
        this.add(pnlMenu); // AÑADIMOS EL NUEVO
        this.revalidate(); // REFRESCAMOS (Recalcula el layout)
        this.repaint(); // REDIBUJAMOS (Redibuja la ventana)
    }

    public void mostrarTPVPanel() {
        this.getContentPane().removeAll();
        this.add(pnlTPV);
        this.revalidate();
        this.repaint();
    }

    public void mostrarGestorPanel() {
        this.getContentPane().removeAll();
        this.add(pnlGestorProductos);
        this.revalidate();
        this.repaint();
    }

    public void mostrarLoginPanel() {
        this.getContentPane().removeAll();
        this.add(pnlLogin);
        this.revalidate();
        this.repaint();
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "TPV - Informa", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "TPV - Error", JOptionPane.ERROR_MESSAGE);
    }
}
