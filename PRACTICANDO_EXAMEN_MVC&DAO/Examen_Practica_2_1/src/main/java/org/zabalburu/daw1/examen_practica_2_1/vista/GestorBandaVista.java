/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_2_1.vista;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Banda;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Concierto;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Instrumento;
import org.zabalburu.daw1.examen_practica_2_1.modelo.Musico;

/**
 * 1.MOSTRAR-MENÚS / 2.MOSTRAR-OBJETOS / 3.MOSTRAR-LISTAS / 4.MOSTRAR-MENSAJES /
 * 5.PEDIR-DATOS
 *
 * @author Iker Navarro Pérez
 */
public class GestorBandaVista {

    //==========1.MOSTRAR-MENÚS===============
    public int mostrarMenuPrincipal() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>💻MENÚ PRINCIPAL - Gestor Bandas</h1>
                    <hr />
                    <table border="1" width="100%">
                        <tr align="center">
                            <td colspan="2">Desarrollado por Iker Navarro Pérez</td>
                        </tr>
                        <tr align="center">
                            <td>1</td>
                            <td>Gestionar Conciertos▶️</td>
                        </tr>
                        <tr align="center">
                            <td>2</td>
                            <td>Gestionar Bandas🥁</td>
                        </tr>
                        <tr align="center">
                            <td>3</td>
                            <td>Gestionar Músicos🎵</td>
                        </tr>
                        <tr align="center">
                            <td>4</td>
                            <td>Gestionar Instrumentos🎺</td>
                        </tr>
                    </table>
                    <hr />
                    <p>
                        Introduzca una Opción del <big>[1 al 4]</big>
                    </p>
                </html>
                """);
        } while (opc < 0 || opc > 4);
        return opc;
    }
    
    public int mostrarMenuConciertos() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>💻MENÚ BANDAS - Gestor Conciertos💻</h1>
                    <hr />
                    <table border="1" width="100%">
                        <caption>Desarrollado por Iker Navarro Pérez</caption>
                        <tr>
                            <td colspan="2">ELIJA UNA OPCIÓN</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Crear Concierto?</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Buscar Concierto</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Listar Conciertos</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Modificar Concierto</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Eliminar Concierto</td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>Asignar Banda</td>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td>Desasignar Banda</td>
                        </tr>
                        <tr>
                            <td>8</td>
                            <td>Vender Entradas</td>
                        </tr>
                    </table>
                    <hr />
                    <p>
                        Introduzca una Opción del <big>[1 al 8]</big>
                    </p>
                </html>
                """);
        } while (opc < 0 || opc > 8);
        return opc;
    }
    
    public int mostrarMenuBandas() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>💻MENÚ BANDAS - Gestor Bandas💻</h1>
                    <hr />
                    <table border="1" width="100%">
                        <caption>Desarrollado por Iker Navarro Pérez</caption>
                        <tr>
                            <td colspan="2">ELIJA UNA OPCIÓN</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Crear Banda?</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Buscar Banda</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Listar Bandas</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Modificar Banda</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Eliminar Banda</td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>Asignar Músico</td>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td>Desasignar Músico</td>
                        </tr>
                        <tr>
                            <td>8</td>
                            <td>Asignar Coordinador</td>
                        </tr>
                        <tr>
                            <td>9</td>
                            <td>Desasignar Coordinador</td>
                        </tr>
                    </table>
                    <hr />
                    <p>
                        Introduzca una Opción del <big>[1 al 9]</big>
                    </p>
                </html>
                """);
        } while (opc < 0 || opc > 9);
        return opc;
    }

    public int mostrarMenuMusicos() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>💻MENÚ Músicos - Gestor Bandas💻</h1>
                    <hr />
                    <table border="1" width="100%">
                        <caption>Desarrollado por Iker Navarro Pérez</caption>
                        <tr>
                            <td colspan="2">ELIJA UNA OPCIÓN</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Crear Músico?</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Buscar Músico</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Listar Músicos</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Modificar Músico</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Eliminar Músico</td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>Asignar Instrumento</td>
                        </tr>
                        <tr>
                            <td>7</td>
                            <td>Desasignar Instrumento</td>
                        </tr>
                    </table>
                    <hr />
                    <p>
                        Introduzca una Opción del <big>[1 al 7]</big>
                    </p>
                </html>
                """);
        } while (opc < 0 || opc > 7);
        return opc;
    }

    public int mostrarMenuInstrumentos() {
        int opc = 0;
        do {
            opc = pedirEntero(
                    """
                <html>
                    <h1>💻MENÚ Instrumentos - Gestor Bandas💻</h1>
                    <hr />
                    <table border="1" width="100%">
                        <caption>Desarrollado por Iker Navarro Pérez</caption>
                        <tr>
                            <td colspan="2">ELIJA UNA OPCIÓN</td>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>Crear Instrumento?</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Buscar Instrumento</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Listar Instrumentos</td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Modificar Instrumento</td>
                        </tr>
                        <tr>
                            <td>5</td>
                            <td>Eliminar Instrumento</td>
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

    //==========2.MOSTRAR-OBJETOS=============
    
    public void mostrarConcierto (Concierto concierto) {
        String mensaje = "";
        if (concierto != null) {
            String banda = (concierto.getIdBanda() != null)? concierto.getIdBanda().toString() : "No Hay Banda Asignada";
            mensaje
                    = """
        <html>
            <h1>Información de Concierto</h1>
            <hr />
            <p> 
                ID: %d
                NOMBRE: %s
                DESCRIPCION: %s
                FECHA INICIO: %s
                DURACIÓN: %s Horas
                FECHA FIN: %s
                PRECIO ENTRADA: %,.2f€
                ENTRADAS DISPONIBLES: %d
                ENTRADAS VENDIDAS: %d
                RECAUDACIÓN TOTAL: %,.2f€
                ID BANDA: %d
            </p>
            <hr />            
        </html>
        """.formatted(
                concierto.getId(),
                concierto.getNombre(),
                concierto.getDescripcion(),
                concierto.getFechaYHoraInicio(),
                concierto.getDuracionEnHoras(),
                concierto.getFechaYHoraFin(),
                concierto.getPrecioEntrada(),
                concierto.getEntradasDisponibles(),
                concierto.getEntradasVendidas(),
                concierto.getRecaudacionTotal(),
                banda);
            mostrarMensaje(mensaje);
        } else {
            mostrarError("¡NO SE HA ENCONTRADO LA BANDA!");
        }
    }
    
    public void mostrarBanda(Banda banda) {
        String mensaje = "";
        if (banda != null) {
            String coordinador = (banda.getCoordinador()!= null)? banda.getCoordinador().toString() : "No Hay Coordinador Asignado";
            String musicos = (banda.getMusicos() != null)? banda.getMusicos().toString() : "No Hay Músicos";
            mensaje
                    = """
        <html>
            <h1>Información de Banda</h1>
            <table border="1">
                <tr>
                    <td>ID</td>
                    <td>NOMBRE</td>
                    <td>GÉNERO</td>
                    <td>FECHA CREACIÓN</td>
                    <td>COORDINADOR</td>  
                    <td>MÚSICOS</td>
                </tr>
                <tr>
                    <td>%d</td>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%s</td>  
                </tr>
            </table>    
        </html>
        """.formatted(
                banda.getId(),
                banda.getNombre(),
                banda.getGenero(),
                banda.getFechaCreacion().toString(),
                coordinador,
                musicos);
            mostrarMensaje(mensaje);
        } else {
            mostrarError("¡NO SE HA ENCONTRADO LA BANDA!");
        }
    }

    public void mostrarMusico(Musico musico) {
        String mensaje = "";
        if (musico != null) {
            String instrumento = (musico.getInstrumento() != null)? musico.getInstrumento().toString() : "Sin Instrumento";
            mensaje
                    = """
                    <html>
                        <h1>Información de Músico</h1>
                        <table border="1">
                            <tr>
                                <td>ID</td>
                                <td>NOMBRE</td>
                                <td>EDAD</td>
                                <td>AÑOS EXPERIENCIA</td>
                                <td>INSTRUMENTO</td>
                            </tr>
                            <tr>
                                <td>%d</td>
                                <td>%s</td>
                                <td>%d</td>
                                <td>%d</td>
                                <td>%s</td>
                            </tr>
                        </table>    
                    </html>
                  """.formatted(
                          musico.getId(),
                          musico.getNombre(),
                          musico.getEdad(),
                          musico.getAñosExperiencia(),
                          instrumento);
            mostrarMensaje(mensaje);
        } else {
            mostrarError("¡NO SE HA ENCONTRADO EL MÚSICO!");
        }
    }

    public void mostrarInstrumento(Instrumento instrumento) {
        String mensaje = "";
        if (instrumento != null) {
            mensaje
                    = """
        <html>
            <h1>Información de Instrumento</h1>
            <table>
                <tr>
                    <td>ID</td>
                    <td>NOMBRE</td>
                    <td>FAMILIA</td>
                    <td>AÑO FABRICACIÓN</td>
                </tr>
                <tr>
                    <td>%d</td>
                    <td>%s</td>
                    <td>%s</td>
                    <td>%d</td>
                </tr>
            </table>    
        </html>
        """.formatted(
                instrumento.getId(),
                instrumento.getNombre(),
                instrumento.getFamilia(),
                instrumento.getAñoFabricacion());
            mostrarMensaje(mensaje);
        } else {
            mostrarError("¡NO SE HA ENCONTRADO EL INSTRUMENTO!");
        }
    }

    //==========3.MOSTRAR-LISTAS==============
    public void mostrarLista(String titulo, List<?> lista) {
        String mensaje = "";
        if (!lista.isEmpty()) {
            mensaje
                    = """
        <html>
            <h1>Lista de %s</h1>
            <hr />
            <p>                        
        """.formatted(titulo);

            for (Object object : lista) {
                mensaje += "<br /> %s".formatted(object.toString());
            }
            mensaje
                    += """
                       </p>
                   </html>
                   """;
        } else {
            mensaje = "NO HAY NADA QUE MOSTRAR";
        }
        mostrarMensaje(mensaje);
    }

    //==========4.MOSTRAR-MENSAJES============
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    //==========5.PEDIR-DATOS=================
    public String pedirCadena(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public int pedirEntero(String mensaje) {
        String resp = pedirCadena(mensaje);
        int entero = 0;
        boolean ok = false;
        do {
            try {
                if (resp != null) {
                    entero = Integer.parseInt(resp);
                }
                ok = true;
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
                mostrarError("¡INTRODUZCA UN NÚMERO VÁLIDO!");
                resp = pedirCadena(mensaje);
            }
        } while (!ok);
        return n.doubleValue();
    }

    public Date pedirFecha(String mensaje) {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Date fecha = new Date();
        String resp = pedirCadena(mensaje);
        boolean ok = false;
        do {
            try {
                if (resp != null) {
                    fecha = df.parse(resp);
                }
                ok = true;
            } catch (ParseException ex) {
                // DD/MM/YYYY
                mostrarError("¡INTRODUZCA UNA FECHA SIGUIENDO LA PLANTILLA!");
                resp = pedirCadena(mensaje);
            }
        } while (!ok);
        return fecha;
    }
}
