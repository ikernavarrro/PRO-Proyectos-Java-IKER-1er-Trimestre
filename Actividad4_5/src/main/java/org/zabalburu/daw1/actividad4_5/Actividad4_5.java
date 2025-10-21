
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad4_5;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad4_5.modelo.Alumno;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad4_5 {

    public static void main(String[] args) {
        Alumno daw1 = new Alumno();
        JOptionPane.showMessageDialog(null, """
                                            <html>
                                                <h1>Actividad 4_5 Calcular Estadísticas de las Notas de una Serie de Alumnos.</h1>
                                                <h5>Desarrollado por Iker Navarro Pérez</h5>
                                            </html>
                                            """, "Bienvenid@", JOptionPane.INFORMATION_MESSAGE);
        daw1.procesarAlumnos();
    }
}
