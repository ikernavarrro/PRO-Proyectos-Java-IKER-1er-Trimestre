/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.mostrar_tabla_multiplicar;

import javax.swing.JOptionPane;

/**
 * 4.Pedir un número y mostrar su tabla de multiplicar. 30/10/2025
 *
 * @author Iker Navarro Pérez
 */
public class App {

    private static int num = 0;//Variable estática de la clase.

    public static void main(String[] args) {

        App.setNum(); //Asignamos un número. 
        App.mostrarTabla(); //Mostramos la tabla del número asignado.

    }

    //============| Métodos |===============
    /**
     * Registra, verifica que es un entero y asigna el número a num.
     */
    private static void setNum() {
        String resp = JOptionPane.showInputDialog(null,
                """
                <html>                                        
                    <h2>Tablas de Multiplicar</h2>
                    <hr />    
                    <h1>Introduzca el número de la TABLA que quiera visualizar:</h1>
                </html>
                """);

        boolean ok = false; 
        do { //Repetitiva 1 a N, hasta que se asigne un entero a num.
            try { //Controlamos la excepción.
                App.num = Integer.parseInt(resp);
                ok = true;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        """
                        <html>                            
                            <h1>¡Introduzca un número entero!</h1>
                        </html>
                        """, "Error", JOptionPane.ERROR_MESSAGE);
                resp = JOptionPane.showInputDialog(null,
                        """
                <html>                                        
                    <h2>Tablas de Multiplicar</h2>
                    <hr />    
                    <h1>Introduzca el número de la TABLA que quiera visualizar:</h1>
                </html>
                """);
            }
        } while (ok == false);

    }

    /**
     * Con el número recibido en setNum() muestra las tablas de multiplicar.
     */
    private static void mostrarTabla() {
        String tabla = "";
        for (int i = 1; i <= 10; i++) { //Repetimos de i al 10.
            tabla += "%d x %d = %d <br />".formatted(App.num, i, (App.num * i));
        }
        JOptionPane.showMessageDialog(null,
                """
                <html> 
                    <h1>Tabla del %d</h1>
                    <hr />
                    <p>
                        <big>%s</big>
                    </p>
                    <hr />
                </html>
                """.formatted(App.num, tabla));
    }
}
