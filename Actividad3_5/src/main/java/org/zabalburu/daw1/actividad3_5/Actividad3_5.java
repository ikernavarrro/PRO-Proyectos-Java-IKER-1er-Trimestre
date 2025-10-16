/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.actividad3_5;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad3_5.modelo.Alumno;

/**
 *
 * @author DAW1
 */
public class Actividad3_5 {

    public static void main(String[] args) {
        Alumno al1 = new Alumno();
        al1.nombre = JOptionPane.showInputDialog(null, """
                                                       <html>
                                                       Nombre del <b>Alumno</b>:
                                                       </html>
                                                       """);
        al1.notaBD = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Base de Datos:", "NotaBD"));
        al1.notaENT = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Entornos de Desarrollo:", "NotaENT"));
        al1.notaFOL = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Formación y Orientación Laboral:", "NotaFOL"));
        al1.notaIT = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Inglés Técnico:", "NotaIT"));
        al1.notaLM = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Lenguaje de Marcas:", "NotaLM"));
        al1.notaPRO = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Programación:", "NotaPRO"));
        al1.notaSI = Integer.parseInt(JOptionPane.showInputDialog(null, "Asigna una Nota para Sistemas Informáticos:", "NotaSI"));
        
        JOptionPane.showMessageDialog(null, """
                                            <html>
                                            <h1>Resultados de %s</h1> <br />
                                            <b>Nota Media:</b> %.2f/10 <br />
                                            <b>Suspensos:</b> %d <br />
                                            <b>Aprobados:</b> %d <br />
                                            <big><b>El alumno <big>%s</big> pasa de curso.</b></big>
                                            </html>
                                            """.formatted(al1.nombre, al1.notaMedia(), al1.modulosSuspendidos(), al1.modulosAprobados(), al1.pasaCurso()? "SI": "NO"), "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
