/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.zabalburu.daw1.mostra_numeros_pares_1_50;

/**
 * 6.Mostrar todos los números pares del 1 al 50. 31/10/2025
 * @author Iker Navarro Pérez
 */
public class App {

    public static void main(String[] args) {
        
        App.numerosPares1a50(); //Mostramos números pares del 1 al 50.
        
    }
    
    //============| Métodos |===============
    
    /**
     * Muestra los números pares del 1 al 50.
     */
    private static void numerosPares1a50() {
        for (int pares = 0; pares < 50; pares += 2) { //Repetitiva, 1. declaramos variable, 2. Mientras pares sea MENOR que 50, entramos a la instrucción, cuando termina la instrucción 3. Sumamos y asignamos 2 a pares. y volvemos a comprobar 2.
            System.out.println(pares);
        }
    }
}
