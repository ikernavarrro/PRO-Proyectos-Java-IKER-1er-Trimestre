/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.trabajosjardineria.vistas;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class JardineriaVista {
    public int mostrarMenu(){
        String resp = JOptionPane.showInputDialog(null, 
                """
                Jardinería Garden
                =================
                1. Nuevo Jardinero
                2. Nuevo Trabajo
                3. Asignar Trabajo
                4. Desasignar Trabajo
                5. Finalizar Trabajo
                6. Mostrar Información jardinero
                7. Salir
                
                Opciones[1-7]:
                """);
        return Integer.parseInt(resp);
    } 
    
    public String pedirCadena(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
    
    public int pedirEntero (String mensaje) {
        return Integer.parseInt(pedirCadena(mensaje));
    }
    public double pedirDouble (String mensaje) {
        NumberFormat nf = NumberFormat.getInstance();
        String resp = pedirCadena(mensaje);
        Number n = nf.parse(resp);
        return n.doubleValue();
    }
            
}
