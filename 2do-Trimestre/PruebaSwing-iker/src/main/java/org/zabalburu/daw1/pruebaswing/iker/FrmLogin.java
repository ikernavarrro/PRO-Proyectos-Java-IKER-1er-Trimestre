/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.pruebaswing.iker;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Iker
 */
public class FrmLogin extends JFrame{
    private JLabel lblTitulo = new JLabel("Identifíquese");
    private JLabel lblLogo = new JLabel();
    private JLabel lblUsuario = new JLabel("Usuario");
    private JTextField txtUsuario = new JTextField();
    private JLabel lblPassword = new JLabel("Password");
    private JPasswordField pwdPassword = new JPasswordField();
    private JButton btnEntrar = new JButton("Entrar");
    private JButton btnSalir = new JButton("Salir");
    
    private JPanel pnlDatos = new JPanel(new BorderLayout());
    private JPanel pnlLogin = new JPanel(new GridLayout(2, 2, 0, 10));
    private JPanel pnlBotones = new JPanel(); // por defecto new FlowLayout()
    
    private Dimension dmVentana = new Dimension(450, 250);
    
    private Font fntFuente = new Font("Calibri", Font.PLAIN, 14);    
    public FrmLogin() {
        this.setSize(dmVentana);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("¡Bienvenid@ a Zabalburu Ikastetxea!");
        
        //pnlLogin (GridLayout)
        lblUsuario.setFont(fntFuente);
        pnlLogin.add(lblUsuario);
        txtUsuario.setFont(fntFuente);
        pnlLogin.add(txtUsuario);
        lblPassword.setFont(fntFuente);
        pnlLogin.add(lblPassword);
        pnlLogin.add(pwdPassword);
        
        //pnlBotones (FlowLayout)
        btnEntrar.setFont(fntFuente);
        pnlBotones.add(btnEntrar);
        btnSalir.setFont(fntFuente);
        pnlBotones.add(btnSalir);
        
        //pnlDatos (BorderLayout)
        pnlDatos.add(pnlLogin, BorderLayout.CENTER);
        pnlDatos.add(pnlBotones, BorderLayout.SOUTH);
        
        //this. VENTANA (BorderLayout);
        lblTitulo.setFont(fntFuente.deriveFont(20f));
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(lblLogo, BorderLayout.WEST);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new FrmLogin();
    }
}   
