/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad4_5.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Alumno {
    public int contadorAlumnos = 0; //Contador
    public int alumnosAprobados = 0; //Contador
    public double sumaNotas = 0; //Acumulador
    public static final int PROCESAR_SI = 1;
    public static final int PROCESAR_NO = 0;
    
    public void procesarAlumnos(){
        
   
        while(PROCESAR_SI == Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                """))){
        double notaAlumnoProcesado = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                                     <html>
                                                                                        <hr />
                                                                                        <h1>Introduzca la Nota del Nuevo Alumno</h1>
                                                                                        <hr />
                                                                                        <h3>Alumnos Registrados: %d</h3>
                                                                                        <hr />
                                                                                        <h5>Desarrollado por Iker Navarro Pérez<h5>
                                                                                     </html>
                                                                                     """.formatted(contadorAlumnos), ""));
        
        }
    }
}
