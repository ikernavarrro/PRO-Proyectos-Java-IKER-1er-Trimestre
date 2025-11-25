/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.examen_practica_1_1.vista;

import java.util.List;
import javax.swing.JOptionPane;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Mazmorra;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Monstruo;
import org.zabalburu.daw1.examen_practica_1_1.modelo.Tesoro;

/**
 *
 * @author Iker Navarro Pérez
 */
public class DungeonCrawlerVista {

    // ==========MENÚS========
    public int mostrarMenuPrincipal() {
        String resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Principal - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Gestionar Mazmorras</li>
                        <li>Gestionar Monstruos</li>
                        <li>Gestionar Tesoros</li>
                    </ol>
                    <hr />
                    <p>
                        SALIR --> x o cancelar
                    </p>
                <html>
                """);
        int opc = -1;
        boolean ok = false;
        do {
            try {
                if (resp != null && (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 3)) {
                    opc = Integer.parseInt(resp);
                }
                ok = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "DATO ERRÓNEO", "Dungeon Crawler - Iker Navarro Pérez - ERROR", JOptionPane.ERROR_MESSAGE);
                resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Principal - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Gestionar Mazmorras</li>
                        <li>Gestionar Monstruos</li>
                        <li>Gestionar Tesoros</li>
                    </ol>
                    <hr />
                    <p>
                        SALIR --> x, cancelar o -1
                    </p>
                <html>
                """);
            }
        } while (!ok);
        return opc;
    }

    public int mostrarMenuMazmorras() {
        String resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Mazmorras - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Crear Mazmorras</li>
                        <li>Obtener Mazmorras</li>
                        <li>Listar Mazmorras</li>
                        <li>Eliminar Mazmorras</li>                                                       
                    </ol>
                    <hr />
                    <p>
                        VOLVER --> x o cancelar
                    </p>
                <html>
                """);
        int opc = -1;
        boolean ok = false;
        do {
            try {
                if (resp != null && (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 4)) {
                    opc = Integer.parseInt(resp);
                }
                ok = true;
            } catch (NumberFormatException ex) {
                this.mostrarError("DATO ERRÓNEO");
                resp = JOptionPane.showInputDialog(null,
                        """
                        <html>
                            <h1>Menú Mazmorras - Dungeon Crawler</h1>
                            <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                            <hr />
                            <ol>
                               <li>Crear Mazmorras</li>
                                <li>Obtener Mazmorras</li>
                                <li>Listar Mazmorras</li>
                                <li>Eliminar Mazmorras</li>                                                       
                            </ol>
                            <hr />
                            <p>
                                VOLVER --> x o cancelar
                            </p>
                        <html>
                        """);
            }
        } while (!ok);
        return opc;
    }

    public int mostrarMenuMonstruos() {
        String resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Monstruos - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Crear Monstruos</li>
                        <li>Obtener Monstruos</li>
                        <li>Listar Monstruos</li>
                        <li>Eliminar Monstruos</li>                                                       
                    </ol>
                    <hr />
                    <p>
                        VOLVER --> x o cancelar
                    </p>
                <html>
                """);
        int opc = -1;
        boolean ok = false;
        do {
            try {
                if (resp != null && (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 4)) {
                    opc = Integer.parseInt(resp);
                }
                ok = true;
            } catch (NumberFormatException ex) {
                this.mostrarError("DATO ERRÓNEO");
                resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Monstruos - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Crear Monstruos</li>
                        <li>Obtener Monstruos</li>
                        <li>Listar Monstruos</li>
                        <li>Eliminar Monstruos</li>                                                       
                    </ol>
                    <hr />
                    <p>
                        VOLVER --> x o cancelar
                    </p>
                <html>
                """);
            }
        } while (!ok);
        return opc;
    }

    public int mostrarMenuTesoros() {
        String resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Tesoros - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Crear Tesoro</li>
                        <li>Obtener Tesoro</li>
                        <li>Listar Tesoro</li>
                        <li>Eliminar Tesoro</li>                                                       
                    </ol>
                    <hr />
                    <p>
                        VOLVER --> x o cancelar
                    </p>
                <html>
                """);
        int opc = -1;
        boolean ok = false;
        do {
            try {
                if (resp != null && (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 4)) {
                    opc = Integer.parseInt(resp);
                }
                ok = true;
            } catch (NumberFormatException ex) {
                this.mostrarError("DATO ERRÓNEO");
                resp = JOptionPane.showInputDialog(null, """
                <html>
                    <h1>Menú Tesoros - Dungeon Crawler</h1>
                    <h6>Práctica Realizada Por Iker Navaro Pérez</h6>
                    <hr />
                    <ol>
                        <li>Crear Tesoro</li>
                        <li>Obtener Tesoro</li>
                        <li>Listar Tesoro</li>
                        <li>Eliminar Tesoro</li>                                                       
                    </ol>
                    <hr />
                    <p>
                        VOLVER --> x o cancelar
                    </p>
                <html>
                """);
            }
        } while (!ok);
        return opc;
    }

    // ===========PEDIR DATOS===========
    public String pedirString(String mensaje) {
        String i = JOptionPane.showInputDialog(null, mensaje);
        return i;
    }

    public int pedirInt(String mensaje) {
        String iStr = JOptionPane.showInputDialog(null, mensaje);
        int iInt = -1;
        boolean ok = false;
        do {
            try {
                if (iStr != null) {
                    iInt = Integer.parseInt(iStr);
                }
                ok = true;
            } catch (NumberFormatException ex) {
                this.mostrarError("DATO ERRÓNEO");
                iStr = JOptionPane.showInputDialog(null, mensaje);
            }
        } while (!ok);
        return iInt;
    }

    // ===========MOSTRAR INFORMACIÓN===========
    public void mostrarMazmorra(Mazmorra mazmorra) {
        if (mazmorra != null) {
            JOptionPane.showMessageDialog(null,
                    """
                <html>
                    <h1>Información Mazmorra</h1>
                    <hr>
                    <table border="1">
                        <tr>
                            <td>Nombre</td>
                            <td>Dificultad</td>
                            <td>Lista Monstruos</td>
                        </tr>   
                        <tr>
                            <td>%s</td>
                            <td>%s</td>
                            <td>%s</td>    
                        </tr>
                    </table>   
                </html>
                """.formatted(mazmorra.getNombre(), mazmorra.getNivelDificultad().toString(), mazmorra.getMonstruos()));
        } else {
            this.mostrarError("Mazmorra NO Encontrada");
        }
    }

    public void mostrarMonstruo(Monstruo monstruo) {
        if (monstruo != null) {
            JOptionPane.showMessageDialog(null,
                    """
                <html>
                    <h1>Información Monstruo</h1>
                    <hr>
                    <table border="1">
                        <tr>
                            <td>Nombre</td>
                            <td>Vida</td>
                            <td>Ataque</td>
                            <td>Dificultad</td>
                            <td>Tesoro</td>
                        </tr>   
                        <tr>
                            <td>%s</td>
                            <td>%s</td>
                            <td>%s</td> 
                            <td>%s</td>
                            <td>%s</td>  
                        </tr>
                    </table>   
                </html>
                """.formatted(monstruo.getNombre(), monstruo.getVida().toString(), monstruo.getAtaque().toString(), monstruo.getDificultad().toString(), monstruo.getTesoro()));
        } else {
            this.mostrarError("Monstruo NO Encontrado");
        }
    }

    public void mostrarTesoro(Tesoro tesoro) {
        if (tesoro != null) {
            JOptionPane.showMessageDialog(null,
                    """
                <html>
                    <h1>Información Tesoro</h1>
                    <hr>
                    <table border="1">
                        <tr>
                            <td>Nombre</td>
                            <td>Valor</td>
                            <td>Rareza</td>
                        </tr>   
                        <tr>
                            <td>%s</td>
                            <td>%s</td>
                            <td>%s</td> 
                        </tr>
                    </table>   
                </html>
                """.formatted(tesoro.getNombre(), tesoro.getValor().toString(), tesoro.getRareza()));
        } else {
            this.mostrarError("Tesoro NO Encontrado");
        }
    }

    public void mostrarLista(List<?> lista) {
        String str = "";
        if (lista != null && !lista.isEmpty()) {
            for (Object obj : lista) {
                str += obj.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, str);
        } else {
            this.mostrarError("Lista NO Encontrada");
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Dungeon Crawler - Iker Navarro Pérez", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error, "Dungeon Crawler - Iker Navarro Pérez - ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
