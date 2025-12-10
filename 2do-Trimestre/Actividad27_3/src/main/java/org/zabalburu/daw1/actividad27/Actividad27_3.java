/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad27;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.HashSet;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad27_3 {

    public static void main(String[] args) {
        /*ventanaPrincipal();*/
        FrmActualizarPerfil ventana1 = new FrmActualizarPerfil();
        FrmGameZone ventana2 = new FrmGameZone();
       
    }
    public static void ventanaPrincipal() {
       /* // CREAND LA VENTANA
        JFrame frmVentana = new JFrame();
        Dimension dmVentana = new Dimension(800, 600);
        Dimension dmTamañoPantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (dmTamañoPantalla.width - dmVentana.width) / 2;
        int y = (dmTamañoPantalla.height - dmVentana.height) / 2;     
        frmVentana.setLocation(new Point(x, y));
        frmVentana.setSize(dmVentana);
        frmVentana.setTitle("Mi Perfil");
        frmVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
         //COmponentes de la ventana : JLabel, JButton, JTextField
        JLabel lblTitulo = new JLabel();
        lblTitulo.setText("Actualiza tu Perfil");
        frmVentana.add(lblTitulo, BorderLayout.NORTH);
        JLabel lblNombre = new JLabel();
        lblNombre.setText("Nombre completo");
        JTextField txtNombre = new JTextField();
        JLabel lblCorreo = new JLabel();
        lblNombre.setText("Correo electrónico");
        JTextField txtCorreo = new JTextField();
        JLabel lblTelefono = new JLabel();
        lblNombre.setText("Teléfono");
        JTextField txtTelefono = new JTextField();
        JLabel lblDireccion = new JLabel();
        lblNombre.setText("Dirección");
        JTextField txtDireccion = new JTextField();
        JLabel lblSitioWeb = new JLabel();
        lblNombre.setText("Sitio web");
        JTextField txtSitioWeb = new JTextField();
        JButton btnCancelar = new JButton();
        btnCancelar.setText("Cancelar");
        JButton btnGuardar = new JButton();
        btnGuardar.setText("Guardar Cambios");
        
        //Paneles
        JPanel pnlCabecera = new JPanel();
        JPanel pnlCuerpo = new JPanel(new GridLayout(10, 1, 10, 10));
        JPanel pnlPie = new JPanel();
        
        //Colores y fuentes
        Color clrAzul = new Color(85, 100, 235);
        Color clrGris = new Color(193, 198, 247);
        Font fntTitulo = new Font("Calibri", Font.BOLD, 18);
        Font fntTexto = new Font("Calibri", Font.PLAIN, 14);
        
        //CONFIGURACIÓN PANELES
        //CABECERA
        lblTitulo.setFont(fntTitulo);
        pnlCabecera.setBackground(clrAzul);
        lblTitulo.setForeground(Color.WHITE);
        pnlCabecera.add(lblTitulo);
        
        //CUERPO
        pnlCuerpo.add(lblNombre);
        pnlCuerpo.add(txtNombre);
        pnlCuerpo.add(lblCorreo);
        pnlCuerpo.add(txtCorreo);
        pnlCuerpo.add(lblTelefono);
        pnlCuerpo.add(txtTelefono);
        pnlCuerpo.add(lblDireccion);
        pnlCuerpo.add(txtDireccion);
        pnlCuerpo.add(lblSitioWeb);
        pnlCuerpo.add(txtSitioWeb);
        pnlCuerpo.setBackground(clrGris);
        pnlCuerpo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        //PIE
        pnlPie.add(btnGuardar);
        pnlPie.add(btnCancelar);
        
        // CONFIGURACIÓN BOTONES
        //GUARDAR
        btnGuardar.setBackground(clrAzul);
        btnGuardar.setFont(fntTexto);
        
        //CANCELAR
        btnCancelar.setBackground(clrGris);
        btnCancelar.setFont(fntTexto);
        
        // AÑADIR PANELES A VENTANA
        frmVentana.add(pnlCabecera, BorderLayout.NORTH);
        frmVentana.add(pnlCuerpo, BorderLayout.CENTER);
        frmVentana.add(pnlPie, BorderLayout.SOUTH);
        
        frmVentana.setVisible(true);
        JOptionPane.showMessageDialog(frmVentana, "Mi Primer JOptionPane con ventana padre :)");
        */
    }
}
