/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad2_3_1.modelo;

/**
 *
 * @author Focus Mode
 */
public class Persona {
    public String nombre;
    public double peso;
    public int altura;
    
    public double pesoLibras(){
        return this.peso / 0.453592;
    }
    
    public double indiceMasaCorporal(){
        return (peso / ((altura / 100.0)*(altura / 100.0))); 
    }
    
    public String estadoIMC(){
        return this.indiceMasaCorporal() < 18.5
                ? 
                "Bajo Peso"
                :
                this.indiceMasaCorporal() < 24.9 
                ? 
                "Normal"
                :
                this.indiceMasaCorporal() <29.9
                ?
                "Sobrepeso"
                :
                "Obesidad";
    }
    
    public String resultado(){
        System.out.println("""
                                  Nombre      : %s 
                                  Peso(kg)    : %.2f kg
                                  Peso(libras): %.2f lb
                                  Altura      : %.2f m
                                  I.M.C.      : %.2f
                                  Estado      : %s
                                  """.formatted(this.nombre, this.peso, this.pesoLibras(), ((double)this.altura / 100.0), this.indiceMasaCorporal(), this.estadoIMC()));
        return null;
        
    }
}
