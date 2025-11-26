/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.coleccionvidojuegos.actividad02_2;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.coleccionvidojuegos.actividad02_2.modelo.Trabajo;

/**
 *
 * @author Iker Navarro
 */
public class Actividad02_2_1 {

    public static void main(String[] args) {
        Trabajo trabajo1 = new Trabajo();
       //Trabajo.IVA --> Clase --> Clase.prop / Clase.metodo()
        trabajo1.cliente = JOptionPane.showInputDialog("Cliente:"); //Instancia --> objeto.prop / objeto.metodo()
        String horas = JOptionPane.showInputDialog("Horas:");
        trabajo1.horas = Double.parseDouble(horas);
        String km = JOptionPane.showInputDialog("Kilómetros:");
        trabajo1.km = Double.parseDouble(km);
        String precioHora = JOptionPane.showInputDialog("Precio Hora");
        trabajo1.precioHora = Double.parseDouble(precioHora);
        String precioKm = JOptionPane.showInputDialog("Precio Kilómetro:");
        trabajo1.precioKm = Double.parseDouble(precioKm);
        
        trabajo1.factura();
        
        double porcentajeKm = (trabajo1.importeKm() / trabajo1.importeTotal()) * 100.0;
        System.out.println("El porcentaje del importe total sin iva que corresponde a los Km es de " + porcentajeKm + "€");
        
    }
}
