/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.vista;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import org.zabalburu.daw1.gestionempleados.config.AppConfig;
import org.zabalburu.daw1.gestionempleados.modelo.Empleado;
import org.zabalburu.daw1.gestionempleados.modelo.EmpleadoProyecto;
import org.zabalburu.daw1.gestionempleados.modelo.Proyecto;
import org.zabalburu.daw1.gestionempleados.servicio.EmpleadoServicio;
import org.zabalburu.daw1.gestionempleados.util.Estado;

/**
 *
 * @author ichueca
 */
public class ProyectosVista extends JFrame {

    private Dimension dmVentana = new Dimension(1000, 700);
    private JLabel lblId = new JLabel("ID");
    private JTextField txtId = new JTextField();
    private JLabel lblResponsable = new JLabel("Responsable");
    private JComboBox<Empleado> cbxResponsable = new JComboBox<>();
    private JLabel lblFechaInicio = new JLabel("Fecha Inicio");
    private JFormattedTextField fmtFechaInicio = new JFormattedTextField(
            DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblFechaFin = new JLabel("Fecha Fin");
    private JFormattedTextField fmtFechaFin = new JFormattedTextField(
            DateFormat.getDateInstance(DateFormat.SHORT));
    private JLabel lblTitulo = new JLabel("Título");
    private JTextField txtTitulo = new JTextField();
    private JLabel lblDescripcion = new JLabel("Descripción");
    private JTextArea txaDescripcion = new JTextArea();
    private JScrollPane jspDescripcion = new JScrollPane(txaDescripcion);
    private JLabel lblCoste = new JLabel("Coste Estimado");
    private JFormattedTextField fmtCoste = new JFormattedTextField(
            NumberFormat.getInstance());
    private JLabel lblEmpleados = new JLabel("Emplados en el Proyecto");
    private JTable tblEmpleados = new JTable();
    private JScrollPane jspEmpleados = new JScrollPane(tblEmpleados);
    private JLabel lblEmpleado = new JLabel("Empleado");
    private JComboBox<Empleado> cbxEmpleado = new JComboBox<>();
    
    private JButton btnPrimero = new JButton(new ImageIcon("iconos/primero.png"));
    private JButton btnAnterior = new JButton(new ImageIcon("iconos/anterior.png"));
    private JButton btnSiguiente = new JButton(new ImageIcon("iconos/siguiente.png"));
    private JButton btnUltimo = new JButton(new ImageIcon("iconos/ultimo.png"));
    private JButton btnNuevo = new JButton(new ImageIcon("iconos/nuevo.png"));
    private JButton btnModificar = new JButton(new ImageIcon("iconos/modificar.png"));
    private JButton btnEliminar = new JButton(new ImageIcon("iconos/eliminar.png"));
    private JButton btnCancelar = new JButton(new ImageIcon("iconos/cancelar.png"));
    private JButton btnGuardar = new JButton(new ImageIcon("iconos/guardar.png"));
    private JButton btnVolver = new JButton(new ImageIcon("iconos/salir.png"));
    private JButton btnAsignar = new JButton("Asignar al Proyecto",
        new ImageIcon("iconos/asignar.png"));
    private JButton btnDesasignar = new JButton("Desasignar al Proyecto",
        new ImageIcon("iconos/desasignar.png"));
    
    private JPanel pnlAsignar = new JPanel(new GridLayout(1,2));
    
    private JLabel lblEncabezado = new JLabel("Proyectos");
    private JPanel pnlEncabezado = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private GridBagLayout grid = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();
    private JPanel pnlDatos = new JPanel(grid);

    private JPanel pnlBotones = new JPanel();

    private BoxLayout bl = new BoxLayout(pnlBotones, BoxLayout.X_AXIS);

    private EmpleadoServicio servicio = new EmpleadoServicio();
    private List<Proyecto> proyectos = servicio.getProyectos();
    private int pos = 0;

    private Vector<String> vctTitulos = new Vector<>();
    private Vector<Vector<String>> vctDatos = new Vector<>();

    private Estado estado = Estado.CONSULTA;

    public ProyectosVista() {
        this.setSize(dmVentana);

        vctTitulos.add("ID");
        vctTitulos.add("Apellidos");
        vctTitulos.add("Nombre");

        lblEncabezado.setFont(AppConfig.FNT_TITULO);
        pnlEncabezado.add(lblEncabezado);

        // Panel de datos
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        /*gbc.ipadx = 10;
        gbc.ipady = 10;*/
        gbc.insets = new Insets(5, 5, 5, 5);
        grid.setConstraints(lblId, gbc);
        //lblId.setBackground(Color.red);
        lblId.setOpaque(true);
        pnlDatos.add(lblId);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;

        grid.setConstraints(txtId, gbc);
        pnlDatos.add(txtId);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1; // 10%
        grid.setConstraints(lblTitulo, gbc);
        pnlDatos.add(lblTitulo);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.4; // 40%
        gbc.fill = GridBagConstraints.BOTH;
        grid.setConstraints(txtTitulo, gbc);
        pnlDatos.add(txtTitulo);

        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1; // 10%

        grid.setConstraints(lblResponsable, gbc);
        pnlDatos.add(lblResponsable);

        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.4; // 40%
        grid.setConstraints(cbxResponsable, gbc);
        pnlDatos.add(cbxResponsable);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.weightx = 0;
        gbc.fill = GridBagConstraints.NONE;
        grid.setConstraints(lblFechaInicio, gbc);
        pnlDatos.add(lblFechaInicio);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        grid.setConstraints(fmtFechaInicio, gbc);
        //fmtFechaInicio.setPreferredSize(new Dimension(200,txtTitulo.getPreferredSize().height));
        fmtFechaInicio.setMinimumSize(new Dimension(100, 28));
        pnlDatos.add(fmtFechaInicio);

        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        grid.setConstraints(lblFechaFin, gbc);
        pnlDatos.add(lblFechaFin);

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        grid.setConstraints(fmtFechaFin, gbc);
        fmtFechaFin.setMinimumSize(new Dimension(100, 28));
        pnlDatos.add(fmtFechaFin);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        grid.setConstraints(lblCoste, gbc);
        gbc.gridwidth = 1;
        pnlDatos.add(lblCoste);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        grid.setConstraints(fmtCoste, gbc);
        pnlDatos.add(fmtCoste);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        grid.setConstraints(lblDescripcion, gbc);
        pnlDatos.add(lblDescripcion);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.weighty = 0.3;
        grid.setConstraints(jspDescripcion, gbc);
        pnlDatos.add(jspDescripcion);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        gbc.weighty = 0;
        grid.setConstraints(lblEmpleados, gbc);
        pnlDatos.add(lblEmpleados);

        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 4;
        gbc.weighty = 0.7;
        grid.setConstraints(jspEmpleados, gbc);
        tblEmpleados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblEmpleados.getSelectionModel().addListSelectionListener(e -> cambioSeleccion(e));
        pnlDatos.add(jspEmpleados);
        gbc.weighty = 0;
        
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        grid.setConstraints(lblEmpleado, gbc);
        pnlDatos.add(lblEmpleado);

        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        grid.setConstraints(cbxEmpleado, gbc);
        pnlDatos.add(cbxEmpleado);
        
        btnAsignar.addActionListener(e -> asignarEmpleado(e));
        btnDesasignar.addActionListener(e -> desasignarEmpleado(e));
        pnlAsignar.add(btnAsignar);
        pnlAsignar.add(btnDesasignar);
        
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        grid.setConstraints(pnlAsignar, gbc);
        pnlDatos.add(pnlAsignar);
        
        for (Component c : pnlDatos.getComponents()) {
            if (c instanceof JLabel) {
                c.setFont(AppConfig.FNT_ETIQUETA);
            } else {
                c.setFont(AppConfig.FNT_TEXTO);
            }
        }

        pnlBotones.setLayout(bl);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 5));
        //pnlBotones.add(Box.createHorizontalStrut(30));
        btnPrimero.addActionListener(e -> {
            pos = 0;
            mostrar();
        });
        btnPrimero.setToolTipText("Ir al Primer Proyecto");
        pnlBotones.add(btnPrimero);

        btnAnterior.addActionListener(e -> {
            pos--;
            mostrar();
        });
        btnAnterior.setToolTipText("Ir al Proyecto Anterior");
        pnlBotones.add(btnAnterior);

        btnSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pos++;
                mostrar();
            }

        });
        pnlBotones.add(btnSiguiente);

        btnUltimo.addActionListener(e -> {
            pos = proyectos.size() - 1;
            mostrar();
        });
        pnlBotones.add(btnUltimo);
        // Añadimos un muelle
        pnlBotones.add(Box.createHorizontalGlue());
        pnlBotones.add(Box.createHorizontalGlue());
        btnNuevo.setToolTipText("Añadir Empleado");
        btnNuevo.addActionListener(e -> {
            estado = Estado.ALTA;
            mostrar();
        });
        pnlBotones.add(btnNuevo);
        btnModificar.addActionListener(e -> {
            estado = Estado.MODIFICACION;
            mostrar();
        });
        pnlBotones.add(btnModificar);

        btnEliminar.addActionListener(e -> {
            eliminar(e);
        });
        pnlBotones.add(btnEliminar);
        btnCancelar.addActionListener(e -> {
            estado = Estado.CONSULTA;
            mostrar();
        });
        pnlBotones.add(btnCancelar);

        btnGuardar.addActionListener(e -> guardar());
        pnlBotones.add(btnGuardar);

        pnlBotones.add(Box.createHorizontalGlue());
        btnVolver.addActionListener(e -> {
            volver();
        });
        pnlBotones.add(btnVolver);

        this.add(pnlEncabezado, BorderLayout.NORTH);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add(pnlDatos);
        this.add(pnlBotones, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        cargarEmpleados();
        txtId.setEnabled(false);
        this.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e) {
                volver();
            }
            
        });
        mostrar();

    }

    private void mostrar() {
        if (proyectos.size() == 0) {
            estado = Estado.ALTA;
        }
        if (estado != Estado.ALTA) {
            Proyecto actual = proyectos.get(pos);
            txtId.setText(String.valueOf(actual.getId()));
            txtTitulo.setText(actual.getTitulo());
            cbxResponsable.setSelectedItem(actual.getResponsable());
            // NO HAY QUE HACER
            // Como buscar si no es por EQUALS
            /*int i;
            int id = 7;
            for(i = 0; i<cbxResponsable.getItemCount()
                && id !=  cbxResponsable.getItemAt(i).getId(); i++);
            if (id < cbxResponsable.getItemCount()){
                cbxResponsable.setSelectedIndex(i);
            } else {
                cbxResponsable.setSelectedIndex(-1);
            }*/
            fmtFechaInicio.setValue(actual.getFechaInicio());
            fmtFechaFin.setValue(actual.getFechaFin());
            fmtCoste.setValue(actual.getCoste());
            txaDescripcion.setText(actual.getDescripción());

        } else {
            txtId.setText("");
            txtTitulo.setText("");
            cbxResponsable.setSelectedIndex(-1);
            //cbxResponsable.setSelectedItem(null);
            fmtFechaInicio.setValue(new Date());
            fmtFechaFin.setValue(null);
            fmtCoste.setValue(0.0);
            txaDescripcion.setText("");
            vctDatos = new Vector<>();
        }
        cargarTabla();

        txtTitulo.setEnabled(estado != Estado.CONSULTA);
        cbxResponsable.setEnabled(estado != Estado.CONSULTA);
        fmtFechaInicio.setEnabled(estado != Estado.CONSULTA);
        fmtFechaFin.setEnabled(estado != Estado.CONSULTA);
        fmtCoste.setEnabled(estado != Estado.CONSULTA);
        txaDescripcion.setEnabled(estado != Estado.CONSULTA);
        btnAnterior.setEnabled(estado == Estado.CONSULTA && pos > 0);
        btnPrimero.setEnabled(estado == Estado.CONSULTA && pos > 0);
        btnSiguiente.setEnabled(estado == Estado.CONSULTA && pos < proyectos.size() - 1);
        btnUltimo.setEnabled(estado == Estado.CONSULTA && pos < proyectos.size() - 1);
        btnNuevo.setEnabled(estado == Estado.CONSULTA);
        btnModificar.setEnabled(estado == Estado.CONSULTA);
        btnEliminar.setEnabled(estado == Estado.CONSULTA);
        btnCancelar.setEnabled(estado != Estado.CONSULTA && proyectos.size() > 0);
        btnGuardar.setEnabled(estado != Estado.CONSULTA);
        
        cbxEmpleado.setEnabled(estado == Estado.CONSULTA);
        btnAsignar.setEnabled(estado == Estado.CONSULTA);
        btnDesasignar.setEnabled(estado == Estado.CONSULTA && 
            tblEmpleados.getSelectedRow() != -1);
    }

    private void cargarEmpleados() {
        // Carga lps empleados en el ComboBox
        List<Empleado> empleados = servicio.getEmpleados();
        for (Empleado e : empleados) {
            cbxResponsable.addItem(e);
            cbxEmpleado.addItem(e);
        }
    }

    private void eliminar(ActionEvent e) {

        Proyecto actual = proyectos.get(pos);
        if (JOptionPane.showConfirmDialog(this,
                "¿Desea eliminar el proyecto?",
                "Eliminar Proyecto",
                JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            if (actual.getEmpleadosProyecto().size() > 0) {
                if (JOptionPane.showConfirmDialog(this,
                        """
                    El proyecto tiene %d empleados asignados
                    
                    ¿Está seguro de querer eliminarlo?
                    """.formatted(actual.getEmpleadosProyecto().size()),
                        "Error",
                        JOptionPane.YES_NO_OPTION)
                        == JOptionPane.YES_OPTION) {
                    servicio.eliminarProyecto(actual.getId());
                }
            } else {
                servicio.eliminarProyecto(actual.getId());
            }
        }
        if (pos == proyectos.size() && pos > 0) {
            pos--;
        }
        mostrar();
    }

    private void guardar() {
        Proyecto p;
        if (estado == Estado.ALTA) {
            p = new Proyecto();
        } else {
            p = proyectos.get(pos);
            p.setId(Integer.parseInt(txtId.getText()));
        }
        Empleado responsable = (Empleado) cbxResponsable.getSelectedItem();
        p.setResponsable(responsable);
        p.setDescripción(txaDescripcion.getText());
        p.setFechaInicio((Date) fmtFechaInicio.getValue());
        p.setFechaFin((Date) fmtFechaFin.getValue());
        Number n = (Number) fmtCoste.getValue();
        p.setCoste(n.doubleValue());
        p.setTitulo(txtTitulo.getText());
        if (estado == Estado.ALTA) {
            servicio.nuevoProyecto(p);
            pos = proyectos.size() - 1;
        } else {
            servicio.modificarProyecto(p);
        }
        estado = Estado.CONSULTA;
        mostrar();
    }

    private void cargarTabla() {
        // Cargar tabla de empleados
        // Crear el vector de datos
        vctDatos = new Vector<>();
        for (EmpleadoProyecto ep : proyectos.get(pos).getEmpleadosProyecto()) {
            Vector<String> vctFila = new Vector<>();
            Empleado e = ep.getEmpleado();
            vctFila.add(String.valueOf(e.getId()));
            vctFila.add(e.getApellidos());
            vctFila.add(e.getNombre());
            vctDatos.add(vctFila);
        }
        //DefaultTableModel dtm = new DefaultTableModel(vctDatos, vctTitulos);
        //tblEmpleados.setModel(dtm);
        DefaultTableModel dtm = (DefaultTableModel) tblEmpleados.getModel();
        dtm.setDataVector(vctDatos, vctTitulos);
    }

    private void asignarEmpleado(ActionEvent e) {
        Empleado emp = (Empleado) cbxEmpleado.getSelectedItem();
        servicio.asignarEmpleado(proyectos.get(pos), emp);
        mostrar();
    }

    private void desasignarEmpleado(ActionEvent e) {
        int seleccionado = tblEmpleados.getSelectedRow();
        if (seleccionado != -1){
            Proyecto p = proyectos.get(pos);
            Empleado emp = p.getEmpleadosProyecto()
                    .get(seleccionado)
                    .getEmpleado();
            if (JOptionPane.showConfirmDialog(this, 
                "Quitar a %s %s del proyecto %s".formatted(emp.getNombre(), emp.getApellidos(), p.getTitulo()),
                "Desasignar Empleado",
                JOptionPane.YES_NO_OPTION)
                ==
                JOptionPane.YES_OPTION){
                servicio.desAsignarEmpleado(p, emp);
                mostrar();
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "Seleccione el empleado de la tabla antes.",
                "Seleccione Empleado",
                JOptionPane.WARNING_MESSAGE);
        }
    }

    private void cambioSeleccion(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            btnDesasignar.setEnabled(tblEmpleados.getSelectedRow() != -1);
        }
    }

    private void volver() {
        new PanelVista().setVisible(true);
        this.dispose();
    }

}
