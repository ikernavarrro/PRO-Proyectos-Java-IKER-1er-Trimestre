/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.vista;

import java.text.DateFormat;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Iker
 */
public class EmpladosVista extends JFrame {

    private JLabel lblTitulo = new JLabel("Gestión de Empleados");
    private JLabel lblFoto = new JLabel();
    private JLabel lblId = new JLabel("ID");
    private JTextField txtId = new JTextField();
    private JLabel lblNombre = new JLabel("NOMBRE");
    private JTextField txtNombre = new JTextField();
    private JLabel lblApellidos = new JLabel("APELLIDOS");
    private JTextField txtApellidos = new JTextField();
    private JLabel lblDireccion = new JLabel("DIRECCIÓN");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblCodigoPostal = new JLabel("CÓDIGO POSTAL");
    private JTextField txtCodigoPostal = new JTextField();
    private JLabel lblProvincia = new JLabel("PROVINCIA");
    private JTextField txtProvincia = new JTextField();
    private JLabel lblEmail = new JLabel("EMAIL");
    private JTextField txtEmail = new JTextField();
    private JLabel lblTelefono = new JLabel("TELÉFONO");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblFechaNacimiento = new JLabel("FECHA NACIMIENTO dd/mm/aaaa");
    private JFormattedTextField fmtFechaNacimiento = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblFechaAlta = new JLabel("FECHA ALTA dd/mm/aaaa");
    private JFormattedTextField fmtFechaAlta = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblSueldo = new JLabel("SUELDO");
    private JFormattedTextField fmtSueldo = new JFormattedTextField(NumberFormat.getInstance());
}
