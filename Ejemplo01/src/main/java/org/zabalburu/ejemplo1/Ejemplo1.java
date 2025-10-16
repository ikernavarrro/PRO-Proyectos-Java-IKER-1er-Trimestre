/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.zabalburu.ejemplo1;

import java.util.Date;
import java.util.Locale;

/**
 *
 * @author DAW1
 */
public class Ejemplo1 {

    /*
    Este es un comentario multilínea.
    Se elimina al compilar la aplicación.
     */
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Hola Mundo"); // Muestra la información por pantalla.
        System.out.println(new Date());
        System.out.println("hola mundo".toUpperCase()); //Para pasar todo a mayúscula.
        System.out.println("Hola Mundo".charAt(4)); // Proyecta únicamente el 4to carácter, en este caso el espacio " "
        System.out.println("=======================");

        // Tipos básicos Números
        // byte,short,char,int,long,float, double
        // Tipo básico booleano (true/false)
        // boolean
        //LITERALES
        // 12 --> int, 12L --> long 12.5 --> double, 12-5F --> float
        // true/false --> boolean
        // 'A' --> char
        // "texto" --> String (OBJETO!)
        //tipo nombre; --> Declaración variable
        int edad;
        double notaPRO = 7.5;
        double notaBD = 8;
        double notaMedia = (notaPRO + notaBD) / 2.0;
        
        //tipo nombre = expresión; --> Declaración e inicialización
        String nombre = "Iker";
        // Instrucción Asignación variable = expresion
        edad = 21;
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("Nota Media : " + notaMedia);
    }
}
