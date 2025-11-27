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
import javax.swing.border.BevelBorder;

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
    private JPanel pnlBordeInferior1 = new JPanel();
    private JPanel pnlDatos2 = new JPanel(new BorderLayout());
    private JPanel pnlBordeInferior2 = new JPanel();
    private JPanel pnlDatos3 = new JPanel(new BorderLayout());
    private JPanel pnlBordeInferior3 = new JPanel();
    private JPanel pnlDatos4 = new JPanel(new BorderLayout());
    private JPanel pnlBordeInferior4 = new JPanel();
    private JPanel pnlDatos5 = new JPanel(new BorderLayout());
    private JPanel pnlBordeInferior5 = new JPanel();
    private JPanel pnlDatosMain = new JPanel(new GridLayout(5, 1, 0, 15));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 15));

    //Dimensiones Ventana
    private Dimension dmVentana = new Dimension(800, 650);

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
        
        //pnlBordeInferior 1,2,3,4,5 (BorderLayout)
        Dimension borde = new Dimension(0, 2);
        //1
        pnlBordeInferior1.setBackground(clrAzul);
        pnlBordeInferior1.setPreferredSize(borde);
        pnlBordeInferior1.setOpaque(true);
        //2
        pnlBordeInferior2.setBackground(clrAzul);
        pnlBordeInferior2.setPreferredSize(borde);
        pnlBordeInferior2.setOpaque(true);
        //3
        pnlBordeInferior3.setBackground(clrAzul);
        pnlBordeInferior3.setPreferredSize(borde);
        pnlBordeInferior3.setOpaque(true);
        //4
        pnlBordeInferior4.setBackground(clrAzul);
        pnlBordeInferior4.setPreferredSize(borde);
        pnlBordeInferior4.setOpaque(true);
        //5
        pnlBordeInferior5.setBackground(clrAzul);
        pnlBordeInferior5.setPreferredSize(borde);
        pnlBordeInferior5.setOpaque(true);
        
        
        
        //pnlDatos1 (BorderLayout)
        lblNombre.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        pnlDatos1.add(lblNombre, BorderLayout.NORTH);
        txtNombre.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlDatos1.add(txtNombre, BorderLayout.CENTER);
        pnlDatos1.add(pnlBordeInferior1, BorderLayout.SOUTH);
        

        //pnlDatos2 (BorderLayout)
        lblCorreo.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        pnlDatos2.add(lblCorreo, BorderLayout.NORTH);
        txtCorreo.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlDatos2.add(txtCorreo, BorderLayout.CENTER);
        pnlDatos2.add(pnlBordeInferior2, BorderLayout.SOUTH);

        //pnlDatos3 (BorderLayout)
        lblTelefono.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        pnlDatos3.add(lblTelefono, BorderLayout.NORTH);
        txtTelefono.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlDatos3.add(txtTelefono, BorderLayout.CENTER);
        pnlDatos3.add(pnlBordeInferior3, BorderLayout.SOUTH);

        //pnlDatos4 (BorderLayout)
        lblDireccion.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        pnlDatos4.add(lblDireccion, BorderLayout.NORTH);
        txtDireccion.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlDatos4.add(txtDireccion, BorderLayout.CENTER);
        pnlDatos4.add(pnlBordeInferior4, BorderLayout.SOUTH);

        //pnlDatos5 (BorderLayout)
        lblSitioWeb.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
        pnlDatos5.add(lblSitioWeb, BorderLayout.NORTH);
        txtSitioWeb.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        pnlDatos5.add(txtSitioWeb, BorderLayout.CENTER);
        pnlDatos5.add(pnlBordeInferior5, BorderLayout.SOUTH);

        //pnlDatosMain (GridLayout)
        pnlDatosMain.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        pnlDatosMain.add(pnlDatos1);
        pnlDatosMain.add(pnlDatos2);
        pnlDatosMain.add(pnlDatos3); 
        pnlDatosMain.add(pnlDatos4);
        pnlDatosMain.add(pnlDatos5);
        
        //pnlBotones (FlowLayout)
        btnCancelar.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15)); 
        btnCancelar.setFont(fntVerdana.deriveFont(Font.BOLD, 12f));
        btnCancelar.setForeground(Color.WHITE);
        btnCancelar.setBackground(Color.LIGHT_GRAY);
        pnlBotones.add(btnCancelar);
        btnGuardar.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15)); 
        btnGuardar.setFont(fntVerdana.deriveFont(Font.BOLD, 12f));
        btnGuardar.setForeground(Color.WHITE);
        btnGuardar.setBackground(clrAzul);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 20));
        pnlBotones.add(btnGuardar);
        
        
        //VENTANA PRINCIPAL
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(pnlBotones, BorderLayout.SOUTH);
        this.add(pnlDatosMain, BorderLayout.CENTER);
        
                
        //VISIBILIDAD DE VENTANA
        this.setVisible(true);
    }

}
