/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.mostrar_numeros_1_100;

/**
 *  5.Mostrar todos los números del 1 al 100. 31/10/2025
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        
        App.numeros1a100(); //Mostramos los números del 1 al 100 llamando a su método estático.
        
    }
    
    //============| Métodos |===============
    
    /**
     * Muestra los números del 1 al 100.
     */
    private static void numeros1a100() {
        for (int i = 1; i <= 100; i++) { //Repetitiva, 1.declaramos una variable, 2.mientras i sea MENOR e IGUAL a 100, entramos en las instrucciones, cuando terminen... 3. Sumamos 1 a i., volvamos a comprobar. 2.
            System.out.println(i);
        }
    }
}
