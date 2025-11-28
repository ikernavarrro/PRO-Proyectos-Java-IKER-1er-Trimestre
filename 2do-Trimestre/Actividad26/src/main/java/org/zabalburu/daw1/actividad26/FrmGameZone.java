/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Iker Navarro Pérez
 */
public class FrmGameZone extends JFrame {
    //COMPONENTES
    JLabel lblTitulo = new JLabel("GAME ZONE");
    JLabel lblGamertag = new JLabel("GAMERTAG");
    JTextField txtGamertag = new JTextField();
    JLabel lblEmail = new JLabel("EMAIL");
    JTextField txtEmail = new JTextField();
    JLabel lblPassword = new JLabel("PASSWORD");
    JPasswordField pswPassWord = new JPasswordField();
    JButton btnCancelar = new JButton("CANCELAR");
    JButton btnResgistrarse = new JButton("REGISTRARSE");
    
    //PANELES
    JPanel pnlGamertag = new JPanel(new BorderLayout());
    JPanel pnlEmail = new JPanel(new BorderLayout());
    JPanel pnlPassword = new JPanel(new BorderLayout());
    JPanel pnlDatos = new JPanel(new GridLayout(3, 1, 20, 10));
    JPanel pnlBotones = new JPanel(); // Por defecto > FlowLayout
    
    //DIMENSIONES
    Dimension dmVentana = new Dimension(600, 600);
    
    //FUENTES
    Font fntImpact = new Font("Impact", Font.PLAIN, 18);
    
    //COLORES
    Color clrVerde = new Color(20, 255, 156);
    Color clrRojo = new Color(255, 64, 64);
    Color clrFondoOscuro = new Color(7, 27, 43);
    Color clrFondoClaro = new Color(50, 65, 84);
    
    //CONSTRUCTOR

    public FrmGameZone() {
        //CONFIGURACIÓN VENTANA
        this.setSize(dmVentana);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Gamezone - Registro -Iker Navarro Pérez");
        
        //CONFIGURACIÓN COMPONENTES
        //TITULO pnlTitulo
        lblTitulo.setFont(fntImpact.deriveFont(Font.BOLD, 50f));
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        lblTitulo.setBackground(clrFondoClaro);
        lblTitulo.setOpaque(true);
        lblTitulo.setForeground(clrVerde);
        //CONTENIDO pnlDatos 
        //BOTONES pnlBotones 
        
        //VENTANA PRINCIPAL
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(pnlDatos, BorderLayout.CENTER);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        //VISIBILIDAD DE VENTANA
        this.setVisible(true);
    
    }
    
            
    
    
    
}
