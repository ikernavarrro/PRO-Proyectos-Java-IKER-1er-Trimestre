/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.tpv_gestion_ventas.vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Iker Navarro Pérez
 */
public class LoginPanel extends JPanel {
    
    //Componentes
    //pnlUsuario
    private JLabel lblUsuario = new JLabel("Usuario");
    private JTextField txtUsuario = new JTextField();
    private JPanel pnlUsuario = new JPanel(new BorderLayout());
    //pnlPassword        
    private JLabel lblPassword = new JLabel("Contraseña");
    private JPasswordField pswPassword = new JPasswordField();
    private JPanel pnlPassword = new JPanel(new BorderLayout());
    //pnlContenido
    private JLabel lblLogo = new JLabel();
    private JButton btnLogin = new JButton();
    private JPanel pnlContenido = new JPanel(new BorderLayout());
    
    //Constructor
    public LoginPanel() {
        this.setLayout(new GridLayout(3, 1, 10, 10));
        
        //pnlUsuario
        pnlUsuario.add(lblUsuario, BorderLayout.NORTH);
        pnlUsuario.add(txtUsuario, BorderLayout.SOUTH);
        
        //pnlPassword
        pnlPassword.add(lblPassword, BorderLayout.NORTH);
        pnlPassword.add(pswPassword, BorderLayout.SOUTH);
        
        //pnlContenido 
        pnlContenido.add(lblLogo, BorderLayout.WEST);
        pnlContenido.add(btnLogin, BorderLayout.EAST);
        
        //Añadiendo paneles al panel principal.
        this.add(pnlUsuario);
        this.add(pnlPassword);
        this.add(pnlContenido);
        
        this.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
    }
    
}
