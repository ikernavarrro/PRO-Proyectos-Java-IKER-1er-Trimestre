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
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Iker Navarro Pérez
 */
public class FrmActualizarPerfil extends JFrame {
    
    //COMPONENTES
    private JLabel lblTitulo = new JLabel("Actualiza Tu Perfil");
    private JLabel lblNombre = new JLabel("Nombre Completo:");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo electrónico:");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Teléfono:");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección:");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblSitioWeb = new JLabel("Sitio web:");
    private JTextField txtSitioWeb = new JTextField();
    private JButton btnCancelar = new JButton("Cancelar");
    private JButton btnGuardar = new JButton("Guardar Cambios");
    
    //CONFIGURACIÓN COMPONENTES
    
    
    //PANELES
    private JPanel pnlDatos1 = new JPanel(new BorderLayout());
    private JPanel pnlDatos2 = new JPanel(new BorderLayout());
    private JPanel pnlDatos3 = new JPanel(new BorderLayout());
    private JPanel pnlDatos4 = new JPanel(new BorderLayout());
    private JPanel pnlDatos5 = new JPanel(new BorderLayout());
    private JPanel pnlDatosMain = new JPanel(new GridLayout(5, 1, 0, 15));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 15));

    //Dimensiones Ventana
    private Dimension dmVentana = new Dimension(600, 800);

    //Fuentes
    private Font fntVerdana = new Font("Verdana", Font.PLAIN, 18);

    //Colores
    private Color clrAzul = new Color(0, 70, 122);
    private Color clrRoto = new Color(237, 237, 237);

    //CONSTRUCTOR
    public FrmActualizarPerfil() {
        //CONFIGURACIÓN VENTANA
        this.setSize(dmVentana);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Gestiona tu perfil | Iker Navarro Pérez");
        
        //CONFIGURACIÓN COMPONENTES
        //Título
        lblTitulo.setPreferredSize(new Dimension(0, 50));
        lblTitulo.setFont(fntVerdana.deriveFont(20f).deriveFont(Font.BOLD));
        lblTitulo.setForeground(clrRoto);
        lblTitulo.setBackground(clrAzul);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        lblTitulo.setOpaque(true);

        //pnlDatos1 (BorderLayout)
        pnlDatos1.add(lblNombre, BorderLayout.NORTH);
        pnlDatos1.add(txtNombre, BorderLayout.SOUTH);
        

        //pnlDatos2 (BorderLayout)
        pnlDatos2.add(lblCorreo, BorderLayout.NORTH);
        pnlDatos2.add(txtCorreo, BorderLayout.SOUTH);

        //pnlDatos3 (BorderLayout)
        pnlDatos3.add(lblTelefono, BorderLayout.NORTH);
        pnlDatos3.add(txtTelefono, BorderLayout.SOUTH);

        //pnlDatos4 (BorderLayout)
        pnlDatos4.add(lblDireccion, BorderLayout.NORTH);
        pnlDatos4.add(txtDireccion, BorderLayout.SOUTH);

        //pnlDatos5 (BorderLayout)
        pnlDatos5.add(lblSitioWeb, BorderLayout.NORTH);
        pnlDatos5.add(txtSitioWeb, BorderLayout.SOUTH);

        //pnlDatosMain (GridLayout)
        pnlDatosMain.add(pnlDatos5);
        pnlDatosMain.add(pnlDatos4);
        pnlDatosMain.add(pnlDatos3);
        pnlDatosMain.add(pnlDatos2);
        pnlDatosMain.add(pnlDatos1);
        
        //pnlBotones (FlowLayout)
        pnlBotones.add(btnGuardar);
        pnlBotones.add(btnCancelar);
        
        //VENTANA PRINCIPAL
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(pnlBotones, BorderLayout.SOUTH);
        this.add(pnlDatosMain, BorderLayout.CENTER);
        
                
        //VISIBILIDAD DE VENTANA
        this.setVisible(true);
    }

}
