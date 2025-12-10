/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import org.zabalburu.daw1.gestionempleados.config.AppConfig;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;

/**
 *
 * @author ichueca
 */
public class NominaView extends JDialog{
    private Empleado empleado;

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    private JLabel lblEmpleado = new JLabel();
    private JLabel lblSueldo = new JLabel("Sueldo");
    private JFormattedTextField fmtSueldo = new JFormattedTextField(
        NumberFormat.getCurrencyInstance());
    private JLabel lblHijos = new JLabel("Hijos");
    private JFormattedTextField fmtHijos = new JFormattedTextField(
        NumberFormat.getIntegerInstance());
    private JLabel lblPorcIRPF = new JLabel("Porcentaje I.R.P.F.");
    NumberFormat nfPorc = NumberFormat.getPercentInstance();
    private JFormattedTextField fmtPorcIrpf = new JFormattedTextField(
        nfPorc);
    private JLabel lblIRPF = new JLabel("Importe I.R.P.F.");
    private JFormattedTextField fmtIRPF = new JFormattedTextField(
        NumberFormat.getCurrencyInstance());
    private JLabel lblSueldoNeto = new JLabel("Sueldo Neto");
    private JFormattedTextField fmtSueldoNeto = new JFormattedTextField(
        NumberFormat.getCurrencyInstance());
    
    private JButton btnVolver = new JButton("Volver");
    
    private JPanel pnlTitulo = new JPanel();
    private JPanel pnlDatos = new JPanel(new GridLayout(5,2,0,10));
    private JPanel pnlBotones = new JPanel();
    
    private Dimension dmDialogo = new Dimension(500,350);
   
    
    public NominaView(JFrame padre, boolean modal, Empleado empleado ){
        super(padre,modal);
        this.empleado = empleado;
        this.setLayout(new BorderLayout());
        lblEmpleado.setText("Nómina de " + empleado.getApellidos() + ", " + empleado.getNombre());
        pnlTitulo.add(lblEmpleado);
        lblEmpleado.setFont(AppConfig.FNT_TITULO);
        this.add(pnlTitulo, BorderLayout.NORTH);
        
        pnlDatos.add(lblHijos);
        pnlDatos.add(fmtHijos);
        pnlDatos.add(lblSueldo);
        pnlDatos.add(fmtSueldo);
        pnlDatos.add(lblPorcIRPF);
        pnlDatos.add(fmtPorcIrpf);
        pnlDatos.add(lblIRPF);
        pnlDatos.add(fmtIRPF);
        pnlDatos.add(lblSueldoNeto);
        pnlDatos.add(fmtSueldoNeto);
        pnlDatos.setBorder(new EmptyBorder(10,10,10,10));
        this.add(pnlDatos, BorderLayout.CENTER);
        
        btnVolver.setFont(AppConfig.FNT_TEXTO);
        btnVolver.addActionListener(e -> this.dispose());
        pnlBotones.add(btnVolver);
        this.add(pnlBotones, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(dmDialogo);
        this.setLocationRelativeTo(padre);
        this.setResizable(false);
        mostrar();
    }
    
    private void mostrar(){
        fmtHijos.setValue(empleado.getHijos());
        fmtSueldo.setValue(empleado.getSueldo());
        fmtPorcIrpf.setValue(empleado.getPorcIrpf());
        fmtIRPF.setValue(empleado.getImporteIrpf());
        fmtSueldoNeto.setValue(empleado.getSueldoNeto());
        for(Component c : pnlDatos.getComponents()){
            
            if (c instanceof JTextField){
                JTextField txt = (JTextField) c;
                //txt.setEditable(false);
                txt.setEnabled(false);
                c.setFont(AppConfig.FNT_TEXTO);
            } else {
                c.setFont(AppConfig.FNT_ETIQUETA);
            }
        }
    }
    
}
