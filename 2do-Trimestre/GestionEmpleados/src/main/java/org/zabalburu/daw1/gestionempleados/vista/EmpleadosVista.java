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
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.dao.impl.EmpleadoList;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;

/**
 *
 * @author Iker
 */
public class EmpleadosVista extends JFrame {

    private JLabel lblTitulo = new JLabel("Empleados");
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
    private JLabel lblLocalidad = new JLabel("LOCALIDAD");
    private JTextField txtLocalidad = new JTextField();
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

    private JTabbedPane tbpEmpleado = new JTabbedPane();
    private JPanel pnlGeneral = new JPanel(new GridLayout(7, 2, 0, 10));
    private JPanel pnlOtros = new JPanel(new GridLayout(7, 2, 0, 10));

    private JButton btnPrimero = new JButton(new ImageIcon("iconos/primero.png"));
    private JButton btnAnterior = new JButton(new ImageIcon("iconos/anterior.png"));
    private JButton btnSiguiente = new JButton(new ImageIcon("iconos/siguiente.png"));
    private JButton btnUltimo = new JButton(new ImageIcon("iconos/ultimo.png"));
    private JButton btnNuevo = new JButton(new ImageIcon("iconos/nuevo.png"));
    private JButton btnModificar = new JButton(new ImageIcon("iconos/modificar.png"));
    private JButton btnEliminar = new JButton(new ImageIcon("iconos/eliminar.png"));
    private JButton btnCancelar = new JButton(new ImageIcon("iconos/cancelar.png"));
    private JButton btnGuardar = new JButton(new ImageIcon("iconos/guardar.png"));
    private JButton btnSalir = new JButton(new ImageIcon("iconos/salir.png"));

    private JPanel pnlCabecera = new JPanel(new BorderLayout());
    private JPanel pnlBotones = new JPanel();
    private BoxLayout bl = new BoxLayout(pnlBotones, BoxLayout.X_AXIS);

    private Dimension dmVentana = new Dimension(800, 600);

    private EmpleadoDAO dao = new EmpleadoList();

    private List<Empleado> empleados = dao.getEmpleados();
    private int pos = 0; //EMPLEADO ACTUAL

    private Font fntTitulo = new Font("Calibri", Font.PLAIN, 32);
    private Font fntTextos = new Font("Calibri", Font.PLAIN, 16);
    private Font fntTitulos = new Font("Calibri", Font.BOLD, 16);

    public EmpleadosVista() {
        this.setTitle("Empleados");
        this.setSize(dmVentana);

        //CABECERA
        lblTitulo.setFont(fntTitulo);
        pnlCabecera.setBorder(BorderFactory.createEmptyBorder(10, 20, 0, 20));
        pnlCabecera.add(lblTitulo, BorderLayout.CENTER);
        pnlCabecera.add(lblFoto, BorderLayout.WEST);

        //TABBEDPANE (Datos del empleado)
        pnlGeneral.add(lblId);
        pnlGeneral.add(txtId);
        pnlGeneral.add(lblNombre);
        pnlGeneral.add(txtNombre);
        pnlGeneral.add(lblApellidos);
        pnlGeneral.add(txtApellidos);
        pnlGeneral.add(lblDireccion);
        pnlGeneral.add(txtDireccion);
        pnlGeneral.add(lblCodigoPostal);
        pnlGeneral.add(txtCodigoPostal);
        pnlGeneral.add(lblLocalidad);
        pnlGeneral.add(txtLocalidad);
        pnlGeneral.add(lblProvincia);
        pnlGeneral.add(txtProvincia);
        pnlGeneral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        tbpEmpleado.add("Datos Generales", pnlGeneral);
        for (Component c : pnlGeneral.getComponents()) {
            if (c instanceof JLabel) {
                c.setFont(fntTitulos);
            } else {
                c.setFont(fntTextos);
            }
        }
        pnlOtros.add(lblEmail);
        pnlOtros.add(txtEmail);
        pnlOtros.add(lblTelefono);
        pnlOtros.add(txtTelefono);
        pnlOtros.add(lblFechaNacimiento);
        pnlOtros.add(fmtFechaNacimiento);
        pnlOtros.add(lblFechaAlta);
        pnlOtros.add(fmtFechaAlta);
        pnlOtros.add(lblSueldo);
        pnlOtros.add(fmtSueldo);
        pnlOtros.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        tbpEmpleado.add("Otros Datos", pnlOtros);
        for (Component c : pnlOtros.getComponents()) {
            if (c instanceof JLabel) {
                c.setFont(fntTitulos);
            } else {
                c.setFont(fntTextos);
            }
        }
        tbpEmpleado.setFont(fntTextos);

        //PANEL DE BOTONES
        pnlBotones.setLayout(bl);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        btnPrimero.setToolTipText("Primer Empleado");
        pnlBotones.add(btnPrimero);
        btnAnterior.setToolTipText("Anterior Empleado");
        pnlBotones.add(btnAnterior);
        btnSiguiente.setToolTipText("Siguiente Empleado");
        pnlBotones.add(btnSiguiente);
        btnUltimo.setToolTipText("Último Empleado");
        pnlBotones.add(btnUltimo);
        //AÑADIMOS UN MUELLE
        pnlBotones.add(Box.createHorizontalGlue());
        btnNuevo.setToolTipText("Nuevo Empleado");
        pnlBotones.add(btnNuevo);
        btnModificar.setToolTipText("Modificar Empleado");
        pnlBotones.add(btnModificar);
        btnEliminar.setToolTipText("Eliminar Empleado");
        pnlBotones.add(btnEliminar);
        btnCancelar.setToolTipText("Cancelar");
        pnlBotones.add(btnCancelar);
        btnGuardar.setToolTipText("Guardar Empleado");
        pnlBotones.add(btnGuardar);
        pnlBotones.add(Box.createHorizontalGlue());
        btnSalir.setToolTipText("Salir");
        pnlBotones.add(btnSalir);

        //VENTANA PRINCIPAL
        this.add(pnlCabecera, BorderLayout.NORTH);
        this.add(tbpEmpleado, BorderLayout.CENTER);
        this.add(pnlBotones, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void mostrar() {
        Empleado actual = empleados.get(pos);
        txtId.setText(String.valueOf(actual.getId()));
        txtNombre.setText(String.valueOf(actual.getNombre()));
        txtApellidos.setText(String.valueOf(actual.getApellidos()));
        txtDireccion.setText(String.valueOf(actual.getDireccion()));
        txtCodigoPostal.setText(String.valueOf(actual.getCodifoPostal()));
        txtLocalidad.setText(String.valueOf(actual.getPoblacion()));
        txtProvincia.setText(String.valueOf(actual.getProvincia()));
        txtEmail.setText(String.valueOf(actual.getEmail()));
        txtTelefono.setText(String.valueOf(actual.getTelefono()));
        fmtFechaAlta.setValue(actual.getFechaAlta());
        fmtFechaNacimiento.setValue(actual.getFechaNacimiento());
        fmtSueldo.setValue(actual.getSueldo());
    }

}
