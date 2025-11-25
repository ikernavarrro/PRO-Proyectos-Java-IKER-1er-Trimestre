/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad2_3_2.modelo;

/**
 *
 * @author Focus Mode
 */
public class Calculadora {
    public int x1;
    public int x2;
    
    public int suma(){
        return x1 + x2;
    }
    
    public int resta(){
        return x1 - x2;
    }
    
    public int multiplicacion(){
        return x1 * x2;
    }
    
    public double division(){
        return (double)x1 / (double)x2;
    }
    
    public String resultado(){
        System.out.println("""
                           %d + %d = %d
                           %d - %d = %d
                           %d x %d = %d
                           %d / %d = %f
                           """.formatted(this.x1, this.x2, this.suma(), this.x1, this.x2, this.resta(), this.x1, this.x2, this.multiplicacion(), this.x1, this.x2, this.division()));
        return null;
    }
}
