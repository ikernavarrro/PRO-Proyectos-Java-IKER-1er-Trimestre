/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1._ejercicio_adicional2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1._ejercicio_adicional2.modelo.Producto;

/**
 *
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {

        Producto producto;
        
        Producto mayor = new Producto();
        mayor.setStock(0);
        mayor.setPrecioUnitario(0);
        
        int contadorProductos = 0;
        double totalImporteProductos = 0.0;
        String almacenarInfoProductos = "";

        do {
            producto = new Producto();
            String resp = JOptionPane.showInputDialog(null,
                    """
                    <html>
                        <h1>Introduzca el Nombre del Producto:</h1>
                    </html>
                    """, "Producto");
            producto.setNombre(resp);

            resp = JOptionPane.showInputDialog(null,
                    """
                    <html>
                        <h1>Introduzca la Categoría del Producto</h1>
                        <hr />
                        <ol>
                            <li>Electrónica</li>
                            <li>Ropa</li>
                            <li>Alimentos</li>
                            <li>Hogar</li>
                        </ol>
                        <hr />
                    </html>
                    """, "Valor del 1 al 4.");
            producto.setCategoria(Integer.parseInt(resp));

            resp = JOptionPane.showInputDialog(null,
                    """
                    <html>
                        <h1>Introduzca el Precio Unitario del Producto:</h1>
                    </html>
                    """, "€");
            producto.setPrecioUnitario(Integer.parseInt(resp));

            resp = JOptionPane.showInputDialog(null,
                    """
                    <html>
                        <h1>Introduzca cuantas unidades de Stock del Producto:</h1>
                    </html>
                    """, "Uds");
            producto.setStock(Integer.parseInt(resp));

            JOptionPane.showMessageDialog(null,
                    """
                    <html>
                        <h1>Resúmen Del Producto</h1>
                        <hr />
                        <ul>
                            <li>Producto: %s</li>
                            <li>Categoría: %s</li>
                            <li>Precio Unitario: %,.2f€</li>
                            <li>Ud Stock: %d</li>
                            <li>Importe Total: %,.2f€</li>
                        </ul>
                        <hr />
                    </html>
                    """.formatted(producto.getNombre(), producto.getDescripcionCategoria(), producto.getPrecioUnitario(), producto.getStock(), producto.getPrecioStock()));
            String menu = "";
            do {
                menu = JOptionPane.showInputDialog(null,
                        """
                        <html>
                            <h1>Menú STOCK de %s</h1>
                            <hr />
                            <ol>
                                <li>Añadir</li>
                                <li>Reducir</li>
                                <li><b>SALIR</b></li>
                            </ol>
                            <hr />
                        </html>    
                        """.formatted(producto.getNombre()));
                if (Integer.parseInt(menu) == 1) {
                    do {
                        resp = JOptionPane.showInputDialog(null,
                                """
                    <html>
                        <h1>Introduce la cantidad a añadir al Stock del Producto:</h1>
                        <hr />
                        <p>
                            Introduce 0 para continuar sin añadir.
                        </p>
                    </html>
                    """, "Uds");
                        producto.agregarStock(Integer.parseInt(resp));
                    } while (Integer.parseInt(resp) != 0);
                } else if (Integer.parseInt(menu) == 2) {
                    do {
                        resp = JOptionPane.showInputDialog(null,
                                """
                    <html>
                        <h1>Introduce la cantidad a retirar del Stock del Producto:</h1>
                        <hr />
                        <p>
                            Introduce 0 para continuar sin reducir.
                        </p>
                    </html>
                    """, "Uds");
                        producto.reducirStock(Integer.parseInt(resp));
                    } while (Integer.parseInt(resp) != 0);
                }
            } while (Integer.parseInt(menu) != 3);

            JOptionPane.showMessageDialog(null,
                    """
                    <html>
                        <h1>Resúmen Del Producto</h1>
                        <hr />
                        <ul>
                            <li>Producto: %s</li>
                            <li>Categoría: %s</li>
                            <li>Precio Unitario: %,.2f€</li>
                            <li>Ud Stock: %d</li>
                            <li>Importe Total: %,.2f€</li>
                        </ul>
                        <hr />
                    </html>
                    """.formatted(producto.getNombre(), producto.getDescripcionCategoria(), producto.getPrecioUnitario(), producto.getStock(), producto.getPrecioStock()));
            
            contadorProductos++;
            totalImporteProductos += producto.getPrecioStock();
            if (producto.getPrecioStock() > mayor.getPrecioStock()) {
                mayor.setCategoria(producto.getCategoria());
                mayor.setNombre(producto.getNombre());
                mayor.setPrecioUnitario(producto.getPrecioUnitario());
                mayor.setStock(producto.getStock());
            }
            almacenarInfoProductos += """
                                  <html>
                                  <h1></h1>
                                  <table border="2" bgcolor="white">
                                    <tr border="1" bgcolor="white" align="center">
                                        <th>Producto</th>
                                        <th>Categoría</th>
                                        <th>Precio Unitario</th>
                                        <th>Ud_Stock</th>
                                        <th>Importe_Total</th>      
                                    </tr border="1" bgcolor="white" align="center">
                                        <td>%s</td>
                                        <td>%s</td> 
                                        <td>%,.2f€</td>
                                        <td>%d</td> 
                                        <td>%,.2f€</td>
                                  </table>
                                  </html>  
                                  """.formatted(producto.getNombre(), producto.getDescripcionCategoria(), producto.getPrecioUnitario(), producto.getStock(), producto.getPrecioStock());
            
        } while (JOptionPane.showConfirmDialog(null,
                """
                <html>
                    <h1>¿Desea introducir un nuevo Producto?</h1>
                </html>
                """, "Producto", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
        
         JOptionPane.showMessageDialog(null,
                    """
                    <html>
                        <h1>Resúmen De La Tienda</h1>
                        <hr />
                        <ul>
                            <li>Productos: %d</li>
                            <li>Valor Total Inventario: %,.2f€ </li>
                        </ul>
                        <hr />
                    </html>
                    """.formatted(contadorProductos, totalImporteProductos));
         
         JOptionPane.showMessageDialog(null, almacenarInfoProductos);
         
         JOptionPane.showMessageDialog(null,
                    """
                    <html>
                        <h1>Resúmen Del Producto Con Mayor Valor</h1>
                        <hr />
                        <ul>
                            <li>Producto: %s</li>
                            <li>Categoría: %s</li>
                            <li>Precio Unitario: %,.2f€</li>
                            <li>Ud Stock: %d</li>
                            <li>Importe Total: %,.2f€</li>
                        </ul>
                        <hr />
                    </html>
                    """.formatted(mayor.getNombre(), mayor.getDescripcionCategoria(), mayor.getPrecioUnitario(), mayor.getStock(), mayor.getPrecioStock()));

    }
}
