/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.controlador;

import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.trabajosjardineria.modelo.Jardinero;
import org.zabalburu.daw1.trabajosjardineria.modelo.TipoTrabajo;
import org.zabalburu.daw1.trabajosjardineria.modelo.Trabajo;
import org.zabalburu.daw1.trabajosjardineria.servicio.JardineriaServicio;
import org.zabalburu.daw1.trabajosjardineria.vistas.JardineriaVista;

/**
 *
 * @author Iker Navarro Pérez
 */
public class JardineriaControlador {

    private static JardineriaServicio servicio = new JardineriaServicio();
    private static JardineriaVista vista = new JardineriaVista();

    public void iniciar() {
        int opc = 0;
        do {
            opc = vista.mostrarMenu();
            switch (opc) {
                case 1:
                    nuevoJardinero();
                    break;
                case 2:
                    nuevoTrabajo();
            }

        } while (opc != 7);
    }

    private void nuevoJardinero() {
        // La vista pide los datos al usuario y los pasa al controlador
        String nombre = vista.pedirCadena("Nombre del Jardinero");
        String apellidos = vista.pedirCadena("Apellidos del Jardinero");
        String dni = vista.pedirCadena("DNI del Jardinero");
        //El controlador crea los objetos
        Jardinero nuevo = new Jardinero(null, dni, nombre, apellidos);
        // e interactúa con el servicio (añadir el Jardinero a la zona de persistencia))
        servicio.addJardinero(nuevo);
        // Pedimos a la vsta que muestre u mensaje al usuario.
        vista.mostrarMensaje(
                """
                El Jardinero %s %s con DNI %s HA SIDO AÑADIDO CORRECTAMENTE con el id %d!            
               """.formatted(nuevo.getNombre(), nuevo.getApellidos(), nuevo.getDni(), nuevo.getId()), JOptionPane.INFORMATION_MESSAGE);
    }

    private void nuevoTrabajo() {
        String descripcion = vista.pedirCadena("Desripción del trabajo:");
        int horas = vista.pedirEntero("Horas:");
        double precioHora = 20;
        try {
            precioHora = vista.pedirDouble("Precio / Hora");
        } catch (ParseException ex) {

        }
        Date fechaInicio = vista.pedirFecha("Fecha Inicio Trabajo");

        String tiposTrabajo
                = """
                <html>              
                    <h3>Tipos de Trabajo</h3>
                    <table border="1" bgcolorwhite=white>
                    <tr>
                        <td>Id</td>
                        <td>Tipo Trabajos</td>
                """;
        for (TipoTrabajo t : servicio.getTiposTrabajo()) {
            tiposTrabajo
                    += """
                    <tr>        
                        <td>%d</td>
                        <td>%s</td>
                   </tr> 
                    """.formatted(t.getId(), t.getDescripcion());
        }
        tiposTrabajo
                += """
                </table>
                <h4>Introduzca el id del Tipo Trabajo deseado</h4>
            </html>
            """;
        int id = vista.pedirEntero(tiposTrabajo);
        TipoTrabajo tt = servicio.getTipoTrabajo(id);
        Trabajo t = new Trabajo(null, descripcion, horas, precioHora, fechaInicio, null, null, tt);
        servicio.addTrabajo(t);
    }
}
