/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad4_4;

import javax.swing.JOptionPane;
import org.zabalburu.daw1.actividad4_4.modelo.Inversion;

/**
 *
 * @author Iker Navarro Pérez
 */
public class Actividad4_4 {

    public static void main(String[] args) {

        Inversion inv = new Inversion();
        inv.capital = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                           <html>
                                                                                <h1>Simulador Calculo Inversiones</h1>
                                                                                <hr />
                                                                                <h3>¡Bienvenid@ al Simulador de Inversiones!</h3>
                                                                                <h5>Desarrollado por Iker Navarro Pérez</h5>
                                                                                <hr />
                                                                                <h2>Capital a simular:</h2>
                                                                           </html>
                                                                           """, "€"));
        inv.porcentajeInteresAnual = Double.parseDouble(JOptionPane.showInputDialog(null, """
                                                                                        <html>
                                                                                            <h1>Simulador Calculo Inversiones</h1>
                                                                                            <hr />
                                                                                            <h3>¡Bienvenid@ al Simulador de Inversiones!</h3>
                                                                                            <h5>Desarrollado por Iker Navarro Pérez</h5>
                                                                                            <hr />
                                                                                            <h2>Porcentaje ANUAL a simular:</h2>
                                                                                        </html>
                                                                                        """, "%"));
        inv.añosInversion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                               <html>
                                                                                    <h1>Simulador Calculo Inversiones</h1>
                                                                                    <hr />
                                                                                    <h3>¡Bienvenid@ al Simulador de Inversiones!</h3>
                                                                                    <h5>Desarrollado por Iker Navarro Pérez</h5>
                                                                                    <hr />
                                                                                    <h2>Años a simular:</h2>
                                                                               </html>
                                                                               """, "Año/s"));
        System.out.printf("""
                           ==============================
                           Datos de la Inversión Simulada
                           ------------------------------
                           Capital Inicial: %,.2f€
                           Interés Anual: %f%%
                           Años : %d 
                           ==============================
                           ------------------------------
                           """, inv.capital, inv.porcentajeInteresAnual, inv.añosInversion);
        inv.calculoInversonPorMeses(); //Método para mostrar los meses en función a los años.

        JOptionPane.showMessageDialog(null, """
                                            <html>
                                                <h1>Resultados en Consola</h1>  
                                                <hr />
                                                <h3>¡Gracias por Simular!</h3>
                                                <h5>Desarrollado por Iker Navarro Pérez</h5>
                                            </html>
                                            """, "Resultado Simulador Inversiones", JOptionPane.INFORMATION_MESSAGE);
    }
}
