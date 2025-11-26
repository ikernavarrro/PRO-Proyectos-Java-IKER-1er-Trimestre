/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examencontrolgastos.vista;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *  * 1-MOSTRAR-MENÚ || 2-PEDIR-DATOS || 3-MOSTRAR-MENSAJES 5.
 *
 * @author Iker
 */
public class ControlGastosVista {

    // ========1-MOSTRAR-MENÚ=========
    public int mostrarMenu() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>Gestión de Ventas</h1>
                    <hr />
                    <table border="1" width="100%" bgcolor="white">
                        <tr align="center">
                            <td colspan="2">Examen de Iker Navarro Pérez</td>
                        </tr>
                        <tr align="center">
                            <td>1</td>
                            <td>Nuevo Comercial️</td>
                        </tr>
                        <tr align="center">
                            <td>2</td>
                            <td>Eliminar Comercial</td>
                        </tr>
                        <tr align="center">
                            <td>3</td>
                            <td>Asignar Gasto</td>
                        </tr>
                        <tr align="center">
                            <td>4</td>
                            <td>Buscar Comercial</td>
                        </tr>
                        <tr align="center">
                            <td>5</td>
                            <td>Salir</td>
                        </tr>
                    </table>
                    <hr />
                    <p>
                        Introduzca una Opción del <big>[1 al 5]</big>
                    </p>
                </html>
                """);
        } while (opc < 0 || opc > 5);
        return opc;
    }

    // ========2-PEDIR-DATOS==========
    public String pedirCadena(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public int pedirEntero(String mensaje) {
        String resp = pedirCadena(mensaje);
        int entero = -1;
        boolean ok = false;
        do {
            try {
                if (resp != null) {
                    entero = Integer.parseInt(resp);
                    ok = true;
                } else {
                    entero = 5; // resp == null : SALIR
                    ok = true;
                }
            } catch (NumberFormatException ex) {
                mostrarError("¡INTRODUZCA UN NÚMERO SIN DECIMALES!");
                resp = pedirCadena(mensaje);
            }
        } while (!ok);
        return entero;
    }

    public double pedirDouble(String mensaje) {
        NumberFormat nf = NumberFormat.getInstance();
        String resp = pedirCadena(mensaje);
        Number n = 0;
        boolean ok = false;
        do {
            try {
                if (resp != null) {
                    n = nf.parse(resp);
                }
                ok = true;
            } catch (ParseException ex) {
                mostrarError("¡INTRODUZCA UN NÚMERO VÁLIDO (En castellano (EJEMPLO: 2,5) y con decimal/es (,))!");
                resp = pedirCadena(mensaje);
            }
        } while (!ok);
        return n.doubleValue();
    }

    public Date pedirFecha(String mensaje) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT); // Formato corto dd/mm/aaaa
        Date fecha = new Date();
        String resp = pedirCadena(mensaje);
        try {
            fecha = df.parse(resp);
        } catch (ParseException ex) {
            mostrarError("¡NO SE HA PODIDO REGISTRAR LA FECHA Y SE HA PUESTO LA DE HOY POR DEFECTO!");
        }
        return fecha;
    }

    public boolean confirmar(String mensaje) {
        int opc = JOptionPane.showConfirmDialog(null, mensaje, "Ventada de Confirmación", JOptionPane.YES_NO_OPTION);
        //Nos devuelve un valor 0 si confirma, un valor 1 si niega y un valor -1 si presiona x.
        boolean b;
        switch (opc) {
            case 0:
                b = true;
                break;
            default:
                b = false;
        }
        return b;
    }

    // ========3-MOSTRAR-MENSAJES==========
    public void mostrarMensaje(String mensaje, int tipoMensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Cuadro de Información", tipoMensaje);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, "<html><h1>" + mensaje + "</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
