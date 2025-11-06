/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.sumar_numeros_1_100;

/**
 *  7.Sumar todos los números del 1 al 100. 06/11/2025
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        int sumaTotalNumeros_1_A_100 = 0; //Acumulador
        for (int i = 0; i <= 100; i++) { //Repetiremos el proceso 100 veces.
            sumaTotalNumeros_1_A_100 += i; //Iremos sumandolo en cada proceso.
            System.out.println(sumaTotalNumeros_1_A_100); //Mostramos el resultado en cada proceso.
        }
        
    }
}
