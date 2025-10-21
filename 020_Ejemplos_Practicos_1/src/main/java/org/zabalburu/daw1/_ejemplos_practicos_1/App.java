/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1._ejemplos_practicos_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, // Mostramos un mensaje de bienvenida.
                """
                <html>
                    <hr />
                    <h1>[Calculadora] Media de Ingresos Anual</h1>
                    <hr />
                    <h6>Desarrollado por Iker Navarro Pérez</h6> 
                    <hr />
                    <p>
                        Para continuar pulse <b>ACEPTAR</b>.
                    </p>
                    <hr />
                </html>
                """);

        double totalIngresos = 0; // Acumulador: Aquí vamos a acumular todos los ingresos mensuales.

        for (int i = 1; i <= 12; i++) { //Repetimos el proceso de pedir los ingresos mes  por mes durante 12 veces
            String nombreMes = switch(i){ //Dependiendo del número del mes mostramos su correspondiente nombre.
                case 1 -> "Enero";
                case 2 -> "Febrero";
                case 3 -> "Marzo";
                case 4 -> "Abril";
                case 5 -> "Mayo";
                case 6 -> "Junio";    
                case 7 -> "Julio";
                case 8 -> "Agosto";
                case 9 -> "Septiembre";
                case 10 -> "Octubre";
                case 11 -> "Noviembre";
                default -> "Diciembre";
            };
            String resp = JOptionPane.showInputDialog(null, //Aquí es donde pedimos los ingresos.
                    """
                <html>
                    <h1>Ingresos Mes de %s</h1>
                    <hr />
                    <h6>Desarrollado por Iker Navarro Pérez</h6>
                </html>
                """.formatted(i));
            totalIngresos += Double.parseDouble(resp); // Sumamos y acumulamos el valor obtenido.
        }
        
        double mediaIngresos = totalIngresos / 12; //Calculamos la media del año.
        
        JOptionPane.showMessageDialog(null, //Mostramos el resultado.
                """
                <html>
                    <hr />
                    <h1>Resultado Media de Ingresos Anual</h1>
                    <hr />
                    <p>
                        La media de ingresos del año es de %.2f€
                    </p>
                    <hr />
                </html>
                """.formatted(mediaIngresos));
    }
}
