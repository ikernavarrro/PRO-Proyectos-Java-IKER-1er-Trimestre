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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;
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
import org.zabalburu.daw1.gestionempleados.config.AppConfig;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoDAO;
import org.zabalburu.daw1.gestionempleados.dao.EmpleadoList;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.servicio.EmpleadoServicio;

/**
 *
 * @author ichueca
 */
public class EmpleadosVista extends JFrame {

    private static final int ALTA = 1;
    private static final int MODIFICACION = 2;
    private static final int CONSULTA = 3;
    private int estado = CONSULTA;

    private JLabel lblTitulo = new JLabel("Empleados");
    private JLabel lblFoto = new JLabel();
    private JLabel lblId = new JLabel("ID");
    private JTextField txtId = new JTextField();
    private JLabel lblNombre = new JLabel("Nombre");
    private JTextField txtNombre = new JTextField();
    private JLabel lblApellidos = new JLabel("Apellidos");
    private JTextField txtApellidos = new JTextField();
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblCodPostal = new JLabel("Código Postal");
    private JTextField txtCodPostal = new JTextField();
    private JLabel lblLocalidad = new JLabel("Localidad");
    private JTextField txtLocalidad = new JTextField();
    private JLabel lblProvincia = new JLabel("Provincia");
    private JTextField txtProvincia = new JTextField();
    private JLabel lblEmail = new JLabel("Email");
    private JTextField txtEmail = new JTextField();
    private JLabel lblTelefono = new JLabel("Teléfono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento (dd/mm/aaaa)");
    private JLabel lblEstado = new JLabel();
    private JFormattedTextField fmtFechaNacimiento
            = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblFechaAlta = new JLabel("Fecha Alta (dd/mm/aaaa)");
    private JFormattedTextField fmtFechaAlta
            = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblSueldo = new JLabel("Sueldo");
    private JFormattedTextField fmtSueldo
            = new JFormattedTextField(NumberFormat.getInstance());
    private JLabel lblHijos = new JLabel("Hijos");
    private JFormattedTextField fmtHijos = new JFormattedTextField(
        NumberFormat.getIntegerInstance());
            
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
    private JButton btnNomina = new JButton(new ImageIcon("iconos/nomina.png"));

    private JPanel pnlCabecera = new JPanel(new BorderLayout());
    private JPanel pnlBotones = new JPanel();
    private BoxLayout bl = new BoxLayout(pnlBotones, BoxLayout.X_AXIS);

    private Dimension dmVentana = new Dimension(900, 700);

    private EmpleadoServicio servicio = new EmpleadoServicio();

    private List<Empleado> empleados = servicio.getEmpleados();
    private int pos = 0; // Empleado actual

    public EmpleadosVista() {
        super();
        this.setTitle("Empleados");
        this.setSize(dmVentana);

        // Cabecera
        lblTitulo.setFont(AppConfig.FNT_TITULO);
        pnlCabecera.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        pnlCabecera.add(lblTitulo, BorderLayout.CENTER);
        pnlCabecera.add(lblFoto, BorderLayout.EAST);

        // TabbedPane con datos del empleado
        pnlGeneral.add(lblId);
        txtId.setEnabled(false);
        pnlGeneral.add(txtId);
        pnlGeneral.add(lblNombre);
        pnlGeneral.add(txtNombre);
        pnlGeneral.add(lblApellidos);
        pnlGeneral.add(txtApellidos);
        pnlGeneral.add(lblDireccion);
        pnlGeneral.add(txtDireccion);
        pnlGeneral.add(lblCodPostal);
        pnlGeneral.add(txtCodPostal);
        pnlGeneral.add(lblLocalidad);
        pnlGeneral.add(txtLocalidad);
        pnlGeneral.add(lblProvincia);
        pnlGeneral.add(txtProvincia);
        pnlGeneral.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tbpEmpleado.add("Datos generales", pnlGeneral);
        for (Component c : pnlGeneral.getComponents()) {
            if (c instanceof JLabel) {
                c.setFont(AppConfig.FNT_ETIQUETA);
            } else {
                c.setFont(AppConfig.FNT_TEXTO);
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
        pnlOtros.add(lblHijos);
        pnlOtros.add(fmtHijos);
        pnlOtros.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        tbpEmpleado.add("Otros datos", pnlOtros);
        for (Component c : pnlOtros.getComponents()) {
            if (c instanceof JLabel) {
                c.setFont(AppConfig.FNT_ETIQUETA);
            } else {
                c.setFont(AppConfig.FNT_TEXTO);
            }
        }
        tbpEmpleado.setFont(AppConfig.FNT_TEXTO);
        // Panel de Botones
        pnlBotones.setLayout(bl);
        //pnlBotones.add(Box.createHorizontalStrut(30));
        btnPrimero.addActionListener(e -> {
            pos = 0;
            mostrar();
        });
        btnPrimero.setToolTipText("Ir al Primer Empleado");
        pnlBotones.add(btnPrimero);

        btnAnterior.addActionListener(e -> {
            pos--;
            mostrar();
        });
        btnAnterior.setToolTipText("Ir al Empleado Anterior");
        pnlBotones.add(btnAnterior);
        
        lblEstado.setFont(AppConfig.FNT_ETIQUETA.deriveFont(20f));
        lblEstado.setText("Estado");
        pnlBotones.add(lblEstado);
        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pos < empleados.size() - 1) {
                    pos++; // Pasamos al siguiente empleado
                    mostrar();
                }
            }

        });
        pnlBotones.add(btnSiguiente);

        btnUltimo.addActionListener(e -> {
            pos = empleados.size() - 1;
            mostrar();
        });
        pnlBotones.add(btnUltimo);
        // Añadimos un muelle
        pnlBotones.add(Box.createHorizontalGlue());
        btnNuevo.setToolTipText("Añadir Empleado");
        btnNuevo.addActionListener(e -> {
            estado = ALTA;
            mostrar();
        });
        pnlBotones.add(btnNuevo);
        pnlBotones.add(btnModificar);
        btnModificar.addActionListener(e -> {
            estado = MODIFICACION;
            mostrar();
        });
        pnlBotones.add(btnEliminar);
        btnCancelar.addActionListener(e -> {
            estado = CONSULTA;
            mostrar();
        });
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardar);
        pnlBotones.add(Box.createHorizontalGlue());
        
        btnNomina.addActionListener(e -> {
            new NominaView(this, true, empleados.get(pos)).setVisible(true);
            /*NominaView nv = new NominaView(this, true);
            nv.setEmpleado(empleados.get(pos));
            nv.setVisible(true);*/
        });
        pnlBotones.add(btnNomina);
        pnlBotones.add(Box.createHorizontalGlue());
        pnlBotones.add(btnSalir);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(0, 30, 10, 30));

        // Ventana Principal
        this.add(pnlCabecera, BorderLayout.NORTH);
        this.add(tbpEmpleado, BorderLayout.CENTER);
        this.add(pnlBotones, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        mostrar();
    }

    private void mostrar() {
        if (estado == ALTA) {
            lblEstado.setText(" [ Nuevo ] ");
            txtId.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
            txtDireccion.setText("");
            txtCodPostal.setText("");
            txtLocalidad.setText("");
            txtProvincia.setText("");
            txtEmail.setText("");
            txtTelefono.setText("");
            fmtFechaAlta.setValue(new Date());
            fmtFechaNacimiento.setValue(new GregorianCalendar(1970,0,1).getTime());
            fmtSueldo.setValue(0.0);
            fmtHijos.setValue(0);
            lblFoto.setIcon(new ImageIcon("imagenes/nouser.png"));
        } else {
            lblEstado.setText(" [ %2d / %2d ] ".formatted((pos+1),empleados.size()));
            Empleado actual = empleados.get(pos);
            txtId.setText(String.valueOf(actual.getId()));
            txtNombre.setText(actual.getNombre());
            txtApellidos.setText(actual.getApellidos());
            txtDireccion.setText(actual.getDireccion());
            txtCodPostal.setText(actual.getCodigoPostal());
            txtLocalidad.setText(actual.getPoblacion());
            txtProvincia.setText(actual.getProvincia());
            txtEmail.setText(actual.getEmail());
            txtTelefono.setText(actual.getTelefono());
            fmtFechaAlta.setValue(actual.getFechaAlta());
            fmtFechaNacimiento.setValue(actual.getFechaNacimiento());
            fmtSueldo.setValue(actual.getSueldo());
            fmtHijos.setValue(actual.getHijos());
            if (actual.getFoto()!=null){
                lblFoto.setIcon(new ImageIcon("imagenes/"+actual.getFoto()));
            } else {
                lblFoto.setIcon(new ImageIcon("imagenes/nouser.png"));
            }
        }
        /*if (estado == CONSULTA){
            txtId.setEnabled(false);
            txtNombre.setEnabled(false);
            txtApellidos.setEditable(false);
            ...
        } else {
            txtId.setEnabled(false);
            txtNombre.setEnabled(true);
            txtApellidos.setEditable(true);
            ...
        }*/
        txtNombre.setEnabled(estado != CONSULTA);
        txtApellidos.setEnabled(estado != CONSULTA);
        txtDireccion.setEnabled(estado != CONSULTA);
        txtCodPostal.setEnabled(estado != CONSULTA);
        txtLocalidad.setEnabled(estado != CONSULTA);
        txtProvincia.setEnabled(estado != CONSULTA);
        txtTelefono.setEnabled(estado != CONSULTA);
        txtEmail.setEnabled(estado != CONSULTA);
        fmtFechaAlta.setEnabled(estado != CONSULTA);
        fmtFechaNacimiento.setEnabled(estado != CONSULTA);
        fmtSueldo.setEnabled(estado != CONSULTA);
        fmtHijos.setEnabled(estado != CONSULTA);
        
        btnPrimero.setEnabled(estado == CONSULTA && pos > 0);
        btnAnterior.setEnabled(estado == CONSULTA && pos > 0);
        btnSiguiente.setEnabled(estado == CONSULTA && pos < empleados.size() - 1);
        btnUltimo.setEnabled(estado == CONSULTA && pos < empleados.size() - 1);
        
        btnNuevo.setEnabled(estado == CONSULTA);
        btnModificar.setEnabled(estado == CONSULTA);
        btnCancelar.setEnabled(estado != CONSULTA);
        btnGuardar.setEnabled(estado != CONSULTA);
        btnEliminar.setEnabled(estado == CONSULTA);
        btnNomina.setEnabled(estado == CONSULTA);
    }

}
