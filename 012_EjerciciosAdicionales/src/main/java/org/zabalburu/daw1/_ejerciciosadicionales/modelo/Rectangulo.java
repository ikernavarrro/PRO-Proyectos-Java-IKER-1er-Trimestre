/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1._ejerciciosadicionales.modelo;

/**
 *
 * @author DAW1
 */
public class Rectangulo {
    public int base;
    public int altura;
    
    public int area(){
        return 
                this.base 
                *
                this.altura;
    }
    
    public int perimetro(){
        return (
                (2 * this.base)
                +
                (2 * this.altura)
                );
    }
    
}
