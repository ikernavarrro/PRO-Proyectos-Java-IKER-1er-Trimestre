/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1._ejerciciosadicionales3.modelo;

/**
 *
 * @author Focus Mode
 */
public class Empleado {
    
    public String nombre;
    public int tipo;
    public int horasTrabajadas;
    public double precioHora;
    public double retencion;
    
    public double sueldobase(){
        return this.horasTrabajadas * this.precioHora;
    }
    
    public double sueldoNeto(){
        return (this.sueldobase() * this.retencion) + this.sueldobase();
    }
    
    public String tipo(){
        return tipo == 1
                
                ? 
                "Operario"
                : 
                tipo == 2
                
                ? 
                "Encargado" 
                : 
                tipo == 3
                
                ? 
                "Dirección" 
                : 
                "ERROR";
    }
    
    public boolean ganaMas(Empleado otro){
        return this.sueldoNeto() >= otro.sueldoNeto();
    }
    
}
