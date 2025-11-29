/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

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
    JButton btnRegistrarse = new JButton("REGISTRARSE");
    
    //PANELES
    JPanel pnlGamertag = new JPanel(new BorderLayout());
    JPanel pnlEmail = new JPanel(new BorderLayout());
    JPanel pnlPassword = new JPanel(new BorderLayout());
    JPanel pnlDatos = new JPanel(new GridLayout(3, 1, 20, 10));
    JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 25, 15)); // Por defecto > FlowLayout,  Pero queremos ponerle alineamiento y HGAP, VGAP
    
    //DIMENSIONES
    Dimension dmVentana = new Dimension(600, 500);
    
    //FUENTES
    Font fntImpact = new Font("Impact", Font.PLAIN, 18);
    Font fntArial = new Font("Arial", Font.BOLD, 16);
    
    //COLORES
    Color clrVerde = new Color(0, 255, 171);
    Color clrRojo = new Color(255, 50, 80);
    Color clrFondoOscuro = new Color(25, 25, 35);
    Color clrFondoClaro = new Color(49, 50, 70);

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
        lblTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, clrVerde));
        lblTitulo.setBackground(clrFondoClaro);
        lblTitulo.setOpaque(true);
        lblTitulo.setForeground(clrVerde);
        
        //CONTENIDO pnlDatos
        lblGamertag.setBackground(clrFondoOscuro);
        lblGamertag.setOpaque(true);
        lblGamertag.setForeground(clrVerde);
        lblGamertag.setFont(fntArial);
        lblGamertag.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        pnlGamertag.add(lblGamertag, BorderLayout.NORTH);
        txtGamertag.setOpaque(true);
        txtGamertag.setBorder(BorderFactory.createLineBorder( clrVerde, 1));
        txtGamertag.setBackground(clrFondoClaro);
        pnlGamertag.add(txtGamertag, BorderLayout.CENTER);
        
        lblEmail.setBackground(clrFondoOscuro);
        lblEmail.setOpaque(true);
        lblEmail.setForeground(clrVerde);
        lblEmail.setFont(fntArial);
        lblEmail.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        pnlEmail.add(lblEmail, BorderLayout.NORTH);
        txtEmail.setOpaque(true);
        txtEmail.setBorder(BorderFactory.createLineBorder( clrVerde, 1));
        txtEmail.setBackground(clrFondoClaro);
        pnlEmail.add(txtEmail, BorderLayout.CENTER);
        
        lblPassword.setBackground(clrFondoOscuro);
        lblPassword.setOpaque(true);
        lblPassword.setForeground(clrVerde);
        lblPassword.setFont(fntArial);
        lblPassword.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        pnlPassword.add(lblPassword, BorderLayout.NORTH);
        pswPassWord.setOpaque(true);
        pswPassWord.setBorder(BorderFactory.createLineBorder( clrVerde, 1));
        pswPassWord.setBackground(clrFondoClaro);
        pnlPassword.add(pswPassWord, BorderLayout.CENTER);
        
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
        pnlDatos.setBackground(clrFondoOscuro);
        pnlDatos.setOpaque(true);
        pnlDatos.add(pnlGamertag);
        pnlDatos.add(pnlEmail);
        pnlDatos.add(pnlPassword);
        
        //BOTONES pnlBotones 
        pnlBotones.setBackground(clrFondoOscuro);
        pnlBotones.setOpaque(true);
        btnRegistrarse.setBackground(clrVerde);
        btnRegistrarse.setOpaque(true);
        btnRegistrarse.setForeground(clrFondoOscuro);
        btnRegistrarse.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(clrVerde.darker(), 2), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        btnRegistrarse.setFont(fntArial);
        pnlBotones.add(btnRegistrarse);
        btnCancelar.setBackground(clrRojo);
        btnCancelar.setOpaque(true);
        btnCancelar.setForeground(clrFondoOscuro);
        btnCancelar.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(clrRojo.darker(), 2), BorderFactory.createEmptyBorder(10, 15, 10, 15)));
        btnCancelar.setFont(fntArial);
        pnlBotones.add(btnCancelar);
        
        //VENTANA PRINCIPAL
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(pnlDatos, BorderLayout.CENTER);
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        //VISIBILIDAD DE VENTANA
        this.setVisible(true);
    
    }
    
            
    
    
    
}
