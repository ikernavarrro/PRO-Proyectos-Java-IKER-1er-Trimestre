/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad7;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad7.modelo.Producto;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Almacen {

    public static void main(String[] args) {
        //Declaramos una matriz con 3 objetos.
        Producto[] producto = new Producto[3];
        //Asignamos a cada objeto sus valores.
        producto[0] = new Producto();
        producto[0].setNombre("Patatas");
        producto[0].setUnidadesAlmacen(20);
        producto[0].setPrecio(2.49);
        producto[1] = new Producto();
        producto[1].setNombre("Cebollas");
        producto[1].setUnidadesAlmacen(30);
        producto[1].setPrecio(1.60);
        producto[2] = new Producto();
        producto[2].setNombre("Puerros");
        producto[2].setUnidadesAlmacen(15);
        producto[2].setPrecio(1.39);
        //Repetimos el siguiente proceso:
        int menu = 0;
        String resp = "";
        boolean ok = false;
        do {
            do {
                resp = JOptionPane.showInputDialog(null,
                        """
                    <html>
                        <ol>
                            <li><big>%s</big></li>
                            <li><big>%s</big></li>
                            <li><big>%s</big></li>
                        </ol>
                        <p>
                            Seleccione el producto [1-3] o pulse 0, x o cancelar para finalizar
                        </p>
                    </html>
                    """.formatted(producto[0].getNombre(), producto[1].getNombre(), producto[2].getNombre()), "Un valor entre 0 y 3, ambos incluidos.");
                try {
                    if (resp == null || Integer.parseInt(resp) == 0) {
                        menu = 0;
                        ok = true;
                    } else if (Integer.parseInt(resp) >= 1 && Integer.parseInt(resp) <= 3) {
                        menu = Integer.parseInt(resp);
                        ok = true;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } while (ok != true);

            switch (menu) {
                case 0:
                    //NO hacemos nada.
                    break;
                case 1, 2, 3:
                    int elegido = menu - 1; // Con esta operación sacamos exactamente que producto ha elegido.
                    Producto p = new Producto(); // Creamos nueva variable para almacenarla 2.2.
                    p.setNombre(producto[elegido].getNombre());
                    p.setUnidadesAlmacen(producto[elegido].getUnidadesAlmacen());
                    p.setPrecio(producto[elegido].getPrecio());
                    //Mostramos 2.3
                    do {
                        ok = false;
                        resp = JOptionPane.showInputDialog(null,
                                """
                                Producto : %s
                                Unidades : %d
                                Precio   : %,.2f€
                                                 
                                ¿Desea [V]ender o [A]umentar las unidades del producto?                           
                                """.formatted(p.getNombre(), p.getUnidadesAlmacen(), p.getPrecio()), "V o A");
                        if (resp == null) {
                            // SALIMOS sin hacer nada.
                            ok = true;
                        } else if (resp.equalsIgnoreCase("a")) {
                            do {
                                ok = false;
                                resp = JOptionPane.showInputDialog(null,
                                        """
                                ¿Cuántas unidades de %s se han añadido?                           
                                """.formatted(p.getNombre()));
                                try {
                                    if (resp == null) {
                                        // Salimos.
                                        ok = true;
                                    } else if (Integer.parseInt(resp) <= 0) {
                                        JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        p.aumentarUnidades(Integer.parseInt(resp));
                                        producto[elegido].aumentarUnidades(Integer.parseInt(resp));
                                        JOptionPane.showMessageDialog(null,
                                                """
                                                                 Producto : %s
                                                 ACTUALIZADO ->  Unidades : %d
                                                                 Precio   : %,.2f€                           
                                                """.formatted(p.getNombre(), p.getUnidadesAlmacen(), p.getPrecio()));
                                        ok = true;
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            } while (ok != true);
                        } else if (resp.equalsIgnoreCase("v")) {

                            do {
                                ok = false;
                                resp = JOptionPane.showInputDialog(null,
                                        """
                                ¿Cuántas unidades de %s se han vendido?                           
                                """.formatted(p.getNombre()));
                                try {
                                    if (resp == null) {
                                        // Salimos.
                                        ok = true;
                                    } else if (Integer.parseInt(resp) <= 0) {
                                        JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    } else {
                                        double importe = p.vender(Integer.parseInt(resp));
                                        producto[elegido].vender(Integer.parseInt(resp));
                                        if (importe == -1) {
                                            JOptionPane.showMessageDialog(null, "<html><h1>¡NO HAY SUFICIENTES UNIDADES!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                                        } else {
                                            JOptionPane.showMessageDialog(null,
                                                    """
                                                ¡Venta de %s realizada!   Importe: %,.2f€                
                                                """.formatted(p.getNombre(), importe));
                                            ok = true;
                                        }
                                    }
                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            } while (ok != true);
                        } else {
                            JOptionPane.showMessageDialog(null, "<html><h1>¡INTRODUZCA UN VALOR VÁLIDO!</h1></html>", "ERROR", JOptionPane.ERROR_MESSAGE);
                            // Asumimos que no ha elegido una opción válida y volvemos a pedirle. 
                        }
                    } while (ok != true);
                    break;
            }
        } while (menu != 0);
        String datosAlmacen = "";
        for (Producto p : producto) {
            datosAlmacen += 
                    """
                    <tr>
                        <td>%s</td> 
                        <td>%d</td> 
                        <td>%,.2f</td> 
                        <td>%d</td> 
                        <td>%,.2f</td>
                    </tr>
                    """.formatted(p.getNombre(), p.getUnidadesAlmacen(), p.getPrecio(), p.getUnidadesVendidas(), p.getVentasProducto());
            
        }
        
        JOptionPane.showMessageDialog(null, 
                """
                <html>
                    <h1>RESÚMEN ALMACÉN</h1>
                    <table border="1">
                        <tr>
                            <td>Producto</td>
                            <td>Unidades Almacen</td>
                            <td>Precio</td>   
                            <td>Unidades Vendidas</td>   
                            <td>Ventas</td>
                        </tr>    
                        %s        
                    </table>
                </html>
                """.formatted(datosAlmacen));
    }

}
