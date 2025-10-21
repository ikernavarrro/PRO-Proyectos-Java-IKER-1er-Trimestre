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

    public void procesarAlumnos() {
        while (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, """
                                                                            <html>
                                                                                <h1>¿Desea procesar un alumno?</h1>
                                                                                <hr />
                                                                                <h4>[SI: Introducir Nuevo Alumno | NO: Mostrar Estadísticas]</h4>
                                                                            </html>
                                                                            """, "Procesar Alumno", JOptionPane.YES_NO_OPTION)) {

            double notaAlumnoProcesado = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                                     <html>
                                                                                        <hr />
                                                                                        <h1>Introduzca la Nota del Nuevo Alumno</h1>
                                                                                        <hr />
                                                                                        <h3>Alumnos Registrados: %d</h3>
                                                                                        <hr />
                                                                                        <p> [Introduzca -1 para volver atrás.] </p> 
                                                                                        <hr />
                                                                                        <h5>Desarrollado por Iker Navarro Pérez<h5>
                                                                                     </html>
                                                                                     """.formatted(contadorAlumnos), ""));
            if (notaAlumnoProcesado != -1) {
                contadorAlumnos++;
                if (notaAlumnoProcesado >= 5) {
                    alumnosAprobados++;
                }
                sumaNotas += notaAlumnoProcesado;
            }
        }

        double notaMedia = sumaNotas / (double) contadorAlumnos;

        JOptionPane.showMessageDialog(null, """
                                            <html>
                                                <hr />
                                                <h1>Estadísticas de las Notas</h1>
                                                <hr />
                                                <p>
                                                    Alumnos Examinados: %d <br />
                                                    Alumnos Aprobados: %d  <br />  
                                                    Nota Media de los Alumnos: %.2f
                                                </p>
                                                <hr />
                                            </html>
                                            """.formatted(contadorAlumnos, alumnosAprobados, notaMedia));
    }
}
