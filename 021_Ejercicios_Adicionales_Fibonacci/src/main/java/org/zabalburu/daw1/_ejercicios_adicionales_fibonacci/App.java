/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1._ejercicios_adicionales_fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author Focus Mode
 */
public class App {

    public static void main(String[] args) {

        String resp = JOptionPane.showInputDialog(null, // Guardamos la respuesta en un String.
                """
                <html>
                    <h1>[Serie de Fibonacci] Introduzca cuantos números quiere calcular.</h1>
                    <hr />
                    <h6>Desarrollado Por Iker Navarro Pérez</h6>
                </html>
                """);
        int n = Integer.parseInt(resp); // Convertimos la respuesta a un entero.

        System.out.println("Primeros %d numeros de la serie de Fibonacci: ".formatted(n));

        int fibonacci = 0; // Acumulador.
        int num1 = 0; // Acumulador.
        int num2 = 1; // Acumulador.
        for (int i = 1; i <= n; i++) { //repetimos el proceso n veces.
            System.out.print(num1 + " ");
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
        }
    }
}
