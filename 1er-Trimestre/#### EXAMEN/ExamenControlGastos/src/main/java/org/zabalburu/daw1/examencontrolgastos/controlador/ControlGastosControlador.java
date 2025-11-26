/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.controlador;

import java.util.Date;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.examencontrolgastos.modelo.Comercial;
import org.zabalburu.daw1.examencontrolgastos.modelo.Gasto;
import org.zabalburu.daw1.examencontrolgastos.modelo.TipoGasto;
import org.zabalburu.daw1.examencontrolgastos.servicio.ControlGastosServicio;
import org.zabalburu.daw1.examencontrolgastos.vista.ControlGastosVista;

/**
 *
 * @author Iker
 */
public class ControlGastosControlador {

    private static ControlGastosServicio servicio = new ControlGastosServicio();
    private static ControlGastosVista vista = new ControlGastosVista();

    // ======= INICIAR ========
    public void iniciar() {
        int opc;
        do {
            opc = vista.mostrarMenu();
            switch (opc) {
                case 1:
                    nuevoComercial();
                    break;
                case 2:
                    eliminarComercial();
                    break;
                case 3:
                    asignarGasto();
                    break;
                case 4:
                    buscarComercial();
                    break;
                case 5:
                    opc = -1;
            }
        } while (opc != -1);
    }

    // ==== NUEVO COMERCIAL =====
    private void nuevoComercial() {
        String nombre = vista.pedirCadena("Nombre del comercial:");
        String apellidos = vista.pedirCadena("Apellidos del comercial:");
        Comercial comercialCreado = servicio.crearComercial(null, nombre, apellidos);
        vista.mostrarMensaje("""
                             <html>
                                <h1>¡Comercial CREADO con ÉXITO!</h1>
                                <h3>
                                    ID: %d <br />
                                    NOMBRE Y APELLIDOS: %s, %s <br />
                                </h3>
                             </html>
                             """.formatted( //LA LISTA DE GASTOS NO LA MUESTRO PORQUE CUANDO SE CREA EL COMERCIAL TODAVÍA NO TIENE NINGÚN GASTO.
                comercialCreado.getId(),
                comercialCreado.getApellidos(),
                comercialCreado.getNombre(),
                comercialCreado.getGastosComercial()), JOptionPane.INFORMATION_MESSAGE);
    }

    // ==== ELIMINAR COMERCIAL =====
    private void eliminarComercial() {
        String mensaje = """
                            <html>
                                <h1>Eliminar Comercial</h1>
                                <table border="2" bgcolor="white">
                                    <tr>
                                        <td>ID</td>
                                        <td>COMERCIAL</td>
                                    </tr>
                            """;
        for (Comercial comercial : servicio.listarComerciales()) {
            mensaje += """
                          <tr>
                              <td>%d</td>  
                              <td>%s, %s</td>
                          </tr>  
                          """.formatted(
                    comercial.getId(),
                    comercial.getApellidos(),
                    comercial.getNombre());
        }
        mensaje += """
                          </table>
                      </html>
                      """;
        Integer idEliminar = vista.pedirEntero(mensaje);
        if (servicio.eliminarComercial(idEliminar) != -1) {
            servicio.eliminarComercial(idEliminar);
            vista.mostrarMensaje("""
                             <html>
                                <h1>¡Comercial ELIMINADO con ÉXITO!</h1>
                             </html>
                             """, JOptionPane.INFORMATION_MESSAGE);
        } else {
            vista.mostrarError("¡Comercial NO Encontrado!");
        }
    }

    // ==== ASIGNAR GASTO =====
    private void asignarGasto() {
        String mensaje = """
                            <html>
                                <h1>Seleccionar Comercial</h1>
                                <table border="2" bgcolor="white">
                                    <tr>
                                        <td>ID</td>
                                        <td>COMERCIAL</td>
                                    </tr>
                            """;
        for (Comercial comercial : servicio.listarComerciales()) {
            mensaje += """
                          <tr>
                              <td>%d</td>  
                              <td>%s, %s</td>
                          </tr>  
                          """.formatted(
                    comercial.getId(),
                    comercial.getApellidos(),
                    comercial.getNombre());
        }
        mensaje += """
                          </table>
                      </html>
                      """;
        Integer idComercial = vista.pedirEntero(mensaje);
        Comercial comercial = servicio.obtenerComercial(idComercial);
        if (comercial != null) {
            mensaje = """
                            <html>
                                <h1>Seleccionar Gasto</h1>
                                <table border="2" bgcolor="white">
                                    <tr>
                                        <td>ID</td>
                                        <td>TIPO DE GASTO</td>
                                    </tr>
                            """;
            for (TipoGasto tipoGasto : servicio.listarTiposDeGastos()) {
                mensaje += """
                          <tr>
                              <td>%d</td>  
                              <td>%s</td>
                          </tr>  
                          """.formatted(
                        tipoGasto.getId(),
                        tipoGasto.getDescripcion());
            }
            mensaje += """
                          </table>
                      </html>
                      """;
            Integer idTipoDeGasto = vista.pedirEntero(mensaje);
            TipoGasto tipoGasto = servicio.obtenerTipoDeGasto(idTipoDeGasto);
            if (tipoGasto != null) {
                Date fechaGasto = vista.pedirFecha("Introduzca la fecha del gasto en formato corto: \n dd/mm/aaaa");
                Double importe = vista.pedirDouble("introduzca el Importe del Gasto con decimales en castellano: \n Ejemplo: 2,0 para referirte a 2");
                Gasto gasto = servicio.crearGasto(null, tipoGasto, fechaGasto, importe, comercial);
                servicio.asignarGasto(gasto.getId(), idComercial);
                vista.mostrarMensaje("""
                             <html>
                                <h1>¡Gasto ASIGNADO con ÉXITO!</h1>
                             </html>
                             """, JOptionPane.INFORMATION_MESSAGE);
            } else {
                vista.mostrarError("¡Tipo de Gasto NO Encontrado!");
            }
        } else {
            vista.mostrarError("¡Comercial NO Encontrado!");
        }
    }

    // ==== BUSCAR COMERCIAL =====
    private void buscarComercial() {
        Integer idComercialBuscar = vista.pedirEntero("Introduzca el ID del Comercial a BUSCAR:");
        Comercial comercial = servicio.obtenerComercial(idComercialBuscar);
        if (comercial != null) {
            String mensaje = """
                             <html>
                                <h3>Informe de Gastos</h3>
                                <table border="2" bgcolor="white">
                                    <tr>
                                        <td>ID</td>
                                        <td>%d</td>
                                    </tr>
                                    <tr>
                                        <td>NOMBRE</td>
                                        <td>%s</td>
                                    </tr>
                                    <tr>
                                        <td>APELLIDOS</td>
                                        <td>%s</td>
                                    </tr>
                                </table>    
                             """.formatted(
                    comercial.getId(),
                    comercial.getNombre(),
                    comercial.getApellidos());
            if (comercial.getGastosComercial() != null) { // Si NO está vacía.
                mensaje += """
                           <hr />
                           <h3>Gastos</h3>
                           <table border="2" bgcolor="white">
                                <tr>
                                    <td>TIPO</td>
                                    <td>FECHA</td>
                                    <td>IMPORTE</td>
                                </tr>
                           """;
                for (Gasto gasto : servicio.listarGastos()) {
                    mensaje += """
                          <tr>
                              <td>%s</td>  
                              <td>%s</td>
                              <td>%,.2f€</td>
                          </tr>  
                          """.formatted(
                            gasto.getTipoGasto().getDescripcion(),
                            gasto.getFechaGasto().toString(),
                            gasto.getImporte());
                }
                mensaje += """
                           </table>
                           <h3>Total Gastos: %,.2f€</h3>
                           """.formatted(comercial.getTotalGastos());
                vista.mostrarMensaje(mensaje, JOptionPane.PLAIN_MESSAGE);
            } else { //Si SI está Vacía.
                mensaje += """
                            <h3>No hay gastos</h3>
                           </html>
                           """;
                vista.mostrarMensaje(mensaje, JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            vista.mostrarError("¡Comercial NO Encontrado!");
        }
    }
}
