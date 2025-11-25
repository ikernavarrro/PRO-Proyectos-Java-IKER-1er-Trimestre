/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1._ejerciciosadicionales3;

import javax.swing.JOptionPane;
import org.zabalburu.daw1._ejerciciosadicionales3.modelo.Empleado;

/**
 *
 * @author Focus Mode
 */
public class App {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.nombre = JOptionPane.showInputDialog("EMPLEADO 1 - Nombre:");
        String resp = JOptionPane.showInputDialog("EMPLEADO 1 - Tipo de empleado:[Un valor entre 1 y 3] [1:Operario 2:Encargado 3:Dirección]");
        empleado1.tipo = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 1 - Horas Trabajadas:");
        empleado1.horasTrabajadas = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 1 - Precio Hora:");
        empleado1.precioHora = Double.parseDouble(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 1 - Retención: [(Por ejemplo, 0.20 para un 20%)]");
        empleado1.retencion = Double.parseDouble(resp);
        double retencion1 = empleado1.retencion * 100;
                
        Empleado empleado2 = new Empleado();
        empleado2.nombre = JOptionPane.showInputDialog("EMPLEADO 2 - Nombre:");
        resp = JOptionPane.showInputDialog("EMPLEADO 2 - Tipo de empleado:[Un valor entre 1 y 3] [1:Operario 2:Encargado 3:Dirección]");
        empleado2.tipo = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 2 - Horas Trabajadas:");
        empleado2.horasTrabajadas = Integer.parseInt(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 2 - Precio Hora:");
        empleado2.precioHora = Double.parseDouble(resp);
        resp = JOptionPane.showInputDialog("EMPLEADO 2 - Retención: [(Por ejemplo, 0.20 para un 20%)]");
        empleado2.retencion = Double.parseDouble(resp);
        double retencion2 = empleado2.retencion * 100;
        
        
        System.out.println("""
                           ---------------------------
                           Empleado:         %s
                           Tipo:             %s
                           Horas Trabajadas: %d
                           Precio Hora:      %f€
                           Retención:        %f%%
                           ---------------------------
                           Sueldo Base:      %f€
                           Sueldo Neto:      %f€
                           ---------------------------
                           ¿Este empleado tiene un sueldo neto mayor o igual al otro empleado?  %s
                           ---------------------------
                           
                           """.formatted(
                                   empleado1.nombre,
                                   empleado1.tipo(),
                                   empleado1.horasTrabajadas,
                                   empleado1.precioHora, 
                                   retencion1,
                                   empleado1.sueldobase(),
                                   empleado1.sueldoNeto(), 
                                   empleado1.ganaMas(empleado2)
                                   )
                           );
        
        System.out.println("""
                           ---------------------------
                           Empleado:         %s
                           Tipo:             %s
                           Horas Trabajadas: %d
                           Precio Hora:      %f€
                           Retención:        %f%%
                           ---------------------------
                           Sueldo Base:      %f€
                           Sueldo Neto:      %f€
                           ---------------------------
                           ¿Este empleado tiene un sueldo neto mayor o igual al otro empleado?  %s
                           ---------------------------
                           
                           """.formatted(
                                   empleado2.nombre,
                                   empleado2.tipo(),
                                   empleado2.horasTrabajadas,
                                   empleado2.precioHora, 
                                   retencion2,
                                   empleado2.sueldobase(),
                                   empleado2.sueldoNeto(), 
                                   empleado2.ganaMas(empleado1)
                                   )
                           );
        
    }
}
