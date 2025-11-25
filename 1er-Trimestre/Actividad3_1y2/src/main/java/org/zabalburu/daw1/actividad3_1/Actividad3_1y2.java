/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.daw1.actividad3_1;

import javax.swing.JOptionPane;

/**
 *
 * @author DAW1
 */
public class Actividad3_1y2 {

    public static void main(String[] args) {
        double numero1;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "<html><h2>Actividad mostrar número más alto.</h2><br />Introduce el <b>primer</b> número:</html>", "0"));
        double numero2;
        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "<html><h2>Actividad mostrar número más alto.</h2><br />Introduce el <b>segundo</b> número:</html>", "0"));

        if (numero1 == numero2) {
            JOptionPane.showMessageDialog(null, "<html><h2>Los <big>dos</big> números son igual de altos.<br /></h2><b>Ambos Números</b>: %f</html>".formatted(numero1), "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "<html><h2>El <big>primer</big> número es el más alto.<br /></h2><b>Número</b>: %f</html>".formatted(numero1), "Información", JOptionPane.INFORMATION_MESSAGE);
        } else if (numero1 < numero2) {
            JOptionPane.showMessageDialog(null, "<html><h2>El <big>segundo</big> número es el más alto.<br /><b>Número</b>: %f</html>".formatted(numero2), "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
