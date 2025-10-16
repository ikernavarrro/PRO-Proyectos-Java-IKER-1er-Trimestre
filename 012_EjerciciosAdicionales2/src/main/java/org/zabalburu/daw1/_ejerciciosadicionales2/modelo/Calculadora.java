/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1._ejerciciosadicionales2.modelo;

/**
 *
 * @author Focus Mode
 */
public class Calculadora {
    
    public static double suma(double n1, double n2){
        return n1 + n2;
    }
    
    public static double resta(double n1, double n2){
        return n1 - n2;
    }
    
    public static double multiplication(double n1, double n2){
        return n1 * n2;
    }
    
    public static double division(double n1, double n2){
        return n1 / n2;
    }
    
    public static boolean divisible (int n1, int n2){
        return (n1 % n2) == 0;
    }
    
    public static double mayor(double n1, double n2){
        return ((n1 > n2)? n1 : n2);
    }
}