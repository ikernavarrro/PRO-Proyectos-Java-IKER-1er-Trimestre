/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.pruebaswing.iker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.w3c.dom.events.MouseEvent;

/**
 *
 * @author Iker
 */
public class FrmLogin extends JFrame {

    private JLabel lblTitulo = new JLabel("Identifíquese");
    private JLabel lblLogo = new JLabel(new ImageIcon("logo.png"));
    private JLabel lblUsuario = new JLabel("Usuario");
    private JTextField txtUsuario = new JTextField();
    private JLabel lblPassword = new JLabel("Password");
    private JPasswordField pwdPassword = new JPasswordField();
    private JButton btnEntrar = new JButton("Entrar");
    private JButton btnSalir = new JButton("Salir");

    private JPanel pnlDatos = new JPanel(new BorderLayout());
    private JPanel pnlLogin = new JPanel(new GridLayout(2, 2, 0, 10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // por defecto new FlowLayout()

    private Dimension dmVentana = new Dimension(350, 180);

    private Font fntFuente = new Font("Calibri", Font.PLAIN, 14);
    private static final Color COLOR_FONDO = new Color(0, 0, 0);

    public FrmLogin() {
        this.setSize(dmVentana);
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("¡Bienvenid@ a Zabalburu Ikastetxea!");

        //pnlLogin (GridLayout)
        pnlLogin.setBackground(COLOR_FONDO);
        pnlLogin.setOpaque(true);
        lblUsuario.setFont(fntFuente);
        lblUsuario.setForeground(Color.white);
        pnlLogin.add(lblUsuario);
        txtUsuario.setFont(fntFuente);
        pnlLogin.add(txtUsuario);
        lblPassword.setFont(fntFuente);
        lblPassword.setForeground(Color.white);
        pnlLogin.add(lblPassword);
        pnlLogin.add(pwdPassword);
        pnlLogin.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        //pnlBotones (FlowLayout)
        btnEntrar.addActionListener(new EntrarListener());
        btnEntrar.setFont(fntFuente);
        btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pnlBotones.add(btnEntrar);
        btnSalir.setFont(fntFuente);
        btnSalir.addMouseListener(new SalirListener());
        pnlBotones.setBackground(COLOR_FONDO);
        pnlBotones.setOpaque(true);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 15));
        pnlBotones.add(btnSalir);

        //pnlDatos (BorderLayout)
        pnlDatos.add(pnlLogin, BorderLayout.CENTER);
        pnlDatos.add(pnlBotones, BorderLayout.SOUTH);

        //this. VENTANA (BorderLayout);
        lblTitulo.setBackground(COLOR_FONDO);
        lblTitulo.setOpaque(true);
        lblTitulo.setFont(fntFuente.deriveFont(20f));
        lblTitulo.setForeground(Color.white);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        this.add(lblTitulo, BorderLayout.NORTH);
        lblLogo.setBackground(COLOR_FONDO);
        lblLogo.setOpaque(true);
        this.add(lblLogo, BorderLayout.WEST);
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.getRootPane().setDefaultButton(btnEntrar);
        
        this.addWindowListener(new VentanaListener());
        
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FrmLogin();
    }

    class SalirListener implements MouseListener {

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            System.out.println("Mouse Clicked: " + e);
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            System.out.println("Mouse Pressed: " + e);
            preguntaSalir();
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            System.out.println("Mouse Released: " + e);
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            System.out.println("Mouse Entered: " + e);
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            System.out.println("Mouse Exited: " + e);
        }
    }
    /*class EntrarListener extends MouseAdapter {

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            String usuario = txtUsuario.getText();
            String password = new String(pwdPassword.getPassword());
            if (usuario.isBlank()){
                JOptionPane.showMessageDialog(FrmLogin.this,"El nombre es OBLIGATORIO!","Faltan datos", JOptionPane.ERROR_MESSAGE);
                txtUsuario.requestFocus();
            } else if (password.isBlank()){
                JOptionPane.showMessageDialog(FrmLogin.this,"La contraseña es OBLIGATORIA!","Faltan datos", JOptionPane.ERROR_MESSAGE);
                pwdPassword.requestFocus();
            } else {
                if (usuario.equalsIgnoreCase("iker") && password.equals("1234.")) {
                    JOptionPane.showMessageDialog(FrmLogin.this, "Bienvenido Iker Zabalburu Ikastetxea!");
                } else {
                    JOptionPane.showMessageDialog(FrmLogin.this, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
    } */

    private void preguntaSalir() {
        if (JOptionPane.showConfirmDialog(FrmLogin.this, "¿Desea SALIR?", "Pregunta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
    
    class EntrarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            entrarActionPerformed(e);
        }
    }
    private void  entrarActionPerformed(ActionEvent e) {
            String usuario = txtUsuario.getText();
            String password = new String(pwdPassword.getPassword());
            if (usuario.isBlank()){
                JOptionPane.showMessageDialog(this,"El nombre es OBLIGATORIO!","Faltan datos", JOptionPane.ERROR_MESSAGE);
                txtUsuario.requestFocus();
            } else if (password.isBlank()){
                JOptionPane.showMessageDialog(this,"La contraseña es OBLIGATORIA!","Faltan datos", JOptionPane.ERROR_MESSAGE);
                pwdPassword.requestFocus();
            } else {
                if (usuario.equalsIgnoreCase("iker") && password.equals("1234.")) {
                    JOptionPane.showMessageDialog(this, "Bienvenido Iker Zabalburu Ikastetxea!");
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    
    class VentanaListener extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent e) {
            preguntaSalir();
        }
        
    }
}
