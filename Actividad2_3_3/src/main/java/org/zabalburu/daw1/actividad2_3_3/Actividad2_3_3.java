/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad2_3_3;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad2_3_3.modelo.Caja;

/**
 *
 * @author Focus Mode
 */
public class Actividad2_3_3 {

    public static void main(String[] args) {
        Caja caja1 = new Caja();

        String resp = JOptionPane.showInputDialog("Cantidad a ingresar 1:"); // Creamos una ventana y pedimos el dato de la caja1.ingresar(ESTE DATO).
        caja1.ingresar(Double.parseDouble(resp)); // Asignamos la respuesta al método de caja1.ingresar para sumar la cantidad deseada a caja1.ingresos.
        resp = JOptionPane.showInputDialog("Cantidad a ingresar 2:");
        caja1.ingresar(Double.parseDouble(resp));

        resp = JOptionPane.showInputDialog("Cantidad gastada 1:"); // Aquí hacemos lo mismo pero con los gastos.
        caja1.gastar(Double.parseDouble(resp));
        resp = JOptionPane.showInputDialog("Cantidad gastada 2:");
        caja1.gastar(Double.parseDouble(resp));

        caja1.recibo(); // Mostramos por pantalla gracias al Método recibo que hemos creado.

    }
}
